
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for REFER_OPER_PRESTAMO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REFER_OPER_PRESTAMO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CONTRATO" type="{http://www.isban.es/webservices/TDCc}CONTRATO_Type"/>
 *         &lt;element name="OPERACION_BASICA" type="{http://www.isban.es/webservices/TDCs}OPERACION_BASICA_Type"/>
 *         &lt;element name="SECUENCIAL_CORTO" type="{http://www.isban.es/webservices/TDCs}SECUENCIAL_CORTO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REFER_OPER_PRESTAMO_Type", propOrder = {
    "contrato",
    "operacionbasica",
    "secuencialcorto"
})
public class REFEROPERPRESTAMOType {

    @XmlElement(name = "CONTRATO", required = true)
    protected CONTRATOType contrato;
    @XmlElement(name = "OPERACION_BASICA", required = true)
    protected String operacionbasica;
    @XmlElement(name = "SECUENCIAL_CORTO")
    protected int secuencialcorto;

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
     * Gets the value of the operacionbasica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPERACIONBASICA() {
        return operacionbasica;
    }

    /**
     * Sets the value of the operacionbasica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPERACIONBASICA(String value) {
        this.operacionbasica = value;
    }

    /**
     * Gets the value of the secuencialcorto property.
     * 
     */
    public int getSECUENCIALCORTO() {
        return secuencialcorto;
    }

    /**
     * Sets the value of the secuencialcorto property.
     * 
     */
    public void setSECUENCIALCORTO(int value) {
        this.secuencialcorto = value;
    }

}
