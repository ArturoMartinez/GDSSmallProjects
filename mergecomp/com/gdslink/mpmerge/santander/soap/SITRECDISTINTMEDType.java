
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SIT_REC_DIST_INTMED_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SIT_REC_DIST_INTMED_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RECIBO_DISTRIB_INTMED" type="{http://www.isban.es/webservices/TDCc}RECIBO_DISTRIB_INTMED_Type"/>
 *         &lt;element name="ESTADO_SIT_REC_INTMED" type="{http://www.isban.es/webservices/TDCs}ESTADO_SIT_REC_INTMED_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SIT_REC_DIST_INTMED_Type", propOrder = {
    "recibodistribintmed",
    "estadositrecintmed"
})
public class SITRECDISTINTMEDType {

    @XmlElement(name = "RECIBO_DISTRIB_INTMED", required = true)
    protected RECIBODISTRIBINTMEDType recibodistribintmed;
    @XmlElement(name = "ESTADO_SIT_REC_INTMED", required = true)
    protected String estadositrecintmed;

    /**
     * Gets the value of the recibodistribintmed property.
     * 
     * @return
     *     possible object is
     *     {@link RECIBODISTRIBINTMEDType }
     *     
     */
    public RECIBODISTRIBINTMEDType getRECIBODISTRIBINTMED() {
        return recibodistribintmed;
    }

    /**
     * Sets the value of the recibodistribintmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link RECIBODISTRIBINTMEDType }
     *     
     */
    public void setRECIBODISTRIBINTMED(RECIBODISTRIBINTMEDType value) {
        this.recibodistribintmed = value;
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

}
