
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GRUPO_DOT_CLA_PNC_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GRUPO_DOT_CLA_PNC_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TRATAMIENTO_PNC" type="{http://www.isban.es/webservices/TDCc}TRATAMIENTO_PNC_Type"/>
 *         &lt;element name="COD_GRUPO" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_4_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GRUPO_DOT_CLA_PNC_Type", propOrder = {
    "tratamientopnc",
    "codgrupo"
})
public class GRUPODOTCLAPNCType {

    @XmlElement(name = "TRATAMIENTO_PNC", required = true)
    protected TRATAMIENTOPNCType tratamientopnc;
    @XmlElement(name = "COD_GRUPO", required = true)
    protected String codgrupo;

    /**
     * Gets the value of the tratamientopnc property.
     * 
     * @return
     *     possible object is
     *     {@link TRATAMIENTOPNCType }
     *     
     */
    public TRATAMIENTOPNCType getTRATAMIENTOPNC() {
        return tratamientopnc;
    }

    /**
     * Sets the value of the tratamientopnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRATAMIENTOPNCType }
     *     
     */
    public void setTRATAMIENTOPNC(TRATAMIENTOPNCType value) {
        this.tratamientopnc = value;
    }

    /**
     * Gets the value of the codgrupo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODGRUPO() {
        return codgrupo;
    }

    /**
     * Sets the value of the codgrupo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODGRUPO(String value) {
        this.codgrupo = value;
    }

}
