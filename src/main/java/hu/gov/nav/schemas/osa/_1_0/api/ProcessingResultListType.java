//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.05 at 09:47:06 AM CEST 
//


package hu.gov.nav.schemas.osa._1_0.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A kéréshez tartozó feldolgozási eredmények
 * 
 * <p>Java class for ProcessingResultListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessingResultListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="processingResult" type="{http://schemas.nav.gov.hu/OSA/1.0/api}ProcessingResultType" maxOccurs="100"/>
 *         &lt;element name="originalRequestVersion" type="{http://schemas.nav.gov.hu/OSA/1.0/api}RequestVersionType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingResultListType", propOrder = {
    "processingResult",
    "originalRequestVersion"
})
public class ProcessingResultListType {

    @XmlElement(required = true)
    protected List<ProcessingResultType> processingResult;
    @XmlElement(required = true)
    protected String originalRequestVersion;

    /**
     * Gets the value of the processingResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processingResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessingResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessingResultType }
     * 
     * 
     */
    public List<ProcessingResultType> getProcessingResult() {
        if (processingResult == null) {
            processingResult = new ArrayList<ProcessingResultType>();
        }
        return this.processingResult;
    }

    /**
     * Gets the value of the originalRequestVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalRequestVersion() {
        return originalRequestVersion;
    }

    /**
     * Sets the value of the originalRequestVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalRequestVersion(String value) {
        this.originalRequestVersion = value;
    }

}
