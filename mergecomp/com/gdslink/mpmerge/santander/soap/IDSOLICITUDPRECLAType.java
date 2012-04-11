
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ID_SOLICITUD_PRECLA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ID_SOLICITUD_PRECLA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CENTRO" type="{http://www.isban.es/webservices/TDCc}CENTRO_Type"/>
 *         &lt;element name="COD_CASO" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_10_Type"/>
 *         &lt;element name="VERSION" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *         &lt;element name="COD_SOLICITUD" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ID_SOLICITUD_PRECLA_Type", propOrder = {
    "centro",
    "codcaso",
    "version",
    "codsolicitud"
})
public class IDSOLICITUDPRECLAType {

    @XmlElement(name = "CENTRO", required = true)
    protected CENTROType centro;
    @XmlElement(name = "COD_CASO", required = true)
    protected String codcaso;
    @XmlElement(name = "VERSION", required = true)
    protected String version;
    @XmlElement(name = "COD_SOLICITUD", required = true)
    protected String codsolicitud;

    /**
     * Gets the value of the centro property.
     * 
     * @return
     *     possible object is
     *     {@link CENTROType }
     *     
     */
    public CENTROType getCENTRO() {
        return centro;
    }

    /**
     * Sets the value of the centro property.
     * 
     * @param value
     *     allowed object is
     *     {@link CENTROType }
     *     
     */
    public void setCENTRO(CENTROType value) {
        this.centro = value;
    }

    /**
     * Gets the value of the codcaso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODCASO() {
        return codcaso;
    }

    /**
     * Sets the value of the codcaso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODCASO(String value) {
        this.codcaso = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVERSION() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVERSION(String value) {
        this.version = value;
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
