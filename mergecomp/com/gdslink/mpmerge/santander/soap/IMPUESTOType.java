
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IMPUESTO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IMPUESTO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_DE_IMPOSITIVO" type="{http://www.isban.es/webservices/TDCs}TIPO_DE_IMPOSITIVO_Type"/>
 *         &lt;element name="CODIGO_DE_IMPUESTO" type="{http://www.isban.es/webservices/TDCs}CODIGO_DE_IMPUESTO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IMPUESTO_Type", propOrder = {
    "tipodeimpositivo",
    "codigodeimpuesto"
})
public class IMPUESTOType {

    @XmlElement(name = "TIPO_DE_IMPOSITIVO", required = true)
    protected String tipodeimpositivo;
    @XmlElement(name = "CODIGO_DE_IMPUESTO", required = true)
    protected String codigodeimpuesto;

    /**
     * Gets the value of the tipodeimpositivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODEIMPOSITIVO() {
        return tipodeimpositivo;
    }

    /**
     * Sets the value of the tipodeimpositivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODEIMPOSITIVO(String value) {
        this.tipodeimpositivo = value;
    }

    /**
     * Gets the value of the codigodeimpuesto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGODEIMPUESTO() {
        return codigodeimpuesto;
    }

    /**
     * Sets the value of the codigodeimpuesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGODEIMPUESTO(String value) {
        this.codigodeimpuesto = value;
    }

}
