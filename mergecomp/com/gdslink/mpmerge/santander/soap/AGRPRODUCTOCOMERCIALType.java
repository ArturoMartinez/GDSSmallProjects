
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AGR_PRODUCTO_COMERCIAL_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AGR_PRODUCTO_COMERCIAL_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PRODUCTO_COMERCIAL" type="{http://www.isban.es/webservices/TDCc}PRODUCTO_COMERCIAL_Type"/>
 *         &lt;element name="AGR_PRODUCTO_COMERCIAL" type="{http://www.isban.es/webservices/TDCs}COD_PRODUCTO_COMERCIAL_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AGR_PRODUCTO_COMERCIAL_Type", propOrder = {
    "productocomercial",
    "agrproductocomercial"
})
public class AGRPRODUCTOCOMERCIALType {

    @XmlElement(name = "PRODUCTO_COMERCIAL", required = true)
    protected PRODUCTOCOMERCIALType productocomercial;
    @XmlElement(name = "AGR_PRODUCTO_COMERCIAL", required = true)
    protected String agrproductocomercial;

    /**
     * Gets the value of the productocomercial property.
     * 
     * @return
     *     possible object is
     *     {@link PRODUCTOCOMERCIALType }
     *     
     */
    public PRODUCTOCOMERCIALType getPRODUCTOCOMERCIAL() {
        return productocomercial;
    }

    /**
     * Sets the value of the productocomercial property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRODUCTOCOMERCIALType }
     *     
     */
    public void setPRODUCTOCOMERCIAL(PRODUCTOCOMERCIALType value) {
        this.productocomercial = value;
    }

    /**
     * Gets the value of the agrproductocomercial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGRPRODUCTOCOMERCIAL() {
        return agrproductocomercial;
    }

    /**
     * Sets the value of the agrproductocomercial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGRPRODUCTOCOMERCIAL(String value) {
        this.agrproductocomercial = value;
    }

}
