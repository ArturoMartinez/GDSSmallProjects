
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VALOR_TEMPORAL_TIPO_DATO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VALOR_TEMPORAL_TIPO_DATO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODIGO_TIPO_DE_DATO" type="{http://www.isban.es/webservices/TDCs}CODIGO_TIPO_DE_DATO_Type"/>
 *         &lt;element name="VALOR_TEMPORAL" type="{http://www.isban.es/webservices/TDCs}VALOR_TEMPORAL_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VALOR_TEMPORAL_TIPO_DATO_Type", propOrder = {
    "codigotipodedato",
    "valortemporal"
})
public class VALORTEMPORALTIPODATOType {

    @XmlElement(name = "CODIGO_TIPO_DE_DATO", required = true)
    protected String codigotipodedato;
    @XmlElement(name = "VALOR_TEMPORAL", required = true)
    protected String valortemporal;

    /**
     * Gets the value of the codigotipodedato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOTIPODEDATO() {
        return codigotipodedato;
    }

    /**
     * Sets the value of the codigotipodedato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOTIPODEDATO(String value) {
        this.codigotipodedato = value;
    }

    /**
     * Gets the value of the valortemporal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALORTEMPORAL() {
        return valortemporal;
    }

    /**
     * Sets the value of the valortemporal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALORTEMPORAL(String value) {
        this.valortemporal = value;
    }

}
