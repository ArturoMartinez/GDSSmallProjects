
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COMPT_BASICOS_2_BR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COMPT_BASICOS_2_BR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PECANVEN" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_3_Type"/>
 *         &lt;element name="PECANCAP" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_3_Type"/>
 *         &lt;element name="PEPAIORI" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_3_Type"/>
 *         &lt;element name="PECODCAM" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COMPT_BASICOS_2_BR_Type", propOrder = {
    "pecanven",
    "pecancap",
    "pepaiori",
    "pecodcam"
})
public class COMPTBASICOS2BRType {

    @XmlElement(name = "PECANVEN", required = true)
    protected String pecanven;
    @XmlElement(name = "PECANCAP", required = true)
    protected String pecancap;
    @XmlElement(name = "PEPAIORI", required = true)
    protected String pepaiori;
    @XmlElement(name = "PECODCAM", required = true)
    protected String pecodcam;

    /**
     * Gets the value of the pecanven property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPECANVEN() {
        return pecanven;
    }

    /**
     * Sets the value of the pecanven property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPECANVEN(String value) {
        this.pecanven = value;
    }

    /**
     * Gets the value of the pecancap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPECANCAP() {
        return pecancap;
    }

    /**
     * Sets the value of the pecancap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPECANCAP(String value) {
        this.pecancap = value;
    }

    /**
     * Gets the value of the pepaiori property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPEPAIORI() {
        return pepaiori;
    }

    /**
     * Sets the value of the pepaiori property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPEPAIORI(String value) {
        this.pepaiori = value;
    }

    /**
     * Gets the value of the pecodcam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPECODCAM() {
        return pecodcam;
    }

    /**
     * Sets the value of the pecodcam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPECODCAM(String value) {
        this.pecodcam = value;
    }

}
