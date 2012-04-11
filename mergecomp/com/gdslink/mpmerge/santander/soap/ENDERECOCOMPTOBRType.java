
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ENDERECO_COMPTO_BR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ENDERECO_COMPTO_BR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENDERECO_BR" type="{http://www.isban.es/webservices/TDCs}ENDERECO_BR_Type"/>
 *         &lt;element name="BAIRRO_1_BR" type="{http://www.isban.es/webservices/TDCs}BAIRRO_1_BR_Type"/>
 *         &lt;element name="BAIRRO_2_BR" type="{http://www.isban.es/webservices/TDCs}BAIRRO_2_BR_Type"/>
 *         &lt;element name="TIPO_DE_RESIDENCIA_BR" type="{http://www.isban.es/webservices/TDCs}TIPO_DE_RESIDENCIA_BR_Type"/>
 *         &lt;element name="RESIDE_DESDE" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_8_Type"/>
 *         &lt;element name="END_COMPROVADO" type="{http://www.isban.es/webservices/TDCs}INDICADOR_SIM_NAO_BR_Type"/>
 *         &lt;element name="INDICADOR_ATACADO" type="{http://www.isban.es/webservices/TDCs}INDICADOR_SIM_NAO_BR_Type"/>
 *         &lt;element name="INDICADOR_PAB" type="{http://www.isban.es/webservices/TDCs}INDICADOR_SIM_NAO_BR_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENDERECO_COMPTO_BR_Type", propOrder = {
    "enderecobr",
    "bairro1BR",
    "bairro2BR",
    "tipoderesidenciabr",
    "residedesde",
    "endcomprovado",
    "indicadoratacado",
    "indicadorpab"
})
public class ENDERECOCOMPTOBRType {

    @XmlElement(name = "ENDERECO_BR", required = true)
    protected String enderecobr;
    @XmlElement(name = "BAIRRO_1_BR", required = true)
    protected String bairro1BR;
    @XmlElement(name = "BAIRRO_2_BR", required = true)
    protected String bairro2BR;
    @XmlElement(name = "TIPO_DE_RESIDENCIA_BR", required = true)
    protected String tipoderesidenciabr;
    @XmlElement(name = "RESIDE_DESDE", required = true)
    protected String residedesde;
    @XmlElement(name = "END_COMPROVADO", required = true)
    protected String endcomprovado;
    @XmlElement(name = "INDICADOR_ATACADO", required = true)
    protected String indicadoratacado;
    @XmlElement(name = "INDICADOR_PAB", required = true)
    protected String indicadorpab;

    /**
     * Gets the value of the enderecobr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENDERECOBR() {
        return enderecobr;
    }

    /**
     * Sets the value of the enderecobr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENDERECOBR(String value) {
        this.enderecobr = value;
    }

    /**
     * Gets the value of the bairro1BR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBAIRRO1BR() {
        return bairro1BR;
    }

    /**
     * Sets the value of the bairro1BR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBAIRRO1BR(String value) {
        this.bairro1BR = value;
    }

    /**
     * Gets the value of the bairro2BR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBAIRRO2BR() {
        return bairro2BR;
    }

    /**
     * Sets the value of the bairro2BR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBAIRRO2BR(String value) {
        this.bairro2BR = value;
    }

    /**
     * Gets the value of the tipoderesidenciabr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODERESIDENCIABR() {
        return tipoderesidenciabr;
    }

    /**
     * Sets the value of the tipoderesidenciabr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODERESIDENCIABR(String value) {
        this.tipoderesidenciabr = value;
    }

    /**
     * Gets the value of the residedesde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESIDEDESDE() {
        return residedesde;
    }

    /**
     * Sets the value of the residedesde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESIDEDESDE(String value) {
        this.residedesde = value;
    }

    /**
     * Gets the value of the endcomprovado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENDCOMPROVADO() {
        return endcomprovado;
    }

    /**
     * Sets the value of the endcomprovado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENDCOMPROVADO(String value) {
        this.endcomprovado = value;
    }

    /**
     * Gets the value of the indicadoratacado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDICADORATACADO() {
        return indicadoratacado;
    }

    /**
     * Sets the value of the indicadoratacado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDICADORATACADO(String value) {
        this.indicadoratacado = value;
    }

    /**
     * Gets the value of the indicadorpab property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDICADORPAB() {
        return indicadorpab;
    }

    /**
     * Sets the value of the indicadorpab property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDICADORPAB(String value) {
        this.indicadorpab = value;
    }

}
