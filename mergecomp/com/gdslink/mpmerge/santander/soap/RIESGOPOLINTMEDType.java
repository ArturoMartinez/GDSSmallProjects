
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RIESGO_POL_INTMED_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RIESGO_POL_INTMED_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NUM_POLIZA_INTMED" type="{http://www.isban.es/webservices/TDCs}NUM_POLIZA_INTMED_Type"/>
 *         &lt;element name="NUM_RIESGO" type="{http://www.isban.es/webservices/TDCs}ORDEN_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RIESGO_POL_INTMED_Type", propOrder = {
    "numpolizaintmed",
    "numriesgo"
})
public class RIESGOPOLINTMEDType {

    @XmlElement(name = "NUM_POLIZA_INTMED", required = true)
    protected String numpolizaintmed;
    @XmlElement(name = "NUM_RIESGO")
    protected int numriesgo;

    /**
     * Gets the value of the numpolizaintmed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMPOLIZAINTMED() {
        return numpolizaintmed;
    }

    /**
     * Sets the value of the numpolizaintmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMPOLIZAINTMED(String value) {
        this.numpolizaintmed = value;
    }

    /**
     * Gets the value of the numriesgo property.
     * 
     */
    public int getNUMRIESGO() {
        return numriesgo;
    }

    /**
     * Sets the value of the numriesgo property.
     * 
     */
    public void setNUMRIESGO(int value) {
        this.numriesgo = value;
    }

}
