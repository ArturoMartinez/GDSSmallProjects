
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IMAGEN_SIU_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IMAGEN_SIU_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_IMAGEN_SIU" type="{http://www.isban.es/webservices/TDCs}TIPO_IMAGEN_SIU_Type"/>
 *         &lt;element name="COD_IMAGEN_SIU" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IMAGEN_SIU_Type", propOrder = {
    "tipoimagensiu",
    "codimagensiu"
})
public class IMAGENSIUType {

    @XmlElement(name = "TIPO_IMAGEN_SIU", required = true)
    protected String tipoimagensiu;
    @XmlElement(name = "COD_IMAGEN_SIU", required = true)
    protected String codimagensiu;

    /**
     * Gets the value of the tipoimagensiu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOIMAGENSIU() {
        return tipoimagensiu;
    }

    /**
     * Sets the value of the tipoimagensiu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOIMAGENSIU(String value) {
        this.tipoimagensiu = value;
    }

    /**
     * Gets the value of the codimagensiu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIMAGENSIU() {
        return codimagensiu;
    }

    /**
     * Sets the value of the codimagensiu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIMAGENSIU(String value) {
        this.codimagensiu = value;
    }

}
