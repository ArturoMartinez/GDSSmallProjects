
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CLASE_DETALLE_FICHA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CLASE_DETALLE_FICHA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SUBTIPO_DETALLE_FICHA" type="{http://www.isban.es/webservices/TDCc}SUBTIPO_DETALLE_FICHA_Type"/>
 *         &lt;element name="CLASE_DETALLE_FICHA" type="{http://www.isban.es/webservices/TDCs}CODIGO_SUBTIPO_DE_FICHA_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CLASE_DETALLE_FICHA_Type", propOrder = {
    "subtipodetalleficha",
    "clasedetalleficha"
})
public class CLASEDETALLEFICHAType {

    @XmlElement(name = "SUBTIPO_DETALLE_FICHA", required = true)
    protected SUBTIPODETALLEFICHAType subtipodetalleficha;
    @XmlElement(name = "CLASE_DETALLE_FICHA", required = true)
    protected String clasedetalleficha;

    /**
     * Gets the value of the subtipodetalleficha property.
     * 
     * @return
     *     possible object is
     *     {@link SUBTIPODETALLEFICHAType }
     *     
     */
    public SUBTIPODETALLEFICHAType getSUBTIPODETALLEFICHA() {
        return subtipodetalleficha;
    }

    /**
     * Sets the value of the subtipodetalleficha property.
     * 
     * @param value
     *     allowed object is
     *     {@link SUBTIPODETALLEFICHAType }
     *     
     */
    public void setSUBTIPODETALLEFICHA(SUBTIPODETALLEFICHAType value) {
        this.subtipodetalleficha = value;
    }

    /**
     * Gets the value of the clasedetalleficha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASEDETALLEFICHA() {
        return clasedetalleficha;
    }

    /**
     * Sets the value of the clasedetalleficha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASEDETALLEFICHA(String value) {
        this.clasedetalleficha = value;
    }

}
