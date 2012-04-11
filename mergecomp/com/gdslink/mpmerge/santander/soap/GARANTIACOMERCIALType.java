
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GARANTIA_COMERCIAL_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GARANTIA_COMERCIAL_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CLASE" type="{http://www.isban.es/webservices/TDCs}CLASE_GARANTIA_COMERCIAL_Type"/>
 *         &lt;element name="TIPO" type="{http://www.isban.es/webservices/TDCs}TIPO_GARANTIA_COMERCIAL_Type"/>
 *         &lt;element name="CODIGO" type="{http://www.isban.es/webservices/TDCs}CODIGO_GARANTIA_COMERCIAL_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GARANTIA_COMERCIAL_Type", propOrder = {
    "clase",
    "tipo",
    "codigo"
})
public class GARANTIACOMERCIALType {

    @XmlElement(name = "CLASE", required = true)
    protected String clase;
    @XmlElement(name = "TIPO", required = true)
    protected String tipo;
    @XmlElement(name = "CODIGO", required = true)
    protected String codigo;

    /**
     * Gets the value of the clase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASE() {
        return clase;
    }

    /**
     * Sets the value of the clase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASE(String value) {
        this.clase = value;
    }

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPO() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPO(String value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the codigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGO() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGO(String value) {
        this.codigo = value;
    }

}
