
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PARAMETRO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PARAMETRO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NOMBRE_PARAMETRO" type="{http://www.isban.es/webservices/TDCs}NOMBRE_PARAMETRO_Type"/>
 *         &lt;element name="TIPO_PARAMETRO_BPM" type="{http://www.isban.es/webservices/TDCs}TIPO_PARAMETRO_BPM_Type"/>
 *         &lt;element name="TEXTO_255" type="{http://www.isban.es/webservices/TDCs}TEXTO_255_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PARAMETRO_Type", propOrder = {
    "nombreparametro",
    "tipoparametrobpm",
    "texto255"
})
public class PARAMETROType {

    @XmlElement(name = "NOMBRE_PARAMETRO", required = true)
    protected String nombreparametro;
    @XmlElement(name = "TIPO_PARAMETRO_BPM", required = true)
    protected String tipoparametrobpm;
    @XmlElement(name = "TEXTO_255", required = true)
    protected String texto255;

    /**
     * Gets the value of the nombreparametro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBREPARAMETRO() {
        return nombreparametro;
    }

    /**
     * Sets the value of the nombreparametro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBREPARAMETRO(String value) {
        this.nombreparametro = value;
    }

    /**
     * Gets the value of the tipoparametrobpm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOPARAMETROBPM() {
        return tipoparametrobpm;
    }

    /**
     * Sets the value of the tipoparametrobpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOPARAMETROBPM(String value) {
        this.tipoparametrobpm = value;
    }

    /**
     * Gets the value of the texto255 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEXTO255() {
        return texto255;
    }

    /**
     * Sets the value of the texto255 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEXTO255(String value) {
        this.texto255 = value;
    }

}
