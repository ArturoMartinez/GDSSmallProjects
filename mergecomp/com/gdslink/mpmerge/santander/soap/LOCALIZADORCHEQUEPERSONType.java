
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LOCALIZADOR_CHEQUE_PERSON_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOCALIZADOR_CHEQUE_PERSON_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CLAVE_CLASIFICACION" type="{http://www.isban.es/webservices/TDCc}LOCALIZADOR_Type"/>
 *         &lt;element name="NUMERO_DE_CHEQUE" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_6_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LOCALIZADOR_CHEQUE_PERSON_Type", propOrder = {
    "claveclasificacion",
    "numerodecheque"
})
public class LOCALIZADORCHEQUEPERSONType {

    @XmlElement(name = "CLAVE_CLASIFICACION", required = true)
    protected LOCALIZADORType claveclasificacion;
    @XmlElement(name = "NUMERO_DE_CHEQUE", required = true)
    protected String numerodecheque;

    /**
     * Gets the value of the claveclasificacion property.
     * 
     * @return
     *     possible object is
     *     {@link LOCALIZADORType }
     *     
     */
    public LOCALIZADORType getCLAVECLASIFICACION() {
        return claveclasificacion;
    }

    /**
     * Sets the value of the claveclasificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCALIZADORType }
     *     
     */
    public void setCLAVECLASIFICACION(LOCALIZADORType value) {
        this.claveclasificacion = value;
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
