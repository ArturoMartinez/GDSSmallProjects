
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NUM_PERSONA_ACTUANTE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NUM_PERSONA_ACTUANTE_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_DE_ACTUANTE" type="{http://www.isban.es/webservices/TDCc}TIPO_DE_ACTUANTE_Type"/>
 *         &lt;element name="NUMERO_DE_ACTUANTE" type="{http://www.isban.es/webservices/TDCs}SECUENCIAL_MEDIO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NUM_PERSONA_ACTUANTE_Type", propOrder = {
    "tipodeactuante",
    "numerodeactuante"
})
public class NUMPERSONAACTUANTEType {

    @XmlElement(name = "TIPO_DE_ACTUANTE", required = true)
    protected TIPODEACTUANTEType tipodeactuante;
    @XmlElement(name = "NUMERO_DE_ACTUANTE")
    protected long numerodeactuante;

    /**
     * Gets the value of the tipodeactuante property.
     * 
     * @return
     *     possible object is
     *     {@link TIPODEACTUANTEType }
     *     
     */
    public TIPODEACTUANTEType getTIPODEACTUANTE() {
        return tipodeactuante;
    }

    /**
     * Sets the value of the tipodeactuante property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIPODEACTUANTEType }
     *     
     */
    public void setTIPODEACTUANTE(TIPODEACTUANTEType value) {
        this.tipodeactuante = value;
    }

    /**
     * Gets the value of the numerodeactuante property.
     * 
     */
    public long getNUMERODEACTUANTE() {
        return numerodeactuante;
    }

    /**
     * Sets the value of the numerodeactuante property.
     * 
     */
    public void setNUMERODEACTUANTE(long value) {
        this.numerodeactuante = value;
    }

}
