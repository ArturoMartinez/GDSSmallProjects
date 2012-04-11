
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TIPO_MENSAJE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIPO_MENSAJE_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AMBITO" type="{http://www.isban.es/webservices/TDCs}AMBITO_INTERNO_RO_Type"/>
 *         &lt;element name="COD_TIPO_MENSAJE" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIPO_MENSAJE_Type", propOrder = {
    "ambito",
    "codtipomensaje"
})
public class TIPOMENSAJEType {

    @XmlElement(name = "AMBITO", required = true)
    protected String ambito;
    @XmlElement(name = "COD_TIPO_MENSAJE", required = true)
    protected String codtipomensaje;

    /**
     * Gets the value of the ambito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMBITO() {
        return ambito;
    }

    /**
     * Sets the value of the ambito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMBITO(String value) {
        this.ambito = value;
    }

    /**
     * Gets the value of the codtipomensaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODTIPOMENSAJE() {
        return codtipomensaje;
    }

    /**
     * Sets the value of the codtipomensaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODTIPOMENSAJE(String value) {
        this.codtipomensaje = value;
    }

}
