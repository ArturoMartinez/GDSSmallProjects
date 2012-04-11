
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCPB_CONCEPTO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCPB_CONCEPTO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODCON_PBC" type="{http://www.isban.es/webservices/TDCs}GCPB_PREGCONCEP_Type"/>
 *         &lt;element name="CODVAL_PBC" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCPB_CONCEPTO_Type", propOrder = {
    "codconpbc",
    "codvalpbc"
})
public class GCPBCONCEPTOType {

    @XmlElement(name = "CODCON_PBC", required = true)
    protected String codconpbc;
    @XmlElement(name = "CODVAL_PBC", required = true)
    protected String codvalpbc;

    /**
     * Gets the value of the codconpbc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODCONPBC() {
        return codconpbc;
    }

    /**
     * Sets the value of the codconpbc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODCONPBC(String value) {
        this.codconpbc = value;
    }

    /**
     * Gets the value of the codvalpbc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODVALPBC() {
        return codvalpbc;
    }

    /**
     * Sets the value of the codvalpbc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODVALPBC(String value) {
        this.codvalpbc = value;
    }

}
