
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CHAVE_SEG_COMERCIAL_BR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CHAVE_SEG_COMERCIAL_BR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_SEG_COMERCIAL_BR" type="{http://www.isban.es/webservices/TDCs}TIPO_SEG_COMERCIAL_BR_Type"/>
 *         &lt;element name="SEGMENTO_COMERCIAL_BR" type="{http://www.isban.es/webservices/TDCs}SEGMENTO_COMERCIAL_BR_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CHAVE_SEG_COMERCIAL_BR_Type", propOrder = {
    "tiposegcomercialbr",
    "segmentocomercialbr"
})
public class CHAVESEGCOMERCIALBRType {

    @XmlElement(name = "TIPO_SEG_COMERCIAL_BR", required = true)
    protected String tiposegcomercialbr;
    @XmlElement(name = "SEGMENTO_COMERCIAL_BR", required = true)
    protected String segmentocomercialbr;

    /**
     * Gets the value of the tiposegcomercialbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOSEGCOMERCIALBR() {
        return tiposegcomercialbr;
    }

    /**
     * Sets the value of the tiposegcomercialbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOSEGCOMERCIALBR(String value) {
        this.tiposegcomercialbr = value;
    }

    /**
     * Gets the value of the segmentocomercialbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEGMENTOCOMERCIALBR() {
        return segmentocomercialbr;
    }

    /**
     * Sets the value of the segmentocomercialbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEGMENTOCOMERCIALBR(String value) {
        this.segmentocomercialbr = value;
    }

}
