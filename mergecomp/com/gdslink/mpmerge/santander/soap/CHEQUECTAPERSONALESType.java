
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CHEQUE_CTA_PERSONALES_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CHEQUE_CTA_PERSONALES_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CONTRATO_CHEQUE_CTAPER" type="{http://www.isban.es/webservices/TDCc}CONTRATO_PRESEN_6MAS7MAS1_Type"/>
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
@XmlType(name = "CHEQUE_CTA_PERSONALES_Type", propOrder = {
    "contratochequectaper",
    "numerodecheque"
})
public class CHEQUECTAPERSONALESType {

    @XmlElement(name = "CONTRATO_CHEQUE_CTAPER", required = true)
    protected CONTRATOPRESEN6MAS7MAS1Type contratochequectaper;
    @XmlElement(name = "NUMERO_DE_CHEQUE", required = true)
    protected String numerodecheque;

    /**
     * Gets the value of the contratochequectaper property.
     * 
     * @return
     *     possible object is
     *     {@link CONTRATOPRESEN6MAS7MAS1Type }
     *     
     */
    public CONTRATOPRESEN6MAS7MAS1Type getCONTRATOCHEQUECTAPER() {
        return contratochequectaper;
    }

    /**
     * Sets the value of the contratochequectaper property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONTRATOPRESEN6MAS7MAS1Type }
     *     
     */
    public void setCONTRATOCHEQUECTAPER(CONTRATOPRESEN6MAS7MAS1Type value) {
        this.contratochequectaper = value;
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
