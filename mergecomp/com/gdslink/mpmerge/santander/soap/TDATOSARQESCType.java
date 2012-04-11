
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TDATOSARQESC_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDATOSARQESC_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdMaquina" type="{http://www.isban.es/webservices/TDCs}NUMERO_DE_TERMINAL_Type"/>
 *         &lt;element name="CentroCompuesto" type="{http://www.isban.es/webservices/TDCc}CENTRO_DE_CONTRATO_Type"/>
 *         &lt;element name="TknRACF" type="{http://www.isban.es/webservices/TDCs}TOKENRACF_Type"/>
 *         &lt;element name="UsuNotes" type="{http://www.isban.es/webservices/TDCs}USUARIO_INTRANET_Type"/>
 *         &lt;element name="Password" type="{http://www.isban.es/webservices/TDCs}PASSWORD_INTRANET_Type"/>
 *         &lt;element name="Centro" type="{http://www.isban.es/webservices/TDCs}CODIGO_CENTRO_Type"/>
 *         &lt;element name="Empresa" type="{http://www.isban.es/webservices/TDCs}EMPRESA_GENERAL_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDATOSARQESC_Type", propOrder = {
    "idMaquina",
    "centroCompuesto",
    "tknRACF",
    "usuNotes",
    "password",
    "centro",
    "empresa"
})
public class TDATOSARQESCType {

    @XmlElement(name = "IdMaquina", required = true)
    protected String idMaquina;
    @XmlElement(name = "CentroCompuesto", required = true)
    protected CENTRODECONTRATOType centroCompuesto;
    @XmlElement(name = "TknRACF", required = true)
    protected String tknRACF;
    @XmlElement(name = "UsuNotes", required = true)
    protected String usuNotes;
    @XmlElement(name = "Password", required = true)
    protected String password;
    @XmlElement(name = "Centro", required = true)
    protected String centro;
    @XmlElement(name = "Empresa", required = true)
    protected String empresa;

    /**
     * Gets the value of the idMaquina property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdMaquina() {
        return idMaquina;
    }

    /**
     * Sets the value of the idMaquina property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdMaquina(String value) {
        this.idMaquina = value;
    }

    /**
     * Gets the value of the centroCompuesto property.
     * 
     * @return
     *     possible object is
     *     {@link CENTRODECONTRATOType }
     *     
     */
    public CENTRODECONTRATOType getCentroCompuesto() {
        return centroCompuesto;
    }

    /**
     * Sets the value of the centroCompuesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link CENTRODECONTRATOType }
     *     
     */
    public void setCentroCompuesto(CENTRODECONTRATOType value) {
        this.centroCompuesto = value;
    }

    /**
     * Gets the value of the tknRACF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTknRACF() {
        return tknRACF;
    }

    /**
     * Sets the value of the tknRACF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTknRACF(String value) {
        this.tknRACF = value;
    }

    /**
     * Gets the value of the usuNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuNotes() {
        return usuNotes;
    }

    /**
     * Sets the value of the usuNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuNotes(String value) {
        this.usuNotes = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the centro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentro() {
        return centro;
    }

    /**
     * Sets the value of the centro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentro(String value) {
        this.centro = value;
    }

    /**
     * Gets the value of the empresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpresa() {
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
    public void setEmpresa(String value) {
        this.empresa = value;
    }

}
