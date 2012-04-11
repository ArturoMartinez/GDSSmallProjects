
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DOCUMENTO_DISPUTA_CC_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DOCUMENTO_DISPUTA_CC_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DISPUTA_CC" type="{http://www.isban.es/webservices/TDCc}DISPUTA_CC_Type"/>
 *         &lt;element name="NUM_DOCUMENTO_CC" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUM_5_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DOCUMENTO_DISPUTA_CC_Type", propOrder = {
    "disputacc",
    "numdocumentocc"
})
public class DOCUMENTODISPUTACCType {

    @XmlElement(name = "DISPUTA_CC", required = true)
    protected DISPUTACCType disputacc;
    @XmlElement(name = "NUM_DOCUMENTO_CC", required = true)
    protected String numdocumentocc;

    /**
     * Gets the value of the disputacc property.
     * 
     * @return
     *     possible object is
     *     {@link DISPUTACCType }
     *     
     */
    public DISPUTACCType getDISPUTACC() {
        return disputacc;
    }

    /**
     * Sets the value of the disputacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DISPUTACCType }
     *     
     */
    public void setDISPUTACC(DISPUTACCType value) {
        this.disputacc = value;
    }

    /**
     * Gets the value of the numdocumentocc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMDOCUMENTOCC() {
        return numdocumentocc;
    }

    /**
     * Sets the value of the numdocumentocc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMDOCUMENTOCC(String value) {
        this.numdocumentocc = value;
    }

}
