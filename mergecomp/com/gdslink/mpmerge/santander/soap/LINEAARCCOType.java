
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LINEA_ARCCO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LINEA_ARCCO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="APLICACION_INFORMATICA" type="{http://www.isban.es/webservices/TDCs}APLICACION_INFORMATICA_Type"/>
 *         &lt;element name="CODIGO_ALFANUM_6" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_6_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LINEA_ARCCO_Type", propOrder = {
    "empresa",
    "aplicacioninformatica",
    "codigoalfanum6"
})
public class LINEAARCCOType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "APLICACION_INFORMATICA", required = true)
    protected String aplicacioninformatica;
    @XmlElement(name = "CODIGO_ALFANUM_6", required = true)
    protected String codigoalfanum6;

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
     * Gets the value of the aplicacioninformatica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPLICACIONINFORMATICA() {
        return aplicacioninformatica;
    }

    /**
     * Sets the value of the aplicacioninformatica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPLICACIONINFORMATICA(String value) {
        this.aplicacioninformatica = value;
    }

    /**
     * Gets the value of the codigoalfanum6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOALFANUM6() {
        return codigoalfanum6;
    }

    /**
     * Sets the value of the codigoalfanum6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOALFANUM6(String value) {
        this.codigoalfanum6 = value;
    }

}
