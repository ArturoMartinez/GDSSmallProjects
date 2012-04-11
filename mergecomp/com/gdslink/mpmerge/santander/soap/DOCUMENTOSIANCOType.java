
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DOCUMENTO_SIANCO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DOCUMENTO_SIANCO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EXPEDIENTE_SIANCO" type="{http://www.isban.es/webservices/TDCc}EXPEDIENTE_SIANCO_Type"/>
 *         &lt;element name="TIMESTAMP" type="{http://www.isban.es/webservices/TDCs}TIMESTAMP_ALTA_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DOCUMENTO_SIANCO_Type", propOrder = {
    "expedientesianco",
    "timestamp"
})
public class DOCUMENTOSIANCOType {

    @XmlElement(name = "EXPEDIENTE_SIANCO", required = true)
    protected EXPEDIENTESIANCOType expedientesianco;
    @XmlElement(name = "TIMESTAMP", required = true)
    protected XMLGregorianCalendar timestamp;

    /**
     * Gets the value of the expedientesianco property.
     * 
     * @return
     *     possible object is
     *     {@link EXPEDIENTESIANCOType }
     *     
     */
    public EXPEDIENTESIANCOType getEXPEDIENTESIANCO() {
        return expedientesianco;
    }

    /**
     * Sets the value of the expedientesianco property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXPEDIENTESIANCOType }
     *     
     */
    public void setEXPEDIENTESIANCO(EXPEDIENTESIANCOType value) {
        this.expedientesianco = value;
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

}
