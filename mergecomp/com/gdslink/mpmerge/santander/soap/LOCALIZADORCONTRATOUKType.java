
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LOCALIZADOR_CONTRATO_UK_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOCALIZADOR_CONTRATO_UK_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SORTCODE_CONTRATO" type="{http://www.isban.es/webservices/TDCc}LOCALIZADOR_Type"/>
 *         &lt;element name="SURCODE_1" type="{http://www.isban.es/webservices/TDCs}SURCODE_LOCALIZA_CTO_UK_Type"/>
 *         &lt;element name="SURCODE_2" type="{http://www.isban.es/webservices/TDCs}SURCODE_LOCALIZA_CTO_UK_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LOCALIZADOR_CONTRATO_UK_Type", propOrder = {
    "sortcodecontrato",
    "surcode1",
    "surcode2"
})
public class LOCALIZADORCONTRATOUKType {

    @XmlElement(name = "SORTCODE_CONTRATO", required = true)
    protected LOCALIZADORType sortcodecontrato;
    @XmlElement(name = "SURCODE_1", required = true)
    protected String surcode1;
    @XmlElement(name = "SURCODE_2", required = true)
    protected String surcode2;

    /**
     * Gets the value of the sortcodecontrato property.
     * 
     * @return
     *     possible object is
     *     {@link LOCALIZADORType }
     *     
     */
    public LOCALIZADORType getSORTCODECONTRATO() {
        return sortcodecontrato;
    }

    /**
     * Sets the value of the sortcodecontrato property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCALIZADORType }
     *     
     */
    public void setSORTCODECONTRATO(LOCALIZADORType value) {
        this.sortcodecontrato = value;
    }

    /**
     * Gets the value of the surcode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSURCODE1() {
        return surcode1;
    }

    /**
     * Sets the value of the surcode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSURCODE1(String value) {
        this.surcode1 = value;
    }

    /**
     * Gets the value of the surcode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSURCODE2() {
        return surcode2;
    }

    /**
     * Sets the value of the surcode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSURCODE2(String value) {
        this.surcode2 = value;
    }

}
