
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CHEQUE_EXTERNO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CHEQUE_EXTERNO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CUENTA_CHEQUE_EXT" type="{http://www.isban.es/webservices/TDCc}CONTRATO_PRESEN_6MAS8_EXT_Type"/>
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
@XmlType(name = "CHEQUE_EXTERNO_Type", propOrder = {
    "cuentachequeext",
    "numerodecheque"
})
public class CHEQUEEXTERNOType {

    @XmlElement(name = "CUENTA_CHEQUE_EXT", required = true)
    protected CONTRATOPRESEN6MAS8EXTType cuentachequeext;
    @XmlElement(name = "NUMERO_DE_CHEQUE", required = true)
    protected String numerodecheque;

    /**
     * Gets the value of the cuentachequeext property.
     * 
     * @return
     *     possible object is
     *     {@link CONTRATOPRESEN6MAS8EXTType }
     *     
     */
    public CONTRATOPRESEN6MAS8EXTType getCUENTACHEQUEEXT() {
        return cuentachequeext;
    }

    /**
     * Sets the value of the cuentachequeext property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONTRATOPRESEN6MAS8EXTType }
     *     
     */
    public void setCUENTACHEQUEEXT(CONTRATOPRESEN6MAS8EXTType value) {
        this.cuentachequeext = value;
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
