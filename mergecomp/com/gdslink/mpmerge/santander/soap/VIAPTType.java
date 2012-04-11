
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VIA_PT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VIA_PT_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FREGUESIA_PT" type="{http://www.isban.es/webservices/TDCc}FREGUESIA_PT_Type"/>
 *         &lt;element name="LOCALIDAD_PT" type="{http://www.isban.es/webservices/TDCs}LOCALIDAD_PT_Type"/>
 *         &lt;element name="COD_VIA_PT" type="{http://www.isban.es/webservices/TDCs}CODIGO_VIA_PT_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VIA_PT_Type", propOrder = {
    "freguesiapt",
    "localidadpt",
    "codviapt"
})
public class VIAPTType {

    @XmlElement(name = "FREGUESIA_PT", required = true)
    protected FREGUESIAPTType freguesiapt;
    @XmlElement(name = "LOCALIDAD_PT", required = true)
    protected String localidadpt;
    @XmlElement(name = "COD_VIA_PT", required = true)
    protected String codviapt;

    /**
     * Gets the value of the freguesiapt property.
     * 
     * @return
     *     possible object is
     *     {@link FREGUESIAPTType }
     *     
     */
    public FREGUESIAPTType getFREGUESIAPT() {
        return freguesiapt;
    }

    /**
     * Sets the value of the freguesiapt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FREGUESIAPTType }
     *     
     */
    public void setFREGUESIAPT(FREGUESIAPTType value) {
        this.freguesiapt = value;
    }

    /**
     * Gets the value of the localidadpt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCALIDADPT() {
        return localidadpt;
    }

    /**
     * Sets the value of the localidadpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCALIDADPT(String value) {
        this.localidadpt = value;
    }

    /**
     * Gets the value of the codviapt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODVIAPT() {
        return codviapt;
    }

    /**
     * Sets the value of the codviapt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODVIAPT(String value) {
        this.codviapt = value;
    }

}
