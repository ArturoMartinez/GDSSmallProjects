
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TIPO_DE_EVENTO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIPO_DE_EVENTO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CLASE_DE_EVENTO" type="{http://www.isban.es/webservices/TDCc}CLASE_DE_EVENTO_Type"/>
 *         &lt;element name="COD_TIPO_DE_EVENTO" type="{http://www.isban.es/webservices/TDCs}COD_TIPO_DE_EVENTO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIPO_DE_EVENTO_Type", propOrder = {
    "clasedeevento",
    "codtipodeevento"
})
public class TIPODEEVENTOType {

    @XmlElement(name = "CLASE_DE_EVENTO", required = true)
    protected CLASEDEEVENTOType clasedeevento;
    @XmlElement(name = "COD_TIPO_DE_EVENTO", required = true)
    protected String codtipodeevento;

    /**
     * Gets the value of the clasedeevento property.
     * 
     * @return
     *     possible object is
     *     {@link CLASEDEEVENTOType }
     *     
     */
    public CLASEDEEVENTOType getCLASEDEEVENTO() {
        return clasedeevento;
    }

    /**
     * Sets the value of the clasedeevento property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLASEDEEVENTOType }
     *     
     */
    public void setCLASEDEEVENTO(CLASEDEEVENTOType value) {
        this.clasedeevento = value;
    }

    /**
     * Gets the value of the codtipodeevento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODTIPODEEVENTO() {
        return codtipodeevento;
    }

    /**
     * Sets the value of the codtipodeevento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODTIPODEEVENTO(String value) {
        this.codtipodeevento = value;
    }

}
