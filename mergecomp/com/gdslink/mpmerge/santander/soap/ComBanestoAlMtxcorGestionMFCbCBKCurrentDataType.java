
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for com.banesto.al.mtxcor.gestion_m.f.cb.CBK_CurrentData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.banesto.al.mtxcor.gestion_m.f.cb.CBK_CurrentData_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rawInfo" type="{http://www.isban.es/webservices/TDCs}DOCUMENTO_XML_Type" minOccurs="0"/>
 *         &lt;element name="fechaDato" type="{http://www.isban.es/webservices/TDCs}FECHA_GENERICA_Type" minOccurs="0"/>
 *         &lt;element name="bureauName" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_2_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "com.banesto.al.mtxcor.gestion_m.f.cb.CBK_CurrentData_Type", namespace = "http://www.isban.es/webservices/GESTION/Gestion_m/F_mtxcor_gestion_m/sovereign/intranet/cbTypes/v1", propOrder = {
    "rawInfo",
    "fechaDato",
    "bureauName"
})
public class ComBanestoAlMtxcorGestionMFCbCBKCurrentDataType {

    protected String rawInfo;
    protected XMLGregorianCalendar fechaDato;
    protected String bureauName;

    /**
     * Gets the value of the rawInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRawInfo() {
        return rawInfo;
    }

    /**
     * Sets the value of the rawInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRawInfo(String value) {
        this.rawInfo = value;
    }

    /**
     * Gets the value of the fechaDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaDato() {
        return fechaDato;
    }

    /**
     * Sets the value of the fechaDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaDato(XMLGregorianCalendar value) {
        this.fechaDato = value;
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

}
