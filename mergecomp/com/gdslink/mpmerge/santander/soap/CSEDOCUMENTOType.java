
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CSE_DOCUMENTO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CSE_DOCUMENTO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PROCESO_DE_NEGOCIO" type="{http://www.isban.es/webservices/TDCc}PROCESO_DE_NEGOCIO_Type"/>
 *         &lt;element name="CODDCTO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CSE_DOCUMENTO_Type", propOrder = {
    "procesodenegocio",
    "coddcto"
})
public class CSEDOCUMENTOType {

    @XmlElement(name = "PROCESO_DE_NEGOCIO", required = true)
    protected PROCESODENEGOCIOType procesodenegocio;
    @XmlElement(name = "CODDCTO", required = true)
    protected String coddcto;

    /**
     * Gets the value of the procesodenegocio property.
     * 
     * @return
     *     possible object is
     *     {@link PROCESODENEGOCIOType }
     *     
     */
    public PROCESODENEGOCIOType getPROCESODENEGOCIO() {
        return procesodenegocio;
    }

    /**
     * Sets the value of the procesodenegocio property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROCESODENEGOCIOType }
     *     
     */
    public void setPROCESODENEGOCIO(PROCESODENEGOCIOType value) {
        this.procesodenegocio = value;
    }

    /**
     * Gets the value of the coddcto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODDCTO() {
        return coddcto;
    }

    /**
     * Sets the value of the coddcto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODDCTO(String value) {
        this.coddcto = value;
    }

}
