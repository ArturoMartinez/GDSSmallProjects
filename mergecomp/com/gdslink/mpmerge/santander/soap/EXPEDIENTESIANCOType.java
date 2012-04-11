
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXPEDIENTE_SIANCO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXPEDIENTE_SIANCO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="TIPO_AGRUPACION_CANALES" type="{http://www.isban.es/webservices/TDCs}TIPO_AGRUPACION_CANALES_Type"/>
 *         &lt;element name="COD_EXPEDIENTE" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_7_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXPEDIENTE_SIANCO_Type", propOrder = {
    "empresa",
    "tipoagrupacioncanales",
    "codexpediente"
})
public class EXPEDIENTESIANCOType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "TIPO_AGRUPACION_CANALES", required = true)
    protected String tipoagrupacioncanales;
    @XmlElement(name = "COD_EXPEDIENTE", required = true)
    protected String codexpediente;

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
     * Gets the value of the tipoagrupacioncanales property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOAGRUPACIONCANALES() {
        return tipoagrupacioncanales;
    }

    /**
     * Sets the value of the tipoagrupacioncanales property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOAGRUPACIONCANALES(String value) {
        this.tipoagrupacioncanales = value;
    }

    /**
     * Gets the value of the codexpediente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODEXPEDIENTE() {
        return codexpediente;
    }

    /**
     * Sets the value of the codexpediente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODEXPEDIENTE(String value) {
        this.codexpediente = value;
    }

}
