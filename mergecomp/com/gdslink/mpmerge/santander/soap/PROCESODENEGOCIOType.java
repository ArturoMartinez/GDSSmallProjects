
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PROCESO_DE_NEGOCIO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PROCESO_DE_NEGOCIO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="PROCESO_DE_NEGOCIO" type="{http://www.isban.es/webservices/TDCs}CODIGO_PROCESO_DE_NEGOCIO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PROCESO_DE_NEGOCIO_Type", propOrder = {
    "empresa",
    "procesodenegocio"
})
public class PROCESODENEGOCIOType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "PROCESO_DE_NEGOCIO", required = true)
    protected String procesodenegocio;

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
     * Gets the value of the procesodenegocio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROCESODENEGOCIO() {
        return procesodenegocio;
    }

    /**
     * Sets the value of the procesodenegocio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROCESODENEGOCIO(String value) {
        this.procesodenegocio = value;
    }

}
