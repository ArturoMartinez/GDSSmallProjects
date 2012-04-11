
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LINEA_NEGOCIO_CORP_2_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LINEA_NEGOCIO_CORP_2_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LINEA_NEGOCIO_CORP_1" type="{http://www.isban.es/webservices/TDCs}LINEA_NEGOCIO_CORP_1_Type"/>
 *         &lt;element name="ID_LINEA_NEGOCIO_CORP_2" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LINEA_NEGOCIO_CORP_2_Type", propOrder = {
    "lineanegociocorp1",
    "idlineanegociocorp2"
})
public class LINEANEGOCIOCORP2Type {

    @XmlElement(name = "LINEA_NEGOCIO_CORP_1", required = true)
    protected String lineanegociocorp1;
    @XmlElement(name = "ID_LINEA_NEGOCIO_CORP_2", required = true)
    protected String idlineanegociocorp2;

    /**
     * Gets the value of the lineanegociocorp1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINEANEGOCIOCORP1() {
        return lineanegociocorp1;
    }

    /**
     * Sets the value of the lineanegociocorp1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINEANEGOCIOCORP1(String value) {
        this.lineanegociocorp1 = value;
    }

    /**
     * Gets the value of the idlineanegociocorp2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDLINEANEGOCIOCORP2() {
        return idlineanegociocorp2;
    }

    /**
     * Sets the value of the idlineanegociocorp2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDLINEANEGOCIOCORP2(String value) {
        this.idlineanegociocorp2 = value;
    }

}
