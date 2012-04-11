
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SUBCONTRATO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SUBCONTRATO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CONTRATO" type="{http://www.isban.es/webservices/TDCc}CONTRATO_Type"/>
 *         &lt;element name="SUBCONTRATO" type="{http://www.isban.es/webservices/TDCs}NUMERO_CUENTA_INTERNO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SUBCONTRATO_Type", propOrder = {
    "contrato",
    "subcontrato"
})
public class SUBCONTRATOType {

    @XmlElement(name = "CONTRATO", required = true)
    protected CONTRATOType contrato;
    @XmlElement(name = "SUBCONTRATO", required = true)
    protected String subcontrato;

    /**
     * Gets the value of the contrato property.
     * 
     * @return
     *     possible object is
     *     {@link CONTRATOType }
     *     
     */
    public CONTRATOType getCONTRATO() {
        return contrato;
    }

    /**
     * Sets the value of the contrato property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONTRATOType }
     *     
     */
    public void setCONTRATO(CONTRATOType value) {
        this.contrato = value;
    }

    /**
     * Gets the value of the subcontrato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBCONTRATO() {
        return subcontrato;
    }

    /**
     * Sets the value of the subcontrato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBCONTRATO(String value) {
        this.subcontrato = value;
    }

}
