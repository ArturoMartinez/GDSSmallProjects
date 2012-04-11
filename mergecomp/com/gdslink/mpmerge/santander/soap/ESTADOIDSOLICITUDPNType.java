
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ESTADO_ID_SOLICITUD_PN_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ESTADO_ID_SOLICITUD_PN_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PROCESO_DE_NEGOCIO" type="{http://www.isban.es/webservices/TDCc}PROCESO_DE_NEGOCIO_Type"/>
 *         &lt;element name="ESTADO_PN" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ESTADO_ID_SOLICITUD_PN_Type", propOrder = {
    "procesodenegocio",
    "estadopn"
})
public class ESTADOIDSOLICITUDPNType {

    @XmlElement(name = "PROCESO_DE_NEGOCIO", required = true)
    protected PROCESODENEGOCIOType procesodenegocio;
    @XmlElement(name = "ESTADO_PN", required = true)
    protected String estadopn;

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
     * Gets the value of the estadopn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESTADOPN() {
        return estadopn;
    }

    /**
     * Sets the value of the estadopn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESTADOPN(String value) {
        this.estadopn = value;
    }

}
