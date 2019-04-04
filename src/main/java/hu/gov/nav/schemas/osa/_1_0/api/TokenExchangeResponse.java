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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="encodedExchangeToken" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="tokenValidityFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tokenValidityTo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "encodedExchangeToken",
    "tokenValidityFrom",
    "tokenValidityTo"
})
@XmlRootElement(name = "TokenExchangeResponse")
public class TokenExchangeResponse
    extends BasicResponseType
{

    @XmlElement(required = true)
    protected byte[] encodedExchangeToken;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tokenValidityFrom;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tokenValidityTo;

    /**
     * Gets the value of the encodedExchangeToken property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getEncodedExchangeToken() {
        return encodedExchangeToken;
    }

    /**
     * Sets the value of the encodedExchangeToken property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setEncodedExchangeToken(byte[] value) {
        this.encodedExchangeToken = value;
    }

    /**
     * Gets the value of the tokenValidityFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTokenValidityFrom() {
        return tokenValidityFrom;
    }

    /**
     * Sets the value of the tokenValidityFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTokenValidityFrom(XMLGregorianCalendar value) {
        this.tokenValidityFrom = value;
    }

    /**
     * Gets the value of the tokenValidityTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTokenValidityTo() {
        return tokenValidityTo;
    }

    /**
     * Sets the value of the tokenValidityTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTokenValidityTo(XMLGregorianCalendar value) {
        this.tokenValidityTo = value;
    }

}