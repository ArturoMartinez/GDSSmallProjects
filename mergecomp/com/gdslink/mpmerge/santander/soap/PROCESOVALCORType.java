
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PROCESO_VALCOR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PROCESO_VALCOR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EXPEDIENTE_VALCOR" type="{http://www.isban.es/webservices/TDCc}EXPEDIENTE_VALCOR_Type"/>
 *         &lt;element name="CICLO_VALCOR" type="{http://www.isban.es/webservices/TDCs}CICLO_VALCOR_Type"/>
 *         &lt;element name="TIMESTAMP_INI_PROCESO" type="{http://www.isban.es/webservices/TDCs}TIMESTAMP_ALTA_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PROCESO_VALCOR_Type", propOrder = {
    "expedientevalcor",
    "ciclovalcor",
    "timestampiniproceso"
})
public class PROCESOVALCORType {

    @XmlElement(name = "EXPEDIENTE_VALCOR", required = true)
    protected EXPEDIENTEVALCORType expedientevalcor;
    @XmlElement(name = "CICLO_VALCOR", required = true)
    protected String ciclovalcor;
    @XmlElement(name = "TIMESTAMP_INI_PROCESO", required = true)
    protected XMLGregorianCalendar timestampiniproceso;

    /**
     * Gets the value of the expedientevalcor property.
     * 
     * @return
     *     possible object is
     *     {@link EXPEDIENTEVALCORType }
     *     
     */
    public EXPEDIENTEVALCORType getEXPEDIENTEVALCOR() {
        return expedientevalcor;
    }

    /**
     * Sets the value of the expedientevalcor property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXPEDIENTEVALCORType }
     *     
     */
    public void setEXPEDIENTEVALCOR(EXPEDIENTEVALCORType value) {
        this.expedientevalcor = value;
    }

    /**
     * Gets the value of the ciclovalcor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCICLOVALCOR() {
        return ciclovalcor;
    }

    /**
     * Sets the value of the ciclovalcor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCICLOVALCOR(String value) {
        this.ciclovalcor = value;
    }

    /**
     * Gets the value of the timestampiniproceso property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTIMESTAMPINIPROCESO() {
        return timestampiniproceso;
    }

    /**
     * Sets the value of the timestampiniproceso property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTIMESTAMPINIPROCESO(XMLGregorianCalendar value) {
        this.timestampiniproceso = value;
    }

}
