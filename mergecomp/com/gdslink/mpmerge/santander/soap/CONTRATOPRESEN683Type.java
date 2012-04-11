
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CONTRATO_PRESEN_6_8_3_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CONTRATO_PRESEN_6_8_3_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CLAVE_CLASIFICACION" type="{http://www.isban.es/webservices/TDCs}CLAVE_CLASIFICACION_INTER_Type"/>
 *         &lt;element name="NUMERO_CONTRATO" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_8_Type"/>
 *         &lt;element name="SURCODE" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONTRATO_PRESEN_6_8_3_Type", propOrder = {
    "claveclasificacion",
    "numerocontrato",
    "surcode"
})
public class CONTRATOPRESEN683Type {

    @XmlElement(name = "CLAVE_CLASIFICACION", required = true)
    protected String claveclasificacion;
    @XmlElement(name = "NUMERO_CONTRATO", required = true)
    protected String numerocontrato;
    @XmlElement(name = "SURCODE", required = true)
    protected String surcode;

    /**
     * Gets the value of the claveclasificacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLAVECLASIFICACION() {
        return claveclasificacion;
    }

    /**
     * Sets the value of the claveclasificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLAVECLASIFICACION(String value) {
        this.claveclasificacion = value;
    }

    /**
     * Gets the value of the numerocontrato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROCONTRATO() {
        return numerocontrato;
    }

    /**
     * Sets the value of the numerocontrato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROCONTRATO(String value) {
        this.numerocontrato = value;
    }

    /**
     * Gets the value of the surcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSURCODE() {
        return surcode;
    }

    /**
     * Sets the value of the surcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSURCODE(String value) {
        this.surcode = value;
    }

}
