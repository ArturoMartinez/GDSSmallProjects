
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RECIBO_FABRICA_INTMED_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RECIBO_FABRICA_INTMED_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_FABRICA_INTMED" type="{http://www.isban.es/webservices/TDCs}ID_FABRICA_INTMED_Type"/>
 *         &lt;element name="NUM_RECIBO_FAB_INTMED" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_20_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RECIBO_FABRICA_INTMED_Type", propOrder = {
    "idfabricaintmed",
    "numrecibofabintmed"
})
public class RECIBOFABRICAINTMEDType {

    @XmlElement(name = "ID_FABRICA_INTMED", required = true)
    protected String idfabricaintmed;
    @XmlElement(name = "NUM_RECIBO_FAB_INTMED", required = true)
    protected String numrecibofabintmed;

    /**
     * Gets the value of the idfabricaintmed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDFABRICAINTMED() {
        return idfabricaintmed;
    }

    /**
     * Sets the value of the idfabricaintmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDFABRICAINTMED(String value) {
        this.idfabricaintmed = value;
    }

    /**
     * Gets the value of the numrecibofabintmed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMRECIBOFABINTMED() {
        return numrecibofabintmed;
    }

    /**
     * Sets the value of the numrecibofabintmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMRECIBOFABINTMED(String value) {
        this.numrecibofabintmed = value;
    }

}
