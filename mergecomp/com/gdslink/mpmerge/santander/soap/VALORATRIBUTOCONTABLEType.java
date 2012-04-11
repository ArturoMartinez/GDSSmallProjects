
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VALOR_ATRIBUTO_CONTABLE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VALOR_ATRIBUTO_CONTABLE_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DENOMINACION_ATRIBUT_CONT" type="{http://www.isban.es/webservices/TDCc}DENOMINACION_ATRIBUT_CONT_Type"/>
 *         &lt;element name="COD_VALOR_ATRIB" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VALOR_ATRIBUTO_CONTABLE_Type", propOrder = {
    "denominacionatributcont",
    "codvaloratrib"
})
public class VALORATRIBUTOCONTABLEType {

    @XmlElement(name = "DENOMINACION_ATRIBUT_CONT", required = true)
    protected DENOMINACIONATRIBUTCONTType denominacionatributcont;
    @XmlElement(name = "COD_VALOR_ATRIB", required = true)
    protected String codvaloratrib;

    /**
     * Gets the value of the denominacionatributcont property.
     * 
     * @return
     *     possible object is
     *     {@link DENOMINACIONATRIBUTCONTType }
     *     
     */
    public DENOMINACIONATRIBUTCONTType getDENOMINACIONATRIBUTCONT() {
        return denominacionatributcont;
    }

    /**
     * Sets the value of the denominacionatributcont property.
     * 
     * @param value
     *     allowed object is
     *     {@link DENOMINACIONATRIBUTCONTType }
     *     
     */
    public void setDENOMINACIONATRIBUTCONT(DENOMINACIONATRIBUTCONTType value) {
        this.denominacionatributcont = value;
    }

    /**
     * Gets the value of the codvaloratrib property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODVALORATRIB() {
        return codvaloratrib;
    }

    /**
     * Sets the value of the codvaloratrib property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODVALORATRIB(String value) {
        this.codvaloratrib = value;
    }

}
