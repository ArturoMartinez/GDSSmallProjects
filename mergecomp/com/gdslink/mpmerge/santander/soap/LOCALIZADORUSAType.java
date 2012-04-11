
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LOCALIZADOR_USA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOCALIZADOR_USA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ABACODE" type="{http://www.isban.es/webservices/TDCs}ABACODE_Type"/>
 *         &lt;element name="CUENTA_17" type="{http://www.isban.es/webservices/TDCs}CUENTA_SOVERIGN_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LOCALIZADOR_USA_Type", propOrder = {
    "abacode",
    "cuenta17"
})
public class LOCALIZADORUSAType {

    @XmlElement(name = "ABACODE", required = true)
    protected String abacode;
    @XmlElement(name = "CUENTA_17", required = true)
    protected String cuenta17;

    /**
     * Gets the value of the abacode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABACODE() {
        return abacode;
    }

    /**
     * Sets the value of the abacode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABACODE(String value) {
        this.abacode = value;
    }

    /**
     * Gets the value of the cuenta17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUENTA17() {
        return cuenta17;
    }

    /**
     * Sets the value of the cuenta17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUENTA17(String value) {
        this.cuenta17 = value;
    }

}
