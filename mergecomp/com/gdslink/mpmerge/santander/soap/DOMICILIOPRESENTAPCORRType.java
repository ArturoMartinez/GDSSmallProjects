
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DOMICILIO_PRESENT_AP_CORR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DOMICILIO_PRESENT_AP_CORR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="APARTADO_DE_CORREOS" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_10_Type"/>
 *         &lt;element name="LOCALIDAD" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_5_Type"/>
 *         &lt;element name="CODIGO_POSTAL" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_7_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DOMICILIO_PRESENT_AP_CORR_Type", propOrder = {
    "apartadodecorreos",
    "localidad",
    "codigopostal"
})
public class DOMICILIOPRESENTAPCORRType {

    @XmlElement(name = "APARTADO_DE_CORREOS", required = true)
    protected String apartadodecorreos;
    @XmlElement(name = "LOCALIDAD", required = true)
    protected String localidad;
    @XmlElement(name = "CODIGO_POSTAL", required = true)
    protected String codigopostal;

    /**
     * Gets the value of the apartadodecorreos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPARTADODECORREOS() {
        return apartadodecorreos;
    }

    /**
     * Sets the value of the apartadodecorreos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPARTADODECORREOS(String value) {
        this.apartadodecorreos = value;
    }

    /**
     * Gets the value of the localidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCALIDAD() {
        return localidad;
    }

    /**
     * Sets the value of the localidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCALIDAD(String value) {
        this.localidad = value;
    }

    /**
     * Gets the value of the codigopostal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOPOSTAL() {
        return codigopostal;
    }

    /**
     * Sets the value of the codigopostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOPOSTAL(String value) {
        this.codigopostal = value;
    }

}
