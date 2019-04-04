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
 * Invoice query parameters
 * 
 * <p>Java class for InvoiceQueryParamsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceQueryParamsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="invoiceIssueDateFrom" type="{http://schemas.nav.gov.hu/OSA/1.0/data}DateType"/>
 *         &lt;element name="invoiceIssueDateTo" type="{http://schemas.nav.gov.hu/OSA/1.0/data}DateType"/>
 *         &lt;element name="customerTaxNumber" type="{http://schemas.nav.gov.hu/OSA/1.0/data}TaxpayerIdType" minOccurs="0"/>
 *         &lt;element name="invoiceCategory" type="{http://schemas.nav.gov.hu/OSA/1.0/data}InvoiceCategoryType" minOccurs="0"/>
 *         &lt;element name="paymentMethod" type="{http://schemas.nav.gov.hu/OSA/1.0/data}PaymentMethodType" minOccurs="0"/>
 *         &lt;element name="invoiceAppearance" type="{http://schemas.nav.gov.hu/OSA/1.0/data}InvoiceAppearanceType" minOccurs="0"/>
 *         &lt;element name="source" type="{http://schemas.nav.gov.hu/OSA/1.0/api}SourceType" minOccurs="0"/>
 *         &lt;element name="invoiceDeliveryGreaterThan" type="{http://schemas.nav.gov.hu/OSA/1.0/data}DateType" minOccurs="0"/>
 *         &lt;element name="invoiceDeliveryLessThan" type="{http://schemas.nav.gov.hu/OSA/1.0/data}DateType" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://schemas.nav.gov.hu/OSA/1.0/data}CurrencyType" minOccurs="0"/>
 *         &lt;element name="invoiceNetAmountGreaterThan" type="{http://schemas.nav.gov.hu/OSA/1.0/data}MonetaryType" minOccurs="0"/>
 *         &lt;element name="invoiceNetAmountLessThan" type="{http://schemas.nav.gov.hu/OSA/1.0/data}MonetaryType" minOccurs="0"/>
 *         &lt;element name="invoiceVatAmountHUFGreaterThan" type="{http://schemas.nav.gov.hu/OSA/1.0/data}MonetaryType" minOccurs="0"/>
 *         &lt;element name="invoiceVatAmountHUFLessThan" type="{http://schemas.nav.gov.hu/OSA/1.0/data}MonetaryType" minOccurs="0"/>
 *         &lt;element name="transactionParams" type="{http://schemas.nav.gov.hu/OSA/1.0/api}InvoiceQueryTransactionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceQueryParamsType", propOrder = {
    "invoiceIssueDateFrom",
    "invoiceIssueDateTo",
    "customerTaxNumber",
    "invoiceCategory",
    "paymentMethod",
    "invoiceAppearance",
    "source",
    "invoiceDeliveryGreaterThan",
    "invoiceDeliveryLessThan",
    "currency",
    "invoiceNetAmountGreaterThan",
    "invoiceNetAmountLessThan",
    "invoiceVatAmountHUFGreaterThan",
    "invoiceVatAmountHUFLessThan",
    "transactionParams"
})
public class InvoiceQueryParamsType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar invoiceIssueDateFrom;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar invoiceIssueDateTo;
    protected String customerTaxNumber;
    @XmlSchemaType(name = "string")
    protected InvoiceCategoryType invoiceCategory;
    @XmlSchemaType(name = "string")
    protected PaymentMethodType paymentMethod;
    @XmlSchemaType(name = "string")
    protected InvoiceAppearanceType invoiceAppearance;
    @XmlSchemaType(name = "string")
    protected SourceType source;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar invoiceDeliveryGreaterThan;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar invoiceDeliveryLessThan;
    protected String currency;
    protected BigDecimal invoiceNetAmountGreaterThan;
    protected BigDecimal invoiceNetAmountLessThan;
    protected BigDecimal invoiceVatAmountHUFGreaterThan;
    protected BigDecimal invoiceVatAmountHUFLessThan;
    protected InvoiceQueryTransactionType transactionParams;

    /**
     * Gets the value of the invoiceIssueDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvoiceIssueDateFrom() {
        return invoiceIssueDateFrom;
    }

    /**
     * Sets the value of the invoiceIssueDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvoiceIssueDateFrom(XMLGregorianCalendar value) {
        this.invoiceIssueDateFrom = value;
    }

    /**
     * Gets the value of the invoiceIssueDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvoiceIssueDateTo() {
        return invoiceIssueDateTo;
    }

    /**
     * Sets the value of the invoiceIssueDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvoiceIssueDateTo(XMLGregorianCalendar value) {
        this.invoiceIssueDateTo = value;
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
     * Gets the value of the invoiceDeliveryGreaterThan property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvoiceDeliveryGreaterThan() {
        return invoiceDeliveryGreaterThan;
    }

    /**
     * Sets the value of the invoiceDeliveryGreaterThan property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvoiceDeliveryGreaterThan(XMLGregorianCalendar value) {
        this.invoiceDeliveryGreaterThan = value;
    }

    /**
     * Gets the value of the invoiceDeliveryLessThan property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvoiceDeliveryLessThan() {
        return invoiceDeliveryLessThan;
    }

    /**
     * Sets the value of the invoiceDeliveryLessThan property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvoiceDeliveryLessThan(XMLGregorianCalendar value) {
        this.invoiceDeliveryLessThan = value;
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
     * Gets the value of the invoiceNetAmountGreaterThan property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvoiceNetAmountGreaterThan() {
        return invoiceNetAmountGreaterThan;
    }

    /**
     * Sets the value of the invoiceNetAmountGreaterThan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvoiceNetAmountGreaterThan(BigDecimal value) {
        this.invoiceNetAmountGreaterThan = value;
    }

    /**
     * Gets the value of the invoiceNetAmountLessThan property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvoiceNetAmountLessThan() {
        return invoiceNetAmountLessThan;
    }

    /**
     * Sets the value of the invoiceNetAmountLessThan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvoiceNetAmountLessThan(BigDecimal value) {
        this.invoiceNetAmountLessThan = value;
    }

    /**
     * Gets the value of the invoiceVatAmountHUFGreaterThan property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvoiceVatAmountHUFGreaterThan() {
        return invoiceVatAmountHUFGreaterThan;
    }

    /**
     * Sets the value of the invoiceVatAmountHUFGreaterThan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvoiceVatAmountHUFGreaterThan(BigDecimal value) {
        this.invoiceVatAmountHUFGreaterThan = value;
    }

    /**
     * Gets the value of the invoiceVatAmountHUFLessThan property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvoiceVatAmountHUFLessThan() {
        return invoiceVatAmountHUFLessThan;
    }

    /**
     * Sets the value of the invoiceVatAmountHUFLessThan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvoiceVatAmountHUFLessThan(BigDecimal value) {
        this.invoiceVatAmountHUFLessThan = value;
    }

    /**
     * Gets the value of the transactionParams property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceQueryTransactionType }
     *     
     */
    public InvoiceQueryTransactionType getTransactionParams() {
        return transactionParams;
    }

    /**
     * Sets the value of the transactionParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceQueryTransactionType }
     *     
     */
    public void setTransactionParams(InvoiceQueryTransactionType value) {
        this.transactionParams = value;
    }

}