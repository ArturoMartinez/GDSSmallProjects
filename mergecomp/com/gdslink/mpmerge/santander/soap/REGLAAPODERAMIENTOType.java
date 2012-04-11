
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for REGLA_APODERAMIENTO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REGLA_APODERAMIENTO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_EXPEDIENTE_APOD" type="{http://www.isban.es/webservices/TDCc}EXPEDIENTE_APODERAMIENTO_Type"/>
 *         &lt;element name="COD_REGLA_APOD" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_5_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REGLA_APODERAMIENTO_Type", propOrder = {
    "idexpedienteapod",
    "codreglaapod"
})
public class REGLAAPODERAMIENTOType {

    @XmlElement(name = "ID_EXPEDIENTE_APOD", required = true)
    protected EXPEDIENTEAPODERAMIENTOType idexpedienteapod;
    @XmlElement(name = "COD_REGLA_APOD")
    protected int codreglaapod;

    /**
     * Gets the value of the idexpedienteapod property.
     * 
     * @return
     *     possible object is
     *     {@link EXPEDIENTEAPODERAMIENTOType }
     *     
     */
    public EXPEDIENTEAPODERAMIENTOType getIDEXPEDIENTEAPOD() {
        return idexpedienteapod;
    }

    /**
     * Sets the value of the idexpedienteapod property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXPEDIENTEAPODERAMIENTOType }
     *     
     */
    public void setIDEXPEDIENTEAPOD(EXPEDIENTEAPODERAMIENTOType value) {
        this.idexpedienteapod = value;
    }

    /**
     * Gets the value of the codreglaapod property.
     * 
     */
    public int getCODREGLAAPOD() {
        return codreglaapod;
    }

    /**
     * Sets the value of the codreglaapod property.
     * 
     */
    public void setCODREGLAAPOD(int value) {
        this.codreglaapod = value;
    }

}
