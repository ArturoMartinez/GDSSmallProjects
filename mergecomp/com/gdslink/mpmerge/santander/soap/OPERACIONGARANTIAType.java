
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OPERACION_GARANTIA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OPERACION_GARANTIA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_OPERACION_GARANTIA" type="{http://www.isban.es/webservices/TDCc}TIPO_OPERACION_GARANTIA_Type"/>
 *         &lt;element name="VALOR_TIPO_OPER_GARANTIA" type="{http://www.isban.es/webservices/TDCs}STRING_50_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OPERACION_GARANTIA_Type", propOrder = {
    "tipooperaciongarantia",
    "valortipoopergarantia"
})
public class OPERACIONGARANTIAType {

    @XmlElement(name = "TIPO_OPERACION_GARANTIA", required = true)
    protected TIPOOPERACIONGARANTIAType tipooperaciongarantia;
    @XmlElement(name = "VALOR_TIPO_OPER_GARANTIA", required = true)
    protected String valortipoopergarantia;

    /**
     * Gets the value of the tipooperaciongarantia property.
     * 
     * @return
     *     possible object is
     *     {@link TIPOOPERACIONGARANTIAType }
     *     
     */
    public TIPOOPERACIONGARANTIAType getTIPOOPERACIONGARANTIA() {
        return tipooperaciongarantia;
    }

    /**
     * Sets the value of the tipooperaciongarantia property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIPOOPERACIONGARANTIAType }
     *     
     */
    public void setTIPOOPERACIONGARANTIA(TIPOOPERACIONGARANTIAType value) {
        this.tipooperaciongarantia = value;
    }

    /**
     * Gets the value of the valortipoopergarantia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALORTIPOOPERGARANTIA() {
        return valortipoopergarantia;
    }

    /**
     * Sets the value of the valortipoopergarantia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALORTIPOOPERGARANTIA(String value) {
        this.valortipoopergarantia = value;
    }

}
