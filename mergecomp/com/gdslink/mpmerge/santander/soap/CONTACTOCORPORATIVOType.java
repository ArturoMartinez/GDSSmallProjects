
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CONTACTO_CORPORATIVO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CONTACTO_CORPORATIVO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FORMATO_CONTACTO" type="{http://www.isban.es/webservices/TDCs}FORMATO_CONTACTO_Type"/>
 *         &lt;element name="CONTACTO_TRANSITO" type="{http://www.isban.es/webservices/TDCs}CONTACTO_TRANSITO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONTACTO_CORPORATIVO_Type", propOrder = {
    "formatocontacto",
    "contactotransito"
})
public class CONTACTOCORPORATIVOType {

    @XmlElement(name = "FORMATO_CONTACTO", required = true)
    protected String formatocontacto;
    @XmlElement(name = "CONTACTO_TRANSITO", required = true)
    protected String contactotransito;

    /**
     * Gets the value of the formatocontacto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORMATOCONTACTO() {
        return formatocontacto;
    }

    /**
     * Sets the value of the formatocontacto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORMATOCONTACTO(String value) {
        this.formatocontacto = value;
    }

    /**
     * Gets the value of the contactotransito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTACTOTRANSITO() {
        return contactotransito;
    }

    /**
     * Sets the value of the contactotransito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTACTOTRANSITO(String value) {
        this.contactotransito = value;
    }

}
