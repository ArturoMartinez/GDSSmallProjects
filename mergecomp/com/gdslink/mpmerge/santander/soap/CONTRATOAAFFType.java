
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CONTRATO_AAFF_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CONTRATO_AAFF_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CENTRO" type="{http://www.isban.es/webservices/TDCc}CENTRO_DE_CONTRATO_Type"/>
 *         &lt;element name="FECHA" type="{http://www.isban.es/webservices/TDCs}FECHA_OPERACION_Type"/>
 *         &lt;element name="NUM_OPERACION" type="{http://www.isban.es/webservices/TDCs}NUM_OPERACION_TESORERIA_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONTRATO_AAFF_Type", propOrder = {
    "centro",
    "fecha",
    "numoperacion"
})
public class CONTRATOAAFFType {

    @XmlElement(name = "CENTRO", required = true)
    protected CENTRODECONTRATOType centro;
    @XmlElement(name = "FECHA", required = true)
    protected XMLGregorianCalendar fecha;
    @XmlElement(name = "NUM_OPERACION")
    protected int numoperacion;

    /**
     * Gets the value of the centro property.
     * 
     * @return
     *     possible object is
     *     {@link CENTRODECONTRATOType }
     *     
     */
    public CENTRODECONTRATOType getCENTRO() {
        return centro;
    }

    /**
     * Sets the value of the centro property.
     * 
     * @param value
     *     allowed object is
     *     {@link CENTRODECONTRATOType }
     *     
     */
    public void setCENTRO(CENTRODECONTRATOType value) {
        this.centro = value;
    }

    /**
     * Gets the value of the fecha property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFECHA() {
        return fecha;
    }

    /**
     * Sets the value of the fecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFECHA(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Gets the value of the numoperacion property.
     * 
     */
    public int getNUMOPERACION() {
        return numoperacion;
    }

    /**
     * Sets the value of the numoperacion property.
     * 
     */
    public void setNUMOPERACION(int value) {
        this.numoperacion = value;
    }

}
