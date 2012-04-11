
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COMBO_VALABB_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COMBO_VALABB_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="COD_CAMPO_FORMULARIO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *         &lt;element name="COD_VALOR" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COMBO_VALABB_Type", propOrder = {
    "empresa",
    "codcampoformulario",
    "codvalor"
})
public class COMBOVALABBType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "COD_CAMPO_FORMULARIO", required = true)
    protected String codcampoformulario;
    @XmlElement(name = "COD_VALOR", required = true)
    protected String codvalor;

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
     * Gets the value of the codcampoformulario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODCAMPOFORMULARIO() {
        return codcampoformulario;
    }

    /**
     * Sets the value of the codcampoformulario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODCAMPOFORMULARIO(String value) {
        this.codcampoformulario = value;
    }

    /**
     * Gets the value of the codvalor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODVALOR() {
        return codvalor;
    }

    /**
     * Sets the value of the codvalor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODVALOR(String value) {
        this.codvalor = value;
    }

}
