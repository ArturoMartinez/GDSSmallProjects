
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATRIBUTO_EEOO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ATRIBUTO_EEOO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_DE_UNIDAD_EEOO" type="{http://www.isban.es/webservices/TDCc}TIPO_DE_UNIDAD_EEOO_Type"/>
 *         &lt;element name="COD_ATRIBUTO" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATRIBUTO_EEOO_Type", propOrder = {
    "tipodeunidadeeoo",
    "codatributo"
})
public class ATRIBUTOEEOOType {

    @XmlElement(name = "TIPO_DE_UNIDAD_EEOO", required = true)
    protected TIPODEUNIDADEEOOType tipodeunidadeeoo;
    @XmlElement(name = "COD_ATRIBUTO")
    protected int codatributo;

    /**
     * Gets the value of the tipodeunidadeeoo property.
     * 
     * @return
     *     possible object is
     *     {@link TIPODEUNIDADEEOOType }
     *     
     */
    public TIPODEUNIDADEEOOType getTIPODEUNIDADEEOO() {
        return tipodeunidadeeoo;
    }

    /**
     * Sets the value of the tipodeunidadeeoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIPODEUNIDADEEOOType }
     *     
     */
    public void setTIPODEUNIDADEEOO(TIPODEUNIDADEEOOType value) {
        this.tipodeunidadeeoo = value;
    }

    /**
     * Gets the value of the codatributo property.
     * 
     */
    public int getCODATRIBUTO() {
        return codatributo;
    }

    /**
     * Sets the value of the codatributo property.
     * 
     */
    public void setCODATRIBUTO(int value) {
        this.codatributo = value;
    }

}
