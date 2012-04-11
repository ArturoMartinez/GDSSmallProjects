
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CONTRATO_PCAS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CONTRATO_PCAS_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CENTRO" type="{http://www.isban.es/webservices/TDCc}CENTRO_Type"/>
 *         &lt;element name="CUENTA_TJA" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_12_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONTRATO_PCAS_Type", propOrder = {
    "centro",
    "cuentatja"
})
public class CONTRATOPCASType {

    @XmlElement(name = "CENTRO", required = true)
    protected CENTROType centro;
    @XmlElement(name = "CUENTA_TJA", required = true)
    protected String cuentatja;

    /**
     * Gets the value of the centro property.
     * 
     * @return
     *     possible object is
     *     {@link CENTROType }
     *     
     */
    public CENTROType getCENTRO() {
        return centro;
    }

    /**
     * Sets the value of the centro property.
     * 
     * @param value
     *     allowed object is
     *     {@link CENTROType }
     *     
     */
    public void setCENTRO(CENTROType value) {
        this.centro = value;
    }

    /**
     * Gets the value of the cuentatja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUENTATJA() {
        return cuentatja;
    }

    /**
     * Sets the value of the cuentatja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUENTATJA(String value) {
        this.cuentatja = value;
    }

}
