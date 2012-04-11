
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NUM_PERSONA_CLIENTE_BR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NUM_PERSONA_CLIENTE_BR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_DE_PERSONA_BR" type="{http://www.isban.es/webservices/TDCs}TIPO_DE_PERSONA_BR_Type"/>
 *         &lt;element name="NRO_DE_PERSONA_BR" type="{http://www.isban.es/webservices/TDCs}NRO_DE_PERSONA_BR_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NUM_PERSONA_CLIENTE_BR_Type", propOrder = {
    "tipodepersonabr",
    "nrodepersonabr"
})
public class NUMPERSONACLIENTEBRType {

    @XmlElement(name = "TIPO_DE_PERSONA_BR", required = true)
    protected String tipodepersonabr;
    @XmlElement(name = "NRO_DE_PERSONA_BR", required = true)
    protected String nrodepersonabr;

    /**
     * Gets the value of the tipodepersonabr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODEPERSONABR() {
        return tipodepersonabr;
    }

    /**
     * Sets the value of the tipodepersonabr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODEPERSONABR(String value) {
        this.tipodepersonabr = value;
    }

    /**
     * Gets the value of the nrodepersonabr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRODEPERSONABR() {
        return nrodepersonabr;
    }

    /**
     * Sets the value of the nrodepersonabr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRODEPERSONABR(String value) {
        this.nrodepersonabr = value;
    }

}
