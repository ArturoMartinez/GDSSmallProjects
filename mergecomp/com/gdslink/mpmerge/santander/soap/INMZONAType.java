
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for INM_ZONA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INM_ZONA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INM_PLANTA" type="{http://www.isban.es/webservices/TDCc}INM_PLANTA_Type"/>
 *         &lt;element name="COD_ZONA" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INM_ZONA_Type", propOrder = {
    "inmplanta",
    "codzona"
})
public class INMZONAType {

    @XmlElement(name = "INM_PLANTA", required = true)
    protected INMPLANTAType inmplanta;
    @XmlElement(name = "COD_ZONA", required = true)
    protected String codzona;

    /**
     * Gets the value of the inmplanta property.
     * 
     * @return
     *     possible object is
     *     {@link INMPLANTAType }
     *     
     */
    public INMPLANTAType getINMPLANTA() {
        return inmplanta;
    }

    /**
     * Sets the value of the inmplanta property.
     * 
     * @param value
     *     allowed object is
     *     {@link INMPLANTAType }
     *     
     */
    public void setINMPLANTA(INMPLANTAType value) {
        this.inmplanta = value;
    }

    /**
     * Gets the value of the codzona property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODZONA() {
        return codzona;
    }

    /**
     * Sets the value of the codzona property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODZONA(String value) {
        this.codzona = value;
    }

}
