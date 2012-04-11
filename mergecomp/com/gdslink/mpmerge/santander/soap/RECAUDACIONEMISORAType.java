
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RECAUDACION_EMISORA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RECAUDACION_EMISORA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMISORA" type="{http://www.isban.es/webservices/TDCs}EMISORA_COLECTORAS_Type"/>
 *         &lt;element name="PRODUCTO" type="{http://www.isban.es/webservices/TDCs}CODIGO_DE_PRODUCTO_Type"/>
 *         &lt;element name="SUBTIPO_DE_RECAUDACION" type="{http://www.isban.es/webservices/TDCc}SUBTIPO_DE_RECAUDACION_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RECAUDACION_EMISORA_Type", propOrder = {
    "emisora",
    "producto",
    "subtipoderecaudacion"
})
public class RECAUDACIONEMISORAType {

    @XmlElement(name = "EMISORA", required = true)
    protected String emisora;
    @XmlElement(name = "PRODUCTO", required = true)
    protected String producto;
    @XmlElement(name = "SUBTIPO_DE_RECAUDACION", required = true)
    protected SUBTIPODERECAUDACIONType subtipoderecaudacion;

    /**
     * Gets the value of the emisora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMISORA() {
        return emisora;
    }

    /**
     * Sets the value of the emisora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMISORA(String value) {
        this.emisora = value;
    }

    /**
     * Gets the value of the producto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODUCTO() {
        return producto;
    }

    /**
     * Sets the value of the producto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODUCTO(String value) {
        this.producto = value;
    }

    /**
     * Gets the value of the subtipoderecaudacion property.
     * 
     * @return
     *     possible object is
     *     {@link SUBTIPODERECAUDACIONType }
     *     
     */
    public SUBTIPODERECAUDACIONType getSUBTIPODERECAUDACION() {
        return subtipoderecaudacion;
    }

    /**
     * Sets the value of the subtipoderecaudacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link SUBTIPODERECAUDACIONType }
     *     
     */
    public void setSUBTIPODERECAUDACION(SUBTIPODERECAUDACIONType value) {
        this.subtipoderecaudacion = value;
    }

}
