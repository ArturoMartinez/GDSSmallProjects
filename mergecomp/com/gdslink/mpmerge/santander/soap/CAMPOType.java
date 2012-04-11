
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CAMPO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CAMPO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NOMBRE_CAMPO" type="{http://www.isban.es/webservices/TDCs}NOMBRE_CAMPO_Type"/>
 *         &lt;element name="TEXTO_255" type="{http://www.isban.es/webservices/TDCs}TEXTO_255_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CAMPO_Type", propOrder = {
    "nombrecampo",
    "texto255"
})
public class CAMPOType {

    @XmlElement(name = "NOMBRE_CAMPO", required = true)
    protected String nombrecampo;
    @XmlElement(name = "TEXTO_255", required = true)
    protected String texto255;

    /**
     * Gets the value of the nombrecampo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBRECAMPO() {
        return nombrecampo;
    }

    /**
     * Sets the value of the nombrecampo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBRECAMPO(String value) {
        this.nombrecampo = value;
    }

    /**
     * Gets the value of the texto255 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEXTO255() {
        return texto255;
    }

    /**
     * Sets the value of the texto255 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEXTO255(String value) {
        this.texto255 = value;
    }

}
