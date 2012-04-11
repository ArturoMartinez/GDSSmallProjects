
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CONCELHO_PT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CONCELHO_PT_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DISTRITO_PT" type="{http://www.isban.es/webservices/TDCs}DISTRITO_PT_Type"/>
 *         &lt;element name="COD_CONCELHO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONCELHO_PT_Type", propOrder = {
    "distritopt",
    "codconcelho"
})
public class CONCELHOPTType {

    @XmlElement(name = "DISTRITO_PT", required = true)
    protected String distritopt;
    @XmlElement(name = "COD_CONCELHO", required = true)
    protected String codconcelho;

    /**
     * Gets the value of the distritopt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISTRITOPT() {
        return distritopt;
    }

    /**
     * Sets the value of the distritopt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISTRITOPT(String value) {
        this.distritopt = value;
    }

    /**
     * Gets the value of the codconcelho property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODCONCELHO() {
        return codconcelho;
    }

    /**
     * Sets the value of the codconcelho property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODCONCELHO(String value) {
        this.codconcelho = value;
    }

}
