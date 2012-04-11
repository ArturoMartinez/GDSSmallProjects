
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PRODUCTO_COMERCIAL_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PRODUCTO_COMERCIAL_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CATALOGO_COMERCIAL" type="{http://www.isban.es/webservices/TDCc}CATALOGO_COMERCIAL_Type"/>
 *         &lt;element name="PRODUCTO_COMERCIAL" type="{http://www.isban.es/webservices/TDCs}COD_PRODUCTO_COMERCIAL_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRODUCTO_COMERCIAL_Type", propOrder = {
    "catalogocomercial",
    "productocomercial"
})
public class PRODUCTOCOMERCIALType {

    @XmlElement(name = "CATALOGO_COMERCIAL", required = true)
    protected CATALOGOCOMERCIALType catalogocomercial;
    @XmlElement(name = "PRODUCTO_COMERCIAL", required = true)
    protected String productocomercial;

    /**
     * Gets the value of the catalogocomercial property.
     * 
     * @return
     *     possible object is
     *     {@link CATALOGOCOMERCIALType }
     *     
     */
    public CATALOGOCOMERCIALType getCATALOGOCOMERCIAL() {
        return catalogocomercial;
    }

    /**
     * Sets the value of the catalogocomercial property.
     * 
     * @param value
     *     allowed object is
     *     {@link CATALOGOCOMERCIALType }
     *     
     */
    public void setCATALOGOCOMERCIAL(CATALOGOCOMERCIALType value) {
        this.catalogocomercial = value;
    }

    /**
     * Gets the value of the productocomercial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODUCTOCOMERCIAL() {
        return productocomercial;
    }

    /**
     * Sets the value of the productocomercial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODUCTOCOMERCIAL(String value) {
        this.productocomercial = value;
    }

}
