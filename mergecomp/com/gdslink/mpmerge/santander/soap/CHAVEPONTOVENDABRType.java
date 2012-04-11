
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CHAVE_PONTO_VENDA_BR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CHAVE_PONTO_VENDA_BR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INDICADOR1" type="{http://www.isban.es/webservices/TDCs}INDICADOR_GENERICO_Type"/>
 *         &lt;element name="PONTO_DE_VENDA" type="{http://www.isban.es/webservices/TDCs}PONTO_VENDA_BR_Type"/>
 *         &lt;element name="INDICADOR2" type="{http://www.isban.es/webservices/TDCs}INDICADOR_GENERICO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CHAVE_PONTO_VENDA_BR_Type", propOrder = {
    "indicador1",
    "pontodevenda",
    "indicador2"
})
public class CHAVEPONTOVENDABRType {

    @XmlElement(name = "INDICADOR1", required = true)
    protected String indicador1;
    @XmlElement(name = "PONTO_DE_VENDA", required = true)
    protected String pontodevenda;
    @XmlElement(name = "INDICADOR2", required = true)
    protected String indicador2;

    /**
     * Gets the value of the indicador1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDICADOR1() {
        return indicador1;
    }

    /**
     * Sets the value of the indicador1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDICADOR1(String value) {
        this.indicador1 = value;
    }

    /**
     * Gets the value of the pontodevenda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPONTODEVENDA() {
        return pontodevenda;
    }

    /**
     * Sets the value of the pontodevenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPONTODEVENDA(String value) {
        this.pontodevenda = value;
    }

    /**
     * Gets the value of the indicador2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDICADOR2() {
        return indicador2;
    }

    /**
     * Sets the value of the indicador2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDICADOR2(String value) {
        this.indicador2 = value;
    }

}
