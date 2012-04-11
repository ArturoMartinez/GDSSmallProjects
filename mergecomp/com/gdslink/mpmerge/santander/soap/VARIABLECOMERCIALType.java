
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VARIABLE_COMERCIAL_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VARIABLE_COMERCIAL_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODIGO_VARIABLE_COMERCIAL" type="{http://www.isban.es/webservices/TDCs}CODIGO_VARIABLE_COMERCIAL_Type"/>
 *         &lt;element name="VALOR_VARIABLE_COMERCIAL" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_8_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VARIABLE_COMERCIAL_Type", propOrder = {
    "codigovariablecomercial",
    "valorvariablecomercial"
})
public class VARIABLECOMERCIALType {

    @XmlElement(name = "CODIGO_VARIABLE_COMERCIAL", required = true)
    protected String codigovariablecomercial;
    @XmlElement(name = "VALOR_VARIABLE_COMERCIAL", required = true)
    protected String valorvariablecomercial;

    /**
     * Gets the value of the codigovariablecomercial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOVARIABLECOMERCIAL() {
        return codigovariablecomercial;
    }

    /**
     * Sets the value of the codigovariablecomercial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOVARIABLECOMERCIAL(String value) {
        this.codigovariablecomercial = value;
    }

    /**
     * Gets the value of the valorvariablecomercial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALORVARIABLECOMERCIAL() {
        return valorvariablecomercial;
    }

    /**
     * Sets the value of the valorvariablecomercial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALORVARIABLECOMERCIAL(String value) {
        this.valorvariablecomercial = value;
    }

}
