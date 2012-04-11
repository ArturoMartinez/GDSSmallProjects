
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COB_SOLICITUD_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COB_SOLICITUD_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COB_CASO" type="{http://www.isban.es/webservices/TDCc}COB_CASO_Type"/>
 *         &lt;element name="COD_SOLICITUD" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COB_SOLICITUD_Type", propOrder = {
    "cobcaso",
    "codsolicitud"
})
public class COBSOLICITUDType {

    @XmlElement(name = "COB_CASO", required = true)
    protected COBCASOType cobcaso;
    @XmlElement(name = "COD_SOLICITUD", required = true)
    protected String codsolicitud;

    /**
     * Gets the value of the cobcaso property.
     * 
     * @return
     *     possible object is
     *     {@link COBCASOType }
     *     
     */
    public COBCASOType getCOBCASO() {
        return cobcaso;
    }

    /**
     * Sets the value of the cobcaso property.
     * 
     * @param value
     *     allowed object is
     *     {@link COBCASOType }
     *     
     */
    public void setCOBCASO(COBCASOType value) {
        this.cobcaso = value;
    }

    /**
     * Gets the value of the codsolicitud property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODSOLICITUD() {
        return codsolicitud;
    }

    /**
     * Sets the value of the codsolicitud property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODSOLICITUD(String value) {
        this.codsolicitud = value;
    }

}
