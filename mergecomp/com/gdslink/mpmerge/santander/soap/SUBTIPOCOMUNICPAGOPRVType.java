
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SUBTIPO_COMUNIC_PAGO_PRV_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SUBTIPO_COMUNIC_PAGO_PRV_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIP_COMUNICACION_PAGO_PRV" type="{http://www.isban.es/webservices/TDCs}TIP_COMUNICACION_PAGO_PRV_Type"/>
 *         &lt;element name="COD_SUBTIPO_COMUNIC" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SUBTIPO_COMUNIC_PAGO_PRV_Type", propOrder = {
    "tipcomunicacionpagoprv",
    "codsubtipocomunic"
})
public class SUBTIPOCOMUNICPAGOPRVType {

    @XmlElement(name = "TIP_COMUNICACION_PAGO_PRV", required = true)
    protected String tipcomunicacionpagoprv;
    @XmlElement(name = "COD_SUBTIPO_COMUNIC", required = true)
    protected String codsubtipocomunic;

    /**
     * Gets the value of the tipcomunicacionpagoprv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPCOMUNICACIONPAGOPRV() {
        return tipcomunicacionpagoprv;
    }

    /**
     * Sets the value of the tipcomunicacionpagoprv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPCOMUNICACIONPAGOPRV(String value) {
        this.tipcomunicacionpagoprv = value;
    }

    /**
     * Gets the value of the codsubtipocomunic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODSUBTIPOCOMUNIC() {
        return codsubtipocomunic;
    }

    /**
     * Sets the value of the codsubtipocomunic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODSUBTIPOCOMUNIC(String value) {
        this.codsubtipocomunic = value;
    }

}
