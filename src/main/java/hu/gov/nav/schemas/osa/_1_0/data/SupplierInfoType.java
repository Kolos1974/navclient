//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.17 at 12:41:34 AM CEST 
//


package hu.gov.nav.schemas.osa._1_0.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Invoice supplier (seller) data
 * 
 * <p>Java class for SupplierInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplierInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="supplierTaxNumber" type="{http://schemas.nav.gov.hu/OSA/1.0/data}TaxNumberType"/>
 *         &lt;element name="groupMemberTaxNumber" type="{http://schemas.nav.gov.hu/OSA/1.0/data}TaxNumberType" minOccurs="0"/>
 *         &lt;element name="communityVatNumber" type="{http://schemas.nav.gov.hu/OSA/1.0/data}CommunityVatNumberType" minOccurs="0"/>
 *         &lt;element name="supplierName" type="{http://schemas.nav.gov.hu/OSA/1.0/data}SimpleText512NotBlankType"/>
 *         &lt;element name="supplierAddress" type="{http://schemas.nav.gov.hu/OSA/1.0/data}AddressType"/>
 *         &lt;element name="supplierBankAccountNumber" type="{http://schemas.nav.gov.hu/OSA/1.0/data}BankAccountNumberType" minOccurs="0"/>
 *         &lt;element name="individualExemption" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="exciseLicenceNum" type="{http://schemas.nav.gov.hu/OSA/1.0/data}SimpleText50NotBlankType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierInfoType", propOrder = {
    "supplierTaxNumber",
    "groupMemberTaxNumber",
    "communityVatNumber",
    "supplierName",
    "supplierAddress",
    "supplierBankAccountNumber",
    "individualExemption",
    "exciseLicenceNum"
})
public class SupplierInfoType {

    @XmlElement(required = true)
    protected TaxNumberType supplierTaxNumber;
    protected TaxNumberType groupMemberTaxNumber;
    protected String communityVatNumber;
    @XmlElement(required = true)
    protected String supplierName;
    @XmlElement(required = true)
    protected AddressType supplierAddress;
    protected String supplierBankAccountNumber;
    @XmlElement(defaultValue = "false")
    protected Boolean individualExemption;
    protected String exciseLicenceNum;

    /**
     * Gets the value of the supplierTaxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TaxNumberType }
     *     
     */
    public TaxNumberType getSupplierTaxNumber() {
        return supplierTaxNumber;
    }

    /**
     * Sets the value of the supplierTaxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxNumberType }
     *     
     */
    public void setSupplierTaxNumber(TaxNumberType value) {
        this.supplierTaxNumber = value;
    }

    /**
     * Gets the value of the groupMemberTaxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TaxNumberType }
     *     
     */
    public TaxNumberType getGroupMemberTaxNumber() {
        return groupMemberTaxNumber;
    }

    /**
     * Sets the value of the groupMemberTaxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxNumberType }
     *     
     */
    public void setGroupMemberTaxNumber(TaxNumberType value) {
        this.groupMemberTaxNumber = value;
    }

    /**
     * Gets the value of the communityVatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunityVatNumber() {
        return communityVatNumber;
    }

    /**
     * Sets the value of the communityVatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunityVatNumber(String value) {
        this.communityVatNumber = value;
    }

    /**
     * Gets the value of the supplierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * Sets the value of the supplierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierName(String value) {
        this.supplierName = value;
    }

    /**
     * Gets the value of the supplierAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getSupplierAddress() {
        return supplierAddress;
    }

    /**
     * Sets the value of the supplierAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setSupplierAddress(AddressType value) {
        this.supplierAddress = value;
    }

    /**
     * Gets the value of the supplierBankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierBankAccountNumber() {
        return supplierBankAccountNumber;
    }

    /**
     * Sets the value of the supplierBankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierBankAccountNumber(String value) {
        this.supplierBankAccountNumber = value;
    }

    /**
     * Gets the value of the individualExemption property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndividualExemption() {
        return individualExemption;
    }

    /**
     * Sets the value of the individualExemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndividualExemption(Boolean value) {
        this.individualExemption = value;
    }

    /**
     * Gets the value of the exciseLicenceNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExciseLicenceNum() {
        return exciseLicenceNum;
    }

    /**
     * Sets the value of the exciseLicenceNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExciseLicenceNum(String value) {
        this.exciseLicenceNum = value;
    }

}
