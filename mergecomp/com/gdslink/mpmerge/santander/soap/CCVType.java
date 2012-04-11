
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCV_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCV_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OFICINA" type="{http://www.isban.es/webservices/TDCc}OFICINA_BANCARIA_Type"/>
 *         &lt;element name="DIGITO_DE_CONTROL" type="{http://www.isban.es/webservices/TDCs}DIGITO_CONTROL_CCC_CCV_Type"/>
 *         &lt;element name="NUMERO_DE_CUENTA" type="{http://www.isban.es/webservices/TDCs}NUMERO_CUENTA_EXTERNA_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCV_Type", propOrder = {
    "oficina",
    "digitodecontrol",
    "numerodecuenta"
})
public class CCVType {

    @XmlElement(name = "OFICINA", required = true)
    protected OFICINABANCARIAType oficina;
    @XmlElement(name = "DIGITO_DE_CONTROL", required = true)
    protected String digitodecontrol;
    @XmlElement(name = "NUMERO_DE_CUENTA", required = true)
    protected String numerodecuenta;

    /**
     * Gets the value of the oficina property.
     * 
     * @return
     *     possible object is
     *     {@link OFICINABANCARIAType }
     *     
     */
    public OFICINABANCARIAType getOFICINA() {
        return oficina;
    }

    /**
     * Sets the value of the oficina property.
     * 
     * @param value
     *     allowed object is
     *     {@link OFICINABANCARIAType }
     *     
     */
    public void setOFICINA(OFICINABANCARIAType value) {
        this.oficina = value;
    }

    /**
     * Gets the value of the digitodecontrol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIGITODECONTROL() {
        return digitodecontrol;
    }

    /**
     * Sets the value of the digitodecontrol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIGITODECONTROL(String value) {
        this.digitodecontrol = value;
    }

    /**
     * Gets the value of the numerodecuenta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERODECUENTA() {
        return numerodecuenta;
    }

    /**
     * Sets the value of the numerodecuenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERODECUENTA(String value) {
        this.numerodecuenta = value;
    }

}
