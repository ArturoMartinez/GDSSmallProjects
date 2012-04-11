
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NUM_PERSONA_CLIENTE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NUM_PERSONA_CLIENTE_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_DE_PERSONA" type="{http://www.isban.es/webservices/TDCs}TIPO_DE_PERSONA_Type"/>
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
@XmlType(name = "NUM_PERSONA_CLIENTE_Type", propOrder = {
    "tipodepersona",
    "codigodepersona"
})
public class NUMPERSONACLIENTEType {

    @XmlElement(name = "TIPO_DE_PERSONA", required = true)
    protected String tipodepersona;
    @XmlElement(name = "CODIGO_DE_PERSONA")
    protected int codigodepersona;

    /**
     * Gets the value of the tipodepersona property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODEPERSONA() {
        return tipodepersona;
    }

    /**
     * Sets the value of the tipodepersona property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODEPERSONA(String value) {
        this.tipodepersona = value;
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
