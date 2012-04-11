
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CHEQUE_BANCO_ESPANA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CHEQUE_BANCO_ESPANA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="SERIE" type="{http://www.isban.es/webservices/TDCs}SERIE_Type"/>
 *         &lt;element name="NUMERO_DE_CHEQUE" type="{http://www.isban.es/webservices/TDCs}NUMERO_DE_CHEQUE_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CHEQUE_BANCO_ESPANA_Type", propOrder = {
    "empresa",
    "serie",
    "numerodecheque"
})
public class CHEQUEBANCOESPANAType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "SERIE", required = true)
    protected String serie;
    @XmlElement(name = "NUMERO_DE_CHEQUE", required = true)
    protected String numerodecheque;

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
     * Gets the value of the serie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERIE() {
        return serie;
    }

    /**
     * Sets the value of the serie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERIE(String value) {
        this.serie = value;
    }

    /**
     * Gets the value of the numerodecheque property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERODECHEQUE() {
        return numerodecheque;
    }

    /**
     * Sets the value of the numerodecheque property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERODECHEQUE(String value) {
        this.numerodecheque = value;
    }

}
