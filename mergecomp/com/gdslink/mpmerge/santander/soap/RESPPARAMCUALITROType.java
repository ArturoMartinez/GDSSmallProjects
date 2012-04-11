
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RESP_PARAM_CUALIT_RO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RESP_PARAM_CUALIT_RO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RESPUESTA_PARAM_RO" type="{http://www.isban.es/webservices/TDCc}RESPUESTA_PARAM_RO_Type"/>
 *         &lt;element name="CODIGO_RESPUESTA_RO" type="{http://www.isban.es/webservices/TDCs}ORDEN_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RESP_PARAM_CUALIT_RO_Type", propOrder = {
    "respuestaparamro",
    "codigorespuestaro"
})
public class RESPPARAMCUALITROType {

    @XmlElement(name = "RESPUESTA_PARAM_RO", required = true)
    protected RESPUESTAPARAMROType respuestaparamro;
    @XmlElement(name = "CODIGO_RESPUESTA_RO")
    protected int codigorespuestaro;

    /**
     * Gets the value of the respuestaparamro property.
     * 
     * @return
     *     possible object is
     *     {@link RESPUESTAPARAMROType }
     *     
     */
    public RESPUESTAPARAMROType getRESPUESTAPARAMRO() {
        return respuestaparamro;
    }

    /**
     * Sets the value of the respuestaparamro property.
     * 
     * @param value
     *     allowed object is
     *     {@link RESPUESTAPARAMROType }
     *     
     */
    public void setRESPUESTAPARAMRO(RESPUESTAPARAMROType value) {
        this.respuestaparamro = value;
    }

    /**
     * Gets the value of the codigorespuestaro property.
     * 
     */
    public int getCODIGORESPUESTARO() {
        return codigorespuestaro;
    }

    /**
     * Sets the value of the codigorespuestaro property.
     * 
     */
    public void setCODIGORESPUESTARO(int value) {
        this.codigorespuestaro = value;
    }

}
