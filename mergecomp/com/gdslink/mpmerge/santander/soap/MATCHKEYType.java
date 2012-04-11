
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MATCHKEY_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MATCHKEY_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COUNTRY" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_4_Type"/>
 *         &lt;element name="TOWN" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_4_Type"/>
 *         &lt;element name="MATCHKPAF" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_18_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MATCHKEY_Type", propOrder = {
    "country",
    "town",
    "matchkpaf"
})
public class MATCHKEYType {

    @XmlElement(name = "COUNTRY", required = true)
    protected String country;
    @XmlElement(name = "TOWN", required = true)
    protected String town;
    @XmlElement(name = "MATCHKPAF", required = true)
    protected String matchkpaf;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUNTRY() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUNTRY(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the town property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOWN() {
        return town;
    }

    /**
     * Sets the value of the town property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOWN(String value) {
        this.town = value;
    }

    /**
     * Gets the value of the matchkpaf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATCHKPAF() {
        return matchkpaf;
    }

    /**
     * Sets the value of the matchkpaf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATCHKPAF(String value) {
        this.matchkpaf = value;
    }

}
