
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MOTIVO_INCIDENCIA_PMAS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MOTIVO_INCIDENCIA_PMAS_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_DE_INCIDENCIA_PMAS" type="{http://www.isban.es/webservices/TDCs}TIPO_DE_INCIDENCIA_PMAS_Type"/>
 *         &lt;element name="MOTIVO_DE_INCIDENCIA" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MOTIVO_INCIDENCIA_PMAS_Type", propOrder = {
    "tipodeincidenciapmas",
    "motivodeincidencia"
})
public class MOTIVOINCIDENCIAPMASType {

    @XmlElement(name = "TIPO_DE_INCIDENCIA_PMAS", required = true)
    protected String tipodeincidenciapmas;
    @XmlElement(name = "MOTIVO_DE_INCIDENCIA", required = true)
    protected String motivodeincidencia;

    /**
     * Gets the value of the tipodeincidenciapmas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODEINCIDENCIAPMAS() {
        return tipodeincidenciapmas;
    }

    /**
     * Sets the value of the tipodeincidenciapmas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODEINCIDENCIAPMAS(String value) {
        this.tipodeincidenciapmas = value;
    }

    /**
     * Gets the value of the motivodeincidencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOTIVODEINCIDENCIA() {
        return motivodeincidencia;
    }

    /**
     * Sets the value of the motivodeincidencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOTIVODEINCIDENCIA(String value) {
        this.motivodeincidencia = value;
    }

}
