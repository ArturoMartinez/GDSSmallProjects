
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PARTICULA_APELLIDO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PARTICULA_APELLIDO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PARTICULA" type="{http://www.isban.es/webservices/TDCs}PARTICULA_CHAR_Type"/>
 *         &lt;element name="APELLIDO" type="{http://www.isban.es/webservices/TDCs}APELLIDO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PARTICULA_APELLIDO_Type", propOrder = {
    "particula",
    "apellido"
})
public class PARTICULAAPELLIDOType {

    @XmlElement(name = "PARTICULA", required = true)
    protected String particula;
    @XmlElement(name = "APELLIDO", required = true)
    protected String apellido;

    /**
     * Gets the value of the particula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARTICULA() {
        return particula;
    }

    /**
     * Sets the value of the particula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARTICULA(String value) {
        this.particula = value;
    }

    /**
     * Gets the value of the apellido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPELLIDO() {
        return apellido;
    }

    /**
     * Sets the value of the apellido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPELLIDO(String value) {
        this.apellido = value;
    }

}
