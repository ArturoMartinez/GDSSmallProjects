
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LIQUIDACION_SILO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIQUIDACION_SILO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CENTRO" type="{http://www.isban.es/webservices/TDCc}CENTRO_Type"/>
 *         &lt;element name="VENDEDOR_ONCE" type="{http://www.isban.es/webservices/TDCs}VENDEDOR_ONCE_Type"/>
 *         &lt;element name="FECHA_LIQUIDACION" type="{http://www.isban.es/webservices/TDCs}FECHA_LIQUIDACION_Type"/>
 *         &lt;element name="TIPO_LIQUIDACION_SILO" type="{http://www.isban.es/webservices/TDCs}TIPO_LIQUIDACION_SILO_Type"/>
 *         &lt;element name="CODIGO_NUMERICO" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_1_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIQUIDACION_SILO_Type", propOrder = {
    "centro",
    "vendedoronce",
    "fechaliquidacion",
    "tipoliquidacionsilo",
    "codigonumerico"
})
public class LIQUIDACIONSILOType {

    @XmlElement(name = "CENTRO", required = true)
    protected CENTROType centro;
    @XmlElement(name = "VENDEDOR_ONCE", required = true)
    protected String vendedoronce;
    @XmlElement(name = "FECHA_LIQUIDACION", required = true)
    protected XMLGregorianCalendar fechaliquidacion;
    @XmlElement(name = "TIPO_LIQUIDACION_SILO", required = true)
    protected String tipoliquidacionsilo;
    @XmlElement(name = "CODIGO_NUMERICO")
    protected int codigonumerico;

    /**
     * Gets the value of the centro property.
     * 
     * @return
     *     possible object is
     *     {@link CENTROType }
     *     
     */
    public CENTROType getCENTRO() {
        return centro;
    }

    /**
     * Sets the value of the centro property.
     * 
     * @param value
     *     allowed object is
     *     {@link CENTROType }
     *     
     */
    public void setCENTRO(CENTROType value) {
        this.centro = value;
    }

    /**
     * Gets the value of the vendedoronce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVENDEDORONCE() {
        return vendedoronce;
    }

    /**
     * Sets the value of the vendedoronce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVENDEDORONCE(String value) {
        this.vendedoronce = value;
    }

    /**
     * Gets the value of the fechaliquidacion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFECHALIQUIDACION() {
        return fechaliquidacion;
    }

    /**
     * Sets the value of the fechaliquidacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFECHALIQUIDACION(XMLGregorianCalendar value) {
        this.fechaliquidacion = value;
    }

    /**
     * Gets the value of the tipoliquidacionsilo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOLIQUIDACIONSILO() {
        return tipoliquidacionsilo;
    }

    /**
     * Sets the value of the tipoliquidacionsilo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOLIQUIDACIONSILO(String value) {
        this.tipoliquidacionsilo = value;
    }

    /**
     * Gets the value of the codigonumerico property.
     * 
     */
    public int getCODIGONUMERICO() {
        return codigonumerico;
    }

    /**
     * Sets the value of the codigonumerico property.
     * 
     */
    public void setCODIGONUMERICO(int value) {
        this.codigonumerico = value;
    }

}
