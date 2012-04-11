
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IDIOMA_CORPORATIVO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IDIOMA_CORPORATIVO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDIOMA_ISO" type="{http://www.isban.es/webservices/TDCs}IDIOMA_ISO_Type"/>
 *         &lt;element name="DIALECTO_ISO" type="{http://www.isban.es/webservices/TDCs}DIALECTO_ISO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IDIOMA_CORPORATIVO_Type", propOrder = {
    "idiomaiso",
    "dialectoiso"
})
public class IDIOMACORPORATIVOType {

    @XmlElement(name = "IDIOMA_ISO", required = true)
    protected String idiomaiso;
    @XmlElement(name = "DIALECTO_ISO", required = true)
    protected String dialectoiso;

    /**
     * Gets the value of the idiomaiso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDIOMAISO() {
        return idiomaiso;
    }

    /**
     * Sets the value of the idiomaiso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDIOMAISO(String value) {
        this.idiomaiso = value;
    }

    /**
     * Gets the value of the dialectoiso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIALECTOISO() {
        return dialectoiso;
    }

    /**
     * Sets the value of the dialectoiso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIALECTOISO(String value) {
        this.dialectoiso = value;
    }

}
