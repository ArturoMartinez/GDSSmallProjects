
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PERIODO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PERIODO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UNIDAD_DE_TIEMPO" type="{http://www.isban.es/webservices/TDCs}TIPO_DE_PERIODO_Type"/>
 *         &lt;element name="NUMERO_DE_UNIDADES" type="{http://www.isban.es/webservices/TDCs}CANT_UNIDADES_DE_TIEMPO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PERIODO_Type", propOrder = {
    "unidaddetiempo",
    "numerodeunidades"
})
public class PERIODOType {

    @XmlElement(name = "UNIDAD_DE_TIEMPO", required = true)
    protected String unidaddetiempo;
    @XmlElement(name = "NUMERO_DE_UNIDADES")
    protected int numerodeunidades;

    /**
     * Gets the value of the unidaddetiempo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNIDADDETIEMPO() {
        return unidaddetiempo;
    }

    /**
     * Sets the value of the unidaddetiempo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNIDADDETIEMPO(String value) {
        this.unidaddetiempo = value;
    }

    /**
     * Gets the value of the numerodeunidades property.
     * 
     */
    public int getNUMERODEUNIDADES() {
        return numerodeunidades;
    }

    /**
     * Sets the value of the numerodeunidades property.
     * 
     */
    public void setNUMERODEUNIDADES(int value) {
        this.numerodeunidades = value;
    }

}
