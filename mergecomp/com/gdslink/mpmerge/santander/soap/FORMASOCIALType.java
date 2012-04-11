
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FORMA_SOCIAL_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FORMA_SOCIAL_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PAIS" type="{http://www.isban.es/webservices/TDCs}PAIS_Type"/>
 *         &lt;element name="COD_FORMA_SOCIAL" type="{http://www.isban.es/webservices/TDCs}COD_FORMA_SOCIAL_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FORMA_SOCIAL_Type", propOrder = {
    "pais",
    "codformasocial"
})
public class FORMASOCIALType {

    @XmlElement(name = "PAIS", required = true)
    protected String pais;
    @XmlElement(name = "COD_FORMA_SOCIAL", required = true)
    protected String codformasocial;

    /**
     * Gets the value of the pais property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAIS() {
        return pais;
    }

    /**
     * Sets the value of the pais property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAIS(String value) {
        this.pais = value;
    }

    /**
     * Gets the value of the codformasocial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODFORMASOCIAL() {
        return codformasocial;
    }

    /**
     * Sets the value of the codformasocial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODFORMASOCIAL(String value) {
        this.codformasocial = value;
    }

}
