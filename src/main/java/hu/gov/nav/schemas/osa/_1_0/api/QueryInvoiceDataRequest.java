//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.05 at 09:47:06 AM CEST 
//


package hu.gov.nav.schemas.osa._1_0.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="page" type="{http://schemas.nav.gov.hu/OSA/1.0/api}PageType"/>
 *         &lt;choice>
 *           &lt;element name="invoiceQuery" type="{http://schemas.nav.gov.hu/OSA/1.0/api}InvoiceQueryType"/>
 *           &lt;element name="queryParams" type="{http://schemas.nav.gov.hu/OSA/1.0/api}InvoiceQueryParamsType"/>
 *         &lt;/choice>
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
    "page",
    "invoiceQuery",
    "queryParams"
})
@XmlRootElement(name = "QueryInvoiceDataRequest")
public class QueryInvoiceDataRequest
    extends BasicRequestType
{

    protected int page;
    protected InvoiceQueryType invoiceQuery;
    protected InvoiceQueryParamsType queryParams;

    /**
     * Gets the value of the page property.
     * 
     */
    public int getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     */
    public void setPage(int value) {
        this.page = value;
    }

    /**
     * Gets the value of the invoiceQuery property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceQueryType }
     *     
     */
    public InvoiceQueryType getInvoiceQuery() {
        return invoiceQuery;
    }

    /**
     * Sets the value of the invoiceQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceQueryType }
     *     
     */
    public void setInvoiceQuery(InvoiceQueryType value) {
        this.invoiceQuery = value;
    }

    /**
     * Gets the value of the queryParams property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceQueryParamsType }
     *     
     */
    public InvoiceQueryParamsType getQueryParams() {
        return queryParams;
    }

    /**
     * Sets the value of the queryParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceQueryParamsType }
     *     
     */
    public void setQueryParams(InvoiceQueryParamsType value) {
        this.queryParams = value;
    }

}
