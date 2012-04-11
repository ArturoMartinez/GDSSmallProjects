
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ASUNTO_CIC_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ASUNTO_CIC_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CONVERSACION_CIC" type="{http://www.isban.es/webservices/TDCc}CONVERSACION_CIC_Type"/>
 *         &lt;element name="CODIGO_ASUNTO_CIC" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ASUNTO_CIC_Type", propOrder = {
    "conversacioncic",
    "codigoasuntocic"
})
public class ASUNTOCICType {

    @XmlElement(name = "CONVERSACION_CIC", required = true)
    protected CONVERSACIONCICType conversacioncic;
    @XmlElement(name = "CODIGO_ASUNTO_CIC", required = true)
    protected String codigoasuntocic;

    /**
     * Gets the value of the conversacioncic property.
     * 
     * @return
     *     possible object is
     *     {@link CONVERSACIONCICType }
     *     
     */
    public CONVERSACIONCICType getCONVERSACIONCIC() {
        return conversacioncic;
    }

    /**
     * Sets the value of the conversacioncic property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONVERSACIONCICType }
     *     
     */
    public void setCONVERSACIONCIC(CONVERSACIONCICType value) {
        this.conversacioncic = value;
    }

    /**
     * Gets the value of the codigoasuntocic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOASUNTOCIC() {
        return codigoasuntocic;
    }

    /**
     * Sets the value of the codigoasuntocic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOASUNTOCIC(String value) {
        this.codigoasuntocic = value;
    }

}
