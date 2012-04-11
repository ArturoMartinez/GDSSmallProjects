
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SINIESTRO_SEGUROS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SINIESTRO_SEGUROS_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MODALIDAD_DE_SEGUROS" type="{http://www.isban.es/webservices/TDCc}MODALIDAD_DE_SEGUROS_Type"/>
 *         &lt;element name="NUM_SINIESTRO_SEGUROS" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_8_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SINIESTRO_SEGUROS_Type", propOrder = {
    "modalidaddeseguros",
    "numsiniestroseguros"
})
public class SINIESTROSEGUROSType {

    @XmlElement(name = "MODALIDAD_DE_SEGUROS", required = true)
    protected MODALIDADDESEGUROSType modalidaddeseguros;
    @XmlElement(name = "NUM_SINIESTRO_SEGUROS")
    protected int numsiniestroseguros;

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
     * Gets the value of the numsiniestroseguros property.
     * 
     */
    public int getNUMSINIESTROSEGUROS() {
        return numsiniestroseguros;
    }

    /**
     * Sets the value of the numsiniestroseguros property.
     * 
     */
    public void setNUMSINIESTROSEGUROS(int value) {
        this.numsiniestroseguros = value;
    }

}
