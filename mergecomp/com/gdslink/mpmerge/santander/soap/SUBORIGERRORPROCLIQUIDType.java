
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SUBORIG_ERROR_PROC_LIQUID_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SUBORIG_ERROR_PROC_LIQUID_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ORIGEN_ERROR_PROC_LIQUID" type="{http://www.isban.es/webservices/TDCs}ORIGEN_ERROR_PROC_LIQUID_Type"/>
 *         &lt;element name="COD_SUBORIGEN" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SUBORIG_ERROR_PROC_LIQUID_Type", propOrder = {
    "origenerrorprocliquid",
    "codsuborigen"
})
public class SUBORIGERRORPROCLIQUIDType {

    @XmlElement(name = "ORIGEN_ERROR_PROC_LIQUID", required = true)
    protected String origenerrorprocliquid;
    @XmlElement(name = "COD_SUBORIGEN", required = true)
    protected String codsuborigen;

    /**
     * Gets the value of the origenerrorprocliquid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORIGENERRORPROCLIQUID() {
        return origenerrorprocliquid;
    }

    /**
     * Sets the value of the origenerrorprocliquid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORIGENERRORPROCLIQUID(String value) {
        this.origenerrorprocliquid = value;
    }

    /**
     * Gets the value of the codsuborigen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODSUBORIGEN() {
        return codsuborigen;
    }

    /**
     * Sets the value of the codsuborigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODSUBORIGEN(String value) {
        this.codsuborigen = value;
    }

}
