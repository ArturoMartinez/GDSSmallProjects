
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PERIODO_FMIS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PERIODO_FMIS_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="APLICACION_FMIS" type="{http://www.isban.es/webservices/TDCs}APLICACION_FMIS_Type"/>
 *         &lt;element name="CODIGO_PERIODO" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PERIODO_FMIS_Type", propOrder = {
    "aplicacionfmis",
    "codigoperiodo"
})
public class PERIODOFMISType {

    @XmlElement(name = "APLICACION_FMIS", required = true)
    protected String aplicacionfmis;
    @XmlElement(name = "CODIGO_PERIODO", required = true)
    protected String codigoperiodo;

    /**
     * Gets the value of the aplicacionfmis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPLICACIONFMIS() {
        return aplicacionfmis;
    }

    /**
     * Sets the value of the aplicacionfmis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPLICACIONFMIS(String value) {
        this.aplicacionfmis = value;
    }

    /**
     * Gets the value of the codigoperiodo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOPERIODO() {
        return codigoperiodo;
    }

    /**
     * Sets the value of the codigoperiodo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOPERIODO(String value) {
        this.codigoperiodo = value;
    }

}
