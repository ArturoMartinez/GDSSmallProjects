
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MOTIVO_PRODUCTO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MOTIVO_PRODUCTO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SUBTIPO_DE_PRODUCTO" type="{http://www.isban.es/webservices/TDCc}SUBTIPO_DE_PRODUCTO_Type"/>
 *         &lt;element name="TIPO_DE_MOTIVO" type="{http://www.isban.es/webservices/TDCs}TIPO_DE_MOTIVO_Type"/>
 *         &lt;element name="CODIGO_MOTIVO" type="{http://www.isban.es/webservices/TDCs}CODIGO_MOTIVO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MOTIVO_PRODUCTO_Type", propOrder = {
    "subtipodeproducto",
    "tipodemotivo",
    "codigomotivo"
})
public class MOTIVOPRODUCTOType {

    @XmlElement(name = "SUBTIPO_DE_PRODUCTO", required = true)
    protected SUBTIPODEPRODUCTOType subtipodeproducto;
    @XmlElement(name = "TIPO_DE_MOTIVO", required = true)
    protected String tipodemotivo;
    @XmlElement(name = "CODIGO_MOTIVO", required = true)
    protected String codigomotivo;

    /**
     * Gets the value of the subtipodeproducto property.
     * 
     * @return
     *     possible object is
     *     {@link SUBTIPODEPRODUCTOType }
     *     
     */
    public SUBTIPODEPRODUCTOType getSUBTIPODEPRODUCTO() {
        return subtipodeproducto;
    }

    /**
     * Sets the value of the subtipodeproducto property.
     * 
     * @param value
     *     allowed object is
     *     {@link SUBTIPODEPRODUCTOType }
     *     
     */
    public void setSUBTIPODEPRODUCTO(SUBTIPODEPRODUCTOType value) {
        this.subtipodeproducto = value;
    }

    /**
     * Gets the value of the tipodemotivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODEMOTIVO() {
        return tipodemotivo;
    }

    /**
     * Sets the value of the tipodemotivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODEMOTIVO(String value) {
        this.tipodemotivo = value;
    }

    /**
     * Gets the value of the codigomotivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOMOTIVO() {
        return codigomotivo;
    }

    /**
     * Sets the value of the codigomotivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOMOTIVO(String value) {
        this.codigomotivo = value;
    }

}
