
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DOCUM_PERSONA_USA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DOCUM_PERSONA_USA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_DOCUM_PERSONA_CORP" type="{http://www.isban.es/webservices/TDCs}AGRUPACION_DOCUM_USA_Type"/>
 *         &lt;element name="CODIGO_DOCUM_PERSONA_CORP" type="{http://www.isban.es/webservices/TDCs}STRING_30_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DOCUM_PERSONA_USA_Type", propOrder = {
    "tipodocumpersonacorp",
    "codigodocumpersonacorp"
})
public class DOCUMPERSONAUSAType {

    @XmlElement(name = "TIPO_DOCUM_PERSONA_CORP", required = true)
    protected String tipodocumpersonacorp;
    @XmlElement(name = "CODIGO_DOCUM_PERSONA_CORP", required = true)
    protected String codigodocumpersonacorp;

    /**
     * Gets the value of the tipodocumpersonacorp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODOCUMPERSONACORP() {
        return tipodocumpersonacorp;
    }

    /**
     * Sets the value of the tipodocumpersonacorp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODOCUMPERSONACORP(String value) {
        this.tipodocumpersonacorp = value;
    }

    /**
     * Gets the value of the codigodocumpersonacorp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGODOCUMPERSONACORP() {
        return codigodocumpersonacorp;
    }

    /**
     * Sets the value of the codigodocumpersonacorp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGODOCUMPERSONACORP(String value) {
        this.codigodocumpersonacorp = value;
    }

}
