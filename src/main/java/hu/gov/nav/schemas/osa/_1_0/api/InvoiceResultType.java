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
import javax.xml.bind.annotation.XmlType;
import hu.gov.nav.schemas.osa._1_0.data.InvoiceReferenceType;


/**
 * Invoice number based query result
 * 
 * <p>Java class for InvoiceResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="invoice" type="{http://schemas.nav.gov.hu/OSA/1.0/api}InvoiceType"/>
 *         &lt;element name="auditData" type="{http://schemas.nav.gov.hu/OSA/1.0/api}AuditDataType"/>
 *         &lt;element name="invoiceReference" type="{http://schemas.nav.gov.hu/OSA/1.0/data}InvoiceReferenceType" minOccurs="0"/>
 *         &lt;element name="compressedContentIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceResultType", propOrder = {
    "invoice",
    "auditData",
    "invoiceReference",
    "compressedContentIndicator"
})
public class InvoiceResultType {

    @XmlElement(required = true)
    protected byte[] invoice;
    @XmlElement(required = true)
    protected AuditDataType auditData;
    protected InvoiceReferenceType invoiceReference;
    @XmlElement(defaultValue = "false")
    protected boolean compressedContentIndicator;

    /**
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setInvoice(byte[] value) {
        this.invoice = value;
    }

    /**
     * Gets the value of the auditData property.
     * 
     * @return
     *     possible object is
     *     {@link AuditDataType }
     *     
     */
    public AuditDataType getAuditData() {
        return auditData;
    }

    /**
     * Sets the value of the auditData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditDataType }
     *     
     */
    public void setAuditData(AuditDataType value) {
        this.auditData = value;
    }

    /**
     * Gets the value of the invoiceReference property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceReferenceType }
     *     
     */
    public InvoiceReferenceType getInvoiceReference() {
        return invoiceReference;
    }

    /**
     * Sets the value of the invoiceReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceReferenceType }
     *     
     */
    public void setInvoiceReference(InvoiceReferenceType value) {
        this.invoiceReference = value;
    }

    /**
     * Gets the value of the compressedContentIndicator property.
     * 
     */
    public boolean isCompressedContentIndicator() {
        return compressedContentIndicator;
    }

    /**
     * Sets the value of the compressedContentIndicator property.
     * 
     */
    public void setCompressedContentIndicator(boolean value) {
        this.compressedContentIndicator = value;
    }

}