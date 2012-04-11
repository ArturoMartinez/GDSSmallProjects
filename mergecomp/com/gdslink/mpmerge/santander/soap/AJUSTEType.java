
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AJUSTE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AJUSTE_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PERIODO_CONSOLIDAC_FINAN" type="{http://www.isban.es/webservices/TDCc}PERIODO_CONSOLIDAC_FINAN_Type"/>
 *         &lt;element name="CODIGO_AJUSTE" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_9_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AJUSTE_Type", propOrder = {
    "periodoconsolidacfinan",
    "codigoajuste"
})
public class AJUSTEType {

    @XmlElement(name = "PERIODO_CONSOLIDAC_FINAN", required = true)
    protected PERIODOCONSOLIDACFINANType periodoconsolidacfinan;
    @XmlElement(name = "CODIGO_AJUSTE")
    protected int codigoajuste;

    /**
     * Gets the value of the periodoconsolidacfinan property.
     * 
     * @return
     *     possible object is
     *     {@link PERIODOCONSOLIDACFINANType }
     *     
     */
    public PERIODOCONSOLIDACFINANType getPERIODOCONSOLIDACFINAN() {
        return periodoconsolidacfinan;
    }

    /**
     * Sets the value of the periodoconsolidacfinan property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERIODOCONSOLIDACFINANType }
     *     
     */
    public void setPERIODOCONSOLIDACFINAN(PERIODOCONSOLIDACFINANType value) {
        this.periodoconsolidacfinan = value;
    }

    /**
     * Gets the value of the codigoajuste property.
     * 
     */
    public int getCODIGOAJUSTE() {
        return codigoajuste;
    }

    /**
     * Sets the value of the codigoajuste property.
     * 
     */
    public void setCODIGOAJUSTE(int value) {
        this.codigoajuste = value;
    }

}
