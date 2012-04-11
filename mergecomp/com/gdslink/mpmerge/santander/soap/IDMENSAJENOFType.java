
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ID_MENSAJE_NOF_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ID_MENSAJE_NOF_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GRUPO_COMUNICACION_NOF" type="{http://www.isban.es/webservices/TDCc}GRUPO_COMUNICACION_NOF_Type"/>
 *         &lt;element name="COD_MENSAJE_NOF" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ID_MENSAJE_NOF_Type", propOrder = {
    "grupocomunicacionnof",
    "codmensajenof"
})
public class IDMENSAJENOFType {

    @XmlElement(name = "GRUPO_COMUNICACION_NOF", required = true)
    protected GRUPOCOMUNICACIONNOFType grupocomunicacionnof;
    @XmlElement(name = "COD_MENSAJE_NOF", required = true)
    protected String codmensajenof;

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
     * Gets the value of the codmensajenof property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODMENSAJENOF() {
        return codmensajenof;
    }

    /**
     * Sets the value of the codmensajenof property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODMENSAJENOF(String value) {
        this.codmensajenof = value;
    }

}
