
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VALOR_CAMPO_PARAM_SEG_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VALOR_CAMPO_PARAM_SEG_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PARAMETRO_CAMPO" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_8_Type"/>
 *         &lt;element name="VALOR_CAMPO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VALOR_CAMPO_PARAM_SEG_Type", propOrder = {
    "parametrocampo",
    "valorcampo"
})
public class VALORCAMPOPARAMSEGType {

    @XmlElement(name = "PARAMETRO_CAMPO", required = true)
    protected String parametrocampo;
    @XmlElement(name = "VALOR_CAMPO", required = true)
    protected String valorcampo;

    /**
     * Gets the value of the parametrocampo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARAMETROCAMPO() {
        return parametrocampo;
    }

    /**
     * Sets the value of the parametrocampo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARAMETROCAMPO(String value) {
        this.parametrocampo = value;
    }

    /**
     * Gets the value of the valorcampo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALORCAMPO() {
        return valorcampo;
    }

    /**
     * Sets the value of the valorcampo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALORCAMPO(String value) {
        this.valorcampo = value;
    }

}
