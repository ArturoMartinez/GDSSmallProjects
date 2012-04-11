
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SIT_REC_INTMED_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SIT_REC_INTMED_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RECIBO_INTMED" type="{http://www.isban.es/webservices/TDCs}RECIBO_INTMED_Type"/>
 *         &lt;element name="ESTADO_SIT_REC_INTMED" type="{http://www.isban.es/webservices/TDCs}ESTADO_SIT_REC_INTMED_Type"/>
 *         &lt;element name="TIMESTAMP_SITUAC_RECIBO" type="{http://www.isban.es/webservices/TDCs}TIMESTAMP_GENERICO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SIT_REC_INTMED_Type", propOrder = {
    "recibointmed",
    "estadositrecintmed",
    "timestampsituacrecibo"
})
public class SITRECINTMEDType {

    @XmlElement(name = "RECIBO_INTMED", required = true)
    protected String recibointmed;
    @XmlElement(name = "ESTADO_SIT_REC_INTMED", required = true)
    protected String estadositrecintmed;
    @XmlElement(name = "TIMESTAMP_SITUAC_RECIBO", required = true)
    protected XMLGregorianCalendar timestampsituacrecibo;

    /**
     * Gets the value of the recibointmed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECIBOINTMED() {
        return recibointmed;
    }

    /**
     * Sets the value of the recibointmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECIBOINTMED(String value) {
        this.recibointmed = value;
    }

    /**
     * Gets the value of the estadositrecintmed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESTADOSITRECINTMED() {
        return estadositrecintmed;
    }

    /**
     * Sets the value of the estadositrecintmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESTADOSITRECINTMED(String value) {
        this.estadositrecintmed = value;
    }

    /**
     * Gets the value of the timestampsituacrecibo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTIMESTAMPSITUACRECIBO() {
        return timestampsituacrecibo;
    }

    /**
     * Sets the value of the timestampsituacrecibo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTIMESTAMPSITUACRECIBO(XMLGregorianCalendar value) {
        this.timestampsituacrecibo = value;
    }

}
