
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COB_CASO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COB_CASO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CENTRO" type="{http://www.isban.es/webservices/TDCc}CENTRO_Type"/>
 *         &lt;element name="COD_CASO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_10_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COB_CASO_Type", propOrder = {
    "centro",
    "codcaso"
})
public class COBCASOType {

    @XmlElement(name = "CENTRO", required = true)
    protected CENTROType centro;
    @XmlElement(name = "COD_CASO", required = true)
    protected String codcaso;

    /**
     * Gets the value of the centro property.
     * 
     * @return
     *     possible object is
     *     {@link CENTROType }
     *     
     */
    public CENTROType getCENTRO() {
        return centro;
    }

    /**
     * Sets the value of the centro property.
     * 
     * @param value
     *     allowed object is
     *     {@link CENTROType }
     *     
     */
    public void setCENTRO(CENTROType value) {
        this.centro = value;
    }

    /**
     * Gets the value of the codcaso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODCASO() {
        return codcaso;
    }

    /**
     * Sets the value of the codcaso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODCASO(String value) {
        this.codcaso = value;
    }

}
