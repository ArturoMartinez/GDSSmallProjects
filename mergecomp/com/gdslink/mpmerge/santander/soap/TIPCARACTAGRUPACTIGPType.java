
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TIP_CARACT_AGRUP_ACTI_GP_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIP_CARACT_AGRUP_ACTI_GP_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_DE_ACTIVO" type="{http://www.isban.es/webservices/TDCs}TIPO_ACTIVO_VALORES_Type"/>
 *         &lt;element name="TIPO_DE_CARACTERISTICA" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIP_CARACT_AGRUP_ACTI_GP_Type", propOrder = {
    "tipodeactivo",
    "tipodecaracteristica"
})
public class TIPCARACTAGRUPACTIGPType {

    @XmlElement(name = "TIPO_DE_ACTIVO", required = true)
    protected String tipodeactivo;
    @XmlElement(name = "TIPO_DE_CARACTERISTICA", required = true)
    protected String tipodecaracteristica;

    /**
     * Gets the value of the tipodeactivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODEACTIVO() {
        return tipodeactivo;
    }

    /**
     * Sets the value of the tipodeactivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODEACTIVO(String value) {
        this.tipodeactivo = value;
    }

    /**
     * Gets the value of the tipodecaracteristica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODECARACTERISTICA() {
        return tipodecaracteristica;
    }

    /**
     * Sets the value of the tipodecaracteristica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODECARACTERISTICA(String value) {
        this.tipodecaracteristica = value;
    }

}
