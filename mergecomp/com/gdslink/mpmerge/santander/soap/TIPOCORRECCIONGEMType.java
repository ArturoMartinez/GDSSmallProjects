
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TIPO_CORRECCION_GEM_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIPO_CORRECCION_GEM_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OPERACION_GEM" type="{http://www.isban.es/webservices/TDCc}OPERACION_GEM_Type"/>
 *         &lt;element name="TIPO_DE_ELEMENTO" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_1_Type"/>
 *         &lt;element name="COD_TIPO_CORRECCION" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIPO_CORRECCION_GEM_Type", propOrder = {
    "operaciongem",
    "tipodeelemento",
    "codtipocorreccion"
})
public class TIPOCORRECCIONGEMType {

    @XmlElement(name = "OPERACION_GEM", required = true)
    protected OPERACIONGEMType operaciongem;
    @XmlElement(name = "TIPO_DE_ELEMENTO", required = true)
    protected String tipodeelemento;
    @XmlElement(name = "COD_TIPO_CORRECCION", required = true)
    protected String codtipocorreccion;

    /**
     * Gets the value of the operaciongem property.
     * 
     * @return
     *     possible object is
     *     {@link OPERACIONGEMType }
     *     
     */
    public OPERACIONGEMType getOPERACIONGEM() {
        return operaciongem;
    }

    /**
     * Sets the value of the operaciongem property.
     * 
     * @param value
     *     allowed object is
     *     {@link OPERACIONGEMType }
     *     
     */
    public void setOPERACIONGEM(OPERACIONGEMType value) {
        this.operaciongem = value;
    }

    /**
     * Gets the value of the tipodeelemento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODEELEMENTO() {
        return tipodeelemento;
    }

    /**
     * Sets the value of the tipodeelemento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODEELEMENTO(String value) {
        this.tipodeelemento = value;
    }

    /**
     * Gets the value of the codtipocorreccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODTIPOCORRECCION() {
        return codtipocorreccion;
    }

    /**
     * Sets the value of the codtipocorreccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODTIPOCORRECCION(String value) {
        this.codtipocorreccion = value;
    }

}
