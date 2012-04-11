
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AGRUPADOR_TIPOS_GARANTIA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AGRUPADOR_TIPOS_GARANTIA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="COD_AGRUPACION_TIPO_GARAN" type="{http://www.isban.es/webservices/TDCs}COD_AGRUPACION_TIPO_GARAN_Type"/>
 *         &lt;element name="COD_AGRUPADOR_TIPO_GARAN" type="{http://www.isban.es/webservices/TDCs}COD_AGRUPADOR_TIPO_GARAN_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AGRUPADOR_TIPOS_GARANTIA_Type", propOrder = {
    "empresa",
    "codagrupaciontipogaran",
    "codagrupadortipogaran"
})
public class AGRUPADORTIPOSGARANTIAType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "COD_AGRUPACION_TIPO_GARAN", required = true)
    protected String codagrupaciontipogaran;
    @XmlElement(name = "COD_AGRUPADOR_TIPO_GARAN", required = true)
    protected String codagrupadortipogaran;

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
     * Gets the value of the codagrupaciontipogaran property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODAGRUPACIONTIPOGARAN() {
        return codagrupaciontipogaran;
    }

    /**
     * Sets the value of the codagrupaciontipogaran property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODAGRUPACIONTIPOGARAN(String value) {
        this.codagrupaciontipogaran = value;
    }

    /**
     * Gets the value of the codagrupadortipogaran property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODAGRUPADORTIPOGARAN() {
        return codagrupadortipogaran;
    }

    /**
     * Sets the value of the codagrupadortipogaran property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODAGRUPADORTIPOGARAN(String value) {
        this.codagrupadortipogaran = value;
    }

}
