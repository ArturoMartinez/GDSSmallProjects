
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NOMBRE_PERS_COMPTO_BR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NOMBRE_PERS_COMPTO_BR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NOMBRE_PERSONA_BR" type="{http://www.isban.es/webservices/TDCs}NOMBRE_PERSONA_BR_Type"/>
 *         &lt;element name="PRIMER_AP_PERSONA_BR" type="{http://www.isban.es/webservices/TDCs}PRIMER_AP_PERSONA_BR_Type"/>
 *         &lt;element name="SEGUNDO_AP_PERSONA_BR" type="{http://www.isban.es/webservices/TDCs}SEGUNDO_AP_PERSONA_BR_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NOMBRE_PERS_COMPTO_BR_Type", propOrder = {
    "nombrepersonabr",
    "primerappersonabr",
    "segundoappersonabr"
})
public class NOMBREPERSCOMPTOBRType {

    @XmlElement(name = "NOMBRE_PERSONA_BR", required = true)
    protected String nombrepersonabr;
    @XmlElement(name = "PRIMER_AP_PERSONA_BR", required = true)
    protected String primerappersonabr;
    @XmlElement(name = "SEGUNDO_AP_PERSONA_BR", required = true)
    protected String segundoappersonabr;

    /**
     * Gets the value of the nombrepersonabr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBREPERSONABR() {
        return nombrepersonabr;
    }

    /**
     * Sets the value of the nombrepersonabr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBREPERSONABR(String value) {
        this.nombrepersonabr = value;
    }

    /**
     * Gets the value of the primerappersonabr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRIMERAPPERSONABR() {
        return primerappersonabr;
    }

    /**
     * Sets the value of the primerappersonabr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRIMERAPPERSONABR(String value) {
        this.primerappersonabr = value;
    }

    /**
     * Gets the value of the segundoappersonabr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEGUNDOAPPERSONABR() {
        return segundoappersonabr;
    }

    /**
     * Sets the value of the segundoappersonabr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEGUNDOAPPERSONABR(String value) {
        this.segundoappersonabr = value;
    }

}
