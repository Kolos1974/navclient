//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.17 at 12:41:27 AM CEST 
//


package hu.gov.nav.schemas.osa._1_0.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessResultCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BusinessResultCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ERROR"/>
 *     &lt;enumeration value="WARN"/>
 *     &lt;enumeration value="INFO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BusinessResultCodeType")
@XmlEnum
public enum BusinessResultCodeType {


    /**
     * Error
     * 
     */
    ERROR,

    /**
     * Warn
     * 
     */
    WARN,

    /**
     * Information
     * 
     */
    INFO;

    public String value() {
        return name();
    }

    public static BusinessResultCodeType fromValue(String v) {
        return valueOf(v);
    }

}