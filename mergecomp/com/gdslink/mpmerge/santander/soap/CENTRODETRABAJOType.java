
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CENTRO_DE_TRABAJO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CENTRO_DE_TRABAJO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_DEL_CENTRO_Type"/>
 *         &lt;element name="CENTRO" type="{http://www.isban.es/webservices/TDCs}CODIGO_CENTRO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CENTRO_DE_TRABAJO_Type", propOrder = {
    "empresa",
    "centro"
})
public class CENTRODETRABAJOType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "CENTRO", required = true)
    protected String centro;

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
     * Gets the value of the centro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCENTRO() {
        return centro;
    }

    /**
     * Sets the value of the centro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCENTRO(String value) {
        this.centro = value;
    }

}
