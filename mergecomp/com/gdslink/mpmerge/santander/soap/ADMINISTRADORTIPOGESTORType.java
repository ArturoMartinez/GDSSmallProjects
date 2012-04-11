
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ADMINISTRADOR_TIPO_GESTOR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ADMINISTRADOR_TIPO_GESTOR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="TIPO_DE_GESTOR" type="{http://www.isban.es/webservices/TDCs}TIPO_DE_GESTOR_Type"/>
 *         &lt;element name="COD_ADMIN_TIPO_GESTOR" type="{http://www.isban.es/webservices/TDCs}COD_ADMIN_TIPO_GESTOR_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ADMINISTRADOR_TIPO_GESTOR_Type", propOrder = {
    "empresa",
    "tipodegestor",
    "codadmintipogestor"
})
public class ADMINISTRADORTIPOGESTORType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "TIPO_DE_GESTOR", required = true)
    protected String tipodegestor;
    @XmlElement(name = "COD_ADMIN_TIPO_GESTOR", required = true)
    protected String codadmintipogestor;

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
     * Gets the value of the tipodegestor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODEGESTOR() {
        return tipodegestor;
    }

    /**
     * Sets the value of the tipodegestor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODEGESTOR(String value) {
        this.tipodegestor = value;
    }

    /**
     * Gets the value of the codadmintipogestor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODADMINTIPOGESTOR() {
        return codadmintipogestor;
    }

    /**
     * Sets the value of the codadmintipogestor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODADMINTIPOGESTOR(String value) {
        this.codadmintipogestor = value;
    }

}
