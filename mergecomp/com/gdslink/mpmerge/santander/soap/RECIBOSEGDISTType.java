
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RECIBO_SEG_DIST_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RECIBO_SEG_DIST_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="POLIZA" type="{http://www.isban.es/webservices/TDCc}POLIZA_SEG_DIST_Type"/>
 *         &lt;element name="NUMERO_RECIBO" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_8_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RECIBO_SEG_DIST_Type", propOrder = {
    "poliza",
    "numerorecibo"
})
public class RECIBOSEGDISTType {

    @XmlElement(name = "POLIZA", required = true)
    protected POLIZASEGDISTType poliza;
    @XmlElement(name = "NUMERO_RECIBO")
    protected int numerorecibo;

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
     * Gets the value of the numerorecibo property.
     * 
     */
    public int getNUMERORECIBO() {
        return numerorecibo;
    }

    /**
     * Sets the value of the numerorecibo property.
     * 
     */
    public void setNUMERORECIBO(int value) {
        this.numerorecibo = value;
    }

}
