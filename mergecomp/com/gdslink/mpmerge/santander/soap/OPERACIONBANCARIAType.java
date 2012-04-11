
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OPERACION_BANCARIA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OPERACION_BANCARIA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OPERACION_BASICA" type="{http://www.isban.es/webservices/TDCs}OPERACION_BASICA_Type"/>
 *         &lt;element name="OPERACION_BANCARIA" type="{http://www.isban.es/webservices/TDCs}CODIGO_OPERACION_BANCARIA_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OPERACION_BANCARIA_Type", propOrder = {
    "operacionbasica",
    "operacionbancaria"
})
public class OPERACIONBANCARIAType {

    @XmlElement(name = "OPERACION_BASICA", required = true)
    protected String operacionbasica;
    @XmlElement(name = "OPERACION_BANCARIA", required = true)
    protected String operacionbancaria;

    /**
     * Gets the value of the operacionbasica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPERACIONBASICA() {
        return operacionbasica;
    }

    /**
     * Sets the value of the operacionbasica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPERACIONBASICA(String value) {
        this.operacionbasica = value;
    }

    /**
     * Gets the value of the operacionbancaria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPERACIONBANCARIA() {
        return operacionbancaria;
    }

    /**
     * Sets the value of the operacionbancaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPERACIONBANCARIA(String value) {
        this.operacionbancaria = value;
    }

}
