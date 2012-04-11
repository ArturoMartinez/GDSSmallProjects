
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TIPO_DE_CONSUMO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIPO_DE_CONSUMO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODIGO_GRUPO_DE_CONSUMO" type="{http://www.isban.es/webservices/TDCs}CODIGO_GRUPO_DE_CONSUMO_Type"/>
 *         &lt;element name="CODIGO_TIPO_DE_CONSUMO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_SIN_ESP_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIPO_DE_CONSUMO_Type", propOrder = {
    "codigogrupodeconsumo",
    "codigotipodeconsumo"
})
public class TIPODECONSUMOType {

    @XmlElement(name = "CODIGO_GRUPO_DE_CONSUMO", required = true)
    protected String codigogrupodeconsumo;
    @XmlElement(name = "CODIGO_TIPO_DE_CONSUMO", required = true)
    protected String codigotipodeconsumo;

    /**
     * Gets the value of the codigogrupodeconsumo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOGRUPODECONSUMO() {
        return codigogrupodeconsumo;
    }

    /**
     * Sets the value of the codigogrupodeconsumo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOGRUPODECONSUMO(String value) {
        this.codigogrupodeconsumo = value;
    }

    /**
     * Gets the value of the codigotipodeconsumo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOTIPODECONSUMO() {
        return codigotipodeconsumo;
    }

    /**
     * Sets the value of the codigotipodeconsumo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOTIPODECONSUMO(String value) {
        this.codigotipodeconsumo = value;
    }

}
