
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FONDO_SEGUROS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FONDO_SEGUROS_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COMPANIA_DE_SEGUROS" type="{http://www.isban.es/webservices/TDCs}COMPANIA_DE_SEGUROS_Type"/>
 *         &lt;element name="COD_FONDO" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_4_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FONDO_SEGUROS_Type", propOrder = {
    "companiadeseguros",
    "codfondo"
})
public class FONDOSEGUROSType {

    @XmlElement(name = "COMPANIA_DE_SEGUROS", required = true)
    protected String companiadeseguros;
    @XmlElement(name = "COD_FONDO", required = true)
    protected String codfondo;

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
     * Gets the value of the codfondo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODFONDO() {
        return codfondo;
    }

    /**
     * Sets the value of the codfondo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODFONDO(String value) {
        this.codfondo = value;
    }

}
