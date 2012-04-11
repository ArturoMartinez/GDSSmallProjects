
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DENOMINACION_ATRIBUT_CONT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DENOMINACION_ATRIBUT_CONT_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_ATRIBUTO" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_1_Type"/>
 *         &lt;element name="COD_DENOMINACION_ATR" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DENOMINACION_ATRIBUT_CONT_Type", propOrder = {
    "tipoatributo",
    "coddenominacionatr"
})
public class DENOMINACIONATRIBUTCONTType {

    @XmlElement(name = "TIPO_ATRIBUTO", required = true)
    protected String tipoatributo;
    @XmlElement(name = "COD_DENOMINACION_ATR", required = true)
    protected String coddenominacionatr;

    /**
     * Gets the value of the tipoatributo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOATRIBUTO() {
        return tipoatributo;
    }

    /**
     * Sets the value of the tipoatributo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOATRIBUTO(String value) {
        this.tipoatributo = value;
    }

    /**
     * Gets the value of the coddenominacionatr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODDENOMINACIONATR() {
        return coddenominacionatr;
    }

    /**
     * Sets the value of the coddenominacionatr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODDENOMINACIONATR(String value) {
        this.coddenominacionatr = value;
    }

}
