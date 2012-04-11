
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PLAZA_VIA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PLAZA_VIA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PLAZA" type="{http://www.isban.es/webservices/TDCc}PLAZA_Type"/>
 *         &lt;element name="CODIGO_VIA" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_9_Type"/>
 *         &lt;element name="NUMERO_VERSION_VIA" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_5_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PLAZA_VIA_Type", propOrder = {
    "plaza",
    "codigovia",
    "numeroversionvia"
})
public class PLAZAVIAType {

    @XmlElement(name = "PLAZA", required = true)
    protected PLAZAType plaza;
    @XmlElement(name = "CODIGO_VIA")
    protected int codigovia;
    @XmlElement(name = "NUMERO_VERSION_VIA")
    protected int numeroversionvia;

    /**
     * Gets the value of the plaza property.
     * 
     * @return
     *     possible object is
     *     {@link PLAZAType }
     *     
     */
    public PLAZAType getPLAZA() {
        return plaza;
    }

    /**
     * Sets the value of the plaza property.
     * 
     * @param value
     *     allowed object is
     *     {@link PLAZAType }
     *     
     */
    public void setPLAZA(PLAZAType value) {
        this.plaza = value;
    }

    /**
     * Gets the value of the codigovia property.
     * 
     */
    public int getCODIGOVIA() {
        return codigovia;
    }

    /**
     * Sets the value of the codigovia property.
     * 
     */
    public void setCODIGOVIA(int value) {
        this.codigovia = value;
    }

    /**
     * Gets the value of the numeroversionvia property.
     * 
     */
    public int getNUMEROVERSIONVIA() {
        return numeroversionvia;
    }

    /**
     * Sets the value of the numeroversionvia property.
     * 
     */
    public void setNUMEROVERSIONVIA(int value) {
        this.numeroversionvia = value;
    }

}
