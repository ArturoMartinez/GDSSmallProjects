
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TARIFA_TABLA_SEG_DIST_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TARIFA_TABLA_SEG_DIST_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VALOR_CAMPO_PARAM_SEG" type="{http://www.isban.es/webservices/TDCc}VALOR_CAMPO_PARAM_SEG_Type"/>
 *         &lt;element name="CODIGO_TABLA" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_SIN_ESP_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TARIFA_TABLA_SEG_DIST_Type", propOrder = {
    "valorcampoparamseg",
    "codigotabla"
})
public class TARIFATABLASEGDISTType {

    @XmlElement(name = "VALOR_CAMPO_PARAM_SEG", required = true)
    protected VALORCAMPOPARAMSEGType valorcampoparamseg;
    @XmlElement(name = "CODIGO_TABLA", required = true)
    protected String codigotabla;

    /**
     * Gets the value of the valorcampoparamseg property.
     * 
     * @return
     *     possible object is
     *     {@link VALORCAMPOPARAMSEGType }
     *     
     */
    public VALORCAMPOPARAMSEGType getVALORCAMPOPARAMSEG() {
        return valorcampoparamseg;
    }

    /**
     * Sets the value of the valorcampoparamseg property.
     * 
     * @param value
     *     allowed object is
     *     {@link VALORCAMPOPARAMSEGType }
     *     
     */
    public void setVALORCAMPOPARAMSEG(VALORCAMPOPARAMSEGType value) {
        this.valorcampoparamseg = value;
    }

    /**
     * Gets the value of the codigotabla property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOTABLA() {
        return codigotabla;
    }

    /**
     * Sets the value of the codigotabla property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOTABLA(String value) {
        this.codigotabla = value;
    }

}
