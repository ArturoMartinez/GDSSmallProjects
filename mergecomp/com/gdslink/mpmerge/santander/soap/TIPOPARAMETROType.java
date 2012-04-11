
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TIPO_PARAMETRO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIPO_PARAMETRO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COD_SUBAPLICACION" type="{http://www.isban.es/webservices/TDCs}CODIGO_DE_SUBAPLICACION_Type"/>
 *         &lt;element name="TIP_PARAMETRO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIPO_PARAMETRO_Type", propOrder = {
    "codsubaplicacion",
    "tipparametro"
})
public class TIPOPARAMETROType {

    @XmlElement(name = "COD_SUBAPLICACION", required = true)
    protected String codsubaplicacion;
    @XmlElement(name = "TIP_PARAMETRO", required = true)
    protected String tipparametro;

    /**
     * Gets the value of the codsubaplicacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODSUBAPLICACION() {
        return codsubaplicacion;
    }

    /**
     * Sets the value of the codsubaplicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODSUBAPLICACION(String value) {
        this.codsubaplicacion = value;
    }

    /**
     * Gets the value of the tipparametro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPPARAMETRO() {
        return tipparametro;
    }

    /**
     * Sets the value of the tipparametro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPPARAMETRO(String value) {
        this.tipparametro = value;
    }

}
