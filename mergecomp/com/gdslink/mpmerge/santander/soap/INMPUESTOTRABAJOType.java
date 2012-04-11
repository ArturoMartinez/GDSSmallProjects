
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for INM_PUESTO_TRABAJO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INM_PUESTO_TRABAJO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INM_ZONA" type="{http://www.isban.es/webservices/TDCc}INM_ZONA_Type"/>
 *         &lt;element name="COD_PUESTO" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_12_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INM_PUESTO_TRABAJO_Type", propOrder = {
    "inmzona",
    "codpuesto"
})
public class INMPUESTOTRABAJOType {

    @XmlElement(name = "INM_ZONA", required = true)
    protected INMZONAType inmzona;
    @XmlElement(name = "COD_PUESTO", required = true)
    protected String codpuesto;

    /**
     * Gets the value of the inmzona property.
     * 
     * @return
     *     possible object is
     *     {@link INMZONAType }
     *     
     */
    public INMZONAType getINMZONA() {
        return inmzona;
    }

    /**
     * Sets the value of the inmzona property.
     * 
     * @param value
     *     allowed object is
     *     {@link INMZONAType }
     *     
     */
    public void setINMZONA(INMZONAType value) {
        this.inmzona = value;
    }

    /**
     * Gets the value of the codpuesto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODPUESTO() {
        return codpuesto;
    }

    /**
     * Sets the value of the codpuesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODPUESTO(String value) {
        this.codpuesto = value;
    }

}
