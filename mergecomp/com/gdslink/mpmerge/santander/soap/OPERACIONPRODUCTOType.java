
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OPERACION_PRODUCTO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OPERACION_PRODUCTO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SUBTIPO_DE_PRODUCTO" type="{http://www.isban.es/webservices/TDCc}SUBTIPO_DE_PRODUCTO_Type"/>
 *         &lt;element name="OPERACION_BANCARIA" type="{http://www.isban.es/webservices/TDCc}OPERACION_BANCARIA_Type"/>
 *         &lt;element name="FECHA_DE_OPERACION" type="{http://www.isban.es/webservices/TDCs}FECHA_OPERACION_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OPERACION_PRODUCTO_Type", propOrder = {
    "subtipodeproducto",
    "operacionbancaria",
    "fechadeoperacion"
})
public class OPERACIONPRODUCTOType {

    @XmlElement(name = "SUBTIPO_DE_PRODUCTO", required = true)
    protected SUBTIPODEPRODUCTOType subtipodeproducto;
    @XmlElement(name = "OPERACION_BANCARIA", required = true)
    protected OPERACIONBANCARIAType operacionbancaria;
    @XmlElement(name = "FECHA_DE_OPERACION", required = true)
    protected XMLGregorianCalendar fechadeoperacion;

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
     * Gets the value of the operacionbancaria property.
     * 
     * @return
     *     possible object is
     *     {@link OPERACIONBANCARIAType }
     *     
     */
    public OPERACIONBANCARIAType getOPERACIONBANCARIA() {
        return operacionbancaria;
    }

    /**
     * Sets the value of the operacionbancaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link OPERACIONBANCARIAType }
     *     
     */
    public void setOPERACIONBANCARIA(OPERACIONBANCARIAType value) {
        this.operacionbancaria = value;
    }

    /**
     * Gets the value of the fechadeoperacion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFECHADEOPERACION() {
        return fechadeoperacion;
    }

    /**
     * Sets the value of the fechadeoperacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFECHADEOPERACION(XMLGregorianCalendar value) {
        this.fechadeoperacion = value;
    }

}
