
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TIPO_MARCA_CART_BR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIPO_MARCA_CART_BR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COD_BANDEIRA_BR" type="{http://www.isban.es/webservices/TDCs}COD_BANDEIRA_BR_Type"/>
 *         &lt;element name="TIPO_CARTAO_BR" type="{http://www.isban.es/webservices/TDCs}TIPO_CARTAO_BR_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIPO_MARCA_CART_BR_Type", propOrder = {
    "codbandeirabr",
    "tipocartaobr"
})
public class TIPOMARCACARTBRType {

    @XmlElement(name = "COD_BANDEIRA_BR")
    protected int codbandeirabr;
    @XmlElement(name = "TIPO_CARTAO_BR", required = true)
    protected String tipocartaobr;

    /**
     * Gets the value of the codbandeirabr property.
     * 
     */
    public int getCODBANDEIRABR() {
        return codbandeirabr;
    }

    /**
     * Sets the value of the codbandeirabr property.
     * 
     */
    public void setCODBANDEIRABR(int value) {
        this.codbandeirabr = value;
    }

    /**
     * Gets the value of the tipocartaobr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOCARTAOBR() {
        return tipocartaobr;
    }

    /**
     * Sets the value of the tipocartaobr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOCARTAOBR(String value) {
        this.tipocartaobr = value;
    }

}
