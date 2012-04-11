
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CLAVE_GAU_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CLAVE_GAU_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_AUTORIZACION_GAU" type="{http://www.isban.es/webservices/TDCc}TIPO_AUTORIZACION_GAU_Type"/>
 *         &lt;element name="COD_INTERNO_GAU" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_18_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CLAVE_GAU_Type", propOrder = {
    "tipoautorizaciongau",
    "codinternogau"
})
public class CLAVEGAUType {

    @XmlElement(name = "TIPO_AUTORIZACION_GAU", required = true)
    protected TIPOAUTORIZACIONGAUType tipoautorizaciongau;
    @XmlElement(name = "COD_INTERNO_GAU")
    protected long codinternogau;

    /**
     * Gets the value of the tipoautorizaciongau property.
     * 
     * @return
     *     possible object is
     *     {@link TIPOAUTORIZACIONGAUType }
     *     
     */
    public TIPOAUTORIZACIONGAUType getTIPOAUTORIZACIONGAU() {
        return tipoautorizaciongau;
    }

    /**
     * Sets the value of the tipoautorizaciongau property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIPOAUTORIZACIONGAUType }
     *     
     */
    public void setTIPOAUTORIZACIONGAU(TIPOAUTORIZACIONGAUType value) {
        this.tipoautorizaciongau = value;
    }

    /**
     * Gets the value of the codinternogau property.
     * 
     */
    public long getCODINTERNOGAU() {
        return codinternogau;
    }

    /**
     * Sets the value of the codinternogau property.
     * 
     */
    public void setCODINTERNOGAU(long value) {
        this.codinternogau = value;
    }

}
