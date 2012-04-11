
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PLANTILLA_EEFF_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PLANTILLA_EEFF_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODPLAN_EEFF" type="{http://www.isban.es/webservices/TDCc}PLAN_CONTABLE_EEFF_Type"/>
 *         &lt;element name="CODMOD_EEFF" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *         &lt;element name="CODPLANTILLA_EEFF" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PLANTILLA_EEFF_Type", propOrder = {
    "codplaneeff",
    "codmodeeff",
    "codplantillaeeff"
})
public class PLANTILLAEEFFType {

    @XmlElement(name = "CODPLAN_EEFF", required = true)
    protected PLANCONTABLEEEFFType codplaneeff;
    @XmlElement(name = "CODMOD_EEFF", required = true)
    protected String codmodeeff;
    @XmlElement(name = "CODPLANTILLA_EEFF", required = true)
    protected String codplantillaeeff;

    /**
     * Gets the value of the codplaneeff property.
     * 
     * @return
     *     possible object is
     *     {@link PLANCONTABLEEEFFType }
     *     
     */
    public PLANCONTABLEEEFFType getCODPLANEEFF() {
        return codplaneeff;
    }

    /**
     * Sets the value of the codplaneeff property.
     * 
     * @param value
     *     allowed object is
     *     {@link PLANCONTABLEEEFFType }
     *     
     */
    public void setCODPLANEEFF(PLANCONTABLEEEFFType value) {
        this.codplaneeff = value;
    }

    /**
     * Gets the value of the codmodeeff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODMODEEFF() {
        return codmodeeff;
    }

    /**
     * Sets the value of the codmodeeff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODMODEEFF(String value) {
        this.codmodeeff = value;
    }

    /**
     * Gets the value of the codplantillaeeff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODPLANTILLAEEFF() {
        return codplantillaeeff;
    }

    /**
     * Sets the value of the codplantillaeeff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODPLANTILLAEEFF(String value) {
        this.codplantillaeeff = value;
    }

}
