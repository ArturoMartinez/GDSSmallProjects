
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MAESTRA_ATRIBUTO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MAESTRA_ATRIBUTO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ATRIBUTO" type="{http://www.isban.es/webservices/TDCs}ATRIBUTO_Type"/>
 *         &lt;element name="SECUENCIAL_CORTO" type="{http://www.isban.es/webservices/TDCs}SECUENCIAL_CORTO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MAESTRA_ATRIBUTO_Type", propOrder = {
    "atributo",
    "secuencialcorto"
})
public class MAESTRAATRIBUTOType {

    @XmlElement(name = "ATRIBUTO", required = true)
    protected String atributo;
    @XmlElement(name = "SECUENCIAL_CORTO")
    protected int secuencialcorto;

    /**
     * Gets the value of the atributo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATRIBUTO() {
        return atributo;
    }

    /**
     * Sets the value of the atributo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATRIBUTO(String value) {
        this.atributo = value;
    }

    /**
     * Gets the value of the secuencialcorto property.
     * 
     */
    public int getSECUENCIALCORTO() {
        return secuencialcorto;
    }

    /**
     * Sets the value of the secuencialcorto property.
     * 
     */
    public void setSECUENCIALCORTO(int value) {
        this.secuencialcorto = value;
    }

}
