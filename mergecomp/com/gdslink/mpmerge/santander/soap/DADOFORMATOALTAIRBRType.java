
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DADO_FORMATO_ALTAIR_BR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DADO_FORMATO_ALTAIR_BR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="APLICACAO_ALTAIR_BR" type="{http://www.isban.es/webservices/TDCs}APLICACAO_ALTAIR_BR_Type"/>
 *         &lt;element name="CAMPO_ALTAIR_BR" type="{http://www.isban.es/webservices/TDCs}CAMPO_ALTAIR_BR_Type"/>
 *         &lt;element name="VALOR_ALTAIR_BR" type="{http://www.isban.es/webservices/TDCs}VALOR_ALTAIR_BR_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DADO_FORMATO_ALTAIR_BR_Type", propOrder = {
    "aplicacaoaltairbr",
    "campoaltairbr",
    "valoraltairbr"
})
public class DADOFORMATOALTAIRBRType {

    @XmlElement(name = "APLICACAO_ALTAIR_BR", required = true)
    protected String aplicacaoaltairbr;
    @XmlElement(name = "CAMPO_ALTAIR_BR", required = true)
    protected String campoaltairbr;
    @XmlElement(name = "VALOR_ALTAIR_BR", required = true)
    protected String valoraltairbr;

    /**
     * Gets the value of the aplicacaoaltairbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPLICACAOALTAIRBR() {
        return aplicacaoaltairbr;
    }

    /**
     * Sets the value of the aplicacaoaltairbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPLICACAOALTAIRBR(String value) {
        this.aplicacaoaltairbr = value;
    }

    /**
     * Gets the value of the campoaltairbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAMPOALTAIRBR() {
        return campoaltairbr;
    }

    /**
     * Sets the value of the campoaltairbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAMPOALTAIRBR(String value) {
        this.campoaltairbr = value;
    }

    /**
     * Gets the value of the valoraltairbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALORALTAIRBR() {
        return valoraltairbr;
    }

    /**
     * Sets the value of the valoraltairbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALORALTAIRBR(String value) {
        this.valoraltairbr = value;
    }

}
