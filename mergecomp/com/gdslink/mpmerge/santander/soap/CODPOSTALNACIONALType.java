
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COD_POSTAL_NACIONAL_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COD_POSTAL_NACIONAL_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PROVINCIA" type="{http://www.isban.es/webservices/TDCs}CODIGO_PROVINCIA_Type"/>
 *         &lt;element name="IND_CAPITAL_DE_PROVINCIA" type="{http://www.isban.es/webservices/TDCs}IND_DE_CAPITAL_DE_PROVIN_Type"/>
 *         &lt;element name="DISTRITO_POSTAL" type="{http://www.isban.es/webservices/TDCs}DISTRITO_POSTAL_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COD_POSTAL_NACIONAL_Type", propOrder = {
    "provincia",
    "indcapitaldeprovincia",
    "distritopostal"
})
public class CODPOSTALNACIONALType {

    @XmlElement(name = "PROVINCIA", required = true)
    protected String provincia;
    @XmlElement(name = "IND_CAPITAL_DE_PROVINCIA", required = true)
    protected String indcapitaldeprovincia;
    @XmlElement(name = "DISTRITO_POSTAL", required = true)
    protected String distritopostal;

    /**
     * Gets the value of the provincia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVINCIA() {
        return provincia;
    }

    /**
     * Sets the value of the provincia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVINCIA(String value) {
        this.provincia = value;
    }

    /**
     * Gets the value of the indcapitaldeprovincia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDCAPITALDEPROVINCIA() {
        return indcapitaldeprovincia;
    }

    /**
     * Sets the value of the indcapitaldeprovincia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDCAPITALDEPROVINCIA(String value) {
        this.indcapitaldeprovincia = value;
    }

    /**
     * Gets the value of the distritopostal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISTRITOPOSTAL() {
        return distritopostal;
    }

    /**
     * Sets the value of the distritopostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISTRITOPOSTAL(String value) {
        this.distritopostal = value;
    }

}
