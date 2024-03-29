package services;

import config.Config;
import data.dao.DaoFactory;
import data.dao.navStatus.NavStatusDao;
import data.dao.szamla.BSzamlaDao;
import data.dao.szamla.SzamlaDao;
import data.entity.NavStatus;
import data.entity.Szamla;
import exception.DatabaseException;
import exception.QueryInvoiceStatusGenException;
import exception.XmlPrettifyException;
import hu.gov.nav.schemas.osa._1_0.api.GeneralErrorResponse;
import hu.gov.nav.schemas.osa._1_0.api.QueryInvoiceStatusRequest;
import hu.gov.nav.schemas.osa._1_0.api.QueryInvoiceStatusResponse;
import network.NetworkManager;
import network.response.NetworkCallback;
import requestFactories.QueryInvoiceStatusGenerator;
import utils.XmlFormatter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class InvoiceStatusCheckService extends RepeatableService {

    private static final String TAG = "InvoiceStatusCheckService";

    private InvoiceStatusCheckService() {
        szamlaDaoMap = DaoFactory.getSzamlaDaoMap();
    }

    public static final InvoiceStatusCheckService INSTANCE  = new InvoiceStatusCheckService();

    private Map<String, Path> transactionIds = new LinkedHashMap<>();

    private final Map<Szamla.SzamlaType, SzamlaDao> szamlaDaoMap;

    public void addTransactionId(String id, Path path) {
        transactionIds.putIfAbsent(id, path);
    }

    @Override
    protected String getTag() {
        return TAG;
    }

    @Override
    protected TimerTask getTimerTask() {
        return new CheckInvoiceTask();
    }

    private class CheckInvoiceTask extends TimerTask {

        private final NavStatusDao navStatusDao;

        public CheckInvoiceTask() {
            navStatusDao = new NavStatusDao();
        }

        @Override
        public void run() {
            if (Config.appMode == Config.AppModes.MSSQL) checkTransactionIdsFromDb();
            if (Config.appMode == Config.AppModes.MSSQL || Config.appMode == Config.AppModes.XML)
                checkTransactionIdsFromXml();
        }

        private void checkTransactionIdsFromDb() {
            try {
                List<NavStatus> navStatuses = navStatusDao.getAllNotDoneOrAborted();
                utils.Logger.logMessage(TAG, "Checking " + navStatuses.size() + " invoice statuses from DB");
                for (NavStatus navStatus : navStatuses) {
                    QueryInvoiceStatusRequest queryInvoiceStatusRequest =
                            QueryInvoiceStatusGenerator.INSTANCE.generateObj(navStatus.getTransactionid());
                    NetworkManager.INSTANCE.queryInvoiceStatus(queryInvoiceStatusRequest, new NetworkCallback<QueryInvoiceStatusResponse>() {
                        @Override
                        public void onSuccess(QueryInvoiceStatusResponse response) {
                            if (response.getProcessingResults() == null) return;
                            String status = response.getProcessingResults().getProcessingResult().get(0).getInvoiceStatus().value();
                            navStatus.setInvoicestatus(status);
                            try {
                                navStatusDao.updateStatus(navStatus);
                                String iktszam = navStatus.getIktszam();
                                szamlaDaoMap.get(getTypeFromIktSzam(iktszam)).updateStatusz(iktszam, status);
                                if (status.equals(Szamla.States.DONE.name()) || status.equals(Szamla.States.ABORTED.name())) {
                                    File file = new File(Config.navExport + "\\" + iktszam.replace("/", "_").trim() + "_" + navStatus.getRequestid() + "_" + status + ".xml");
                                    writeStatusResponseToFile(response, file);
                                }
                            } catch (DatabaseException e) {
                                e.printStackTrace();
                                utils.Logger.logMessage(TAG, e.getMessage());
                            }
                        }

                        @Override
                        public void onError(GeneralErrorResponse errorResponse) {
                            utils.Logger.logMessage(TAG, errorResponse.getResult().getMessage());
                        }

                        @Override
                        public void onFail(String msg) {
                            utils.Logger.logMessage(TAG, msg);
                        }
                    });
                }
            } catch (DatabaseException | QueryInvoiceStatusGenException e) {
                e.printStackTrace();
            }
        }

        private void checkTransactionIdsFromXml() {
            Iterator<String> iterator = transactionIds.keySet().iterator();
            utils.Logger.logMessage(TAG, "Checking " + transactionIds.size() + " invoice statuses from MEMORY");
            while (iterator.hasNext()) {
                String transactionId = iterator.next();
                try {
                    QueryInvoiceStatusRequest queryInvoiceStatusRequest =
                            QueryInvoiceStatusGenerator.INSTANCE.generateObj(transactionId);
                    NetworkManager.INSTANCE.queryInvoiceStatus(queryInvoiceStatusRequest, new NetworkCallback<QueryInvoiceStatusResponse>() {
                        @Override
                        public void onSuccess(QueryInvoiceStatusResponse response) {
                            String status = response.getProcessingResults().getProcessingResult().get(0).getInvoiceStatus().value();
                            if (status.equals(Szamla.States.DONE.name()) || status.equals(Szamla.States.ABORTED.name())) {
                                Path path = transactionIds.get(transactionId);
                                File file = new File(Config.navExport + "\\" + path.getFileName().toString().replace(".xml", "_" + status + ".xml"));
                                writeStatusResponseToFile(response, file);
                                iterator.remove();
                            }
                        }

                        @Override
                        public void onError(GeneralErrorResponse errorResponse) {
                            utils.Logger.logMessage(TAG, errorResponse.getResult().getMessage());
                        }

                        @Override
                        public void onFail(String msg) {
                            utils.Logger.logMessage(TAG, msg);
                        }
                    });
                } catch (QueryInvoiceStatusGenException e) {
                    e.printStackTrace();
                }
            }
        }

        private Szamla.SzamlaType getTypeFromIktSzam(String iktszam) {
            String firstLetter = iktszam.substring(0, 1);
            if (firstLetter.equals("V")) return Szamla.SzamlaType.Z;
            try {
                return Szamla.SzamlaType.valueOf(firstLetter);
            } catch (IllegalArgumentException e) {
                return Szamla.SzamlaType.V;
            }
        }

    }

    private void writeStatusResponseToFile(QueryInvoiceStatusResponse response, File file) {
        try {
            byte[] originalRequest = response.getProcessingResults().getProcessingResult().get(0).getOriginalRequest();
            String prettid = XmlFormatter.prettify(new String(originalRequest));
            response.getProcessingResults().getProcessingResult().get(0).setOriginalRequest(null);
            JAXBContext context = JAXBContext.newInstance(QueryInvoiceStatusResponse.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            utils.Logger.logMessage(TAG, "Saving file to "+ file.getAbsolutePath());
            marshaller.marshal(response, file);
            try (FileWriter fileWriter = new FileWriter(file, true)) {
                fileWriter.write(prettid);
            }
        } catch (JAXBException | XmlPrettifyException | IOException e) {
            utils.Logger.logMessage(TAG, e.getMessage());
            e.printStackTrace();
        }
    }


}
