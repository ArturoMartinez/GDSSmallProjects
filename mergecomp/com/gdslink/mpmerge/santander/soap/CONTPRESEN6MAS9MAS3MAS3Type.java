
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CONT_PRESEN_6MAS9MAS3MAS3_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CONT_PRESEN_6MAS9MAS3MAS3_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CLAVE_CLASIFICACION" type="{http://www.isban.es/webservices/TDCs}CLAVE_CLASIFICACION_INTER_Type"/>
 *         &lt;element name="NUMERO_CONTRATO" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_9_Type"/>
 *         &lt;element name="SURCODE" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *         &lt;element name="SURCODE_2" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONT_PRESEN_6MAS9MAS3MAS3_Type", propOrder = {
    "claveclasificacion",
    "numerocontrato",
    "surcode",
    "surcode2"
})
public class CONTPRESEN6MAS9MAS3MAS3Type {

    @XmlElement(name = "CLAVE_CLASIFICACION", required = true)
    protected String claveclasificacion;
    @XmlElement(name = "NUMERO_CONTRATO", required = true)
    protected String numerocontrato;
    @XmlElement(name = "SURCODE", required = true)
    protected String surcode;
    @XmlElement(name = "SURCODE_2", required = true)
    protected String surcode2;

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

    /**
     * Gets the value of the surcode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSURCODE2() {
        return surcode2;
    }

    /**
     * Sets the value of the surcode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSURCODE2(String value) {
        this.surcode2 = value;
    }

}
