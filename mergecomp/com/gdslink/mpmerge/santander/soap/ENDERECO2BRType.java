
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ENDERECO_2_BR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ENDERECO_2_BR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TITULARIDADE_VIA_BR" type="{http://www.isban.es/webservices/TDCs}TITULARIDADE_DA_VIA_BR_Type"/>
 *         &lt;element name="ENDERECO_BR" type="{http://www.isban.es/webservices/TDCs}ENDERECO_BR_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENDERECO_2_BR_Type", propOrder = {
    "titularidadeviabr",
    "enderecobr"
})
public class ENDERECO2BRType {

    @XmlElement(name = "TITULARIDADE_VIA_BR", required = true)
    protected String titularidadeviabr;
    @XmlElement(name = "ENDERECO_BR", required = true)
    protected String enderecobr;

    /**
     * Gets the value of the titularidadeviabr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITULARIDADEVIABR() {
        return titularidadeviabr;
    }

    /**
     * Sets the value of the titularidadeviabr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITULARIDADEVIABR(String value) {
        this.titularidadeviabr = value;
    }

    /**
     * Gets the value of the enderecobr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENDERECOBR() {
        return enderecobr;
    }

    /**
     * Sets the value of the enderecobr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENDERECOBR(String value) {
        this.enderecobr = value;
    }

}
