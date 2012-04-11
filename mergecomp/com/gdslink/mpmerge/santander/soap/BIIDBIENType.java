
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BI_ID_BIEN_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BI_ID_BIEN_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="BI_TIPO_BIEN" type="{http://www.isban.es/webservices/TDCs}BI_TIPO_BIEN_Type"/>
 *         &lt;element name="NUMERO_BIEN" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_9_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BI_ID_BIEN_Type", propOrder = {
    "empresa",
    "bitipobien",
    "numerobien"
})
public class BIIDBIENType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "BI_TIPO_BIEN", required = true)
    protected String bitipobien;
    @XmlElement(name = "NUMERO_BIEN")
    protected int numerobien;

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
     * Gets the value of the numerobien property.
     * 
     */
    public int getNUMEROBIEN() {
        return numerobien;
    }

    /**
     * Sets the value of the numerobien property.
     * 
     */
    public void setNUMEROBIEN(int value) {
        this.numerobien = value;
    }

}
