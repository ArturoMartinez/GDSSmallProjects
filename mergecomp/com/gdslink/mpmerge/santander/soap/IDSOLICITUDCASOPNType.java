
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ID_SOLICITUD_CASO_PN_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ID_SOLICITUD_CASO_PN_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_CASO_PN" type="{http://www.isban.es/webservices/TDCc}ID_CASO_PN_Type"/>
 *         &lt;element name="CODIGO_DE_SOLICITUD" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ID_SOLICITUD_CASO_PN_Type", propOrder = {
    "idcasopn",
    "codigodesolicitud"
})
public class IDSOLICITUDCASOPNType {

    @XmlElement(name = "ID_CASO_PN", required = true)
    protected IDCASOPNType idcasopn;
    @XmlElement(name = "CODIGO_DE_SOLICITUD", required = true)
    protected String codigodesolicitud;

    /**
     * Gets the value of the idcasopn property.
     * 
     * @return
     *     possible object is
     *     {@link IDCASOPNType }
     *     
     */
    public IDCASOPNType getIDCASOPN() {
        return idcasopn;
    }

    /**
     * Sets the value of the idcasopn property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDCASOPNType }
     *     
     */
    public void setIDCASOPN(IDCASOPNType value) {
        this.idcasopn = value;
    }

    /**
     * Gets the value of the codigodesolicitud property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGODESOLICITUD() {
        return codigodesolicitud;
    }

    /**
     * Sets the value of the codigodesolicitud property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGODESOLICITUD(String value) {
        this.codigodesolicitud = value;
    }

}
