
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TPO_DATO_BONIS_BNF_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPO_DATO_BONIS_BNF_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_DATO_BNF" type="{http://www.isban.es/webservices/TDCc}TIPO_DATO_BNF_Type"/>
 *         &lt;element name="COD_DATO_OPER_BONIS" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPO_DATO_BONIS_BNF_Type", propOrder = {
    "tipodatobnf",
    "coddatooperbonis"
})
public class TPODATOBONISBNFType {

    @XmlElement(name = "TIPO_DATO_BNF", required = true)
    protected TIPODATOBNFType tipodatobnf;
    @XmlElement(name = "COD_DATO_OPER_BONIS", required = true)
    protected String coddatooperbonis;

    /**
     * Gets the value of the tipodatobnf property.
     * 
     * @return
     *     possible object is
     *     {@link TIPODATOBNFType }
     *     
     */
    public TIPODATOBNFType getTIPODATOBNF() {
        return tipodatobnf;
    }

    /**
     * Sets the value of the tipodatobnf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIPODATOBNFType }
     *     
     */
    public void setTIPODATOBNF(TIPODATOBNFType value) {
        this.tipodatobnf = value;
    }

    /**
     * Gets the value of the coddatooperbonis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODDATOOPERBONIS() {
        return coddatooperbonis;
    }

    /**
     * Sets the value of the coddatooperbonis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODDATOOPERBONIS(String value) {
        this.coddatooperbonis = value;
    }

}
