
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SUBTIPO_EVIDENCIA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SUBTIPO_EVIDENCIA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA_CON_COD_NUM_4" type="{http://www.isban.es/webservices/TDCc}TIPO_EVIDENCIA_Type"/>
 *         &lt;element name="COD_NUM" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUM_4_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SUBTIPO_EVIDENCIA_Type", propOrder = {
    "empresaconcodnum4",
    "codnum"
})
public class SUBTIPOEVIDENCIAType {

    @XmlElement(name = "EMPRESA_CON_COD_NUM_4", required = true)
    protected TIPOEVIDENCIAType empresaconcodnum4;
    @XmlElement(name = "COD_NUM", required = true)
    protected String codnum;

    /**
     * Gets the value of the empresaconcodnum4 property.
     * 
     * @return
     *     possible object is
     *     {@link TIPOEVIDENCIAType }
     *     
     */
    public TIPOEVIDENCIAType getEMPRESACONCODNUM4() {
        return empresaconcodnum4;
    }

    /**
     * Sets the value of the empresaconcodnum4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIPOEVIDENCIAType }
     *     
     */
    public void setEMPRESACONCODNUM4(TIPOEVIDENCIAType value) {
        this.empresaconcodnum4 = value;
    }

    /**
     * Gets the value of the codnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODNUM() {
        return codnum;
    }

    /**
     * Sets the value of the codnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODNUM(String value) {
        this.codnum = value;
    }

}
