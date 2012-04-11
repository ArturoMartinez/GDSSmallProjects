
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for REF_OPERACION_GC_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REF_OPERACION_GC_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ORDEN_DE_SERVICIO" type="{http://www.isban.es/webservices/TDCc}ORDEN_DE_SERVICIO_Type"/>
 *         &lt;element name="TIMESTAMP" type="{http://www.isban.es/webservices/TDCs}TIMESTAMP_GENERICO_Type"/>
 *         &lt;element name="OPERACION_GESTOR_CONTABLE" type="{http://www.isban.es/webservices/TDCs}OPERACION_GESTOR_CONTABLE_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REF_OPERACION_GC_Type", propOrder = {
    "ordendeservicio",
    "timestamp",
    "operaciongestorcontable"
})
public class REFOPERACIONGCType {

    @XmlElement(name = "ORDEN_DE_SERVICIO", required = true)
    protected ORDENDESERVICIOType ordendeservicio;
    @XmlElement(name = "TIMESTAMP", required = true)
    protected XMLGregorianCalendar timestamp;
    @XmlElement(name = "OPERACION_GESTOR_CONTABLE", required = true)
    protected String operaciongestorcontable;

    /**
     * Gets the value of the ordendeservicio property.
     * 
     * @return
     *     possible object is
     *     {@link ORDENDESERVICIOType }
     *     
     */
    public ORDENDESERVICIOType getORDENDESERVICIO() {
        return ordendeservicio;
    }

    /**
     * Sets the value of the ordendeservicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORDENDESERVICIOType }
     *     
     */
    public void setORDENDESERVICIO(ORDENDESERVICIOType value) {
        this.ordendeservicio = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTIMESTAMP() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTIMESTAMP(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the operaciongestorcontable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPERACIONGESTORCONTABLE() {
        return operaciongestorcontable;
    }

    /**
     * Sets the value of the operaciongestorcontable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPERACIONGESTORCONTABLE(String value) {
        this.operaciongestorcontable = value;
    }

}
