
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EMISION_DE_VALORES_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EMISION_DE_VALORES_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODIGO_DE_VALOR" type="{http://www.isban.es/webservices/TDCs}CODIGO_DE_VALOR_Type"/>
 *         &lt;element name="CODIGO_DE_EMISION" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EMISION_DE_VALORES_Type", propOrder = {
    "codigodevalor",
    "codigodeemision"
})
public class EMISIONDEVALORESType {

    @XmlElement(name = "CODIGO_DE_VALOR", required = true)
    protected String codigodevalor;
    @XmlElement(name = "CODIGO_DE_EMISION", required = true)
    protected String codigodeemision;

    /**
     * Gets the value of the codigodevalor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGODEVALOR() {
        return codigodevalor;
    }

    /**
     * Sets the value of the codigodevalor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGODEVALOR(String value) {
        this.codigodevalor = value;
    }

    /**
     * Gets the value of the codigodeemision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGODEEMISION() {
        return codigodeemision;
    }

    /**
     * Sets the value of the codigodeemision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGODEEMISION(String value) {
        this.codigodeemision = value;
    }

}
