
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BLOQUEO_CONTRATO_TARJETA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BLOQUEO_CONTRATO_TARJETA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="COD_BLOQUEO_CONTRATO_TJTA" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BLOQUEO_CONTRATO_TARJETA_Type", propOrder = {
    "empresa",
    "codbloqueocontratotjta"
})
public class BLOQUEOCONTRATOTARJETAType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "COD_BLOQUEO_CONTRATO_TJTA")
    protected int codbloqueocontratotjta;

    /**
     * Gets the value of the empresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPRESA() {
        return empresa;
    }

    /**
     * Sets the value of the empresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPRESA(String value) {
        this.empresa = value;
    }

    /**
     * Gets the value of the codbloqueocontratotjta property.
     * 
     */
    public int getCODBLOQUEOCONTRATOTJTA() {
        return codbloqueocontratotjta;
    }

    /**
     * Sets the value of the codbloqueocontratotjta property.
     * 
     */
    public void setCODBLOQUEOCONTRATOTJTA(int value) {
        this.codbloqueocontratotjta = value;
    }

}
