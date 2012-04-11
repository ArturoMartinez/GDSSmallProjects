
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CODIBAN_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CODIBAN_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PAIS" type="{http://www.isban.es/webservices/TDCs}PAIS_Type"/>
 *         &lt;element name="DIGITO_DE_CONTROL" type="{http://www.isban.es/webservices/TDCs}DIGITO_CONTROL_IBAN_Type"/>
 *         &lt;element name="CODBBAN" type="{http://www.isban.es/webservices/TDCs}CODBBAN_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CODIBAN_Type", propOrder = {
    "pais",
    "digitodecontrol",
    "codbban"
})
public class CODIBANType {

    @XmlElement(name = "PAIS", required = true)
    protected String pais;
    @XmlElement(name = "DIGITO_DE_CONTROL", required = true)
    protected String digitodecontrol;
    @XmlElement(name = "CODBBAN", required = true)
    protected String codbban;

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
     * Gets the value of the digitodecontrol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIGITODECONTROL() {
        return digitodecontrol;
    }

    /**
     * Sets the value of the digitodecontrol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIGITODECONTROL(String value) {
        this.digitodecontrol = value;
    }

    /**
     * Gets the value of the codbban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODBBAN() {
        return codbban;
    }

    /**
     * Sets the value of the codbban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODBBAN(String value) {
        this.codbban = value;
    }

}
