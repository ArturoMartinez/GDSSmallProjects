
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CONTRATO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CONTRATO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CENTRO" type="{http://www.isban.es/webservices/TDCc}CENTRO_DE_CONTRATO_Type"/>
 *         &lt;element name="PRODUCTO" type="{http://www.isban.es/webservices/TDCs}CODIGO_DE_PRODUCTO_Type"/>
 *         &lt;element name="NUMERO_DE_CONTRATO" type="{http://www.isban.es/webservices/TDCs}NUMERO_CUENTA_INTERNO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONTRATO_Type", propOrder = {
    "centro",
    "producto",
    "numerodecontrato"
})
public class CONTRATOType {

    @XmlElement(name = "CENTRO", required = true)
    protected CENTRODECONTRATOType centro;
    @XmlElement(name = "PRODUCTO", required = true)
    protected String producto;
    @XmlElement(name = "NUMERO_DE_CONTRATO", required = true)
    protected String numerodecontrato;

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
     * Gets the value of the producto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODUCTO() {
        return producto;
    }

    /**
     * Sets the value of the producto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODUCTO(String value) {
        this.producto = value;
    }

    /**
     * Gets the value of the numerodecontrato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERODECONTRATO() {
        return numerodecontrato;
    }

    /**
     * Sets the value of the numerodecontrato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERODECONTRATO(String value) {
        this.numerodecontrato = value;
    }

}
