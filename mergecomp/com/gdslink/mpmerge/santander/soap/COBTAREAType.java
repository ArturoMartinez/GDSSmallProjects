
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COB_TAREA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COB_TAREA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COD_TAREA" type="{http://www.isban.es/webservices/TDCc}COB_SOLICITUD_Type"/>
 *         &lt;element name="CODIGO_ALFANUM_4" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_4_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COB_TAREA_Type", propOrder = {
    "codtarea",
    "codigoalfanum4"
})
public class COBTAREAType {

    @XmlElement(name = "COD_TAREA", required = true)
    protected COBSOLICITUDType codtarea;
    @XmlElement(name = "CODIGO_ALFANUM_4", required = true)
    protected String codigoalfanum4;

    /**
     * Gets the value of the codtarea property.
     * 
     * @return
     *     possible object is
     *     {@link COBSOLICITUDType }
     *     
     */
    public COBSOLICITUDType getCODTAREA() {
        return codtarea;
    }

    /**
     * Sets the value of the codtarea property.
     * 
     * @param value
     *     allowed object is
     *     {@link COBSOLICITUDType }
     *     
     */
    public void setCODTAREA(COBSOLICITUDType value) {
        this.codtarea = value;
    }

    /**
     * Gets the value of the codigoalfanum4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOALFANUM4() {
        return codigoalfanum4;
    }

    /**
     * Sets the value of the codigoalfanum4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOALFANUM4(String value) {
        this.codigoalfanum4 = value;
    }

}
