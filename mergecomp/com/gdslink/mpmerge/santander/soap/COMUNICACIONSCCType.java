
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COMUNICACION_SCC_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COMUNICACION_SCC_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="COD_COMUNICACION" type="{http://www.isban.es/webservices/TDCs}CODIGO_DE_SUBAPLICACION_Type"/>
 *         &lt;element name="COD_SEC_COMUNICACION" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_17_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COMUNICACION_SCC_Type", propOrder = {
    "empresa",
    "codcomunicacion",
    "codseccomunicacion"
})
public class COMUNICACIONSCCType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "COD_COMUNICACION", required = true)
    protected String codcomunicacion;
    @XmlElement(name = "COD_SEC_COMUNICACION", required = true)
    protected String codseccomunicacion;

    /**
     * Gets the value of the empresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPRESA() {
        return empresa;
    }

    /**
     * Sets the value of the empresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPRESA(String value) {
        this.empresa = value;
    }

    /**
     * Gets the value of the codcomunicacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODCOMUNICACION() {
        return codcomunicacion;
    }

    /**
     * Sets the value of the codcomunicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODCOMUNICACION(String value) {
        this.codcomunicacion = value;
    }

    /**
     * Gets the value of the codseccomunicacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODSECCOMUNICACION() {
        return codseccomunicacion;
    }

    /**
     * Sets the value of the codseccomunicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODSECCOMUNICACION(String value) {
        this.codseccomunicacion = value;
    }

}
