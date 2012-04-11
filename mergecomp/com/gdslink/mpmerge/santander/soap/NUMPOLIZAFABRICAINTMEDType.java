
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NUM_POLIZA_FABRICA_INTMED_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NUM_POLIZA_FABRICA_INTMED_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_FABRICA_INTMED" type="{http://www.isban.es/webservices/TDCs}ID_FABRICA_INTMED_Type"/>
 *         &lt;element name="NUMERO_POLIZA_FABRICA" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_20_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NUM_POLIZA_FABRICA_INTMED_Type", propOrder = {
    "idfabricaintmed",
    "numeropolizafabrica"
})
public class NUMPOLIZAFABRICAINTMEDType {

    @XmlElement(name = "ID_FABRICA_INTMED", required = true)
    protected String idfabricaintmed;
    @XmlElement(name = "NUMERO_POLIZA_FABRICA", required = true)
    protected String numeropolizafabrica;

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
     * Gets the value of the numeropolizafabrica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROPOLIZAFABRICA() {
        return numeropolizafabrica;
    }

    /**
     * Sets the value of the numeropolizafabrica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROPOLIZAFABRICA(String value) {
        this.numeropolizafabrica = value;
    }

}
