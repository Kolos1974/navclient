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
 * <p>Java class for AnnulmentCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AnnulmentCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ERRATIC_DATA"/>
 *     &lt;enumeration value="ERRATIC_INVOICE_NUMBER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AnnulmentCodeType")
@XmlEnum
public enum AnnulmentCodeType {


    /**
     * Technical annulment due to erratic data content
     * 
     */
    ERRATIC_DATA,

    /**
     * Technical annulment due to erratic invoice number
     * 
     */
    ERRATIC_INVOICE_NUMBER;

    public String value() {
        return name();
    }

    public static AnnulmentCodeType fromValue(String v) {
        return valueOf(v);
    }

}