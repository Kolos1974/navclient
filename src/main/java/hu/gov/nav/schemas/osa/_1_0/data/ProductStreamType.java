//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.17 at 12:41:34 AM CEST 
//


package hu.gov.nav.schemas.osa._1_0.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductStreamType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductStreamType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BATTERY"/>
 *     &lt;enumeration value="PACKAGING"/>
 *     &lt;enumeration value="OTHER_PETROL"/>
 *     &lt;enumeration value="ELECTRONIC"/>
 *     &lt;enumeration value="TIRE"/>
 *     &lt;enumeration value="COMMERCIAL"/>
 *     &lt;enumeration value="PLASTIC"/>
 *     &lt;enumeration value="OTHER_CHEMICAL"/>
 *     &lt;enumeration value="PAPER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductStreamType")
@XmlEnum
public enum ProductStreamType {


    /**
     * Battery
     * 
     */
    BATTERY,

    /**
     * Packaging products
     * 
     */
    PACKAGING,

    /**
     * Other petroleum product
     * 
     */
    OTHER_PETROL,

    /**
     * The electric appliance, electronic equipment
     * 
     */
    ELECTRONIC,

    /**
     * Tire
     * 
     */
    TIRE,

    /**
     * Commercial printing paper
     * 
     */
    COMMERCIAL,

    /**
     * Other plastic product
     * 
     */
    PLASTIC,

    /**
     * Other chemical product
     * 
     */
    OTHER_CHEMICAL,

    /**
     * Paper stationery
     * 
     */
    PAPER;

    public String value() {
        return name();
    }

    public static ProductStreamType fromValue(String v) {
        return valueOf(v);
    }

}