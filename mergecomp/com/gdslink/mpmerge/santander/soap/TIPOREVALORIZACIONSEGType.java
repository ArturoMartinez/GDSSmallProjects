
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TIPO_REVALORIZACION_SEG_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIPO_REVALORIZACION_SEG_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_TARIFA_FABRICA_SEG" type="{http://www.isban.es/webservices/TDCc}ID_TARIFA_FABRICA_SEG_Type"/>
 *         &lt;element name="TIPO_DATO_AFECTADO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *         &lt;element name="CODIGO_REVALORIZACION" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIPO_REVALORIZACION_SEG_Type", propOrder = {
    "idtarifafabricaseg",
    "tipodatoafectado",
    "codigorevalorizacion"
})
public class TIPOREVALORIZACIONSEGType {

    @XmlElement(name = "ID_TARIFA_FABRICA_SEG", required = true)
    protected IDTARIFAFABRICASEGType idtarifafabricaseg;
    @XmlElement(name = "TIPO_DATO_AFECTADO", required = true)
    protected String tipodatoafectado;
    @XmlElement(name = "CODIGO_REVALORIZACION", required = true)
    protected String codigorevalorizacion;

    /**
     * Gets the value of the idtarifafabricaseg property.
     * 
     * @return
     *     possible object is
     *     {@link IDTARIFAFABRICASEGType }
     *     
     */
    public IDTARIFAFABRICASEGType getIDTARIFAFABRICASEG() {
        return idtarifafabricaseg;
    }

    /**
     * Sets the value of the idtarifafabricaseg property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDTARIFAFABRICASEGType }
     *     
     */
    public void setIDTARIFAFABRICASEG(IDTARIFAFABRICASEGType value) {
        this.idtarifafabricaseg = value;
    }

    /**
     * Gets the value of the tipodatoafectado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODATOAFECTADO() {
        return tipodatoafectado;
    }

    /**
     * Sets the value of the tipodatoafectado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODATOAFECTADO(String value) {
        this.tipodatoafectado = value;
    }

    /**
     * Gets the value of the codigorevalorizacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOREVALORIZACION() {
        return codigorevalorizacion;
    }

    /**
     * Sets the value of the codigorevalorizacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOREVALORIZACION(String value) {
        this.codigorevalorizacion = value;
    }

}
