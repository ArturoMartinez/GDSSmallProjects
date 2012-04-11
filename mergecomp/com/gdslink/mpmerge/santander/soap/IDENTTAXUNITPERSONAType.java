
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IDENT_TAX_UNIT_PERSONA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IDENT_TAX_UNIT_PERSONA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="TAXPER" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_25_Type"/>
 *         &lt;element name="TIPO_DE_DISCRIMINANTE" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IDENT_TAX_UNIT_PERSONA_Type", propOrder = {
    "empresa",
    "taxper",
    "tipodediscriminante"
})
public class IDENTTAXUNITPERSONAType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "TAXPER", required = true)
    protected String taxper;
    @XmlElement(name = "TIPO_DE_DISCRIMINANTE", required = true)
    protected String tipodediscriminante;

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
     * Gets the value of the taxper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAXPER() {
        return taxper;
    }

    /**
     * Sets the value of the taxper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAXPER(String value) {
        this.taxper = value;
    }

    /**
     * Gets the value of the tipodediscriminante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODEDISCRIMINANTE() {
        return tipodediscriminante;
    }

    /**
     * Sets the value of the tipodediscriminante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODEDISCRIMINANTE(String value) {
        this.tipodediscriminante = value;
    }

}
