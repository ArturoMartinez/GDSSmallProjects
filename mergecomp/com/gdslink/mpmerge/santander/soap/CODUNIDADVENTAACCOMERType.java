
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COD_UNIDAD_VENTA_AC_COMER_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COD_UNIDAD_VENTA_AC_COMER_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="COD_UVENT" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_4_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COD_UNIDAD_VENTA_AC_COMER_Type", propOrder = {
    "empresa",
    "coduvent"
})
public class CODUNIDADVENTAACCOMERType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "COD_UVENT", required = true)
    protected String coduvent;

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
     * Gets the value of the coduvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODUVENT() {
        return coduvent;
    }

    /**
     * Sets the value of the coduvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODUVENT(String value) {
        this.coduvent = value;
    }

}
