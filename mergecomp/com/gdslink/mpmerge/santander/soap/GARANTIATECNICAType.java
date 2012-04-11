
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GARANTIA_TECNICA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GARANTIA_TECNICA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CLASE_DE_GARANTIA" type="{http://www.isban.es/webservices/TDCs}CLASE_DE_GARANTIA_Type"/>
 *         &lt;element name="TIPO_DE_GARANTIA" type="{http://www.isban.es/webservices/TDCs}TIPO_DE_GARANTIA_Type"/>
 *         &lt;element name="INDICACION_DE_GARANTIA" type="{http://www.isban.es/webservices/TDCs}INDICACION_DE_GARANTIA_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GARANTIA_TECNICA_Type", propOrder = {
    "clasedegarantia",
    "tipodegarantia",
    "indicaciondegarantia"
})
public class GARANTIATECNICAType {

    @XmlElement(name = "CLASE_DE_GARANTIA", required = true)
    protected String clasedegarantia;
    @XmlElement(name = "TIPO_DE_GARANTIA", required = true)
    protected String tipodegarantia;
    @XmlElement(name = "INDICACION_DE_GARANTIA", required = true)
    protected String indicaciondegarantia;

    /**
     * Gets the value of the clasedegarantia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASEDEGARANTIA() {
        return clasedegarantia;
    }

    /**
     * Sets the value of the clasedegarantia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASEDEGARANTIA(String value) {
        this.clasedegarantia = value;
    }

    /**
     * Gets the value of the tipodegarantia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODEGARANTIA() {
        return tipodegarantia;
    }

    /**
     * Sets the value of the tipodegarantia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODEGARANTIA(String value) {
        this.tipodegarantia = value;
    }

    /**
     * Gets the value of the indicaciondegarantia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDICACIONDEGARANTIA() {
        return indicaciondegarantia;
    }

    /**
     * Sets the value of the indicaciondegarantia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDICACIONDEGARANTIA(String value) {
        this.indicaciondegarantia = value;
    }

}
