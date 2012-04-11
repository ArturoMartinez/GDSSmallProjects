
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ORIGEN_ANCOCO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ORIGEN_ANCOCO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="CANALDIS" type="{http://www.isban.es/webservices/TDCs}CODIGO_DE_CANAL_Type"/>
 *         &lt;element name="COD_TIPO_ALERTA" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_1_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ORIGEN_ANCOCO_Type", propOrder = {
    "empresa",
    "canaldis",
    "codtipoalerta"
})
public class ORIGENANCOCOType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "CANALDIS", required = true)
    protected String canaldis;
    @XmlElement(name = "COD_TIPO_ALERTA", required = true)
    protected String codtipoalerta;

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
     * Gets the value of the canaldis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCANALDIS() {
        return canaldis;
    }

    /**
     * Sets the value of the canaldis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCANALDIS(String value) {
        this.canaldis = value;
    }

    /**
     * Gets the value of the codtipoalerta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODTIPOALERTA() {
        return codtipoalerta;
    }

    /**
     * Sets the value of the codtipoalerta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODTIPOALERTA(String value) {
        this.codtipoalerta = value;
    }

}
