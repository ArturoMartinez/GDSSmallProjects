
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AREAPG5_BR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AREAPG5_BR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODLINX" type="{http://www.isban.es/webservices/TDCs}CODIGO_LINX_BR_Type"/>
 *         &lt;element name="OBSLINX" type="{http://www.isban.es/webservices/TDCs}STRING_30_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AREAPG5_BR_Type", propOrder = {
    "codlinx",
    "obslinx"
})
public class AREAPG5BRType {

    @XmlElement(name = "CODLINX", required = true)
    protected String codlinx;
    @XmlElement(name = "OBSLINX", required = true)
    protected String obslinx;

    /**
     * Gets the value of the codlinx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODLINX() {
        return codlinx;
    }

    /**
     * Sets the value of the codlinx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODLINX(String value) {
        this.codlinx = value;
    }

    /**
     * Gets the value of the obslinx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBSLINX() {
        return obslinx;
    }

    /**
     * Sets the value of the obslinx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBSLINX(String value) {
        this.obslinx = value;
    }

}
