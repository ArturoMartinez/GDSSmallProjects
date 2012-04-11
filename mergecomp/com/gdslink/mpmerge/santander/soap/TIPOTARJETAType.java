
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TIPO_TARJETA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIPO_TARJETA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MARCA_TARJETA" type="{http://www.isban.es/webservices/TDCc}MARCA_TARJETA_Type"/>
 *         &lt;element name="IND_TIPO_TARJETA" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIPO_TARJETA_Type", propOrder = {
    "marcatarjeta",
    "indtipotarjeta"
})
public class TIPOTARJETAType {

    @XmlElement(name = "MARCA_TARJETA", required = true)
    protected MARCATARJETAType marcatarjeta;
    @XmlElement(name = "IND_TIPO_TARJETA")
    protected int indtipotarjeta;

    /**
     * Gets the value of the marcatarjeta property.
     * 
     * @return
     *     possible object is
     *     {@link MARCATARJETAType }
     *     
     */
    public MARCATARJETAType getMARCATARJETA() {
        return marcatarjeta;
    }

    /**
     * Sets the value of the marcatarjeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link MARCATARJETAType }
     *     
     */
    public void setMARCATARJETA(MARCATARJETAType value) {
        this.marcatarjeta = value;
    }

    /**
     * Gets the value of the indtipotarjeta property.
     * 
     */
    public int getINDTIPOTARJETA() {
        return indtipotarjeta;
    }

    /**
     * Sets the value of the indtipotarjeta property.
     * 
     */
    public void setINDTIPOTARJETA(int value) {
        this.indtipotarjeta = value;
    }

}
