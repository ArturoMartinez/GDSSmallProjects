
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TIPO_DE_ELEMENTO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIPO_DE_ELEMENTO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_FICHA" type="{http://www.isban.es/webservices/TDCs}CODIGO_TIPO_DE_FICHA_Type"/>
 *         &lt;element name="TIPO_ELEMENTO" type="{http://www.isban.es/webservices/TDCs}CODIGO_TIPO_DE_ELEMENTO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIPO_DE_ELEMENTO_Type", propOrder = {
    "tipoficha",
    "tipoelemento"
})
public class TIPODEELEMENTOType {

    @XmlElement(name = "TIPO_FICHA", required = true)
    protected String tipoficha;
    @XmlElement(name = "TIPO_ELEMENTO", required = true)
    protected String tipoelemento;

    /**
     * Gets the value of the tipoficha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOFICHA() {
        return tipoficha;
    }

    /**
     * Sets the value of the tipoficha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOFICHA(String value) {
        this.tipoficha = value;
    }

    /**
     * Gets the value of the tipoelemento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOELEMENTO() {
        return tipoelemento;
    }

    /**
     * Sets the value of the tipoelemento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOELEMENTO(String value) {
        this.tipoelemento = value;
    }

}
