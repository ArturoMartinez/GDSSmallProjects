
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POLIZA_SEG_DIST_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POLIZA_SEG_DIST_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COD_COMPANIA" type="{http://www.isban.es/webservices/TDCs}COMPANIA_DE_SEGUROS_Type"/>
 *         &lt;element name="PRODUCTO_COMERCIAL" type="{http://www.isban.es/webservices/TDCc}PROD_COMERCIAL_SEG_DIST_Type"/>
 *         &lt;element name="NUMERO_POLIZA" type="{http://www.isban.es/webservices/TDCs}NUMERO_POLIZA_SEGURO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POLIZA_SEG_DIST_Type", propOrder = {
    "codcompania",
    "productocomercial",
    "numeropoliza"
})
public class POLIZASEGDISTType {

    @XmlElement(name = "COD_COMPANIA", required = true)
    protected String codcompania;
    @XmlElement(name = "PRODUCTO_COMERCIAL", required = true)
    protected PRODCOMERCIALSEGDISTType productocomercial;
    @XmlElement(name = "NUMERO_POLIZA")
    protected int numeropoliza;

    /**
     * Gets the value of the codcompania property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODCOMPANIA() {
        return codcompania;
    }

    /**
     * Sets the value of the codcompania property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODCOMPANIA(String value) {
        this.codcompania = value;
    }

    /**
     * Gets the value of the productocomercial property.
     * 
     * @return
     *     possible object is
     *     {@link PRODCOMERCIALSEGDISTType }
     *     
     */
    public PRODCOMERCIALSEGDISTType getPRODUCTOCOMERCIAL() {
        return productocomercial;
    }

    /**
     * Sets the value of the productocomercial property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRODCOMERCIALSEGDISTType }
     *     
     */
    public void setPRODUCTOCOMERCIAL(PRODCOMERCIALSEGDISTType value) {
        this.productocomercial = value;
    }

    /**
     * Gets the value of the numeropoliza property.
     * 
     */
    public int getNUMEROPOLIZA() {
        return numeropoliza;
    }

    /**
     * Sets the value of the numeropoliza property.
     * 
     */
    public void setNUMEROPOLIZA(int value) {
        this.numeropoliza = value;
    }

}
