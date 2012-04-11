
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TAXONOMIA_BR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TAXONOMIA_BR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ORIGEN" type="{http://www.isban.es/webservices/TDCs}ORIGEN_BR_Type"/>
 *         &lt;element name="FAMILIA" type="{http://www.isban.es/webservices/TDCs}FAMILIA_BR_Type"/>
 *         &lt;element name="SUBFAMILIA" type="{http://www.isban.es/webservices/TDCs}SUBFAMILIA_BR_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAXONOMIA_BR_Type", propOrder = {
    "origen",
    "familia",
    "subfamilia"
})
public class TAXONOMIABRType {

    @XmlElement(name = "ORIGEN", required = true)
    protected String origen;
    @XmlElement(name = "FAMILIA", required = true)
    protected String familia;
    @XmlElement(name = "SUBFAMILIA", required = true)
    protected String subfamilia;

    /**
     * Gets the value of the origen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORIGEN() {
        return origen;
    }

    /**
     * Sets the value of the origen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORIGEN(String value) {
        this.origen = value;
    }

    /**
     * Gets the value of the familia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAMILIA() {
        return familia;
    }

    /**
     * Sets the value of the familia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAMILIA(String value) {
        this.familia = value;
    }

    /**
     * Gets the value of the subfamilia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBFAMILIA() {
        return subfamilia;
    }

    /**
     * Sets the value of the subfamilia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBFAMILIA(String value) {
        this.subfamilia = value;
    }

}
