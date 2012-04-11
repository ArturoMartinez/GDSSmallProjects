
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LOCALIZADOR_AL_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOCALIZADOR_AL_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BLZCODE" type="{http://www.isban.es/webservices/TDCs}BLZCODE_Type"/>
 *         &lt;element name="CUENTA10" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_10_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LOCALIZADOR_AL_Type", propOrder = {
    "blzcode",
    "cuenta10"
})
public class LOCALIZADORALType {

    @XmlElement(name = "BLZCODE", required = true)
    protected String blzcode;
    @XmlElement(name = "CUENTA10", required = true)
    protected String cuenta10;

    /**
     * Gets the value of the blzcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBLZCODE() {
        return blzcode;
    }

    /**
     * Sets the value of the blzcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBLZCODE(String value) {
        this.blzcode = value;
    }

    /**
     * Gets the value of the cuenta10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUENTA10() {
        return cuenta10;
    }

    /**
     * Sets the value of the cuenta10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUENTA10(String value) {
        this.cuenta10 = value;
    }

}
