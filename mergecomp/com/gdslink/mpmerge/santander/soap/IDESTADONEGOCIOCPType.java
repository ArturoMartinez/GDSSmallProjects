
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ID_ESTADO_NEGOCIO_CP_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ID_ESTADO_NEGOCIO_CP_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PROCESO_DE_NEGOCIO" type="{http://www.isban.es/webservices/TDCc}PROCESO_DE_NEGOCIO_Type"/>
 *         &lt;element name="COD_ESTADO_PN" type="{http://www.isban.es/webservices/TDCs}ESTADO_PN_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ID_ESTADO_NEGOCIO_CP_Type", propOrder = {
    "procesodenegocio",
    "codestadopn"
})
public class IDESTADONEGOCIOCPType {

    @XmlElement(name = "PROCESO_DE_NEGOCIO", required = true)
    protected PROCESODENEGOCIOType procesodenegocio;
    @XmlElement(name = "COD_ESTADO_PN", required = true)
    protected String codestadopn;

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
     * Gets the value of the codestadopn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODESTADOPN() {
        return codestadopn;
    }

    /**
     * Sets the value of the codestadopn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODESTADOPN(String value) {
        this.codestadopn = value;
    }

}
