
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUXILIAR_CONTABLE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AUXILIAR_CONTABLE_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CENTRO" type="{http://www.isban.es/webservices/TDCc}CENTRO_DE_CONTRATO_Type"/>
 *         &lt;element name="PRODUCTO" type="{http://www.isban.es/webservices/TDCc}SUBTIPO_DE_PRODUCTO_Type"/>
 *         &lt;element name="CONCEPTO" type="{http://www.isban.es/webservices/TDCs}CONCEPTO_DE_SALDO_Type"/>
 *         &lt;element name="IMPORTE" type="{http://www.isban.es/webservices/TDCc}IMPORTE_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AUXILIAR_CONTABLE_Type", propOrder = {
    "centro",
    "producto",
    "concepto",
    "importe"
})
public class AUXILIARCONTABLEType {

    @XmlElement(name = "CENTRO", required = true)
    protected CENTRODECONTRATOType centro;
    @XmlElement(name = "PRODUCTO", required = true)
    protected SUBTIPODEPRODUCTOType producto;
    @XmlElement(name = "CONCEPTO", required = true)
    protected String concepto;
    @XmlElement(name = "IMPORTE", required = true)
    protected IMPORTEType importe;

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
     *     {@link SUBTIPODEPRODUCTOType }
     *     
     */
    public SUBTIPODEPRODUCTOType getPRODUCTO() {
        return producto;
    }

    /**
     * Sets the value of the producto property.
     * 
     * @param value
     *     allowed object is
     *     {@link SUBTIPODEPRODUCTOType }
     *     
     */
    public void setPRODUCTO(SUBTIPODEPRODUCTOType value) {
        this.producto = value;
    }

    /**
     * Gets the value of the concepto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONCEPTO() {
        return concepto;
    }

    /**
     * Sets the value of the concepto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONCEPTO(String value) {
        this.concepto = value;
    }

    /**
     * Gets the value of the importe property.
     * 
     * @return
     *     possible object is
     *     {@link IMPORTEType }
     *     
     */
    public IMPORTEType getIMPORTE() {
        return importe;
    }

    /**
     * Sets the value of the importe property.
     * 
     * @param value
     *     allowed object is
     *     {@link IMPORTEType }
     *     
     */
    public void setIMPORTE(IMPORTEType value) {
        this.importe = value;
    }

}
