
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RFRV_ID_EVENTO_OPER_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RFRV_ID_EVENTO_OPER_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CONTRATO" type="{http://www.isban.es/webservices/TDCc}CONTRATO_Type"/>
 *         &lt;element name="NUM_EVENTO" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RFRV_ID_EVENTO_OPER_Type", propOrder = {
    "contrato",
    "numevento"
})
public class RFRVIDEVENTOOPERType {

    @XmlElement(name = "CONTRATO", required = true)
    protected CONTRATOType contrato;
    @XmlElement(name = "NUM_EVENTO")
    protected int numevento;

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
     * Gets the value of the numevento property.
     * 
     */
    public int getNUMEVENTO() {
        return numevento;
    }

    /**
     * Sets the value of the numevento property.
     * 
     */
    public void setNUMEVENTO(int value) {
        this.numevento = value;
    }

}
