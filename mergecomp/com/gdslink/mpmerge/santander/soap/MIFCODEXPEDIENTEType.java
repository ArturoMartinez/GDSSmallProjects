
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MIF_COD_EXPEDIENTE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MIF_COD_EXPEDIENTE_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MIF_TIPO_EXPEDIENTE" type="{http://www.isban.es/webservices/TDCc}MIF_TIPO_EXPEDIENTE_Type"/>
 *         &lt;element name="CEXPEDTE_SECUENCIAL_MEDIO" type="{http://www.isban.es/webservices/TDCs}SECUENCIAL_MEDIO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MIF_COD_EXPEDIENTE_Type", propOrder = {
    "miftipoexpediente",
    "cexpedtesecuencialmedio"
})
public class MIFCODEXPEDIENTEType {

    @XmlElement(name = "MIF_TIPO_EXPEDIENTE", required = true)
    protected MIFTIPOEXPEDIENTEType miftipoexpediente;
    @XmlElement(name = "CEXPEDTE_SECUENCIAL_MEDIO")
    protected long cexpedtesecuencialmedio;

    /**
     * Gets the value of the miftipoexpediente property.
     * 
     * @return
     *     possible object is
     *     {@link MIFTIPOEXPEDIENTEType }
     *     
     */
    public MIFTIPOEXPEDIENTEType getMIFTIPOEXPEDIENTE() {
        return miftipoexpediente;
    }

    /**
     * Sets the value of the miftipoexpediente property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIFTIPOEXPEDIENTEType }
     *     
     */
    public void setMIFTIPOEXPEDIENTE(MIFTIPOEXPEDIENTEType value) {
        this.miftipoexpediente = value;
    }

    /**
     * Gets the value of the cexpedtesecuencialmedio property.
     * 
     */
    public long getCEXPEDTESECUENCIALMEDIO() {
        return cexpedtesecuencialmedio;
    }

    /**
     * Sets the value of the cexpedtesecuencialmedio property.
     * 
     */
    public void setCEXPEDTESECUENCIALMEDIO(long value) {
        this.cexpedtesecuencialmedio = value;
    }

}
