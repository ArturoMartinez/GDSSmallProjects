
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PETICION_SWIFT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PETICION_SWIFT_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="USUARIO" type="{http://www.isban.es/webservices/TDCs}UID_Type"/>
 *         &lt;element name="FECHA" type="{http://www.isban.es/webservices/TDCs}FECHA_GENERICA_Type"/>
 *         &lt;element name="NUMERO_DE_PETICION" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PETICION_SWIFT_Type", propOrder = {
    "usuario",
    "fecha",
    "numerodepeticion"
})
public class PETICIONSWIFTType {

    @XmlElement(name = "USUARIO", required = true)
    protected String usuario;
    @XmlElement(name = "FECHA", required = true)
    protected XMLGregorianCalendar fecha;
    @XmlElement(name = "NUMERO_DE_PETICION")
    protected int numerodepeticion;

    /**
     * Gets the value of the usuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSUARIO() {
        return usuario;
    }

    /**
     * Sets the value of the usuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSUARIO(String value) {
        this.usuario = value;
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
     * Gets the value of the numerodepeticion property.
     * 
     */
    public int getNUMERODEPETICION() {
        return numerodepeticion;
    }

    /**
     * Sets the value of the numerodepeticion property.
     * 
     */
    public void setNUMERODEPETICION(int value) {
        this.numerodepeticion = value;
    }

}
