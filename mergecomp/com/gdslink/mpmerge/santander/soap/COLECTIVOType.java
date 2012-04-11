
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLECTIVO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLECTIVO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_COLECTIVO" type="{http://www.isban.es/webservices/TDCc}TIPO_COLECTIVO_Type"/>
 *         &lt;element name="CODIGO_ALFANUM_4" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_4_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COLECTIVO_Type", propOrder = {
    "tipocolectivo",
    "codigoalfanum4"
})
public class COLECTIVOType {

    @XmlElement(name = "TIPO_COLECTIVO", required = true)
    protected TIPOCOLECTIVOType tipocolectivo;
    @XmlElement(name = "CODIGO_ALFANUM_4", required = true)
    protected String codigoalfanum4;

    /**
     * Gets the value of the tipocolectivo property.
     * 
     * @return
     *     possible object is
     *     {@link TIPOCOLECTIVOType }
     *     
     */
    public TIPOCOLECTIVOType getTIPOCOLECTIVO() {
        return tipocolectivo;
    }

    /**
     * Sets the value of the tipocolectivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIPOCOLECTIVOType }
     *     
     */
    public void setTIPOCOLECTIVO(TIPOCOLECTIVOType value) {
        this.tipocolectivo = value;
    }

    /**
     * Gets the value of the codigoalfanum4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOALFANUM4() {
        return codigoalfanum4;
    }

    /**
     * Sets the value of the codigoalfanum4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOALFANUM4(String value) {
        this.codigoalfanum4 = value;
    }

}
