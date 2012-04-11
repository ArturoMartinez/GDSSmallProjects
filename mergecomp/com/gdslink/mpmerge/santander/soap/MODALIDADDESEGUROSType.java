
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MODALIDAD_DE_SEGUROS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MODALIDAD_DE_SEGUROS_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RAMO_DE_SEGUROS" type="{http://www.isban.es/webservices/TDCc}RAMO_DE_SEGUROS_Type"/>
 *         &lt;element name="COD_PRODUCTO" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MODALIDAD_DE_SEGUROS_Type", propOrder = {
    "ramodeseguros",
    "codproducto"
})
public class MODALIDADDESEGUROSType {

    @XmlElement(name = "RAMO_DE_SEGUROS", required = true)
    protected RAMODESEGUROSType ramodeseguros;
    @XmlElement(name = "COD_PRODUCTO")
    protected int codproducto;

    /**
     * Gets the value of the ramodeseguros property.
     * 
     * @return
     *     possible object is
     *     {@link RAMODESEGUROSType }
     *     
     */
    public RAMODESEGUROSType getRAMODESEGUROS() {
        return ramodeseguros;
    }

    /**
     * Sets the value of the ramodeseguros property.
     * 
     * @param value
     *     allowed object is
     *     {@link RAMODESEGUROSType }
     *     
     */
    public void setRAMODESEGUROS(RAMODESEGUROSType value) {
        this.ramodeseguros = value;
    }

    /**
     * Gets the value of the codproducto property.
     * 
     */
    public int getCODPRODUCTO() {
        return codproducto;
    }

    /**
     * Sets the value of the codproducto property.
     * 
     */
    public void setCODPRODUCTO(int value) {
        this.codproducto = value;
    }

}
