
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SALDO_PUNTUAL_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SALDO_PUNTUAL_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="POSICION_DE_CONTRATO" type="{http://www.isban.es/webservices/TDCc}POSICION_DE_CONTRATO_Type"/>
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
@XmlType(name = "SALDO_PUNTUAL_Type", propOrder = {
    "posiciondecontrato",
    "importe"
})
public class SALDOPUNTUALType {

    @XmlElement(name = "POSICION_DE_CONTRATO", required = true)
    protected POSICIONDECONTRATOType posiciondecontrato;
    @XmlElement(name = "IMPORTE", required = true)
    protected IMPORTEType importe;

    /**
     * Gets the value of the posiciondecontrato property.
     * 
     * @return
     *     possible object is
     *     {@link POSICIONDECONTRATOType }
     *     
     */
    public POSICIONDECONTRATOType getPOSICIONDECONTRATO() {
        return posiciondecontrato;
    }

    /**
     * Sets the value of the posiciondecontrato property.
     * 
     * @param value
     *     allowed object is
     *     {@link POSICIONDECONTRATOType }
     *     
     */
    public void setPOSICIONDECONTRATO(POSICIONDECONTRATOType value) {
        this.posiciondecontrato = value;
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
