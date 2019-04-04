//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.17 at 12:41:27 AM CEST 
//


package hu.gov.nav.schemas.osa._1_0.api;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import hu.gov.nav.schemas.osa._1_0.data.InvoiceAppearanceType;
import hu.gov.nav.schemas.osa._1_0.data.InvoiceCategoryType;
import hu.gov.nav.schemas.osa._1_0.data.PaymentMethodType;


/**
 * Digest query result
 * 
 * <p>Java class for InvoiceDigestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceDigestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="invoiceNumber" type="{http://schemas.nav.gov.hu/OSA/1.0/data}SimpleText50NotBlankType"/>
 *         &lt;element name="invoiceOperation" type="{http://schemas.nav.gov.hu/OSA/1.0/api}OperationType"/>
 *         &lt;element name="invoiceCategory" type="{http://schemas.nav.gov.hu/OSA/1.0/data}InvoiceCategoryType"/>
 *         &lt;element name="invoiceIssueDate" type="{http://schemas.nav.gov.hu/OSA/1.0/data}DateType"/>
 *         &lt;element name="customerTaxNumber" type="{http://schemas.nav.gov.hu/OSA/1.0/data}TaxpayerIdType" minOccurs="0"/>
 *         &lt;element name="paymentMethod" type="{http://schemas.nav.gov.hu/OSA/1.0/data}PaymentMethodType" minOccurs="0"/>
 *         &lt;element name="invoiceAppearance" type="{http://schemas.nav.gov.hu/OSA/1.0/data}InvoiceAppearanceType" minOccurs="0"/>
 *         &lt;element name="source" type="{http://schemas.nav.gov.hu/OSA/1.0/api}SourceType" minOccurs="0"/>
 *         &lt;element name="invoiceDelivery" type="{http://schemas.nav.gov.hu/OSA/1.0/data}DateType" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://schemas.nav.gov.hu/OSA/1.0/data}CurrencyType" minOccurs="0"/>
 *         &lt;element name="invoiceNetAmount" type="{http://schemas.nav.gov.hu/OSA/1.0/data}MonetaryType" minOccurs="0"/>
 *         &lt;element name="invoiceVatAmountHUF" type="{http://schemas.nav.gov.hu/OSA/1.0/data}MonetaryType" minOccurs="0"/>
 *         &lt;element name="transactionId" type="{http://schemas.nav.gov.hu/OSA/1.0/api}EntityIdType" minOccurs="0"/>
 *         &lt;element name="index" type="{http://schemas.nav.gov.hu/OSA/1.0/api}IndexType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceDigestType", propOrder = {
    "invoiceNumber",
    "invoiceOperation",
    "invoiceCategory",
    "invoiceIssueDate",
    "customerTaxNumber",
    "paymentMethod",
    "invoiceAppearance",
    "source",
    "invoiceDelivery",
    "currency",
    "invoiceNetAmount",
    "invoiceVatAmountHUF",
    "transactionId",
    "index"
})
public class InvoiceDigestType {

    @XmlElement(required = true)
    protected String invoiceNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected OperationType invoiceOperation;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected InvoiceCategoryType invoiceCategory;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar invoiceIssueDate;
    protected String customerTaxNumber;
    @XmlSchemaType(name = "string")
    protected PaymentMethodType paymentMethod;
    @XmlSchemaType(name = "string")
    protected InvoiceAppearanceType invoiceAppearance;
    @XmlSchemaType(name = "string")
    protected SourceType source;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar invoiceDelivery;
    protected String currency;
    protected BigDecimal invoiceNetAmount;
    protected BigDecimal invoiceVatAmountHUF;
    protected String transactionId;
    protected Integer index;

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

    /**
     * Gets the value of the invoiceOperation property.
     * 
     * @return
     *     possible object is
     *     {@link OperationType }
     *     
     */
    public OperationType getInvoiceOperation() {
        return invoiceOperation;
    }

    /**
     * Sets the value of the invoiceOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationType }
     *     
     */
    public void setInvoiceOperation(OperationType value) {
        this.invoiceOperation = value;
    }

    /**
     * Gets the value of the invoiceCategory property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceCategoryType }
     *     
     */
    public InvoiceCategoryType getInvoiceCategory() {
        return invoiceCategory;
    }

    /**
     * Sets the value of the invoiceCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceCategoryType }
     *     
     */
    public void setInvoiceCategory(InvoiceCategoryType value) {
        this.invoiceCategory = value;
    }

    /**
     * Gets the value of the invoiceIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvoiceIssueDate() {
        return invoiceIssueDate;
    }

    /**
     * Sets the value of the invoiceIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvoiceIssueDate(XMLGregorianCalendar value) {
        this.invoiceIssueDate = value;
    }

    /**
     * Gets the value of the customerTaxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerTaxNumber() {
        return customerTaxNumber;
    }

    /**
     * Sets the value of the customerTaxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerTaxNumber(String value) {
        this.customerTaxNumber = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodType }
     *     
     */
    public PaymentMethodType getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodType }
     *     
     */
    public void setPaymentMethod(PaymentMethodType value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the invoiceAppearance property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceAppearanceType }
     *     
     */
    public InvoiceAppearanceType getInvoiceAppearance() {
        return invoiceAppearance;
    }

    /**
     * Sets the value of the invoiceAppearance property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceAppearanceType }
     *     
     */
    public void setInvoiceAppearance(InvoiceAppearanceType value) {
        this.invoiceAppearance = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link SourceType }
     *     
     */
    public SourceType getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceType }
     *     
     */
    public void setSource(SourceType value) {
        this.source = value;
    }

    /**
     * Gets the value of the invoiceDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvoiceDelivery() {
        return invoiceDelivery;
    }

    /**
     * Sets the value of the invoiceDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvoiceDelivery(XMLGregorianCalendar value) {
        this.invoiceDelivery = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the invoiceNetAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvoiceNetAmount() {
        return invoiceNetAmount;
    }

    /**
     * Sets the value of the invoiceNetAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvoiceNetAmount(BigDecimal value) {
        this.invoiceNetAmount = value;
    }

    /**
     * Gets the value of the invoiceVatAmountHUF property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvoiceVatAmountHUF() {
        return invoiceVatAmountHUF;
    }

    /**
     * Sets the value of the invoiceVatAmountHUF property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvoiceVatAmountHUF(BigDecimal value) {
        this.invoiceVatAmountHUF = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndex(Integer value) {
        this.index = value;
    }

}