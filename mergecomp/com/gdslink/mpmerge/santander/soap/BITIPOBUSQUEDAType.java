
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BI_TIPO_BUSQUEDA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BI_TIPO_BUSQUEDA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BI_TIPO_BIEN" type="{http://www.isban.es/webservices/TDCs}BI_TIPO_BIEN_Type"/>
 *         &lt;element name="COD_TIPO_BUSQUEDA" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BI_TIPO_BUSQUEDA_Type", propOrder = {
    "bitipobien",
    "codtipobusqueda"
})
public class BITIPOBUSQUEDAType {

    @XmlElement(name = "BI_TIPO_BIEN", required = true)
    protected String bitipobien;
    @XmlElement(name = "COD_TIPO_BUSQUEDA", required = true)
    protected String codtipobusqueda;

    /**
     * Gets the value of the bitipobien property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBITIPOBIEN() {
        return bitipobien;
    }

    /**
     * Sets the value of the bitipobien property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBITIPOBIEN(String value) {
        this.bitipobien = value;
    }

    /**
     * Gets the value of the codtipobusqueda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODTIPOBUSQUEDA() {
        return codtipobusqueda;
    }

    /**
     * Sets the value of the codtipobusqueda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODTIPOBUSQUEDA(String value) {
        this.codtipobusqueda = value;
    }

}
