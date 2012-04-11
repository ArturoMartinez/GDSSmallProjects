
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RETENCION_IRAS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RETENCION_IRAS_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="CONCEPTO_FISCAL" type="{http://www.isban.es/webservices/TDCs}CONCEPTO_DE_LIQUIDACION_Type"/>
 *         &lt;element name="CODIGO_DE_TERRITORIO" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_6_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RETENCION_IRAS_Type", propOrder = {
    "empresa",
    "conceptofiscal",
    "codigodeterritorio"
})
public class RETENCIONIRASType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "CONCEPTO_FISCAL", required = true)
    protected String conceptofiscal;
    @XmlElement(name = "CODIGO_DE_TERRITORIO", required = true)
    protected String codigodeterritorio;

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
     * Gets the value of the conceptofiscal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONCEPTOFISCAL() {
        return conceptofiscal;
    }

    /**
     * Sets the value of the conceptofiscal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONCEPTOFISCAL(String value) {
        this.conceptofiscal = value;
    }

    /**
     * Gets the value of the codigodeterritorio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGODETERRITORIO() {
        return codigodeterritorio;
    }

    /**
     * Sets the value of the codigodeterritorio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGODETERRITORIO(String value) {
        this.codigodeterritorio = value;
    }

}
