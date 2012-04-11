
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DOMICILIO_ALEMAN_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DOMICILIO_ALEMAN_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="STREET" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_50_Type"/>
 *         &lt;element name="HOUSENUMBER" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_15_Type"/>
 *         &lt;element name="POSTALCODE" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_5_Type"/>
 *         &lt;element name="LANDER" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_50_Type"/>
 *         &lt;element name="CITY" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_50_Type"/>
 *         &lt;element name="PDELIVERYNOTE" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_50_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DOMICILIO_ALEMAN_Type", propOrder = {
    "street",
    "housenumber",
    "postalcode",
    "lander",
    "city",
    "pdeliverynote"
})
public class DOMICILIOALEMANType {

    @XmlElement(name = "STREET", required = true)
    protected String street;
    @XmlElement(name = "HOUSENUMBER", required = true)
    protected String housenumber;
    @XmlElement(name = "POSTALCODE", required = true)
    protected String postalcode;
    @XmlElement(name = "LANDER", required = true)
    protected String lander;
    @XmlElement(name = "CITY", required = true)
    protected String city;
    @XmlElement(name = "PDELIVERYNOTE", required = true)
    protected String pdeliverynote;

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTREET() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTREET(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the housenumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOUSENUMBER() {
        return housenumber;
    }

    /**
     * Sets the value of the housenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOUSENUMBER(String value) {
        this.housenumber = value;
    }

    /**
     * Gets the value of the postalcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSTALCODE() {
        return postalcode;
    }

    /**
     * Sets the value of the postalcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSTALCODE(String value) {
        this.postalcode = value;
    }

    /**
     * Gets the value of the lander property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANDER() {
        return lander;
    }

    /**
     * Sets the value of the lander property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANDER(String value) {
        this.lander = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCITY() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCITY(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the pdeliverynote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDELIVERYNOTE() {
        return pdeliverynote;
    }

    /**
     * Sets the value of the pdeliverynote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDELIVERYNOTE(String value) {
        this.pdeliverynote = value;
    }

}
