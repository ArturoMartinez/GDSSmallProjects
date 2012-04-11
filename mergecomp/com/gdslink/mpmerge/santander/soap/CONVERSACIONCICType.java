
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CONVERSACION_CIC_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CONVERSACION_CIC_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INTERACCION_CIC" type="{http://www.isban.es/webservices/TDCc}INTERACCION_CIC_Type"/>
 *         &lt;element name="NRO_DE_CONVERSACION" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONVERSACION_CIC_Type", propOrder = {
    "interaccioncic",
    "nrodeconversacion"
})
public class CONVERSACIONCICType {

    @XmlElement(name = "INTERACCION_CIC", required = true)
    protected INTERACCIONCICType interaccioncic;
    @XmlElement(name = "NRO_DE_CONVERSACION", required = true)
    protected String nrodeconversacion;

    /**
     * Gets the value of the interaccioncic property.
     * 
     * @return
     *     possible object is
     *     {@link INTERACCIONCICType }
     *     
     */
    public INTERACCIONCICType getINTERACCIONCIC() {
        return interaccioncic;
    }

    /**
     * Sets the value of the interaccioncic property.
     * 
     * @param value
     *     allowed object is
     *     {@link INTERACCIONCICType }
     *     
     */
    public void setINTERACCIONCIC(INTERACCIONCICType value) {
        this.interaccioncic = value;
    }

    /**
     * Gets the value of the nrodeconversacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRODECONVERSACION() {
        return nrodeconversacion;
    }

    /**
     * Sets the value of the nrodeconversacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRODECONVERSACION(String value) {
        this.nrodeconversacion = value;
    }

}
