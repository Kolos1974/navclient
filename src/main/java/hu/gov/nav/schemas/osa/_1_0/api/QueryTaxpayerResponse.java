//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.17 at 12:41:27 AM CEST 
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
 *     &lt;extension base="{http://schemas.nav.gov.hu/OSA/1.0/api}BasicResponseType">
 *       &lt;sequence>
 *         &lt;element name="taxpayerValidity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="taxpayerData" type="{http://schemas.nav.gov.hu/OSA/1.0/api}TaxpayerDataType" minOccurs="0"/>
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
    "taxpayerValidity",
    "taxpayerData"
})
@XmlRootElement(name = "QueryTaxpayerResponse")
public class QueryTaxpayerResponse
    extends BasicResponseType
{

    protected Boolean taxpayerValidity;
    protected TaxpayerDataType taxpayerData;

    /**
     * Gets the value of the taxpayerValidity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxpayerValidity() {
        return taxpayerValidity;
    }

    /**
     * Sets the value of the taxpayerValidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxpayerValidity(Boolean value) {
        this.taxpayerValidity = value;
    }

    /**
     * Gets the value of the taxpayerData property.
     * 
     * @return
     *     possible object is
     *     {@link TaxpayerDataType }
     *     
     */
    public TaxpayerDataType getTaxpayerData() {
        return taxpayerData;
    }

    /**
     * Sets the value of the taxpayerData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxpayerDataType }
     *     
     */
    public void setTaxpayerData(TaxpayerDataType value) {
        this.taxpayerData = value;
    }

}
