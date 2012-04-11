
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OCURRENCIA_AIS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OCURRENCIA_AIS_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="FECHA_OCURRENCIA" type="{http://www.isban.es/webservices/TDCs}FECHA_GENERICA_Type"/>
 *         &lt;element name="SEC_OCURRENCIA" type="{http://www.isban.es/webservices/TDCs}NUMERO_SECUENCIAL_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCURRENCIA_AIS_Type", propOrder = {
    "empresa",
    "fechaocurrencia",
    "secocurrencia"
})
public class OCURRENCIAAISType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "FECHA_OCURRENCIA", required = true)
    protected XMLGregorianCalendar fechaocurrencia;
    @XmlElement(name = "SEC_OCURRENCIA")
    protected int secocurrencia;

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
     * Gets the value of the fechaocurrencia property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFECHAOCURRENCIA() {
        return fechaocurrencia;
    }

    /**
     * Sets the value of the fechaocurrencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFECHAOCURRENCIA(XMLGregorianCalendar value) {
        this.fechaocurrencia = value;
    }

    /**
     * Gets the value of the secocurrencia property.
     * 
     */
    public int getSECOCURRENCIA() {
        return secocurrencia;
    }

    /**
     * Sets the value of the secocurrencia property.
     * 
     */
    public void setSECOCURRENCIA(int value) {
        this.secocurrencia = value;
    }

}
