
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SUBTIPO_DE_RECAUDACION_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SUBTIPO_DE_RECAUDACION_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_DE_RECAUDACION" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *         &lt;element name="CODIGO_DE_SUBTIPO" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_5_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SUBTIPO_DE_RECAUDACION_Type", propOrder = {
    "tipoderecaudacion",
    "codigodesubtipo"
})
public class SUBTIPODERECAUDACIONType {

    @XmlElement(name = "TIPO_DE_RECAUDACION", required = true)
    protected String tipoderecaudacion;
    @XmlElement(name = "CODIGO_DE_SUBTIPO", required = true)
    protected String codigodesubtipo;

    /**
     * Gets the value of the tipoderecaudacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODERECAUDACION() {
        return tipoderecaudacion;
    }

    /**
     * Sets the value of the tipoderecaudacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODERECAUDACION(String value) {
        this.tipoderecaudacion = value;
    }

    /**
     * Gets the value of the codigodesubtipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGODESUBTIPO() {
        return codigodesubtipo;
    }

    /**
     * Sets the value of the codigodesubtipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGODESUBTIPO(String value) {
        this.codigodesubtipo = value;
    }

}
