
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ESTANDAR_CUALITATIVA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ESTANDAR_CUALITATIVA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MAESTRA_ATRIBUTO" type="{http://www.isban.es/webservices/TDCc}MAESTRA_ATRIBUTO_Type"/>
 *         &lt;element name="CODIGO_RESPUESTA" type="{http://www.isban.es/webservices/TDCs}ORDEN_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ESTANDAR_CUALITATIVA_Type", propOrder = {
    "maestraatributo",
    "codigorespuesta"
})
public class ESTANDARCUALITATIVAType {

    @XmlElement(name = "MAESTRA_ATRIBUTO", required = true)
    protected MAESTRAATRIBUTOType maestraatributo;
    @XmlElement(name = "CODIGO_RESPUESTA")
    protected int codigorespuesta;

    /**
     * Gets the value of the maestraatributo property.
     * 
     * @return
     *     possible object is
     *     {@link MAESTRAATRIBUTOType }
     *     
     */
    public MAESTRAATRIBUTOType getMAESTRAATRIBUTO() {
        return maestraatributo;
    }

    /**
     * Sets the value of the maestraatributo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MAESTRAATRIBUTOType }
     *     
     */
    public void setMAESTRAATRIBUTO(MAESTRAATRIBUTOType value) {
        this.maestraatributo = value;
    }

    /**
     * Gets the value of the codigorespuesta property.
     * 
     */
    public int getCODIGORESPUESTA() {
        return codigorespuesta;
    }

    /**
     * Sets the value of the codigorespuesta property.
     * 
     */
    public void setCODIGORESPUESTA(int value) {
        this.codigorespuesta = value;
    }

}
