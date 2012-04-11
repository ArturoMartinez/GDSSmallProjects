
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PARAM_EVENTO_AHINBN_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PARAM_EVENTO_AHINBN_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EVENTO_AHEBMG" type="{http://www.isban.es/webservices/TDCc}EVENTO_AHINBN_Type"/>
 *         &lt;element name="COD_ALFANUM_2" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PARAM_EVENTO_AHINBN_Type", propOrder = {
    "eventoahebmg",
    "codalfanum2"
})
public class PARAMEVENTOAHINBNType {

    @XmlElement(name = "EVENTO_AHEBMG", required = true)
    protected EVENTOAHINBNType eventoahebmg;
    @XmlElement(name = "COD_ALFANUM_2", required = true)
    protected String codalfanum2;

    /**
     * Gets the value of the eventoahebmg property.
     * 
     * @return
     *     possible object is
     *     {@link EVENTOAHINBNType }
     *     
     */
    public EVENTOAHINBNType getEVENTOAHEBMG() {
        return eventoahebmg;
    }

    /**
     * Sets the value of the eventoahebmg property.
     * 
     * @param value
     *     allowed object is
     *     {@link EVENTOAHINBNType }
     *     
     */
    public void setEVENTOAHEBMG(EVENTOAHINBNType value) {
        this.eventoahebmg = value;
    }

    /**
     * Gets the value of the codalfanum2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODALFANUM2() {
        return codalfanum2;
    }

    /**
     * Sets the value of the codalfanum2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODALFANUM2(String value) {
        this.codalfanum2 = value;
    }

}
