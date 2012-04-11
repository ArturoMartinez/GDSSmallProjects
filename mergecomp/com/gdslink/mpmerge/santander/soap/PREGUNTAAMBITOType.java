
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PREGUNTA_AMBITO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PREGUNTA_AMBITO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AMBITO" type="{http://www.isban.es/webservices/TDCs}AMBITO_INTERNO_RO_Type"/>
 *         &lt;element name="CODIGO_PREGUNTA" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_6_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PREGUNTA_AMBITO_Type", propOrder = {
    "ambito",
    "codigopregunta"
})
public class PREGUNTAAMBITOType {

    @XmlElement(name = "AMBITO", required = true)
    protected String ambito;
    @XmlElement(name = "CODIGO_PREGUNTA", required = true)
    protected String codigopregunta;

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
     * Gets the value of the codigopregunta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOPREGUNTA() {
        return codigopregunta;
    }

    /**
     * Sets the value of the codigopregunta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOPREGUNTA(String value) {
        this.codigopregunta = value;
    }

}
