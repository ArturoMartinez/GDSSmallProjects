
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CHAVE_COND_ECON_BR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CHAVE_COND_ECON_BR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COD_PRODUTO_BR" type="{http://www.isban.es/webservices/TDCs}COD_PRODUTO_BR_Type"/>
 *         &lt;element name="SUBPRODUCTO_BR" type="{http://www.isban.es/webservices/TDCs}SUBPRODUCTO_BR_Type"/>
 *         &lt;element name="VERTENTE_BR" type="{http://www.isban.es/webservices/TDCs}VERTENTE_BR_Type"/>
 *         &lt;element name="CONDICAO_ECON_BR" type="{http://www.isban.es/webservices/TDCs}CONDICAO_ECON_BR_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CHAVE_COND_ECON_BR_Type", propOrder = {
    "codprodutobr",
    "subproductobr",
    "vertentebr",
    "condicaoeconbr"
})
public class CHAVECONDECONBRType {

    @XmlElement(name = "COD_PRODUTO_BR", required = true)
    protected String codprodutobr;
    @XmlElement(name = "SUBPRODUCTO_BR", required = true)
    protected String subproductobr;
    @XmlElement(name = "VERTENTE_BR", required = true)
    protected String vertentebr;
    @XmlElement(name = "CONDICAO_ECON_BR", required = true)
    protected String condicaoeconbr;

    /**
     * Gets the value of the codprodutobr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODPRODUTOBR() {
        return codprodutobr;
    }

    /**
     * Sets the value of the codprodutobr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODPRODUTOBR(String value) {
        this.codprodutobr = value;
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
     * Gets the value of the vertentebr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVERTENTEBR() {
        return vertentebr;
    }

    /**
     * Sets the value of the vertentebr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVERTENTEBR(String value) {
        this.vertentebr = value;
    }

    /**
     * Gets the value of the condicaoeconbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONDICAOECONBR() {
        return condicaoeconbr;
    }

    /**
     * Sets the value of the condicaoeconbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONDICAOECONBR(String value) {
        this.condicaoeconbr = value;
    }

}
