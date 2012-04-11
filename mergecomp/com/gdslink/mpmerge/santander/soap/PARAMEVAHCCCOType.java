
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PARAM_EV_AHCCCO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PARAM_EV_AHCCCO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EVENTO_AHCCCO" type="{http://www.isban.es/webservices/TDCc}EVENTO_AHCCCO_Type"/>
 *         &lt;element name="COD_DAUDI" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PARAM_EV_AHCCCO_Type", propOrder = {
    "eventoahccco",
    "coddaudi"
})
public class PARAMEVAHCCCOType {

    @XmlElement(name = "EVENTO_AHCCCO", required = true)
    protected EVENTOAHCCCOType eventoahccco;
    @XmlElement(name = "COD_DAUDI", required = true)
    protected String coddaudi;

    /**
     * Gets the value of the eventoahccco property.
     * 
     * @return
     *     possible object is
     *     {@link EVENTOAHCCCOType }
     *     
     */
    public EVENTOAHCCCOType getEVENTOAHCCCO() {
        return eventoahccco;
    }

    /**
     * Sets the value of the eventoahccco property.
     * 
     * @param value
     *     allowed object is
     *     {@link EVENTOAHCCCOType }
     *     
     */
    public void setEVENTOAHCCCO(EVENTOAHCCCOType value) {
        this.eventoahccco = value;
    }

    /**
     * Gets the value of the coddaudi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODDAUDI() {
        return coddaudi;
    }

    /**
     * Sets the value of the coddaudi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODDAUDI(String value) {
        this.coddaudi = value;
    }

}
