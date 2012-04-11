
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GESTOR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GESTOR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_DEL_GESTOR_Type"/>
 *         &lt;element name="GESTOR" type="{http://www.isban.es/webservices/TDCs}CODIGO_GESTOR_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GESTOR_Type", propOrder = {
    "empresa",
    "gestor"
})
public class GESTORType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "GESTOR", required = true)
    protected String gestor;

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
     * Gets the value of the gestor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGESTOR() {
        return gestor;
    }

    /**
     * Sets the value of the gestor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGESTOR(String value) {
        this.gestor = value;
    }

}
