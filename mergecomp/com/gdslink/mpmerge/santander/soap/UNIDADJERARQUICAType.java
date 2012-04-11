
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UNIDAD_JERARQUICA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UNIDAD_JERARQUICA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CONTRATO" type="{http://www.isban.es/webservices/TDCc}CONTRATO_Type"/>
 *         &lt;element name="COD_UNIDAD_JERARQUICA" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UNIDAD_JERARQUICA_Type", propOrder = {
    "contrato",
    "codunidadjerarquica"
})
public class UNIDADJERARQUICAType {

    @XmlElement(name = "CONTRATO", required = true)
    protected CONTRATOType contrato;
    @XmlElement(name = "COD_UNIDAD_JERARQUICA", required = true)
    protected String codunidadjerarquica;

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
     * Gets the value of the codunidadjerarquica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODUNIDADJERARQUICA() {
        return codunidadjerarquica;
    }

    /**
     * Sets the value of the codunidadjerarquica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODUNIDADJERARQUICA(String value) {
        this.codunidadjerarquica = value;
    }

}
