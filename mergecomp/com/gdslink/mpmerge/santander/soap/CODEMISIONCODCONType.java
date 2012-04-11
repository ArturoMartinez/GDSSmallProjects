
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COD_EMISION_CODCON_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COD_EMISION_CODCON_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COD_VALOR_INTERNO_CC" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_10_Type"/>
 *         &lt;element name="COD_EMISION_CC" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COD_EMISION_CODCON_Type", propOrder = {
    "codvalorinternocc",
    "codemisioncc"
})
public class CODEMISIONCODCONType {

    @XmlElement(name = "COD_VALOR_INTERNO_CC", required = true)
    protected String codvalorinternocc;
    @XmlElement(name = "COD_EMISION_CC", required = true)
    protected String codemisioncc;

    /**
     * Gets the value of the codvalorinternocc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODVALORINTERNOCC() {
        return codvalorinternocc;
    }

    /**
     * Sets the value of the codvalorinternocc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODVALORINTERNOCC(String value) {
        this.codvalorinternocc = value;
    }

    /**
     * Gets the value of the codemisioncc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODEMISIONCC() {
        return codemisioncc;
    }

    /**
     * Sets the value of the codemisioncc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODEMISIONCC(String value) {
        this.codemisioncc = value;
    }

}
