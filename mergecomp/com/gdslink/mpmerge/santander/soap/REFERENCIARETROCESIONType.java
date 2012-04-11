
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for REFERENCIA_RETROCESION_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REFERENCIA_RETROCESION_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CONTRATO" type="{http://www.isban.es/webservices/TDCc}CONTRATO_Type"/>
 *         &lt;element name="CODIGO_REFERENCIA" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_25_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REFERENCIA_RETROCESION_Type", propOrder = {
    "contrato",
    "codigoreferencia"
})
public class REFERENCIARETROCESIONType {

    @XmlElement(name = "CONTRATO", required = true)
    protected CONTRATOType contrato;
    @XmlElement(name = "CODIGO_REFERENCIA", required = true)
    protected String codigoreferencia;

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
     * Gets the value of the codigoreferencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOREFERENCIA() {
        return codigoreferencia;
    }

    /**
     * Sets the value of the codigoreferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOREFERENCIA(String value) {
        this.codigoreferencia = value;
    }

}
