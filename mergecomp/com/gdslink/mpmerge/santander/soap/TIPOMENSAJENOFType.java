
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TIPO_MENSAJE_NOF_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIPO_MENSAJE_NOF_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COD_TIPO_MENSAJE" type="{http://www.isban.es/webservices/TDCs}INDICADOR_GENERICO_Type"/>
 *         &lt;element name="ID_TIPO_SOLICITUD" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIPO_MENSAJE_NOF_Type", propOrder = {
    "codtipomensaje",
    "idtiposolicitud"
})
public class TIPOMENSAJENOFType {

    @XmlElement(name = "COD_TIPO_MENSAJE", required = true)
    protected String codtipomensaje;
    @XmlElement(name = "ID_TIPO_SOLICITUD", required = true)
    protected String idtiposolicitud;

    /**
     * Gets the value of the codtipomensaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODTIPOMENSAJE() {
        return codtipomensaje;
    }

    /**
     * Sets the value of the codtipomensaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODTIPOMENSAJE(String value) {
        this.codtipomensaje = value;
    }

    /**
     * Gets the value of the idtiposolicitud property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDTIPOSOLICITUD() {
        return idtiposolicitud;
    }

    /**
     * Sets the value of the idtiposolicitud property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDTIPOSOLICITUD(String value) {
        this.idtiposolicitud = value;
    }

}
