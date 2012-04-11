
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SEGMENTO_FMIS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SEGMENTO_FMIS_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="APLICACION_FMIS" type="{http://www.isban.es/webservices/TDCs}APLICACION_FMIS_Type"/>
 *         &lt;element name="EMPRESA_FMIS" type="{http://www.isban.es/webservices/TDCs}EMPRESA_FMIS_Type"/>
 *         &lt;element name="CODIGO_SEGMENTO_FMIS" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SEGMENTO_FMIS_Type", propOrder = {
    "aplicacionfmis",
    "empresafmis",
    "codigosegmentofmis"
})
public class SEGMENTOFMISType {

    @XmlElement(name = "APLICACION_FMIS", required = true)
    protected String aplicacionfmis;
    @XmlElement(name = "EMPRESA_FMIS", required = true)
    protected String empresafmis;
    @XmlElement(name = "CODIGO_SEGMENTO_FMIS", required = true)
    protected String codigosegmentofmis;

    /**
     * Gets the value of the aplicacionfmis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPLICACIONFMIS() {
        return aplicacionfmis;
    }

    /**
     * Sets the value of the aplicacionfmis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPLICACIONFMIS(String value) {
        this.aplicacionfmis = value;
    }

    /**
     * Gets the value of the empresafmis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPRESAFMIS() {
        return empresafmis;
    }

    /**
     * Sets the value of the empresafmis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPRESAFMIS(String value) {
        this.empresafmis = value;
    }

    /**
     * Gets the value of the codigosegmentofmis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOSEGMENTOFMIS() {
        return codigosegmentofmis;
    }

    /**
     * Sets the value of the codigosegmentofmis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOSEGMENTOFMIS(String value) {
        this.codigosegmentofmis = value;
    }

}
