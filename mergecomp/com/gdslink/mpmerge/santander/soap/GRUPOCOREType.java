
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GRUPO_CORE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GRUPO_CORE_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_GRUPO" type="{http://www.isban.es/webservices/TDCc}TIPO_GRUPO_Type"/>
 *         &lt;element name="CODIGO_GRUPO" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_8_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GRUPO_CORE_Type", propOrder = {
    "tipogrupo",
    "codigogrupo"
})
public class GRUPOCOREType {

    @XmlElement(name = "TIPO_GRUPO", required = true)
    protected TIPOGRUPOType tipogrupo;
    @XmlElement(name = "CODIGO_GRUPO", required = true)
    protected String codigogrupo;

    /**
     * Gets the value of the tipogrupo property.
     * 
     * @return
     *     possible object is
     *     {@link TIPOGRUPOType }
     *     
     */
    public TIPOGRUPOType getTIPOGRUPO() {
        return tipogrupo;
    }

    /**
     * Sets the value of the tipogrupo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIPOGRUPOType }
     *     
     */
    public void setTIPOGRUPO(TIPOGRUPOType value) {
        this.tipogrupo = value;
    }

    /**
     * Gets the value of the codigogrupo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOGRUPO() {
        return codigogrupo;
    }

    /**
     * Sets the value of the codigogrupo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOGRUPO(String value) {
        this.codigogrupo = value;
    }

}
