//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.17 at 12:41:34 AM CEST 
//


package hu.gov.nav.schemas.osa._1_0.data;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data in connection with takeover of environmental protection product fee
 * 
 * <p>Java class for ProductFeeTakeoverDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductFeeTakeoverDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="takeoverReason" type="{http://schemas.nav.gov.hu/OSA/1.0/data}TakeoverType"/>
 *         &lt;element name="takeoverAmount" type="{http://schemas.nav.gov.hu/OSA/1.0/data}MonetaryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductFeeTakeoverDataType", propOrder = {
    "takeoverReason",
    "takeoverAmount"
})
public class ProductFeeTakeoverDataType {

    @XmlElement(required = true)
    protected String takeoverReason;
    protected BigDecimal takeoverAmount;

    /**
     * Gets the value of the takeoverReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTakeoverReason() {
        return takeoverReason;
    }

    /**
     * Sets the value of the takeoverReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTakeoverReason(String value) {
        this.takeoverReason = value;
    }

    /**
     * Gets the value of the takeoverAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTakeoverAmount() {
        return takeoverAmount;
    }

    /**
     * Sets the value of the takeoverAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTakeoverAmount(BigDecimal value) {
        this.takeoverAmount = value;
    }

}
