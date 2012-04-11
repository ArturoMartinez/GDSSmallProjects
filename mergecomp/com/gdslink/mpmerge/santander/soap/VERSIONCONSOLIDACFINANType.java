
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VERSION_CONSOLIDAC_FINAN_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VERSION_CONSOLIDAC_FINAN_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PERIODO_CONSOLIDAC" type="{http://www.isban.es/webservices/TDCc}PERIODO_CONSOLIDAC_FINAN_Type"/>
 *         &lt;element name="PERIMETRO" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_6_Type"/>
 *         &lt;element name="ID_VERSION" type="{http://www.isban.es/webservices/TDCs}ORDEN_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VERSION_CONSOLIDAC_FINAN_Type", propOrder = {
    "periodoconsolidac",
    "perimetro",
    "idversion"
})
public class VERSIONCONSOLIDACFINANType {

    @XmlElement(name = "PERIODO_CONSOLIDAC", required = true)
    protected PERIODOCONSOLIDACFINANType periodoconsolidac;
    @XmlElement(name = "PERIMETRO", required = true)
    protected String perimetro;
    @XmlElement(name = "ID_VERSION")
    protected int idversion;

    /**
     * Gets the value of the periodoconsolidac property.
     * 
     * @return
     *     possible object is
     *     {@link PERIODOCONSOLIDACFINANType }
     *     
     */
    public PERIODOCONSOLIDACFINANType getPERIODOCONSOLIDAC() {
        return periodoconsolidac;
    }

    /**
     * Sets the value of the periodoconsolidac property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERIODOCONSOLIDACFINANType }
     *     
     */
    public void setPERIODOCONSOLIDAC(PERIODOCONSOLIDACFINANType value) {
        this.periodoconsolidac = value;
    }

    /**
     * Gets the value of the perimetro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERIMETRO() {
        return perimetro;
    }

    /**
     * Sets the value of the perimetro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERIMETRO(String value) {
        this.perimetro = value;
    }

    /**
     * Gets the value of the idversion property.
     * 
     */
    public int getIDVERSION() {
        return idversion;
    }

    /**
     * Sets the value of the idversion property.
     * 
     */
    public void setIDVERSION(int value) {
        this.idversion = value;
    }

}
