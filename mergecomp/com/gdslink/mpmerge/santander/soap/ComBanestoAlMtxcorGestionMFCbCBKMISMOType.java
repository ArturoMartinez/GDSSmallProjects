
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for com.banesto.al.mtxcor.gestion_m.f.cb.CBK_MISMO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.banesto.al.mtxcor.gestion_m.f.cb.CBK_MISMO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mismo" type="{http://www.isban.es/webservices/TDCs}DOCUMENTO_XML_Type" minOccurs="0"/>
 *         &lt;element name="BDP_Id" type="{http://www.isban.es/webservices/TDCc}NUM_PERSONA_CLIENTE_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "com.banesto.al.mtxcor.gestion_m.f.cb.CBK_MISMO_Type", namespace = "http://www.isban.es/webservices/GESTION/Gestion_m/F_mtxcor_gestion_m/sovereign/intranet/cbTypes/v1", propOrder = {
    "mismo",
    "bdpId"
})
public class ComBanestoAlMtxcorGestionMFCbCBKMISMOType {

    protected String mismo;
    @XmlElement(name = "BDP_Id")
    protected NUMPERSONACLIENTEType bdpId;

    /**
     * Gets the value of the mismo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMismo() {
        return mismo;
    }

    /**
     * Sets the value of the mismo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMismo(String value) {
        this.mismo = value;
    }

    /**
     * Gets the value of the bdpId property.
     * 
     * @return
     *     possible object is
     *     {@link NUMPERSONACLIENTEType }
     *     
     */
    public NUMPERSONACLIENTEType getBDPId() {
        return bdpId;
    }

    /**
     * Sets the value of the bdpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link NUMPERSONACLIENTEType }
     *     
     */
    public void setBDPId(NUMPERSONACLIENTEType value) {
        this.bdpId = value;
    }

}
