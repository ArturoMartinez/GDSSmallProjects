
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TIPO_CONDICION_RGO_SEG_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIPO_CONDICION_RGO_SEG_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COMPANIA_DE_SEGUROS" type="{http://www.isban.es/webservices/TDCs}COMPANIA_DE_SEGUROS_Type"/>
 *         &lt;element name="CODIGO_DE_CONDICION" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_8_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIPO_CONDICION_RGO_SEG_Type", propOrder = {
    "companiadeseguros",
    "codigodecondicion"
})
public class TIPOCONDICIONRGOSEGType {

    @XmlElement(name = "COMPANIA_DE_SEGUROS", required = true)
    protected String companiadeseguros;
    @XmlElement(name = "CODIGO_DE_CONDICION", required = true)
    protected String codigodecondicion;

    /**
     * Gets the value of the companiadeseguros property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPANIADESEGUROS() {
        return companiadeseguros;
    }

    /**
     * Sets the value of the companiadeseguros property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPANIADESEGUROS(String value) {
        this.companiadeseguros = value;
    }

    /**
     * Gets the value of the codigodecondicion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGODECONDICION() {
        return codigodecondicion;
    }

    /**
     * Sets the value of the codigodecondicion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGODECONDICION(String value) {
        this.codigodecondicion = value;
    }

}
