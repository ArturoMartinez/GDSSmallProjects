
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TIPO_COMITE_FEVE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIPO_COMITE_FEVE_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_REVISION_FEVE" type="{http://www.isban.es/webservices/TDCc}TIPO_REVISION_FEVE_Type"/>
 *         &lt;element name="COD_COMITE_FEVE" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIPO_COMITE_FEVE_Type", propOrder = {
    "tiporevisionfeve",
    "codcomitefeve"
})
public class TIPOCOMITEFEVEType {

    @XmlElement(name = "TIPO_REVISION_FEVE", required = true)
    protected TIPOREVISIONFEVEType tiporevisionfeve;
    @XmlElement(name = "COD_COMITE_FEVE", required = true)
    protected String codcomitefeve;

    /**
     * Gets the value of the tiporevisionfeve property.
     * 
     * @return
     *     possible object is
     *     {@link TIPOREVISIONFEVEType }
     *     
     */
    public TIPOREVISIONFEVEType getTIPOREVISIONFEVE() {
        return tiporevisionfeve;
    }

    /**
     * Sets the value of the tiporevisionfeve property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIPOREVISIONFEVEType }
     *     
     */
    public void setTIPOREVISIONFEVE(TIPOREVISIONFEVEType value) {
        this.tiporevisionfeve = value;
    }

    /**
     * Gets the value of the codcomitefeve property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODCOMITEFEVE() {
        return codcomitefeve;
    }

    /**
     * Sets the value of the codcomitefeve property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODCOMITEFEVE(String value) {
        this.codcomitefeve = value;
    }

}
