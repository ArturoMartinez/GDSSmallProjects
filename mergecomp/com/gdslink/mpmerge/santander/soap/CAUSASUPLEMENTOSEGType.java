
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CAUSA_SUPLEMENTO_SEG_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CAUSA_SUPLEMENTO_SEG_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COMPANIA_DE_SEGUROS" type="{http://www.isban.es/webservices/TDCs}COMPANIA_DE_SEGUROS_Type"/>
 *         &lt;element name="CAUSA_DE_SUPLEMENTO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CAUSA_SUPLEMENTO_SEG_Type", propOrder = {
    "companiadeseguros",
    "causadesuplemento"
})
public class CAUSASUPLEMENTOSEGType {

    @XmlElement(name = "COMPANIA_DE_SEGUROS", required = true)
    protected String companiadeseguros;
    @XmlElement(name = "CAUSA_DE_SUPLEMENTO", required = true)
    protected String causadesuplemento;

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
     * Gets the value of the causadesuplemento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAUSADESUPLEMENTO() {
        return causadesuplemento;
    }

    /**
     * Sets the value of the causadesuplemento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAUSADESUPLEMENTO(String value) {
        this.causadesuplemento = value;
    }

}
