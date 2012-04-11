
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PLAZA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PLAZA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PROVINCIA" type="{http://www.isban.es/webservices/TDCs}CODIGO_PROVINCIA_Type"/>
 *         &lt;element name="PLAZA" type="{http://www.isban.es/webservices/TDCs}CODIGO_PLAZA_Type"/>
 *         &lt;element name="DISCRIMINANTE_PLAZA" type="{http://www.isban.es/webservices/TDCs}DISCRIMINANTE_PLAZA_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PLAZA_Type", propOrder = {
    "provincia",
    "plaza",
    "discriminanteplaza"
})
public class PLAZAType {

    @XmlElement(name = "PROVINCIA", required = true)
    protected String provincia;
    @XmlElement(name = "PLAZA")
    protected int plaza;
    @XmlElement(name = "DISCRIMINANTE_PLAZA")
    protected int discriminanteplaza;

    /**
     * Gets the value of the provincia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVINCIA() {
        return provincia;
    }

    /**
     * Sets the value of the provincia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVINCIA(String value) {
        this.provincia = value;
    }

    /**
     * Gets the value of the plaza property.
     * 
     */
    public int getPLAZA() {
        return plaza;
    }

    /**
     * Sets the value of the plaza property.
     * 
     */
    public void setPLAZA(int value) {
        this.plaza = value;
    }

    /**
     * Gets the value of the discriminanteplaza property.
     * 
     */
    public int getDISCRIMINANTEPLAZA() {
        return discriminanteplaza;
    }

    /**
     * Sets the value of the discriminanteplaza property.
     * 
     */
    public void setDISCRIMINANTEPLAZA(int value) {
        this.discriminanteplaza = value;
    }

}
