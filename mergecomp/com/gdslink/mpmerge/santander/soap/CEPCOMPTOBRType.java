
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CEP_COMPTO_BR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CEP_COMPTO_BR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODIGO_ALFANUM_5" type="{http://www.isban.es/webservices/TDCs}NUM_CEP_BR_Type"/>
 *         &lt;element name="CODIGO_ALFANUM_3" type="{http://www.isban.es/webservices/TDCs}COMPLEMENTO_CEP_BR_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CEP_COMPTO_BR_Type", propOrder = {
    "codigoalfanum5",
    "codigoalfanum3"
})
public class CEPCOMPTOBRType {

    @XmlElement(name = "CODIGO_ALFANUM_5", required = true)
    protected String codigoalfanum5;
    @XmlElement(name = "CODIGO_ALFANUM_3", required = true)
    protected String codigoalfanum3;

    /**
     * Gets the value of the codigoalfanum5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOALFANUM5() {
        return codigoalfanum5;
    }

    /**
     * Sets the value of the codigoalfanum5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOALFANUM5(String value) {
        this.codigoalfanum5 = value;
    }

    /**
     * Gets the value of the codigoalfanum3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOALFANUM3() {
        return codigoalfanum3;
    }

    /**
     * Sets the value of the codigoalfanum3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOALFANUM3(String value) {
        this.codigoalfanum3 = value;
    }

}
