
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LEGISLAC_JERARQUIA_JUSNUE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LEGISLAC_JERARQUIA_JUSNUE_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODIGO_ALFANUM_2" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFA_2_Type"/>
 *         &lt;element name="CODIGO_ALFANUM_20" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_20_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LEGISLAC_JERARQUIA_JUSNUE_Type", propOrder = {
    "codigoalfanum2",
    "codigoalfanum20"
})
public class LEGISLACJERARQUIAJUSNUEType {

    @XmlElement(name = "CODIGO_ALFANUM_2", required = true)
    protected String codigoalfanum2;
    @XmlElement(name = "CODIGO_ALFANUM_20", required = true)
    protected String codigoalfanum20;

    /**
     * Gets the value of the codigoalfanum2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOALFANUM2() {
        return codigoalfanum2;
    }

    /**
     * Sets the value of the codigoalfanum2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOALFANUM2(String value) {
        this.codigoalfanum2 = value;
    }

    /**
     * Gets the value of the codigoalfanum20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOALFANUM20() {
        return codigoalfanum20;
    }

    /**
     * Sets the value of the codigoalfanum20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOALFANUM20(String value) {
        this.codigoalfanum20 = value;
    }

}
