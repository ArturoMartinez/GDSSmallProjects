
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PROD_COMERCIAL_SEG_DIST_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PROD_COMERCIAL_SEG_DIST_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COD_RAMO" type="{http://www.isban.es/webservices/TDCs}RAMO_SEG_DIST_Type"/>
 *         &lt;element name="COD_PROD_COMERCIAL" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PROD_COMERCIAL_SEG_DIST_Type", propOrder = {
    "codramo",
    "codprodcomercial"
})
public class PRODCOMERCIALSEGDISTType {

    @XmlElement(name = "COD_RAMO")
    protected int codramo;
    @XmlElement(name = "COD_PROD_COMERCIAL")
    protected int codprodcomercial;

    /**
     * Gets the value of the codramo property.
     * 
     */
    public int getCODRAMO() {
        return codramo;
    }

    /**
     * Sets the value of the codramo property.
     * 
     */
    public void setCODRAMO(int value) {
        this.codramo = value;
    }

    /**
     * Gets the value of the codprodcomercial property.
     * 
     */
    public int getCODPRODCOMERCIAL() {
        return codprodcomercial;
    }

    /**
     * Sets the value of the codprodcomercial property.
     * 
     */
    public void setCODPRODCOMERCIAL(int value) {
        this.codprodcomercial = value;
    }

}
