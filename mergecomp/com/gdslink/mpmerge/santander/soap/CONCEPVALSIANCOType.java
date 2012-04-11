
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CONCEPVAL_SIANCO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CONCEPVAL_SIANCO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CONCEP_SSAA" type="{http://www.isban.es/webservices/TDCs}COD_CONCEPTO_SIANCO_Type"/>
 *         &lt;element name="CODVAL_SSAA" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONCEPVAL_SIANCO_Type", propOrder = {
    "concepssaa",
    "codvalssaa"
})
public class CONCEPVALSIANCOType {

    @XmlElement(name = "CONCEP_SSAA", required = true)
    protected String concepssaa;
    @XmlElement(name = "CODVAL_SSAA", required = true)
    protected String codvalssaa;

    /**
     * Gets the value of the concepssaa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONCEPSSAA() {
        return concepssaa;
    }

    /**
     * Sets the value of the concepssaa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONCEPSSAA(String value) {
        this.concepssaa = value;
    }

    /**
     * Gets the value of the codvalssaa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODVALSSAA() {
        return codvalssaa;
    }

    /**
     * Sets the value of the codvalssaa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODVALSSAA(String value) {
        this.codvalssaa = value;
    }

}
