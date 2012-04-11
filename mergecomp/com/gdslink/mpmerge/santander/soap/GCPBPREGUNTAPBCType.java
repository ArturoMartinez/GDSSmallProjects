
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCPB_PREGUNTAPBC_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCPB_PREGUNTAPBC_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PREG_PBC" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_5_Type"/>
 *         &lt;element name="SISDAT_PBC" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCPB_PREGUNTAPBC_Type", propOrder = {
    "pregpbc",
    "sisdatpbc"
})
public class GCPBPREGUNTAPBCType {

    @XmlElement(name = "PREG_PBC", required = true)
    protected String pregpbc;
    @XmlElement(name = "SISDAT_PBC", required = true)
    protected String sisdatpbc;

    /**
     * Gets the value of the pregpbc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPREGPBC() {
        return pregpbc;
    }

    /**
     * Sets the value of the pregpbc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPREGPBC(String value) {
        this.pregpbc = value;
    }

    /**
     * Gets the value of the sisdatpbc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSISDATPBC() {
        return sisdatpbc;
    }

    /**
     * Sets the value of the sisdatpbc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSISDATPBC(String value) {
        this.sisdatpbc = value;
    }

}
