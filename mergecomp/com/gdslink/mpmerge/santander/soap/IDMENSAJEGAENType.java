
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ID_MENSAJE_GAEN_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ID_MENSAJE_GAEN_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PROCESO_DE_NEGOCIO" type="{http://www.isban.es/webservices/TDCc}PROCESO_DE_NEGOCIO_Type"/>
 *         &lt;element name="COD_TIP_MENSAJE" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ID_MENSAJE_GAEN_Type", propOrder = {
    "procesodenegocio",
    "codtipmensaje"
})
public class IDMENSAJEGAENType {

    @XmlElement(name = "PROCESO_DE_NEGOCIO", required = true)
    protected PROCESODENEGOCIOType procesodenegocio;
    @XmlElement(name = "COD_TIP_MENSAJE", required = true)
    protected String codtipmensaje;

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
     * Gets the value of the codtipmensaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODTIPMENSAJE() {
        return codtipmensaje;
    }

    /**
     * Sets the value of the codtipmensaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODTIPMENSAJE(String value) {
        this.codtipmensaje = value;
    }

}
