
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RECIBO_SEGUROS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RECIBO_SEGUROS_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MODALIDAD_DE_SEGUROS" type="{http://www.isban.es/webservices/TDCc}MODALIDAD_DE_SEGUROS_Type"/>
 *         &lt;element name="NUM_RECIBO_SEGUROS" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_8_Type"/>
 *         &lt;element name="NUM_INTEGRANTE_RECIBO" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_6_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RECIBO_SEGUROS_Type", propOrder = {
    "modalidaddeseguros",
    "numreciboseguros",
    "numintegranterecibo"
})
public class RECIBOSEGUROSType {

    @XmlElement(name = "MODALIDAD_DE_SEGUROS", required = true)
    protected MODALIDADDESEGUROSType modalidaddeseguros;
    @XmlElement(name = "NUM_RECIBO_SEGUROS")
    protected int numreciboseguros;
    @XmlElement(name = "NUM_INTEGRANTE_RECIBO")
    protected int numintegranterecibo;

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
     * Gets the value of the numreciboseguros property.
     * 
     */
    public int getNUMRECIBOSEGUROS() {
        return numreciboseguros;
    }

    /**
     * Sets the value of the numreciboseguros property.
     * 
     */
    public void setNUMRECIBOSEGUROS(int value) {
        this.numreciboseguros = value;
    }

    /**
     * Gets the value of the numintegranterecibo property.
     * 
     */
    public int getNUMINTEGRANTERECIBO() {
        return numintegranterecibo;
    }

    /**
     * Sets the value of the numintegranterecibo property.
     * 
     */
    public void setNUMINTEGRANTERECIBO(int value) {
        this.numintegranterecibo = value;
    }

}
