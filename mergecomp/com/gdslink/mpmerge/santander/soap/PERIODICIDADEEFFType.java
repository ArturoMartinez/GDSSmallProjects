
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PERIODICIDAD_EEFF_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PERIODICIDAD_EEFF_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA_EEFF" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="CODPERIOD_EEFF" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PERIODICIDAD_EEFF_Type", propOrder = {
    "empresaeeff",
    "codperiodeeff"
})
public class PERIODICIDADEEFFType {

    @XmlElement(name = "EMPRESA_EEFF", required = true)
    protected String empresaeeff;
    @XmlElement(name = "CODPERIOD_EEFF")
    protected int codperiodeeff;

    /**
     * Gets the value of the empresaeeff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPRESAEEFF() {
        return empresaeeff;
    }

    /**
     * Sets the value of the empresaeeff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPRESAEEFF(String value) {
        this.empresaeeff = value;
    }

    /**
     * Gets the value of the codperiodeeff property.
     * 
     */
    public int getCODPERIODEEFF() {
        return codperiodeeff;
    }

    /**
     * Sets the value of the codperiodeeff property.
     * 
     */
    public void setCODPERIODEEFF(int value) {
        this.codperiodeeff = value;
    }

}
