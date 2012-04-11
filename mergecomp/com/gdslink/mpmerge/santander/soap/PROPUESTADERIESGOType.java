
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PROPUESTA_DE_RIESGO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PROPUESTA_DE_RIESGO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CENTRO" type="{http://www.isban.es/webservices/TDCc}CENTRO_Type"/>
 *         &lt;element name="ANO" type="{http://www.isban.es/webservices/TDCs}ANO_Type"/>
 *         &lt;element name="NUMERO_DE_PROPUESTA" type="{http://www.isban.es/webservices/TDCs}SECUENCIAL_CORTO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PROPUESTA_DE_RIESGO_Type", propOrder = {
    "centro",
    "ano",
    "numerodepropuesta"
})
public class PROPUESTADERIESGOType {

    @XmlElement(name = "CENTRO", required = true)
    protected CENTROType centro;
    @XmlElement(name = "ANO")
    protected int ano;
    @XmlElement(name = "NUMERO_DE_PROPUESTA")
    protected int numerodepropuesta;

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
     * Gets the value of the ano property.
     * 
     */
    public int getANO() {
        return ano;
    }

    /**
     * Sets the value of the ano property.
     * 
     */
    public void setANO(int value) {
        this.ano = value;
    }

    /**
     * Gets the value of the numerodepropuesta property.
     * 
     */
    public int getNUMERODEPROPUESTA() {
        return numerodepropuesta;
    }

    /**
     * Sets the value of the numerodepropuesta property.
     * 
     */
    public void setNUMERODEPROPUESTA(int value) {
        this.numerodepropuesta = value;
    }

}
