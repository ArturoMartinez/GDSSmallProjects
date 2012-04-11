
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APLICACION_SWIFT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APLICACION_SWIFT_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="SISTEMA_GSTP" type="{http://www.isban.es/webservices/TDCs}SISTEMA_GSTP_Type"/>
 *         &lt;element name="COD_APLICACION" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APLICACION_SWIFT_Type", propOrder = {
    "empresa",
    "sistemagstp",
    "codaplicacion"
})
public class APLICACIONSWIFTType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "SISTEMA_GSTP", required = true)
    protected String sistemagstp;
    @XmlElement(name = "COD_APLICACION", required = true)
    protected String codaplicacion;

    /**
     * Gets the value of the empresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPRESA() {
        return empresa;
    }

    /**
     * Sets the value of the empresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPRESA(String value) {
        this.empresa = value;
    }

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
     * Gets the value of the codaplicacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODAPLICACION() {
        return codaplicacion;
    }

    /**
     * Sets the value of the codaplicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODAPLICACION(String value) {
        this.codaplicacion = value;
    }

}
