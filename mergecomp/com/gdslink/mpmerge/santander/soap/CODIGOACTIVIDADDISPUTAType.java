
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CODIGO_ACTIVIDAD_DISPUTA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CODIGO_ACTIVIDAD_DISPUTA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="CODIGO_NUMERICO" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_4_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CODIGO_ACTIVIDAD_DISPUTA_Type", propOrder = {
    "empresa",
    "codigonumerico"
})
public class CODIGOACTIVIDADDISPUTAType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "CODIGO_NUMERICO")
    protected int codigonumerico;

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
     * Gets the value of the codigonumerico property.
     * 
     */
    public int getCODIGONUMERICO() {
        return codigonumerico;
    }

    /**
     * Sets the value of the codigonumerico property.
     * 
     */
    public void setCODIGONUMERICO(int value) {
        this.codigonumerico = value;
    }

}
