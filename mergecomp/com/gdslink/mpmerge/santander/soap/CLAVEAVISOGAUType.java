
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CLAVE_AVISO_GAU_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CLAVE_AVISO_GAU_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_AUTORIZACION_GAU" type="{http://www.isban.es/webservices/TDCc}TIPO_AUTORIZACION_GAU_Type"/>
 *         &lt;element name="NATURALEZA_AVISO_GAU" type="{http://www.isban.es/webservices/TDCs}NATURALEZA_AVISO_GAU_Type"/>
 *         &lt;element name="COD_INT_AVISO" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_18_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CLAVE_AVISO_GAU_Type", propOrder = {
    "tipoautorizaciongau",
    "naturalezaavisogau",
    "codintaviso"
})
public class CLAVEAVISOGAUType {

    @XmlElement(name = "TIPO_AUTORIZACION_GAU", required = true)
    protected TIPOAUTORIZACIONGAUType tipoautorizaciongau;
    @XmlElement(name = "NATURALEZA_AVISO_GAU", required = true)
    protected String naturalezaavisogau;
    @XmlElement(name = "COD_INT_AVISO")
    protected long codintaviso;

    /**
     * Gets the value of the tipoautorizaciongau property.
     * 
     * @return
     *     possible object is
     *     {@link TIPOAUTORIZACIONGAUType }
     *     
     */
    public TIPOAUTORIZACIONGAUType getTIPOAUTORIZACIONGAU() {
        return tipoautorizaciongau;
    }

    /**
     * Sets the value of the tipoautorizaciongau property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIPOAUTORIZACIONGAUType }
     *     
     */
    public void setTIPOAUTORIZACIONGAU(TIPOAUTORIZACIONGAUType value) {
        this.tipoautorizaciongau = value;
    }

    /**
     * Gets the value of the naturalezaavisogau property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNATURALEZAAVISOGAU() {
        return naturalezaavisogau;
    }

    /**
     * Sets the value of the naturalezaavisogau property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNATURALEZAAVISOGAU(String value) {
        this.naturalezaavisogau = value;
    }

    /**
     * Gets the value of the codintaviso property.
     * 
     */
    public long getCODINTAVISO() {
        return codintaviso;
    }

    /**
     * Sets the value of the codintaviso property.
     * 
     */
    public void setCODINTAVISO(long value) {
        this.codintaviso = value;
    }

}
