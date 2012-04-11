
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OPERACION_BKS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OPERACION_BKS_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="APLICACION_LOGICA" type="{http://www.isban.es/webservices/TDCs}APLICACION_LOGICA_Type"/>
 *         &lt;element name="NOMBRE_OPERACION_BKS" type="{http://www.isban.es/webservices/TDCs}NOMBRE_OPERACION_BKS_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OPERACION_BKS_Type", propOrder = {
    "aplicacionlogica",
    "nombreoperacionbks"
})
public class OPERACIONBKSType {

    @XmlElement(name = "APLICACION_LOGICA", required = true)
    protected String aplicacionlogica;
    @XmlElement(name = "NOMBRE_OPERACION_BKS", required = true)
    protected String nombreoperacionbks;

    /**
     * Gets the value of the aplicacionlogica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPLICACIONLOGICA() {
        return aplicacionlogica;
    }

    /**
     * Sets the value of the aplicacionlogica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPLICACIONLOGICA(String value) {
        this.aplicacionlogica = value;
    }

    /**
     * Gets the value of the nombreoperacionbks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBREOPERACIONBKS() {
        return nombreoperacionbks;
    }

    /**
     * Sets the value of the nombreoperacionbks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBREOPERACIONBKS(String value) {
        this.nombreoperacionbks = value;
    }

}
