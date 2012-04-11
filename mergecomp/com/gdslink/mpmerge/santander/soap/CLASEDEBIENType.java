
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CLASE_DE_BIEN_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CLASE_DE_BIEN_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_BIEN" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *         &lt;element name="CLASE_BIEN" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CLASE_DE_BIEN_Type", propOrder = {
    "tipobien",
    "clasebien"
})
public class CLASEDEBIENType {

    @XmlElement(name = "TIPO_BIEN", required = true)
    protected String tipobien;
    @XmlElement(name = "CLASE_BIEN", required = true)
    protected String clasebien;

    /**
     * Gets the value of the tipobien property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOBIEN() {
        return tipobien;
    }

    /**
     * Sets the value of the tipobien property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOBIEN(String value) {
        this.tipobien = value;
    }

    /**
     * Gets the value of the clasebien property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASEBIEN() {
        return clasebien;
    }

    /**
     * Sets the value of the clasebien property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASEBIEN(String value) {
        this.clasebien = value;
    }

}
