
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LINEA_DE_RIESGOS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LINEA_DE_RIESGOS_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SISTEMA_DE_RIESGOS" type="{http://www.isban.es/webservices/TDCs}CODIGO_SISTEMA_DE_RIESGOS_Type"/>
 *         &lt;element name="NIVEL_DE_RIESGOS" type="{http://www.isban.es/webservices/TDCs}CODIGO_NIVEL_DE_RIESGOS_Type"/>
 *         &lt;element name="CODIGO_DE_LINEA" type="{http://www.isban.es/webservices/TDCs}CODIGO_LINEA_DE_RIESGOS_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LINEA_DE_RIESGOS_Type", propOrder = {
    "sistemaderiesgos",
    "nivelderiesgos",
    "codigodelinea"
})
public class LINEADERIESGOSType {

    @XmlElement(name = "SISTEMA_DE_RIESGOS", required = true)
    protected String sistemaderiesgos;
    @XmlElement(name = "NIVEL_DE_RIESGOS", required = true)
    protected String nivelderiesgos;
    @XmlElement(name = "CODIGO_DE_LINEA", required = true)
    protected String codigodelinea;

    /**
     * Gets the value of the sistemaderiesgos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSISTEMADERIESGOS() {
        return sistemaderiesgos;
    }

    /**
     * Sets the value of the sistemaderiesgos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSISTEMADERIESGOS(String value) {
        this.sistemaderiesgos = value;
    }

    /**
     * Gets the value of the nivelderiesgos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIVELDERIESGOS() {
        return nivelderiesgos;
    }

    /**
     * Sets the value of the nivelderiesgos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIVELDERIESGOS(String value) {
        this.nivelderiesgos = value;
    }

    /**
     * Gets the value of the codigodelinea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGODELINEA() {
        return codigodelinea;
    }

    /**
     * Sets the value of the codigodelinea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGODELINEA(String value) {
        this.codigodelinea = value;
    }

}
