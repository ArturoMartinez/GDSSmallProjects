
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GARANTIA_REC_INTMED_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GARANTIA_REC_INTMED_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RECIBO_INTMED" type="{http://www.isban.es/webservices/TDCs}RECIBO_INTMED_Type"/>
 *         &lt;element name="ID_GARANTIA_INTMED" type="{http://www.isban.es/webservices/TDCs}ID_GARANTIA_INTMED_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GARANTIA_REC_INTMED_Type", propOrder = {
    "recibointmed",
    "idgarantiaintmed"
})
public class GARANTIARECINTMEDType {

    @XmlElement(name = "RECIBO_INTMED", required = true)
    protected String recibointmed;
    @XmlElement(name = "ID_GARANTIA_INTMED", required = true)
    protected String idgarantiaintmed;

    /**
     * Gets the value of the recibointmed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECIBOINTMED() {
        return recibointmed;
    }

    /**
     * Sets the value of the recibointmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECIBOINTMED(String value) {
        this.recibointmed = value;
    }

    /**
     * Gets the value of the idgarantiaintmed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDGARANTIAINTMED() {
        return idgarantiaintmed;
    }

    /**
     * Sets the value of the idgarantiaintmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDGARANTIAINTMED(String value) {
        this.idgarantiaintmed = value;
    }

}
