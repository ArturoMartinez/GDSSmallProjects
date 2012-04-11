
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TIPO_MENSAJE_GSTP_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIPO_MENSAJE_GSTP_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SISTEMA_GSTP" type="{http://www.isban.es/webservices/TDCs}SISTEMA_GSTP_Type"/>
 *         &lt;element name="MENSAJE" type="{http://www.isban.es/webservices/TDCs}STRING_10_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIPO_MENSAJE_GSTP_Type", propOrder = {
    "sistemagstp",
    "mensaje"
})
public class TIPOMENSAJEGSTPType {

    @XmlElement(name = "SISTEMA_GSTP", required = true)
    protected String sistemagstp;
    @XmlElement(name = "MENSAJE", required = true)
    protected String mensaje;

    /**
     * Gets the value of the sistemagstp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSISTEMAGSTP() {
        return sistemagstp;
    }

    /**
     * Sets the value of the sistemagstp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSISTEMAGSTP(String value) {
        this.sistemagstp = value;
    }

    /**
     * Gets the value of the mensaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMENSAJE() {
        return mensaje;
    }

    /**
     * Sets the value of the mensaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMENSAJE(String value) {
        this.mensaje = value;
    }

}
