
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TIPO_RELACION_NOF_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIPO_RELACION_NOF_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GRUPO_COMUNICACION_NOF" type="{http://www.isban.es/webservices/TDCc}GRUPO_COMUNICACION_NOF_Type"/>
 *         &lt;element name="COD_RELACION" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIPO_RELACION_NOF_Type", propOrder = {
    "grupocomunicacionnof",
    "codrelacion"
})
public class TIPORELACIONNOFType {

    @XmlElement(name = "GRUPO_COMUNICACION_NOF", required = true)
    protected GRUPOCOMUNICACIONNOFType grupocomunicacionnof;
    @XmlElement(name = "COD_RELACION", required = true)
    protected String codrelacion;

    /**
     * Gets the value of the grupocomunicacionnof property.
     * 
     * @return
     *     possible object is
     *     {@link GRUPOCOMUNICACIONNOFType }
     *     
     */
    public GRUPOCOMUNICACIONNOFType getGRUPOCOMUNICACIONNOF() {
        return grupocomunicacionnof;
    }

    /**
     * Sets the value of the grupocomunicacionnof property.
     * 
     * @param value
     *     allowed object is
     *     {@link GRUPOCOMUNICACIONNOFType }
     *     
     */
    public void setGRUPOCOMUNICACIONNOF(GRUPOCOMUNICACIONNOFType value) {
        this.grupocomunicacionnof = value;
    }

    /**
     * Gets the value of the codrelacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODRELACION() {
        return codrelacion;
    }

    /**
     * Sets the value of the codrelacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODRELACION(String value) {
        this.codrelacion = value;
    }

}
