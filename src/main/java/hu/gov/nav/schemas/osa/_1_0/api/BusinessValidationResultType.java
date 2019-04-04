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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Business validation response type
 * 
 * <p>Java class for BusinessValidationResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessValidationResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="validationResultCode" type="{http://schemas.nav.gov.hu/OSA/1.0/api}BusinessResultCodeType"/>
 *         &lt;element name="validationErrorCode" type="{http://schemas.nav.gov.hu/OSA/1.0/data}SimpleText100NotBlankType" minOccurs="0"/>
 *         &lt;element name="message" type="{http://schemas.nav.gov.hu/OSA/1.0/data}SimpleText512NotBlankType" minOccurs="0"/>
 *         &lt;element name="pointer" type="{http://schemas.nav.gov.hu/OSA/1.0/api}PointerType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessValidationResultType", propOrder = {
    "validationResultCode",
    "validationErrorCode",
    "message",
    "pointer"
})
public class BusinessValidationResultType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected BusinessResultCodeType validationResultCode;
    protected String validationErrorCode;
    protected String message;
    protected PointerType pointer;

    /**
     * Gets the value of the validationResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessResultCodeType }
     *     
     */
    public BusinessResultCodeType getValidationResultCode() {
        return validationResultCode;
    }

    /**
     * Sets the value of the validationResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessResultCodeType }
     *     
     */
    public void setValidationResultCode(BusinessResultCodeType value) {
        this.validationResultCode = value;
    }

    /**
     * Gets the value of the validationErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationErrorCode() {
        return validationErrorCode;
    }

    /**
     * Sets the value of the validationErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationErrorCode(String value) {
        this.validationErrorCode = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the pointer property.
     * 
     * @return
     *     possible object is
     *     {@link PointerType }
     *     
     */
    public PointerType getPointer() {
        return pointer;
    }

    /**
     * Sets the value of the pointer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointerType }
     *     
     */
    public void setPointer(PointerType value) {
        this.pointer = value;
    }

}
