
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SUBAPLICACION_RETRO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SUBAPLICACION_RETRO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="COD_SUBAPLICACION_RETRO" type="{http://www.isban.es/webservices/TDCs}CODIGO_DE_SUBAPLICACION_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SUBAPLICACION_RETRO_Type", propOrder = {
    "empresa",
    "codsubaplicacionretro"
})
public class SUBAPLICACIONRETROType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "COD_SUBAPLICACION_RETRO", required = true)
    protected String codsubaplicacionretro;

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
     * Gets the value of the codsubaplicacionretro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODSUBAPLICACIONRETRO() {
        return codsubaplicacionretro;
    }

    /**
     * Sets the value of the codsubaplicacionretro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODSUBAPLICACIONRETRO(String value) {
        this.codsubaplicacionretro = value;
    }

}
