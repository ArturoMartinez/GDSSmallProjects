
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GRUPO_COMUNICACION_NOF_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GRUPO_COMUNICACION_NOF_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SISTEMA_COMUNICACION_NOF" type="{http://www.isban.es/webservices/TDCs}SISTEMA_COMUNICACION_NOF_Type"/>
 *         &lt;element name="COD_GRUPO_COMUNIC_NOF" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GRUPO_COMUNICACION_NOF_Type", propOrder = {
    "sistemacomunicacionnof",
    "codgrupocomunicnof"
})
public class GRUPOCOMUNICACIONNOFType {

    @XmlElement(name = "SISTEMA_COMUNICACION_NOF", required = true)
    protected String sistemacomunicacionnof;
    @XmlElement(name = "COD_GRUPO_COMUNIC_NOF", required = true)
    protected String codgrupocomunicnof;

    /**
     * Gets the value of the sistemacomunicacionnof property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSISTEMACOMUNICACIONNOF() {
        return sistemacomunicacionnof;
    }

    /**
     * Sets the value of the sistemacomunicacionnof property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSISTEMACOMUNICACIONNOF(String value) {
        this.sistemacomunicacionnof = value;
    }

    /**
     * Gets the value of the codgrupocomunicnof property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODGRUPOCOMUNICNOF() {
        return codgrupocomunicnof;
    }

    /**
     * Sets the value of the codgrupocomunicnof property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODGRUPOCOMUNICNOF(String value) {
        this.codgrupocomunicnof = value;
    }

}
