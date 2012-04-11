
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CHAVE_MAR_PROD_BR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CHAVE_MAR_PROD_BR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PRODUCTO_BR" type="{http://www.isban.es/webservices/TDCs}PRODUCTO_BR_Type"/>
 *         &lt;element name="SUBPRODUCTO_BR" type="{http://www.isban.es/webservices/TDCs}SUBPRODUCTO_BR_Type"/>
 *         &lt;element name="BANDEIRA_BR" type="{http://www.isban.es/webservices/TDCs}COD_BANDEIRA_BR_Type"/>
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
@XmlType(name = "CHAVE_MAR_PROD_BR_Type", propOrder = {
    "productobr",
    "subproductobr",
    "bandeirabr",
    "tipocartaobr"
})
public class CHAVEMARPRODBRType {

    @XmlElement(name = "PRODUCTO_BR", required = true)
    protected String productobr;
    @XmlElement(name = "SUBPRODUCTO_BR", required = true)
    protected String subproductobr;
    @XmlElement(name = "BANDEIRA_BR")
    protected int bandeirabr;
    @XmlElement(name = "TIPO_CARTAO_BR", required = true)
    protected String tipocartaobr;

    /**
     * Gets the value of the productobr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODUCTOBR() {
        return productobr;
    }

    /**
     * Sets the value of the productobr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODUCTOBR(String value) {
        this.productobr = value;
    }

    /**
     * Gets the value of the subproductobr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBPRODUCTOBR() {
        return subproductobr;
    }

    /**
     * Sets the value of the subproductobr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBPRODUCTOBR(String value) {
        this.subproductobr = value;
    }

    /**
     * Gets the value of the bandeirabr property.
     * 
     */
    public int getBANDEIRABR() {
        return bandeirabr;
    }

    /**
     * Sets the value of the bandeirabr property.
     * 
     */
    public void setBANDEIRABR(int value) {
        this.bandeirabr = value;
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
