
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NOMBRE_CORPORATIVO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NOMBRE_CORPORATIVO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_NOMBRE" type="{http://www.isban.es/webservices/TDCs}TIPO_NOMBRE_Type"/>
 *         &lt;element name="NOMBRE_TRANSITO" type="{http://www.isban.es/webservices/TDCs}STRING_70_Type"/>
 *         &lt;element name="RESTO_NOMBRE" type="{http://www.isban.es/webservices/TDCs}STRING_290_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NOMBRE_CORPORATIVO_Type", propOrder = {
    "tiponombre",
    "nombretransito",
    "restonombre"
})
public class NOMBRECORPORATIVOType {

    @XmlElement(name = "TIPO_NOMBRE", required = true)
    protected String tiponombre;
    @XmlElement(name = "NOMBRE_TRANSITO", required = true)
    protected String nombretransito;
    @XmlElement(name = "RESTO_NOMBRE", required = true)
    protected String restonombre;

    /**
     * Gets the value of the tiponombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPONOMBRE() {
        return tiponombre;
    }

    /**
     * Sets the value of the tiponombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPONOMBRE(String value) {
        this.tiponombre = value;
    }

    /**
     * Gets the value of the nombretransito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBRETRANSITO() {
        return nombretransito;
    }

    /**
     * Sets the value of the nombretransito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBRETRANSITO(String value) {
        this.nombretransito = value;
    }

    /**
     * Gets the value of the restonombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESTONOMBRE() {
        return restonombre;
    }

    /**
     * Sets the value of the restonombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESTONOMBRE(String value) {
        this.restonombre = value;
    }

}
