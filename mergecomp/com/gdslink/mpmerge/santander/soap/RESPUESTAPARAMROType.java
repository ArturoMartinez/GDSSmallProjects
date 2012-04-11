
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RESPUESTA_PARAM_RO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RESPUESTA_PARAM_RO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODIGO_ALFANUM" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *         &lt;element name="SECUENCIAL_CORTO" type="{http://www.isban.es/webservices/TDCs}SECUENCIAL_CORTO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RESPUESTA_PARAM_RO_Type", propOrder = {
    "codigoalfanum",
    "secuencialcorto"
})
public class RESPUESTAPARAMROType {

    @XmlElement(name = "CODIGO_ALFANUM", required = true)
    protected String codigoalfanum;
    @XmlElement(name = "SECUENCIAL_CORTO")
    protected int secuencialcorto;

    /**
     * Gets the value of the codigoalfanum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOALFANUM() {
        return codigoalfanum;
    }

    /**
     * Sets the value of the codigoalfanum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOALFANUM(String value) {
        this.codigoalfanum = value;
    }

    /**
     * Gets the value of the secuencialcorto property.
     * 
     */
    public int getSECUENCIALCORTO() {
        return secuencialcorto;
    }

    /**
     * Sets the value of the secuencialcorto property.
     * 
     */
    public void setSECUENCIALCORTO(int value) {
        this.secuencialcorto = value;
    }

}
