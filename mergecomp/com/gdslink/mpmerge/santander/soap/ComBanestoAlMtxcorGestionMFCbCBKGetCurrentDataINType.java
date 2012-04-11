
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for com.banesto.al.mtxcor.gestion_m.f.cb.CBK_getCurrentData_IN_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.banesto.al.mtxcor.gestion_m.f.cb.CBK_getCurrentData_IN_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="callType" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_2_Type" minOccurs="0"/>
 *         &lt;element name="catalogueProductType" type="{http://www.isban.es/webservices/TDCc}TIPO_DE_PRODUCTO_Type" minOccurs="0"/>
 *         &lt;element name="catalogueProductSubType" type="{http://www.isban.es/webservices/TDCc}SUBTIPO_DE_PRODUCTO_Type" minOccurs="0"/>
 *         &lt;element name="bureauName" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_10_Type" minOccurs="0"/>
 *         &lt;element name="vigencia" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_3_Type" minOccurs="0"/>
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
@XmlType(name = "com.banesto.al.mtxcor.gestion_m.f.cb.CBK_getCurrentData_IN_Type", namespace = "http://www.isban.es/webservices/GESTION/Gestion_m/F_mtxcor_gestion_m/sovereign/intranet/cbTypes/v1", propOrder = {
    "callType",
    "catalogueProductType",
    "catalogueProductSubType",
    "bureauName",
    "vigencia",
    "bdpId"
})
public class ComBanestoAlMtxcorGestionMFCbCBKGetCurrentDataINType {

    protected String callType;
    protected TIPODEPRODUCTOType catalogueProductType;
    protected SUBTIPODEPRODUCTOType catalogueProductSubType;
    protected String bureauName;
    protected String vigencia;
    @XmlElement(name = "BDP_Id")
    protected NUMPERSONACLIENTEType bdpId;

    /**
     * Gets the value of the callType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallType() {
        return callType;
    }

    /**
     * Sets the value of the callType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallType(String value) {
        this.callType = value;
    }

    /**
     * Gets the value of the catalogueProductType property.
     * 
     * @return
     *     possible object is
     *     {@link TIPODEPRODUCTOType }
     *     
     */
    public TIPODEPRODUCTOType getCatalogueProductType() {
        return catalogueProductType;
    }

    /**
     * Sets the value of the catalogueProductType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIPODEPRODUCTOType }
     *     
     */
    public void setCatalogueProductType(TIPODEPRODUCTOType value) {
        this.catalogueProductType = value;
    }

    /**
     * Gets the value of the catalogueProductSubType property.
     * 
     * @return
     *     possible object is
     *     {@link SUBTIPODEPRODUCTOType }
     *     
     */
    public SUBTIPODEPRODUCTOType getCatalogueProductSubType() {
        return catalogueProductSubType;
    }

    /**
     * Sets the value of the catalogueProductSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SUBTIPODEPRODUCTOType }
     *     
     */
    public void setCatalogueProductSubType(SUBTIPODEPRODUCTOType value) {
        this.catalogueProductSubType = value;
    }

    /**
     * Gets the value of the bureauName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBureauName() {
        return bureauName;
    }

    /**
     * Sets the value of the bureauName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBureauName(String value) {
        this.bureauName = value;
    }

    /**
     * Gets the value of the vigencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVigencia() {
        return vigencia;
    }

    /**
     * Sets the value of the vigencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVigencia(String value) {
        this.vigencia = value;
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
