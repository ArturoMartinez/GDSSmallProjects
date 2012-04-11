
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BI_COMPANIA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BI_COMPANIA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BI_TIPO_COMPANIA" type="{http://www.isban.es/webservices/TDCs}BI_TIPO_COMPANIA_Type"/>
 *         &lt;element name="COD_COMPANIA" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_4_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BI_COMPANIA_Type", propOrder = {
    "bitipocompania",
    "codcompania"
})
public class BICOMPANIAType {

    @XmlElement(name = "BI_TIPO_COMPANIA", required = true)
    protected String bitipocompania;
    @XmlElement(name = "COD_COMPANIA", required = true)
    protected String codcompania;

    /**
     * Gets the value of the bitipocompania property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBITIPOCOMPANIA() {
        return bitipocompania;
    }

    /**
     * Sets the value of the bitipocompania property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBITIPOCOMPANIA(String value) {
        this.bitipocompania = value;
    }

    /**
     * Gets the value of the codcompania property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODCOMPANIA() {
        return codcompania;
    }

    /**
     * Sets the value of the codcompania property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODCOMPANIA(String value) {
        this.codcompania = value;
    }

}
