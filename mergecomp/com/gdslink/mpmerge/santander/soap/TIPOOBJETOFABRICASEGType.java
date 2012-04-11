
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TIPO_OBJETO_FABRICA_SEG_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIPO_OBJETO_FABRICA_SEG_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COMPANIA_DE_SEGUROS" type="{http://www.isban.es/webservices/TDCs}COMPANIA_DE_SEGUROS_Type"/>
 *         &lt;element name="TIPO_OBJETO" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_2_Type"/>
 *         &lt;element name="DESCRIPCION_TIPO_OBJETO" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_8_Type"/>
 *         &lt;element name="SUBTIPO_OBJETO" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIPO_OBJETO_FABRICA_SEG_Type", propOrder = {
    "companiadeseguros",
    "tipoobjeto",
    "descripciontipoobjeto",
    "subtipoobjeto"
})
public class TIPOOBJETOFABRICASEGType {

    @XmlElement(name = "COMPANIA_DE_SEGUROS", required = true)
    protected String companiadeseguros;
    @XmlElement(name = "TIPO_OBJETO", required = true)
    protected String tipoobjeto;
    @XmlElement(name = "DESCRIPCION_TIPO_OBJETO", required = true)
    protected String descripciontipoobjeto;
    @XmlElement(name = "SUBTIPO_OBJETO", required = true)
    protected String subtipoobjeto;

    /**
     * Gets the value of the companiadeseguros property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPANIADESEGUROS() {
        return companiadeseguros;
    }

    /**
     * Sets the value of the companiadeseguros property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPANIADESEGUROS(String value) {
        this.companiadeseguros = value;
    }

    /**
     * Gets the value of the tipoobjeto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOOBJETO() {
        return tipoobjeto;
    }

    /**
     * Sets the value of the tipoobjeto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOOBJETO(String value) {
        this.tipoobjeto = value;
    }

    /**
     * Gets the value of the descripciontipoobjeto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPCIONTIPOOBJETO() {
        return descripciontipoobjeto;
    }

    /**
     * Sets the value of the descripciontipoobjeto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPCIONTIPOOBJETO(String value) {
        this.descripciontipoobjeto = value;
    }

    /**
     * Gets the value of the subtipoobjeto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBTIPOOBJETO() {
        return subtipoobjeto;
    }

    /**
     * Sets the value of the subtipoobjeto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBTIPOOBJETO(String value) {
        this.subtipoobjeto = value;
    }

}
