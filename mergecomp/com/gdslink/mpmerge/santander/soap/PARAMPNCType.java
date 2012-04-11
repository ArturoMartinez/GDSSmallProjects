
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PARAM_PNC_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PARAM_PNC_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="COD_PARAM_PNC" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_8_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PARAM_PNC_Type", propOrder = {
    "empresa",
    "codparampnc"
})
public class PARAMPNCType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "COD_PARAM_PNC", required = true)
    protected String codparampnc;

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
     * Gets the value of the codparampnc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODPARAMPNC() {
        return codparampnc;
    }

    /**
     * Sets the value of the codparampnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODPARAMPNC(String value) {
        this.codparampnc = value;
    }

}
