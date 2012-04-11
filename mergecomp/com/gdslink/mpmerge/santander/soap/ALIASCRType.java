
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ALIAS_CR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ALIAS_CR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="SISTEMA" type="{http://www.isban.es/webservices/TDCs}BMG_SISTEMA_Type"/>
 *         &lt;element name="CONCEPTO_NEGOCIO" type="{http://www.isban.es/webservices/TDCs}BMG_CONCEPTO_NEGOCIO_Type"/>
 *         &lt;element name="COD_ALIAS" type="{http://www.isban.es/webservices/TDCs}STRING_50_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ALIAS_CR_Type", propOrder = {
    "empresa",
    "sistema",
    "conceptonegocio",
    "codalias"
})
public class ALIASCRType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "SISTEMA", required = true)
    protected String sistema;
    @XmlElement(name = "CONCEPTO_NEGOCIO", required = true)
    protected String conceptonegocio;
    @XmlElement(name = "COD_ALIAS", required = true)
    protected String codalias;

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
     * Gets the value of the sistema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSISTEMA() {
        return sistema;
    }

    /**
     * Sets the value of the sistema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSISTEMA(String value) {
        this.sistema = value;
    }

    /**
     * Gets the value of the conceptonegocio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONCEPTONEGOCIO() {
        return conceptonegocio;
    }

    /**
     * Sets the value of the conceptonegocio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONCEPTONEGOCIO(String value) {
        this.conceptonegocio = value;
    }

    /**
     * Gets the value of the codalias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODALIAS() {
        return codalias;
    }

    /**
     * Sets the value of the codalias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODALIAS(String value) {
        this.codalias = value;
    }

}
