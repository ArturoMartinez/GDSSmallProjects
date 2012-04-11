
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NUM_POLIZA_DISTR_INTMED_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NUM_POLIZA_DISTR_INTMED_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_DISTRIBUIDOR_INTMED" type="{http://www.isban.es/webservices/TDCs}ID_DISTRIBUIDOR_INTMED_Type"/>
 *         &lt;element name="NUM_POLIZA_DISTRIBUCION" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_20_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NUM_POLIZA_DISTR_INTMED_Type", propOrder = {
    "iddistribuidorintmed",
    "numpolizadistribucion"
})
public class NUMPOLIZADISTRINTMEDType {

    @XmlElement(name = "ID_DISTRIBUIDOR_INTMED", required = true)
    protected String iddistribuidorintmed;
    @XmlElement(name = "NUM_POLIZA_DISTRIBUCION", required = true)
    protected String numpolizadistribucion;

    /**
     * Gets the value of the iddistribuidorintmed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDDISTRIBUIDORINTMED() {
        return iddistribuidorintmed;
    }

    /**
     * Sets the value of the iddistribuidorintmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDDISTRIBUIDORINTMED(String value) {
        this.iddistribuidorintmed = value;
    }

    /**
     * Gets the value of the numpolizadistribucion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMPOLIZADISTRIBUCION() {
        return numpolizadistribucion;
    }

    /**
     * Sets the value of the numpolizadistribucion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMPOLIZADISTRIBUCION(String value) {
        this.numpolizadistribucion = value;
    }

}
