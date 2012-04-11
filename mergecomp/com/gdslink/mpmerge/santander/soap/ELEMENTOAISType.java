
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ELEMENTO_AIS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ELEMENTO_AIS_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="TIPO_ELEMENTO_AIS" type="{http://www.isban.es/webservices/TDCs}TIPO_ELEMENTO_AIS_Type"/>
 *         &lt;element name="ID_ELEMENTO_AIS" type="{http://www.isban.es/webservices/TDCs}SECUENCIAL_CORTO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ELEMENTO_AIS_Type", propOrder = {
    "empresa",
    "tipoelementoais",
    "idelementoais"
})
public class ELEMENTOAISType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "TIPO_ELEMENTO_AIS", required = true)
    protected String tipoelementoais;
    @XmlElement(name = "ID_ELEMENTO_AIS")
    protected int idelementoais;

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
     * Gets the value of the tipoelementoais property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOELEMENTOAIS() {
        return tipoelementoais;
    }

    /**
     * Sets the value of the tipoelementoais property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOELEMENTOAIS(String value) {
        this.tipoelementoais = value;
    }

    /**
     * Gets the value of the idelementoais property.
     * 
     */
    public int getIDELEMENTOAIS() {
        return idelementoais;
    }

    /**
     * Sets the value of the idelementoais property.
     * 
     */
    public void setIDELEMENTOAIS(int value) {
        this.idelementoais = value;
    }

}
