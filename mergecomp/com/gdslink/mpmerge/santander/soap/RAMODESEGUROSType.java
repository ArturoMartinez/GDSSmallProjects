
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RAMO_DE_SEGUROS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RAMO_DE_SEGUROS_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COD_COMPANIA_SEG" type="{http://www.isban.es/webservices/TDCs}COMPANIA_DE_SEGUROS_Type"/>
 *         &lt;element name="COD_RAMO" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RAMO_DE_SEGUROS_Type", propOrder = {
    "codcompaniaseg",
    "codramo"
})
public class RAMODESEGUROSType {

    @XmlElement(name = "COD_COMPANIA_SEG", required = true)
    protected String codcompaniaseg;
    @XmlElement(name = "COD_RAMO")
    protected int codramo;

    /**
     * Gets the value of the codcompaniaseg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODCOMPANIASEG() {
        return codcompaniaseg;
    }

    /**
     * Sets the value of the codcompaniaseg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODCOMPANIASEG(String value) {
        this.codcompaniaseg = value;
    }

    /**
     * Gets the value of the codramo property.
     * 
     */
    public int getCODRAMO() {
        return codramo;
    }

    /**
     * Sets the value of the codramo property.
     * 
     */
    public void setCODRAMO(int value) {
        this.codramo = value;
    }

}
