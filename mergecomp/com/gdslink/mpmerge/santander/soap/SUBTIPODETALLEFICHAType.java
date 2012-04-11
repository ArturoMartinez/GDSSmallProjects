
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SUBTIPO_DETALLE_FICHA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SUBTIPO_DETALLE_FICHA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_DETALLE_FICHA" type="{http://www.isban.es/webservices/TDCs}COD_TIPO_DETALLE_FICHA_Type"/>
 *         &lt;element name="SUBTIPO_DETALLE_FICHA" type="{http://www.isban.es/webservices/TDCs}COD_SUBTIPO_DETALLE_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SUBTIPO_DETALLE_FICHA_Type", propOrder = {
    "tipodetalleficha",
    "subtipodetalleficha"
})
public class SUBTIPODETALLEFICHAType {

    @XmlElement(name = "TIPO_DETALLE_FICHA", required = true)
    protected String tipodetalleficha;
    @XmlElement(name = "SUBTIPO_DETALLE_FICHA", required = true)
    protected String subtipodetalleficha;

    /**
     * Gets the value of the tipodetalleficha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODETALLEFICHA() {
        return tipodetalleficha;
    }

    /**
     * Sets the value of the tipodetalleficha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODETALLEFICHA(String value) {
        this.tipodetalleficha = value;
    }

    /**
     * Gets the value of the subtipodetalleficha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBTIPODETALLEFICHA() {
        return subtipodetalleficha;
    }

    /**
     * Sets the value of the subtipodetalleficha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBTIPODETALLEFICHA(String value) {
        this.subtipodetalleficha = value;
    }

}
