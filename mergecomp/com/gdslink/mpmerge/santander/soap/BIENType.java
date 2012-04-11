
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BIEN_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BIEN_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="MODALIDAD" type="{http://www.isban.es/webservices/TDCs}MODALIDAD_Type"/>
 *         &lt;element name="CODIGO_BIEN" type="{http://www.isban.es/webservices/TDCs}CODIGO_BIEN_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BIEN_Type", propOrder = {
    "empresa",
    "modalidad",
    "codigobien"
})
public class BIENType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "MODALIDAD", required = true)
    protected String modalidad;
    @XmlElement(name = "CODIGO_BIEN")
    protected int codigobien;

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
     * Gets the value of the modalidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMODALIDAD() {
        return modalidad;
    }

    /**
     * Sets the value of the modalidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODALIDAD(String value) {
        this.modalidad = value;
    }

    /**
     * Gets the value of the codigobien property.
     * 
     */
    public int getCODIGOBIEN() {
        return codigobien;
    }

    /**
     * Sets the value of the codigobien property.
     * 
     */
    public void setCODIGOBIEN(int value) {
        this.codigobien = value;
    }

}
