//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.17 at 12:41:34 AM CEST 
//


package hu.gov.nav.schemas.osa._1_0.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Main type of the data exchange
 * 
 * <p>Java class for InvoiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="invoiceExchange" type="{http://schemas.nav.gov.hu/OSA/1.0/data}InvoiceExchangeType"/>
 *         &lt;element name="invoiceAnnulment" type="{http://schemas.nav.gov.hu/OSA/1.0/data}InvoiceAnnulmentType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceType", propOrder = {
    "invoiceExchange",
    "invoiceAnnulment"
})
@XmlSeeAlso({
    Invoice.class
})
public class InvoiceType {

    protected InvoiceExchangeType invoiceExchange;
    protected InvoiceAnnulmentType invoiceAnnulment;

    /**
     * Gets the value of the invoiceExchange property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceExchangeType }
     *     
     */
    public InvoiceExchangeType getInvoiceExchange() {
        return invoiceExchange;
    }

    /**
     * Sets the value of the invoiceExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceExchangeType }
     *     
     */
    public void setInvoiceExchange(InvoiceExchangeType value) {
        this.invoiceExchange = value;
    }

    /**
     * Gets the value of the invoiceAnnulment property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceAnnulmentType }
     *     
     */
    public InvoiceAnnulmentType getInvoiceAnnulment() {
        return invoiceAnnulment;
    }

    /**
     * Sets the value of the invoiceAnnulment property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceAnnulmentType }
     *     
     */
    public void setInvoiceAnnulment(InvoiceAnnulmentType value) {
        this.invoiceAnnulment = value;
    }

}