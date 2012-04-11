
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACTIVIDAD_PERSONA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACTIVIDAD_PERSONA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INDICADOR_TRABAJO" type="{http://www.isban.es/webservices/TDCs}INDICADOR_TRABAJO_CLIENTE_Type"/>
 *         &lt;element name="CODIGO_DE_ACTIVIDAD" type="{http://www.isban.es/webservices/TDCs}CODIGO_DE_ACTIVIDAD_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACTIVIDAD_PERSONA_Type", propOrder = {
    "indicadortrabajo",
    "codigodeactividad"
})
public class ACTIVIDADPERSONAType {

    @XmlElement(name = "INDICADOR_TRABAJO", required = true)
    protected String indicadortrabajo;
    @XmlElement(name = "CODIGO_DE_ACTIVIDAD", required = true)
    protected String codigodeactividad;

    /**
     * Gets the value of the indicadortrabajo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDICADORTRABAJO() {
        return indicadortrabajo;
    }

    /**
     * Sets the value of the indicadortrabajo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDICADORTRABAJO(String value) {
        this.indicadortrabajo = value;
    }

    /**
     * Gets the value of the codigodeactividad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGODEACTIVIDAD() {
        return codigodeactividad;
    }

    /**
     * Sets the value of the codigodeactividad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGODEACTIVIDAD(String value) {
        this.codigodeactividad = value;
    }

}
