
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for com.banesto.al.mtxcor.gestion_m.f.cb.CBK_getRawABu_OUT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.banesto.al.mtxcor.gestion_m.f.cb.CBK_getRawABu_OUT_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="callType" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_2_Type" minOccurs="0"/>
 *         &lt;element name="ProductType" type="{http://www.isban.es/webservices/TDCc}TIPO_DE_PRODUCTO_Type" minOccurs="0"/>
 *         &lt;element name="ProductSubtype" type="{http://www.isban.es/webservices/TDCc}SUBTIPO_DE_PRODUCTO_Type" minOccurs="0"/>
 *         &lt;element name="CadenaBureauName" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_10_Type" minOccurs="0"/>
 *         &lt;element name="Lista_Raw_Info" type="{http://www.isban.es/webservices/GESTION/Gestion_m/F_mtxcor_gestion_m/sovereign/intranet/cbTypes/v1}com.banesto.al.mtxcor.gestion_m.f.cb.CBI_ListCurrentData_Type" minOccurs="0"/>
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
@XmlType(name = "com.banesto.al.mtxcor.gestion_m.f.cb.CBK_getRawABu_OUT_Type", namespace = "http://www.isban.es/webservices/GESTION/Gestion_m/F_mtxcor_gestion_m/sovereign/intranet/cbTypes/v1", propOrder = {
    "callType",
    "productType",
    "productSubtype",
    "cadenaBureauName",
    "listaRawInfo",
    "mensaje"
})
public class ComBanestoAlMtxcorGestionMFCbCBKGetRawABuOUTType {

    protected String callType;
    @XmlElement(name = "ProductType")
    protected TIPODEPRODUCTOType productType;
    @XmlElement(name = "ProductSubtype")
    protected SUBTIPODEPRODUCTOType productSubtype;
    @XmlElement(name = "CadenaBureauName")
    protected String cadenaBureauName;
    @XmlElement(name = "Lista_Raw_Info")
    protected ComBanestoAlMtxcorGestionMFCbCBIListCurrentDataType listaRawInfo;
    protected String mensaje;

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
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link TIPODEPRODUCTOType }
     *     
     */
    public TIPODEPRODUCTOType getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIPODEPRODUCTOType }
     *     
     */
    public void setProductType(TIPODEPRODUCTOType value) {
        this.productType = value;
    }

    /**
     * Gets the value of the productSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link SUBTIPODEPRODUCTOType }
     *     
     */
    public SUBTIPODEPRODUCTOType getProductSubtype() {
        return productSubtype;
    }

    /**
     * Sets the value of the productSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link SUBTIPODEPRODUCTOType }
     *     
     */
    public void setProductSubtype(SUBTIPODEPRODUCTOType value) {
        this.productSubtype = value;
    }

    /**
     * Gets the value of the cadenaBureauName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCadenaBureauName() {
        return cadenaBureauName;
    }

    /**
     * Sets the value of the cadenaBureauName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCadenaBureauName(String value) {
        this.cadenaBureauName = value;
    }

    /**
     * Gets the value of the listaRawInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ComBanestoAlMtxcorGestionMFCbCBIListCurrentDataType }
     *     
     */
    public ComBanestoAlMtxcorGestionMFCbCBIListCurrentDataType getListaRawInfo() {
        return listaRawInfo;
    }

    /**
     * Sets the value of the listaRawInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComBanestoAlMtxcorGestionMFCbCBIListCurrentDataType }
     *     
     */
    public void setListaRawInfo(ComBanestoAlMtxcorGestionMFCbCBIListCurrentDataType value) {
        this.listaRawInfo = value;
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
