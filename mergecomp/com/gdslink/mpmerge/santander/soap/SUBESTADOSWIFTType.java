
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SUBESTADO_SWIFT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SUBESTADO_SWIFT_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ESTADO_MENSAJE_SWIFT" type="{http://www.isban.es/webservices/TDCs}ESTADO_MENSAJE_SWIFT_Type"/>
 *         &lt;element name="COD_SUBESTADO_SWIFT" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SUBESTADO_SWIFT_Type", propOrder = {
    "estadomensajeswift",
    "codsubestadoswift"
})
public class SUBESTADOSWIFTType {

    @XmlElement(name = "ESTADO_MENSAJE_SWIFT", required = true)
    protected String estadomensajeswift;
    @XmlElement(name = "COD_SUBESTADO_SWIFT", required = true)
    protected String codsubestadoswift;

    /**
     * Gets the value of the estadomensajeswift property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESTADOMENSAJESWIFT() {
        return estadomensajeswift;
    }

    /**
     * Sets the value of the estadomensajeswift property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESTADOMENSAJESWIFT(String value) {
        this.estadomensajeswift = value;
    }

    /**
     * Gets the value of the codsubestadoswift property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODSUBESTADOSWIFT() {
        return codsubestadoswift;
    }

    /**
     * Sets the value of the codsubestadoswift property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODSUBESTADOSWIFT(String value) {
        this.codsubestadoswift = value;
    }

}
