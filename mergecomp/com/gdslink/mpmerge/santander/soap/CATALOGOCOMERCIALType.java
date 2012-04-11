
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CATALOGO_COMERCIAL_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CATALOGO_COMERCIAL_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="CATALOGO_COMERCIAL" type="{http://www.isban.es/webservices/TDCs}COD_CATALOGO_COMERCIAL_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CATALOGO_COMERCIAL_Type", propOrder = {
    "empresa",
    "catalogocomercial"
})
public class CATALOGOCOMERCIALType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "CATALOGO_COMERCIAL", required = true)
    protected String catalogocomercial;

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
     * Gets the value of the catalogocomercial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCATALOGOCOMERCIAL() {
        return catalogocomercial;
    }

    /**
     * Sets the value of the catalogocomercial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCATALOGOCOMERCIAL(String value) {
        this.catalogocomercial = value;
    }

}
