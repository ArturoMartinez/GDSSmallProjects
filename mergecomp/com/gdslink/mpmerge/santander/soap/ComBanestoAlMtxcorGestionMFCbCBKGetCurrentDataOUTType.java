
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for com.banesto.al.mtxcor.gestion_m.f.cb.CBK_getCurrentData_OUT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.banesto.al.mtxcor.gestion_m.f.cb.CBK_getCurrentData_OUT_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BDP_Id" type="{http://www.isban.es/webservices/TDCc}NUM_PERSONA_CLIENTE_Type" minOccurs="0"/>
 *         &lt;element name="catalogueProductType" type="{http://www.isban.es/webservices/TDCc}TIPO_DE_PRODUCTO_Type" minOccurs="0"/>
 *         &lt;element name="catalogueProductSubType" type="{http://www.isban.es/webservices/TDCc}SUBTIPO_DE_PRODUCTO_Type" minOccurs="0"/>
 *         &lt;element name="BureauName" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_10_Type" minOccurs="0"/>
 *         &lt;element name="ListaRaw" type="{http://www.isban.es/webservices/GESTION/Gestion_m/F_mtxcor_gestion_m/sovereign/intranet/cbTypes/v1}com.banesto.al.mtxcor.gestion_m.f.cb.CBI_ListCurrentData_Type" minOccurs="0"/>
 *         &lt;element name="mensaje" type="{http://www.isban.es/webservices/TDCs}DESCRIPCION_CORTA_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "com.banesto.al.mtxcor.gestion_m.f.cb.CBK_getCurrentData_OUT_Type", namespace = "http://www.isban.es/webservices/GESTION/Gestion_m/F_mtxcor_gestion_m/sovereign/intranet/cbTypes/v1", propOrder = {
    "bdpId",
    "catalogueProductType",
    "catalogueProductSubType",
    "bureauName",
    "listaRaw",
    "mensaje"
})
public class ComBanestoAlMtxcorGestionMFCbCBKGetCurrentDataOUTType {

    @XmlElement(name = "BDP_Id")
    protected NUMPERSONACLIENTEType bdpId;
    protected TIPODEPRODUCTOType catalogueProductType;
    protected SUBTIPODEPRODUCTOType catalogueProductSubType;
    @XmlElement(name = "BureauName")
    protected String bureauName;
    @XmlElement(name = "ListaRaw")
    protected ComBanestoAlMtxcorGestionMFCbCBIListCurrentDataType listaRaw;
    protected String mensaje;

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
     * Gets the value of the listaRaw property.
     * 
     * @return
     *     possible object is
     *     {@link ComBanestoAlMtxcorGestionMFCbCBIListCurrentDataType }
     *     
     */
    public ComBanestoAlMtxcorGestionMFCbCBIListCurrentDataType getListaRaw() {
        return listaRaw;
    }

    /**
     * Sets the value of the listaRaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComBanestoAlMtxcorGestionMFCbCBIListCurrentDataType }
     *     
     */
    public void setListaRaw(ComBanestoAlMtxcorGestionMFCbCBIListCurrentDataType value) {
        this.listaRaw = value;
    }

    /**
     * Gets the value of the mensaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Sets the value of the mensaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

}
