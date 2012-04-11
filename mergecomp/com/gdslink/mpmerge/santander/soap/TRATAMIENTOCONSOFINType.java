
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TRATAMIENTO_CONSO_FIN_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRATAMIENTO_CONSO_FIN_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENTORNO_CONSOLIDAC_FINAN" type="{http://www.isban.es/webservices/TDCc}ENTORNO_CONSOLIDAC_FINAN_Type"/>
 *         &lt;element name="TIPO_TRATAMIENTO_CON_FINA" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *         &lt;element name="FECHA_ALTA" type="{http://www.isban.es/webservices/TDCs}FECHA_ALTA_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRATAMIENTO_CONSO_FIN_Type", propOrder = {
    "entornoconsolidacfinan",
    "tipotratamientoconfina",
    "fechaalta"
})
public class TRATAMIENTOCONSOFINType {

    @XmlElement(name = "ENTORNO_CONSOLIDAC_FINAN", required = true)
    protected ENTORNOCONSOLIDACFINANType entornoconsolidacfinan;
    @XmlElement(name = "TIPO_TRATAMIENTO_CON_FINA", required = true)
    protected String tipotratamientoconfina;
    @XmlElement(name = "FECHA_ALTA", required = true)
    protected XMLGregorianCalendar fechaalta;

    /**
     * Gets the value of the entornoconsolidacfinan property.
     * 
     * @return
     *     possible object is
     *     {@link ENTORNOCONSOLIDACFINANType }
     *     
     */
    public ENTORNOCONSOLIDACFINANType getENTORNOCONSOLIDACFINAN() {
        return entornoconsolidacfinan;
    }

    /**
     * Sets the value of the entornoconsolidacfinan property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENTORNOCONSOLIDACFINANType }
     *     
     */
    public void setENTORNOCONSOLIDACFINAN(ENTORNOCONSOLIDACFINANType value) {
        this.entornoconsolidacfinan = value;
    }

    /**
     * Gets the value of the tipotratamientoconfina property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOTRATAMIENTOCONFINA() {
        return tipotratamientoconfina;
    }

    /**
     * Sets the value of the tipotratamientoconfina property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOTRATAMIENTOCONFINA(String value) {
        this.tipotratamientoconfina = value;
    }

    /**
     * Gets the value of the fechaalta property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFECHAALTA() {
        return fechaalta;
    }

    /**
     * Sets the value of the fechaalta property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFECHAALTA(XMLGregorianCalendar value) {
        this.fechaalta = value;
    }

}
