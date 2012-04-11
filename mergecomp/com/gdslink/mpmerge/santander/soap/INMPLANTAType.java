
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for INM_PLANTA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INM_PLANTA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INM_INMUEBLE" type="{http://www.isban.es/webservices/TDCs}INM_INMUEBLE_Type"/>
 *         &lt;element name="COD_PLANTA" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INM_PLANTA_Type", propOrder = {
    "inminmueble",
    "codplanta"
})
public class INMPLANTAType {

    @XmlElement(name = "INM_INMUEBLE", required = true)
    protected String inminmueble;
    @XmlElement(name = "COD_PLANTA", required = true)
    protected String codplanta;

    /**
     * Gets the value of the inminmueble property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINMINMUEBLE() {
        return inminmueble;
    }

    /**
     * Sets the value of the inminmueble property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINMINMUEBLE(String value) {
        this.inminmueble = value;
    }

    /**
     * Gets the value of the codplanta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODPLANTA() {
        return codplanta;
    }

    /**
     * Sets the value of the codplanta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODPLANTA(String value) {
        this.codplanta = value;
    }

}
