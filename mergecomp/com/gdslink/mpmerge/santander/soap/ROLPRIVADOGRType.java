
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ROL_PRIVADO_GR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ROL_PRIVADO_GR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SUBTIPO_GR" type="{http://www.isban.es/webservices/TDCc}SUBTIPO_GR_Type"/>
 *         &lt;element name="ID_PRIVADA" type="{http://www.isban.es/webservices/TDCs}ID_PRIVADA_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ROL_PRIVADO_GR_Type", propOrder = {
    "subtipogr",
    "idprivada"
})
public class ROLPRIVADOGRType {

    @XmlElement(name = "SUBTIPO_GR", required = true)
    protected SUBTIPOGRType subtipogr;
    @XmlElement(name = "ID_PRIVADA", required = true)
    protected String idprivada;

    /**
     * Gets the value of the subtipogr property.
     * 
     * @return
     *     possible object is
     *     {@link SUBTIPOGRType }
     *     
     */
    public SUBTIPOGRType getSUBTIPOGR() {
        return subtipogr;
    }

    /**
     * Sets the value of the subtipogr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SUBTIPOGRType }
     *     
     */
    public void setSUBTIPOGR(SUBTIPOGRType value) {
        this.subtipogr = value;
    }

    /**
     * Gets the value of the idprivada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDPRIVADA() {
        return idprivada;
    }

    /**
     * Sets the value of the idprivada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDPRIVADA(String value) {
        this.idprivada = value;
    }

}
