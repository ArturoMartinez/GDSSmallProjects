
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DOMICILIO_CORPORATIVO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DOMICILIO_CORPORATIVO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FORMATO_DOMICILIO" type="{http://www.isban.es/webservices/TDCs}FORMATO_DOMICILIO_Type"/>
 *         &lt;element name="DETALLE_DOMICILIO" type="{http://www.isban.es/webservices/TDCs}DOMICILIO_TRANSITO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DOMICILIO_CORPORATIVO_Type", propOrder = {
    "formatodomicilio",
    "detalledomicilio"
})
public class DOMICILIOCORPORATIVOType {

    @XmlElement(name = "FORMATO_DOMICILIO", required = true)
    protected String formatodomicilio;
    @XmlElement(name = "DETALLE_DOMICILIO", required = true)
    protected String detalledomicilio;

    /**
     * Gets the value of the formatodomicilio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORMATODOMICILIO() {
        return formatodomicilio;
    }

    /**
     * Sets the value of the formatodomicilio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORMATODOMICILIO(String value) {
        this.formatodomicilio = value;
    }

    /**
     * Gets the value of the detalledomicilio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDETALLEDOMICILIO() {
        return detalledomicilio;
    }

    /**
     * Sets the value of the detalledomicilio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDETALLEDOMICILIO(String value) {
        this.detalledomicilio = value;
    }

}
