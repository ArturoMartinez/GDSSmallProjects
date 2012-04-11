
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BI_ID_PARAMETRO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BI_ID_PARAMETRO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_PARAMETRO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *         &lt;element name="COD_PARAMETRO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BI_ID_PARAMETRO_Type", propOrder = {
    "tipoparametro",
    "codparametro"
})
public class BIIDPARAMETROType {

    @XmlElement(name = "TIPO_PARAMETRO", required = true)
    protected String tipoparametro;
    @XmlElement(name = "COD_PARAMETRO", required = true)
    protected String codparametro;

    /**
     * Gets the value of the tipoparametro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOPARAMETRO() {
        return tipoparametro;
    }

    /**
     * Sets the value of the tipoparametro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOPARAMETRO(String value) {
        this.tipoparametro = value;
    }

    /**
     * Gets the value of the codparametro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODPARAMETRO() {
        return codparametro;
    }

    /**
     * Sets the value of the codparametro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODPARAMETRO(String value) {
        this.codparametro = value;
    }

}
