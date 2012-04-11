
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SUBTIPO_AGRUPACION_FONDO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SUBTIPO_AGRUPACION_FONDO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_AGRUPACION_FONDO" type="{http://www.isban.es/webservices/TDCs}TIPO_AGRUPACION_FONDO_Type"/>
 *         &lt;element name="OPERACION_BANCARIA" type="{http://www.isban.es/webservices/TDCc}OPERACION_BANCARIA_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SUBTIPO_AGRUPACION_FONDO_Type", propOrder = {
    "tipoagrupacionfondo",
    "operacionbancaria"
})
public class SUBTIPOAGRUPACIONFONDOType {

    @XmlElement(name = "TIPO_AGRUPACION_FONDO", required = true)
    protected String tipoagrupacionfondo;
    @XmlElement(name = "OPERACION_BANCARIA", required = true)
    protected OPERACIONBANCARIAType operacionbancaria;

    /**
     * Gets the value of the tipoagrupacionfondo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOAGRUPACIONFONDO() {
        return tipoagrupacionfondo;
    }

    /**
     * Sets the value of the tipoagrupacionfondo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOAGRUPACIONFONDO(String value) {
        this.tipoagrupacionfondo = value;
    }

    /**
     * Gets the value of the operacionbancaria property.
     * 
     * @return
     *     possible object is
     *     {@link OPERACIONBANCARIAType }
     *     
     */
    public OPERACIONBANCARIAType getOPERACIONBANCARIA() {
        return operacionbancaria;
    }

    /**
     * Sets the value of the operacionbancaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link OPERACIONBANCARIAType }
     *     
     */
    public void setOPERACIONBANCARIA(OPERACIONBANCARIAType value) {
        this.operacionbancaria = value;
    }

}
