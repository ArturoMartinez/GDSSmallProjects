
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RECIBO_DISTRIB_INTMED_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RECIBO_DISTRIB_INTMED_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_DISTRIBUIDOR_INTMED" type="{http://www.isban.es/webservices/TDCs}ID_DISTRIBUIDOR_INTMED_Type"/>
 *         &lt;element name="NUM_RECIBO_DIST_INTMED" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_20_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RECIBO_DISTRIB_INTMED_Type", propOrder = {
    "iddistribuidorintmed",
    "numrecibodistintmed"
})
public class RECIBODISTRIBINTMEDType {

    @XmlElement(name = "ID_DISTRIBUIDOR_INTMED", required = true)
    protected String iddistribuidorintmed;
    @XmlElement(name = "NUM_RECIBO_DIST_INTMED", required = true)
    protected String numrecibodistintmed;

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
     * Gets the value of the numrecibodistintmed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMRECIBODISTINTMED() {
        return numrecibodistintmed;
    }

    /**
     * Sets the value of the numrecibodistintmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMRECIBODISTINTMED(String value) {
        this.numrecibodistintmed = value;
    }

}
