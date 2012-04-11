
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EMISOR_GESTOR_EMISORES_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EMISOR_GESTOR_EMISORES_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="TIPO_ACUERDO" type="{http://www.isban.es/webservices/TDCs}TIPO_ACUERDO_Type"/>
 *         &lt;element name="COD_ROL_ACUERDO" type="{http://www.isban.es/webservices/TDCs}COD_ROL_ACUERDO_Type"/>
 *         &lt;element name="TIPO_GESTOR_EMISORES_ISO" type="{http://www.isban.es/webservices/TDCs}TIPO_GESTOR_EMISORES_ISO_Type"/>
 *         &lt;element name="GESTOR_EMISORES_ISO" type="{http://www.isban.es/webservices/TDCs}GESTOR_EMISORES_ISO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EMISOR_GESTOR_EMISORES_Type", propOrder = {
    "empresa",
    "tipoacuerdo",
    "codrolacuerdo",
    "tipogestoremisoresiso",
    "gestoremisoresiso"
})
public class EMISORGESTOREMISORESType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "TIPO_ACUERDO", required = true)
    protected String tipoacuerdo;
    @XmlElement(name = "COD_ROL_ACUERDO", required = true)
    protected String codrolacuerdo;
    @XmlElement(name = "TIPO_GESTOR_EMISORES_ISO", required = true)
    protected String tipogestoremisoresiso;
    @XmlElement(name = "GESTOR_EMISORES_ISO", required = true)
    protected String gestoremisoresiso;

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
     * Gets the value of the tipoacuerdo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOACUERDO() {
        return tipoacuerdo;
    }

    /**
     * Sets the value of the tipoacuerdo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOACUERDO(String value) {
        this.tipoacuerdo = value;
    }

    /**
     * Gets the value of the codrolacuerdo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODROLACUERDO() {
        return codrolacuerdo;
    }

    /**
     * Sets the value of the codrolacuerdo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODROLACUERDO(String value) {
        this.codrolacuerdo = value;
    }

    /**
     * Gets the value of the tipogestoremisoresiso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOGESTOREMISORESISO() {
        return tipogestoremisoresiso;
    }

    /**
     * Sets the value of the tipogestoremisoresiso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOGESTOREMISORESISO(String value) {
        this.tipogestoremisoresiso = value;
    }

    /**
     * Gets the value of the gestoremisoresiso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGESTOREMISORESISO() {
        return gestoremisoresiso;
    }

    /**
     * Sets the value of the gestoremisoresiso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGESTOREMISORESISO(String value) {
        this.gestoremisoresiso = value;
    }

}
