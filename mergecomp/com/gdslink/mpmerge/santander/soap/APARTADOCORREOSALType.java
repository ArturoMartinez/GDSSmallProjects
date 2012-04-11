
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APARTADO_CORREOS_AL_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APARTADO_CORREOS_AL_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="POBNUMBER" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_10_Type"/>
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
@XmlType(name = "APARTADO_CORREOS_AL_Type", propOrder = {
    "pobnumber",
    "postalcode",
    "lander",
    "city",
    "pdeliverynote"
})
public class APARTADOCORREOSALType {

    @XmlElement(name = "POBNUMBER", required = true)
    protected String pobnumber;
    @XmlElement(name = "POSTALCODE", required = true)
    protected String postalcode;
    @XmlElement(name = "LANDER", required = true)
    protected String lander;
    @XmlElement(name = "CITY", required = true)
    protected String city;
    @XmlElement(name = "PDELIVERYNOTE", required = true)
    protected String pdeliverynote;

    /**
     * Gets the value of the pobnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOBNUMBER() {
        return pobnumber;
    }

    /**
     * Sets the value of the pobnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOBNUMBER(String value) {
        this.pobnumber = value;
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
