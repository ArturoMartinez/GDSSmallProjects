
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RIESGO_POL_DIS_INTMED_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RIESGO_POL_DIS_INTMED_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NUM_POLIZA_DISTR_INTMED" type="{http://www.isban.es/webservices/TDCc}NUM_POLIZA_DISTR_INTMED_Type"/>
 *         &lt;element name="ORDEN" type="{http://www.isban.es/webservices/TDCs}ORDEN_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RIESGO_POL_DIS_INTMED_Type", propOrder = {
    "numpolizadistrintmed",
    "orden"
})
public class RIESGOPOLDISINTMEDType {

    @XmlElement(name = "NUM_POLIZA_DISTR_INTMED", required = true)
    protected NUMPOLIZADISTRINTMEDType numpolizadistrintmed;
    @XmlElement(name = "ORDEN")
    protected int orden;

    /**
     * Gets the value of the numpolizadistrintmed property.
     * 
     * @return
     *     possible object is
     *     {@link NUMPOLIZADISTRINTMEDType }
     *     
     */
    public NUMPOLIZADISTRINTMEDType getNUMPOLIZADISTRINTMED() {
        return numpolizadistrintmed;
    }

    /**
     * Sets the value of the numpolizadistrintmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link NUMPOLIZADISTRINTMEDType }
     *     
     */
    public void setNUMPOLIZADISTRINTMED(NUMPOLIZADISTRINTMEDType value) {
        this.numpolizadistrintmed = value;
    }

    /**
     * Gets the value of the orden property.
     * 
     */
    public int getORDEN() {
        return orden;
    }

    /**
     * Sets the value of the orden property.
     * 
     */
    public void setORDEN(int value) {
        this.orden = value;
    }

}
