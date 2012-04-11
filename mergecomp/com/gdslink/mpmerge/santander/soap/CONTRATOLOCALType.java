
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CONTRATO_LOCAL_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CONTRATO_LOCAL_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_CONTRATO_LOCAL" type="{http://www.isban.es/webservices/TDCs}TIPO_CONTRATO_LOCAL_Type"/>
 *         &lt;element name="DETALLE_CONTRATO_LOCAL" type="{http://www.isban.es/webservices/TDCs}CONTR_LOCAL_LOCALIZACION_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONTRATO_LOCAL_Type", propOrder = {
    "tipocontratolocal",
    "detallecontratolocal"
})
public class CONTRATOLOCALType {

    @XmlElement(name = "TIPO_CONTRATO_LOCAL", required = true)
    protected String tipocontratolocal;
    @XmlElement(name = "DETALLE_CONTRATO_LOCAL", required = true)
    protected String detallecontratolocal;

    /**
     * Gets the value of the tipocontratolocal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOCONTRATOLOCAL() {
        return tipocontratolocal;
    }

    /**
     * Sets the value of the tipocontratolocal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOCONTRATOLOCAL(String value) {
        this.tipocontratolocal = value;
    }

    /**
     * Gets the value of the detallecontratolocal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDETALLECONTRATOLOCAL() {
        return detallecontratolocal;
    }

    /**
     * Sets the value of the detallecontratolocal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDETALLECONTRATOLOCAL(String value) {
        this.detallecontratolocal = value;
    }

}
