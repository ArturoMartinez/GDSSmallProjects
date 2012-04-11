
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OFICINA_EUROPEA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OFICINA_EUROPEA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PAIS" type="{http://www.isban.es/webservices/TDCs}PAIS_Type"/>
 *         &lt;element name="CODIGO_ALFANUM_10" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_10_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OFICINA_EUROPEA_Type", propOrder = {
    "pais",
    "codigoalfanum10"
})
public class OFICINAEUROPEAType {

    @XmlElement(name = "PAIS", required = true)
    protected String pais;
    @XmlElement(name = "CODIGO_ALFANUM_10", required = true)
    protected String codigoalfanum10;

    /**
     * Gets the value of the pais property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAIS() {
        return pais;
    }

    /**
     * Sets the value of the pais property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAIS(String value) {
        this.pais = value;
    }

    /**
     * Gets the value of the codigoalfanum10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOALFANUM10() {
        return codigoalfanum10;
    }

    /**
     * Sets the value of the codigoalfanum10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOALFANUM10(String value) {
        this.codigoalfanum10 = value;
    }

}
