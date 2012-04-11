
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COD_DOCUMEN_FACTOR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COD_DOCUMEN_FACTOR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="TIPO_DOCUMENTO_FACTOR" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *         &lt;element name="COD_DOCUMENTO_FACTOR" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COD_DOCUMEN_FACTOR_Type", propOrder = {
    "empresa",
    "tipodocumentofactor",
    "coddocumentofactor"
})
public class CODDOCUMENFACTORType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "TIPO_DOCUMENTO_FACTOR", required = true)
    protected String tipodocumentofactor;
    @XmlElement(name = "COD_DOCUMENTO_FACTOR", required = true)
    protected String coddocumentofactor;

    /**
     * Gets the value of the empresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPRESA() {
        return empresa;
    }

    /**
     * Sets the value of the empresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPRESA(String value) {
        this.empresa = value;
    }

    /**
     * Gets the value of the tipodocumentofactor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODOCUMENTOFACTOR() {
        return tipodocumentofactor;
    }

    /**
     * Sets the value of the tipodocumentofactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODOCUMENTOFACTOR(String value) {
        this.tipodocumentofactor = value;
    }

    /**
     * Gets the value of the coddocumentofactor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODDOCUMENTOFACTOR() {
        return coddocumentofactor;
    }

    /**
     * Sets the value of the coddocumentofactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODDOCUMENTOFACTOR(String value) {
        this.coddocumentofactor = value;
    }

}
