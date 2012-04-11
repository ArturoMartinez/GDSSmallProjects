
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ORDEN_HCE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ORDEN_HCE_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}GRUPO_EMPRESA_Type"/>
 *         &lt;element name="COD_OPERACION_HCE" type="{http://www.isban.es/webservices/TDCs}COD_OPERACION_HCE_Type"/>
 *         &lt;element name="CODIGO_NUMERICO_9" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_9_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ORDEN_HCE_Type", propOrder = {
    "empresa",
    "codoperacionhce",
    "codigonumerico9"
})
public class ORDENHCEType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "COD_OPERACION_HCE", required = true)
    protected String codoperacionhce;
    @XmlElement(name = "CODIGO_NUMERICO_9")
    protected int codigonumerico9;

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
     * Gets the value of the codoperacionhce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODOPERACIONHCE() {
        return codoperacionhce;
    }

    /**
     * Sets the value of the codoperacionhce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODOPERACIONHCE(String value) {
        this.codoperacionhce = value;
    }

    /**
     * Gets the value of the codigonumerico9 property.
     * 
     */
    public int getCODIGONUMERICO9() {
        return codigonumerico9;
    }

    /**
     * Sets the value of the codigonumerico9 property.
     * 
     */
    public void setCODIGONUMERICO9(int value) {
        this.codigonumerico9 = value;
    }

}
