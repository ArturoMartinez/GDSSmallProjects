
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CHAVE_PRODUCTO_BR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CHAVE_PRODUCTO_BR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODIGO_ALFANUM_2" type="{http://www.isban.es/webservices/TDCs}PRODUCTO_BR_Type"/>
 *         &lt;element name="CODIGO_ALFANUM_4" type="{http://www.isban.es/webservices/TDCs}SUBPRODUCTO_BR_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CHAVE_PRODUCTO_BR_Type", propOrder = {
    "codigoalfanum2",
    "codigoalfanum4"
})
public class CHAVEPRODUCTOBRType {

    @XmlElement(name = "CODIGO_ALFANUM_2", required = true)
    protected String codigoalfanum2;
    @XmlElement(name = "CODIGO_ALFANUM_4", required = true)
    protected String codigoalfanum4;

    /**
     * Gets the value of the codigoalfanum2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOALFANUM2() {
        return codigoalfanum2;
    }

    /**
     * Sets the value of the codigoalfanum2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOALFANUM2(String value) {
        this.codigoalfanum2 = value;
    }

    /**
     * Gets the value of the codigoalfanum4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOALFANUM4() {
        return codigoalfanum4;
    }

    /**
     * Sets the value of the codigoalfanum4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOALFANUM4(String value) {
        this.codigoalfanum4 = value;
    }

}
