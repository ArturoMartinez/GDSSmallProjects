
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BENEFICIARIO_SEG_DIST_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BENEFICIARIO_SEG_DIST_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="POLIZA" type="{http://www.isban.es/webservices/TDCc}POLIZA_SEG_DIST_Type"/>
 *         &lt;element name="NUMERO_ORDEN" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BENEFICIARIO_SEG_DIST_Type", propOrder = {
    "poliza",
    "numeroorden"
})
public class BENEFICIARIOSEGDISTType {

    @XmlElement(name = "POLIZA", required = true)
    protected POLIZASEGDISTType poliza;
    @XmlElement(name = "NUMERO_ORDEN")
    protected int numeroorden;

    /**
     * Gets the value of the poliza property.
     * 
     * @return
     *     possible object is
     *     {@link POLIZASEGDISTType }
     *     
     */
    public POLIZASEGDISTType getPOLIZA() {
        return poliza;
    }

    /**
     * Sets the value of the poliza property.
     * 
     * @param value
     *     allowed object is
     *     {@link POLIZASEGDISTType }
     *     
     */
    public void setPOLIZA(POLIZASEGDISTType value) {
        this.poliza = value;
    }

    /**
     * Gets the value of the numeroorden property.
     * 
     */
    public int getNUMEROORDEN() {
        return numeroorden;
    }

    /**
     * Sets the value of the numeroorden property.
     * 
     */
    public void setNUMEROORDEN(int value) {
        this.numeroorden = value;
    }

}
