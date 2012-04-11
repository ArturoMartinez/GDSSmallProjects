
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLECTIVO_POLIZA_SEGUROS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLECTIVO_POLIZA_SEGUROS_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MODALIDAD_DE_SEGUROS" type="{http://www.isban.es/webservices/TDCc}MODALIDAD_DE_SEGUROS_Type"/>
 *         &lt;element name="NUMERO_POLIZA_SEGURO" type="{http://www.isban.es/webservices/TDCs}NUMERO_POLIZA_SEGURO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COLECTIVO_POLIZA_SEGUROS_Type", propOrder = {
    "modalidaddeseguros",
    "numeropolizaseguro"
})
public class COLECTIVOPOLIZASEGUROSType {

    @XmlElement(name = "MODALIDAD_DE_SEGUROS", required = true)
    protected MODALIDADDESEGUROSType modalidaddeseguros;
    @XmlElement(name = "NUMERO_POLIZA_SEGURO")
    protected int numeropolizaseguro;

    /**
     * Gets the value of the modalidaddeseguros property.
     * 
     * @return
     *     possible object is
     *     {@link MODALIDADDESEGUROSType }
     *     
     */
    public MODALIDADDESEGUROSType getMODALIDADDESEGUROS() {
        return modalidaddeseguros;
    }

    /**
     * Sets the value of the modalidaddeseguros property.
     * 
     * @param value
     *     allowed object is
     *     {@link MODALIDADDESEGUROSType }
     *     
     */
    public void setMODALIDADDESEGUROS(MODALIDADDESEGUROSType value) {
        this.modalidaddeseguros = value;
    }

    /**
     * Gets the value of the numeropolizaseguro property.
     * 
     */
    public int getNUMEROPOLIZASEGURO() {
        return numeropolizaseguro;
    }

    /**
     * Sets the value of the numeropolizaseguro property.
     * 
     */
    public void setNUMEROPOLIZASEGURO(int value) {
        this.numeropolizaseguro = value;
    }

}
