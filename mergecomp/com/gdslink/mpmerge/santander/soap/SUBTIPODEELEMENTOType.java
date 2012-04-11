
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SUBTIPO_DE_ELEMENTO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SUBTIPO_DE_ELEMENTO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_DE_ELEMENTO" type="{http://www.isban.es/webservices/TDCc}TIPO_DE_ELEMENTO_Type"/>
 *         &lt;element name="SUBTIPO_ELEMENTO" type="{http://www.isban.es/webservices/TDCs}COD_SUBTIPO_DE_ELEMENTO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SUBTIPO_DE_ELEMENTO_Type", propOrder = {
    "tipodeelemento",
    "subtipoelemento"
})
public class SUBTIPODEELEMENTOType {

    @XmlElement(name = "TIPO_DE_ELEMENTO", required = true)
    protected TIPODEELEMENTOType tipodeelemento;
    @XmlElement(name = "SUBTIPO_ELEMENTO", required = true)
    protected String subtipoelemento;

    /**
     * Gets the value of the tipodeelemento property.
     * 
     * @return
     *     possible object is
     *     {@link TIPODEELEMENTOType }
     *     
     */
    public TIPODEELEMENTOType getTIPODEELEMENTO() {
        return tipodeelemento;
    }

    /**
     * Sets the value of the tipodeelemento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIPODEELEMENTOType }
     *     
     */
    public void setTIPODEELEMENTO(TIPODEELEMENTOType value) {
        this.tipodeelemento = value;
    }

    /**
     * Gets the value of the subtipoelemento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBTIPOELEMENTO() {
        return subtipoelemento;
    }

    /**
     * Sets the value of the subtipoelemento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBTIPOELEMENTO(String value) {
        this.subtipoelemento = value;
    }

}
