//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.05 at 09:47:06 AM CEST 
//


package hu.gov.nav.schemas.osa._1_0.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMethodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentMethodType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TRANSFER"/>
 *     &lt;enumeration value="CASH"/>
 *     &lt;enumeration value="CARD"/>
 *     &lt;enumeration value="VOUCHER"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentMethodType")
@XmlEnum
public enum PaymentMethodType {


    /**
     * Bank transfer
     * 
     */
    TRANSFER,

    /**
     * Cash
     * 
     */
    CASH,

    /**
     * Debit card, credit card, other cash-substitute payment instrument
     * 
     */
    CARD,

    /**
     * Voucher,  bill of exchange, other non-cash payment instrument
     * 
     */
    VOUCHER,

    /**
     * Other
     * 
     */
    OTHER;

    public String value() {
        return name();
    }

    public static PaymentMethodType fromValue(String v) {
        return valueOf(v);
    }

}
