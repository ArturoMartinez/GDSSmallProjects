
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APLICACION_RETRO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APLICACION_RETRO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="COD_APLICACION_RETRO" type="{http://www.isban.es/webservices/TDCs}APLICACION_INFORMATICA_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APLICACION_RETRO_Type", propOrder = {
    "empresa",
    "codaplicacionretro"
})
public class APLICACIONRETROType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "COD_APLICACION_RETRO", required = true)
    protected String codaplicacionretro;

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
     * Gets the value of the codaplicacionretro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODAPLICACIONRETRO() {
        return codaplicacionretro;
    }

    /**
     * Sets the value of the codaplicacionretro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODAPLICACIONRETRO(String value) {
        this.codaplicacionretro = value;
    }

}
