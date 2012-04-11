
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OPERACION_DGO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OPERACION_DGO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CENTRO" type="{http://www.isban.es/webservices/TDCc}CENTRO_DE_CONTRATO_Type"/>
 *         &lt;element name="CODIGO_TERMINAL_DGO" type="{http://www.isban.es/webservices/TDCs}CODIGO_TERMINAL_DGO_Type"/>
 *         &lt;element name="NUMERO_DGO" type="{http://www.isban.es/webservices/TDCs}NUMERO_OPERACION_DGO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OPERACION_DGO_Type", propOrder = {
    "centro",
    "codigoterminaldgo",
    "numerodgo"
})
public class OPERACIONDGOType {

    @XmlElement(name = "CENTRO", required = true)
    protected CENTRODECONTRATOType centro;
    @XmlElement(name = "CODIGO_TERMINAL_DGO", required = true)
    protected String codigoterminaldgo;
    @XmlElement(name = "NUMERO_DGO")
    protected int numerodgo;

    /**
     * Gets the value of the centro property.
     * 
     * @return
     *     possible object is
     *     {@link CENTRODECONTRATOType }
     *     
     */
    public CENTRODECONTRATOType getCENTRO() {
        return centro;
    }

    /**
     * Sets the value of the centro property.
     * 
     * @param value
     *     allowed object is
     *     {@link CENTRODECONTRATOType }
     *     
     */
    public void setCENTRO(CENTRODECONTRATOType value) {
        this.centro = value;
    }

    /**
     * Gets the value of the codigoterminaldgo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOTERMINALDGO() {
        return codigoterminaldgo;
    }

    /**
     * Sets the value of the codigoterminaldgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOTERMINALDGO(String value) {
        this.codigoterminaldgo = value;
    }

    /**
     * Gets the value of the numerodgo property.
     * 
     */
    public int getNUMERODGO() {
        return numerodgo;
    }

    /**
     * Sets the value of the numerodgo property.
     * 
     */
    public void setNUMERODGO(int value) {
        this.numerodgo = value;
    }

}
