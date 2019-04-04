//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.17 at 12:41:34 AM CEST 
//


package hu.gov.nav.schemas.osa._1_0.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Format of address that includes either a simple or a detailed address
 * 
 * <p>Java class for AddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="simpleAddress" type="{http://schemas.nav.gov.hu/OSA/1.0/data}SimpleAddressType"/>
 *         &lt;element name="detailedAddress" type="{http://schemas.nav.gov.hu/OSA/1.0/data}DetailedAddressType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", propOrder = {
    "simpleAddress",
    "detailedAddress"
})
public class AddressType {

    protected SimpleAddressType simpleAddress;
    protected DetailedAddressType detailedAddress;

    /**
     * Gets the value of the simpleAddress property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleAddressType }
     *     
     */
    public SimpleAddressType getSimpleAddress() {
        return simpleAddress;
    }

    /**
     * Sets the value of the simpleAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleAddressType }
     *     
     */
    public void setSimpleAddress(SimpleAddressType value) {
        this.simpleAddress = value;
    }

    /**
     * Gets the value of the detailedAddress property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedAddressType }
     *     
     */
    public DetailedAddressType getDetailedAddress() {
        return detailedAddress;
    }

    /**
     * Sets the value of the detailedAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedAddressType }
     *     
     */
    public void setDetailedAddress(DetailedAddressType value) {
        this.detailedAddress = value;
    }

}