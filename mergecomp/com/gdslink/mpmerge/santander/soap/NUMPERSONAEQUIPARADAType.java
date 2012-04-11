
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NUM_PERSONA_EQUIPARADA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NUM_PERSONA_EQUIPARADA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_PERSONA" type="{http://www.isban.es/webservices/TDCs}TIPO_DE_PERSONA_Type"/>
 *         &lt;element name="CODIGO_DE_PERSONA" type="{http://www.isban.es/webservices/TDCs}NUMERO_DE_PERSONA_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NUM_PERSONA_EQUIPARADA_Type", propOrder = {
    "tipopersona",
    "codigodepersona"
})
public class NUMPERSONAEQUIPARADAType {

    @XmlElement(name = "TIPO_PERSONA", required = true)
    protected String tipopersona;
    @XmlElement(name = "CODIGO_DE_PERSONA")
    protected int codigodepersona;

    /**
     * Gets the value of the tipopersona property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOPERSONA() {
        return tipopersona;
    }

    /**
     * Sets the value of the tipopersona property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOPERSONA(String value) {
        this.tipopersona = value;
    }

    /**
     * Gets the value of the codigodepersona property.
     * 
     */
    public int getCODIGODEPERSONA() {
        return codigodepersona;
    }

    /**
     * Sets the value of the codigodepersona property.
     * 
     */
    public void setCODIGODEPERSONA(int value) {
        this.codigodepersona = value;
    }

}
