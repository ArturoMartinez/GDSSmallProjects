
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RFRV_FLUJO_OPERACION_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RFRV_FLUJO_OPERACION_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CONTRATO" type="{http://www.isban.es/webservices/TDCc}CONTRATO_Type"/>
 *         &lt;element name="CODIGO_DE_FLUJO" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RFRV_FLUJO_OPERACION_Type", propOrder = {
    "contrato",
    "codigodeflujo"
})
public class RFRVFLUJOOPERACIONType {

    @XmlElement(name = "CONTRATO", required = true)
    protected CONTRATOType contrato;
    @XmlElement(name = "CODIGO_DE_FLUJO")
    protected int codigodeflujo;

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
     * Gets the value of the codigodeflujo property.
     * 
     */
    public int getCODIGODEFLUJO() {
        return codigodeflujo;
    }

    /**
     * Sets the value of the codigodeflujo property.
     * 
     */
    public void setCODIGODEFLUJO(int value) {
        this.codigodeflujo = value;
    }

}
