
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getCurrent_IN" type="{http://www.isban.es/webservices/GESTION/Gestion_m/F_mtxcor_gestion_m/sovereign/intranet/cbTypes/v1}com.banesto.al.mtxcor.gestion_m.f.cb.CBK_getCurrentData_IN_Type"/>
 *       &lt;/sequence>
 *       &lt;attribute name="facade" type="{http://www.isban.es/webservices/TDCs}DESCRIPCION_GENERAL_Type" fixed="MTXSOVWS" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getCurrentIN"
})
@XmlRootElement(name = "getCurrentBureauData", namespace = "http://www.isban.es/webservices/GESTION/Gestion_m/F_mtxcor_gestion_m/intranet/MTXSOVWS/v1")
public class GetCurrentBureauData {

    @XmlElement(name = "getCurrent_IN", required = true, nillable = true)
    protected ComBanestoAlMtxcorGestionMFCbCBKGetCurrentDataINType getCurrentIN;
    @XmlAttribute(name = "facade")
    protected String facade;

    /**
     * Gets the value of the getCurrentIN property.
     * 
     * @return
     *     possible object is
     *     {@link ComBanestoAlMtxcorGestionMFCbCBKGetCurrentDataINType }
     *     
     */
    public ComBanestoAlMtxcorGestionMFCbCBKGetCurrentDataINType getGetCurrentIN() {
        return getCurrentIN;
    }

    /**
     * Sets the value of the getCurrentIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComBanestoAlMtxcorGestionMFCbCBKGetCurrentDataINType }
     *     
     */
    public void setGetCurrentIN(ComBanestoAlMtxcorGestionMFCbCBKGetCurrentDataINType value) {
        this.getCurrentIN = value;
    }

    /**
     * Gets the value of the facade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacade() {
        if (facade == null) {
            return "MTXSOVWS";
        } else {
            return facade;
        }
    }

    /**
     * Sets the value of the facade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacade(String value) {
        this.facade = value;
    }

}
