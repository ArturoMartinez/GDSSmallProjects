
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LITERAL_DE_TEXTO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LITERAL_DE_TEXTO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDIOMA" type="{http://www.isban.es/webservices/TDCs}IDIOMA_Type"/>
 *         &lt;element name="LITERAL_DE_TEXTO" type="{http://www.isban.es/webservices/TDCs}CODIGO_DE_LITERAL_TEXTO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LITERAL_DE_TEXTO_Type", propOrder = {
    "idioma",
    "literaldetexto"
})
public class LITERALDETEXTOType {

    @XmlElement(name = "IDIOMA", required = true)
    protected String idioma;
    @XmlElement(name = "LITERAL_DE_TEXTO", required = true)
    protected String literaldetexto;

    /**
     * Gets the value of the idioma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDIOMA() {
        return idioma;
    }

    /**
     * Sets the value of the idioma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDIOMA(String value) {
        this.idioma = value;
    }

    /**
     * Gets the value of the literaldetexto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLITERALDETEXTO() {
        return literaldetexto;
    }

    /**
     * Sets the value of the literaldetexto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLITERALDETEXTO(String value) {
        this.literaldetexto = value;
    }

}
