
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TIPO_OFICINA_FMIS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIPO_OFICINA_FMIS_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA_FMIS" type="{http://www.isban.es/webservices/TDCs}EMPRESA_FMIS_Type"/>
 *         &lt;element name="CODIGO_TIPO_OFICINA_FMIS" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIPO_OFICINA_FMIS_Type", propOrder = {
    "empresafmis",
    "codigotipooficinafmis"
})
public class TIPOOFICINAFMISType {

    @XmlElement(name = "EMPRESA_FMIS", required = true)
    protected String empresafmis;
    @XmlElement(name = "CODIGO_TIPO_OFICINA_FMIS", required = true)
    protected String codigotipooficinafmis;

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
     * Gets the value of the codigotipooficinafmis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOTIPOOFICINAFMIS() {
        return codigotipooficinafmis;
    }

    /**
     * Sets the value of the codigotipooficinafmis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOTIPOOFICINAFMIS(String value) {
        this.codigotipooficinafmis = value;
    }

}
