
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CONCEPTO_CONTENIDO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CONCEPTO_CONTENIDO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CONCEPTO_DGO" type="{http://www.isban.es/webservices/TDCs}CONCEPTO_DGO_Type"/>
 *         &lt;element name="CODIGO_CONTENIDO" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_9_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONCEPTO_CONTENIDO_Type", propOrder = {
    "conceptodgo",
    "codigocontenido"
})
public class CONCEPTOCONTENIDOType {

    @XmlElement(name = "CONCEPTO_DGO", required = true)
    protected String conceptodgo;
    @XmlElement(name = "CODIGO_CONTENIDO")
    protected int codigocontenido;

    /**
     * Gets the value of the conceptodgo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONCEPTODGO() {
        return conceptodgo;
    }

    /**
     * Sets the value of the conceptodgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONCEPTODGO(String value) {
        this.conceptodgo = value;
    }

    /**
     * Gets the value of the codigocontenido property.
     * 
     */
    public int getCODIGOCONTENIDO() {
        return codigocontenido;
    }

    /**
     * Sets the value of the codigocontenido property.
     * 
     */
    public void setCODIGOCONTENIDO(int value) {
        this.codigocontenido = value;
    }

}
