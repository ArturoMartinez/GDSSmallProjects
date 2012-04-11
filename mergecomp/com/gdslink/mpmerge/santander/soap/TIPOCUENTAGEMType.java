
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TIPO_CUENTA_GEM_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIPO_CUENTA_GEM_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FORMATO_ENTRADA_GEM" type="{http://www.isban.es/webservices/TDCc}FORMATO_ENTRADA_GEM_Type"/>
 *         &lt;element name="COD_TIPO_CUENTA" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_1_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIPO_CUENTA_GEM_Type", propOrder = {
    "formatoentradagem",
    "codtipocuenta"
})
public class TIPOCUENTAGEMType {

    @XmlElement(name = "FORMATO_ENTRADA_GEM", required = true)
    protected FORMATOENTRADAGEMType formatoentradagem;
    @XmlElement(name = "COD_TIPO_CUENTA", required = true)
    protected String codtipocuenta;

    /**
     * Gets the value of the formatoentradagem property.
     * 
     * @return
     *     possible object is
     *     {@link FORMATOENTRADAGEMType }
     *     
     */
    public FORMATOENTRADAGEMType getFORMATOENTRADAGEM() {
        return formatoentradagem;
    }

    /**
     * Sets the value of the formatoentradagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link FORMATOENTRADAGEMType }
     *     
     */
    public void setFORMATOENTRADAGEM(FORMATOENTRADAGEMType value) {
        this.formatoentradagem = value;
    }

    /**
     * Gets the value of the codtipocuenta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODTIPOCUENTA() {
        return codtipocuenta;
    }

    /**
     * Sets the value of the codtipocuenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODTIPOCUENTA(String value) {
        this.codtipocuenta = value;
    }

}
