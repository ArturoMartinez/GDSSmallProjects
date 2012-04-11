
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OPERACION_CODCON_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OPERACION_CODCON_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FECHA_EJECUCION" type="{http://www.isban.es/webservices/TDCs}FECHA_GENERICA_Type"/>
 *         &lt;element name="NUMERO_DE_ORDEN" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_10_Type"/>
 *         &lt;element name="NUMERO_DE_EJECUCION" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_2_Type"/>
 *         &lt;element name="CONTRATO" type="{http://www.isban.es/webservices/TDCc}CONTRATO_Type"/>
 *         &lt;element name="TIPO_DE_OPERACION" type="{http://www.isban.es/webservices/TDCs}TIPO_OPERACION_PRICING_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OPERACION_CODCON_Type", propOrder = {
    "fechaejecucion",
    "numerodeorden",
    "numerodeejecucion",
    "contrato",
    "tipodeoperacion"
})
public class OPERACIONCODCONType {

    @XmlElement(name = "FECHA_EJECUCION", required = true)
    protected XMLGregorianCalendar fechaejecucion;
    @XmlElement(name = "NUMERO_DE_ORDEN", required = true)
    protected String numerodeorden;
    @XmlElement(name = "NUMERO_DE_EJECUCION")
    protected int numerodeejecucion;
    @XmlElement(name = "CONTRATO", required = true)
    protected CONTRATOType contrato;
    @XmlElement(name = "TIPO_DE_OPERACION", required = true)
    protected String tipodeoperacion;

    /**
     * Gets the value of the fechaejecucion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFECHAEJECUCION() {
        return fechaejecucion;
    }

    /**
     * Sets the value of the fechaejecucion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFECHAEJECUCION(XMLGregorianCalendar value) {
        this.fechaejecucion = value;
    }

    /**
     * Gets the value of the numerodeorden property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERODEORDEN() {
        return numerodeorden;
    }

    /**
     * Sets the value of the numerodeorden property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERODEORDEN(String value) {
        this.numerodeorden = value;
    }

    /**
     * Gets the value of the numerodeejecucion property.
     * 
     */
    public int getNUMERODEEJECUCION() {
        return numerodeejecucion;
    }

    /**
     * Sets the value of the numerodeejecucion property.
     * 
     */
    public void setNUMERODEEJECUCION(int value) {
        this.numerodeejecucion = value;
    }

    /**
     * Gets the value of the contrato property.
     * 
     * @return
     *     possible object is
     *     {@link CONTRATOType }
     *     
     */
    public CONTRATOType getCONTRATO() {
        return contrato;
    }

    /**
     * Sets the value of the contrato property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONTRATOType }
     *     
     */
    public void setCONTRATO(CONTRATOType value) {
        this.contrato = value;
    }

    /**
     * Gets the value of the tipodeoperacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODEOPERACION() {
        return tipodeoperacion;
    }

    /**
     * Sets the value of the tipodeoperacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODEOPERACION(String value) {
        this.tipodeoperacion = value;
    }

}
