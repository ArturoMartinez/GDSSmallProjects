
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ID_RECLAMACION_CASO_DP_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ID_RECLAMACION_CASO_DP_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CENTRO" type="{http://www.isban.es/webservices/TDCc}CENTRO_Type"/>
 *         &lt;element name="CODIGO_CASO_RECLAMACION" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_10_Type"/>
 *         &lt;element name="VERSION" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *         &lt;element name="CODIGO_RECLAMACION" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ID_RECLAMACION_CASO_DP_Type", propOrder = {
    "centro",
    "codigocasoreclamacion",
    "version",
    "codigoreclamacion"
})
public class IDRECLAMACIONCASODPType {

    @XmlElement(name = "CENTRO", required = true)
    protected CENTROType centro;
    @XmlElement(name = "CODIGO_CASO_RECLAMACION")
    protected long codigocasoreclamacion;
    @XmlElement(name = "VERSION", required = true)
    protected String version;
    @XmlElement(name = "CODIGO_RECLAMACION", required = true)
    protected String codigoreclamacion;

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
     * Gets the value of the codigocasoreclamacion property.
     * 
     */
    public long getCODIGOCASORECLAMACION() {
        return codigocasoreclamacion;
    }

    /**
     * Sets the value of the codigocasoreclamacion property.
     * 
     */
    public void setCODIGOCASORECLAMACION(long value) {
        this.codigocasoreclamacion = value;
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
     * Gets the value of the codigoreclamacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGORECLAMACION() {
        return codigoreclamacion;
    }

    /**
     * Sets the value of the codigoreclamacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGORECLAMACION(String value) {
        this.codigoreclamacion = value;
    }

}
