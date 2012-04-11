
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CIRCUITO_DE_ADMISION_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CIRCUITO_DE_ADMISION_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="CIRCUITO_ADMISION" type="{http://www.isban.es/webservices/TDCs}COD_CIRCUITO_DE_ADMISION_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CIRCUITO_DE_ADMISION_Type", propOrder = {
    "empresa",
    "circuitoadmision"
})
public class CIRCUITODEADMISIONType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "CIRCUITO_ADMISION", required = true)
    protected String circuitoadmision;

    /**
     * Gets the value of the empresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPRESA() {
        return empresa;
    }

    /**
     * Sets the value of the empresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPRESA(String value) {
        this.empresa = value;
    }

    /**
     * Gets the value of the circuitoadmision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIRCUITOADMISION() {
        return circuitoadmision;
    }

    /**
     * Sets the value of the circuitoadmision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIRCUITOADMISION(String value) {
        this.circuitoadmision = value;
    }

}
