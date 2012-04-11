
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RANGO_DE_FECHAS_PRUEBA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RANGO_DE_FECHAS_PRUEBA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FECHA_INICIO" type="{http://www.isban.es/webservices/TDCs}FECHA_PRUEBA_Type"/>
 *         &lt;element name="FECHA_FIN" type="{http://www.isban.es/webservices/TDCs}FECHA_PRUEBA_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RANGO_DE_FECHAS_PRUEBA_Type", propOrder = {
    "fechainicio",
    "fechafin"
})
public class RANGODEFECHASPRUEBAType {

    @XmlElement(name = "FECHA_INICIO", required = true)
    protected XMLGregorianCalendar fechainicio;
    @XmlElement(name = "FECHA_FIN", required = true)
    protected XMLGregorianCalendar fechafin;

    /**
     * Gets the value of the fechainicio property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFECHAINICIO() {
        return fechainicio;
    }

    /**
     * Sets the value of the fechainicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFECHAINICIO(XMLGregorianCalendar value) {
        this.fechainicio = value;
    }

    /**
     * Gets the value of the fechafin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFECHAFIN() {
        return fechafin;
    }

    /**
     * Sets the value of the fechafin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFECHAFIN(XMLGregorianCalendar value) {
        this.fechafin = value;
    }

}
