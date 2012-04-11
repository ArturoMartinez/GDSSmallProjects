
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CHAVE_SUBPROD_MP_BR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CHAVE_SUBPROD_MP_BR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COD_PRODUTO_BR" type="{http://www.isban.es/webservices/TDCs}COD_PRODUTO_BR_Type"/>
 *         &lt;element name="SUB_PROD_MP_BR" type="{http://www.isban.es/webservices/TDCs}SUB_PROD_MP_BR_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CHAVE_SUBPROD_MP_BR_Type", propOrder = {
    "codprodutobr",
    "subprodmpbr"
})
public class CHAVESUBPRODMPBRType {

    @XmlElement(name = "COD_PRODUTO_BR", required = true)
    protected String codprodutobr;
    @XmlElement(name = "SUB_PROD_MP_BR", required = true)
    protected String subprodmpbr;

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
     * Gets the value of the subprodmpbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBPRODMPBR() {
        return subprodmpbr;
    }

    /**
     * Sets the value of the subprodmpbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBPRODMPBR(String value) {
        this.subprodmpbr = value;
    }

}
