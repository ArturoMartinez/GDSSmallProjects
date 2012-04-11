
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ID_SOLICITUD_RECLAM_PN_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ID_SOLICITUD_RECLAM_PN_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_CASO_RECLAM_PN" type="{http://www.isban.es/webservices/TDCc}ID_CASO_RECLAM_PN_Type"/>
 *         &lt;element name="COD_RECLAM" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ID_SOLICITUD_RECLAM_PN_Type", propOrder = {
    "idcasoreclampn",
    "codreclam"
})
public class IDSOLICITUDRECLAMPNType {

    @XmlElement(name = "ID_CASO_RECLAM_PN", required = true)
    protected IDCASORECLAMPNType idcasoreclampn;
    @XmlElement(name = "COD_RECLAM", required = true)
    protected String codreclam;

    /**
     * Gets the value of the idcasoreclampn property.
     * 
     * @return
     *     possible object is
     *     {@link IDCASORECLAMPNType }
     *     
     */
    public IDCASORECLAMPNType getIDCASORECLAMPN() {
        return idcasoreclampn;
    }

    /**
     * Sets the value of the idcasoreclampn property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDCASORECLAMPNType }
     *     
     */
    public void setIDCASORECLAMPN(IDCASORECLAMPNType value) {
        this.idcasoreclampn = value;
    }

    /**
     * Gets the value of the codreclam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODRECLAM() {
        return codreclam;
    }

    /**
     * Sets the value of the codreclam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODRECLAM(String value) {
        this.codreclam = value;
    }

}
