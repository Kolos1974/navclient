//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.17 at 12:41:27 AM CEST 
//


package hu.gov.nav.schemas.osa._1_0.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.nav.gov.hu/OSA/1.0/api}BasicRequestType">
 *       &lt;sequence>
 *         &lt;element name="exchangeToken" type="{http://schemas.nav.gov.hu/OSA/1.0/data}SimpleText50NotBlankType"/>
 *         &lt;element name="invoiceOperations" type="{http://schemas.nav.gov.hu/OSA/1.0/api}InvoiceOperationListType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "exchangeToken",
    "invoiceOperations"
})
@XmlRootElement(name = "ManageInvoiceRequest")
public class ManageInvoiceRequest
    extends BasicRequestType
{

    @XmlElement(required = true)
    protected String exchangeToken;
    @XmlElement(required = true)
    protected InvoiceOperationListType invoiceOperations;

    /**
     * Gets the value of the exchangeToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeToken() {
        return exchangeToken;
    }

    /**
     * Sets the value of the exchangeToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeToken(String value) {
        this.exchangeToken = value;
    }

    /**
     * Gets the value of the invoiceOperations property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceOperationListType }
     *     
     */
    public InvoiceOperationListType getInvoiceOperations() {
        return invoiceOperations;
    }

    /**
     * Sets the value of the invoiceOperations property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceOperationListType }
     *     
     */
    public void setInvoiceOperations(InvoiceOperationListType value) {
        this.invoiceOperations = value;
    }

}
