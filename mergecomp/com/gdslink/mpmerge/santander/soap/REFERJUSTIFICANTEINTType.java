
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for REFER_JUSTIFICANTE_INT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REFER_JUSTIFICANTE_INT_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="ID_JUSTIFICANTE_INT" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_16_Type"/>
 *         &lt;element name="SECUENCIA" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REFER_JUSTIFICANTE_INT_Type", propOrder = {
    "empresa",
    "idjustificanteint",
    "secuencia"
})
public class REFERJUSTIFICANTEINTType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "ID_JUSTIFICANTE_INT", required = true)
    protected String idjustificanteint;
    @XmlElement(name = "SECUENCIA")
    protected int secuencia;

    /**
     * Gets the value of the empresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPRESA() {
        return empresa;
    }

    /**
     * Sets the value of the empresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPRESA(String value) {
        this.empresa = value;
    }

    /**
     * Gets the value of the idjustificanteint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDJUSTIFICANTEINT() {
        return idjustificanteint;
    }

    /**
     * Sets the value of the idjustificanteint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDJUSTIFICANTEINT(String value) {
        this.idjustificanteint = value;
    }

    /**
     * Gets the value of the secuencia property.
     * 
     */
    public int getSECUENCIA() {
        return secuencia;
    }

    /**
     * Sets the value of the secuencia property.
     * 
     */
    public void setSECUENCIA(int value) {
        this.secuencia = value;
    }

}
