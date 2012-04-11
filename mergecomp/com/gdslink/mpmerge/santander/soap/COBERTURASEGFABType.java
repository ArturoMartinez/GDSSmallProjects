
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COBERTURA_SEG_FAB_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COBERTURA_SEG_FAB_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COMPANIA_DE_SEGUROS" type="{http://www.isban.es/webservices/TDCs}COMPANIA_DE_SEGUROS_Type"/>
 *         &lt;element name="CODIGO_COBERTURA_" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COBERTURA_SEG_FAB_Type", propOrder = {
    "companiadeseguros",
    "codigocobertura"
})
public class COBERTURASEGFABType {

    @XmlElement(name = "COMPANIA_DE_SEGUROS", required = true)
    protected String companiadeseguros;
    @XmlElement(name = "CODIGO_COBERTURA_", required = true)
    protected String codigocobertura;

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
     * Gets the value of the codigocobertura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOCOBERTURA() {
        return codigocobertura;
    }

    /**
     * Sets the value of the codigocobertura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOCOBERTURA(String value) {
        this.codigocobertura = value;
    }

}
