
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MOTIVO_GAU_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MOTIVO_GAU_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIP_MOTIVO_GAU" type="{http://www.isban.es/webservices/TDCc}TIP_MOTIVO_GAU_Type"/>
 *         &lt;element name="COD_MOTIVO_INTERNO" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_4_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MOTIVO_GAU_Type", propOrder = {
    "tipmotivogau",
    "codmotivointerno"
})
public class MOTIVOGAUType {

    @XmlElement(name = "TIP_MOTIVO_GAU", required = true)
    protected TIPMOTIVOGAUType tipmotivogau;
    @XmlElement(name = "COD_MOTIVO_INTERNO", required = true)
    protected String codmotivointerno;

    /**
     * Gets the value of the tipmotivogau property.
     * 
     * @return
     *     possible object is
     *     {@link TIPMOTIVOGAUType }
     *     
     */
    public TIPMOTIVOGAUType getTIPMOTIVOGAU() {
        return tipmotivogau;
    }

    /**
     * Sets the value of the tipmotivogau property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIPMOTIVOGAUType }
     *     
     */
    public void setTIPMOTIVOGAU(TIPMOTIVOGAUType value) {
        this.tipmotivogau = value;
    }

    /**
     * Gets the value of the codmotivointerno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODMOTIVOINTERNO() {
        return codmotivointerno;
    }

    /**
     * Sets the value of the codmotivointerno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODMOTIVOINTERNO(String value) {
        this.codmotivointerno = value;
    }

}
