
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TIPO_MENSAJE_SWIFT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIPO_MENSAJE_SWIFT_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_MENSAJE" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *         &lt;element name="CATEGORIA_MENSAJE" type="{http://www.isban.es/webservices/TDCs}INDICADOR_GENERICO_Type"/>
 *         &lt;element name="NUMERO_MENSAJE" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIPO_MENSAJE_SWIFT_Type", propOrder = {
    "tipomensaje",
    "categoriamensaje",
    "numeromensaje"
})
public class TIPOMENSAJESWIFTType {

    @XmlElement(name = "TIPO_MENSAJE", required = true)
    protected String tipomensaje;
    @XmlElement(name = "CATEGORIA_MENSAJE", required = true)
    protected String categoriamensaje;
    @XmlElement(name = "NUMERO_MENSAJE", required = true)
    protected String numeromensaje;

    /**
     * Gets the value of the tipomensaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOMENSAJE() {
        return tipomensaje;
    }

    /**
     * Sets the value of the tipomensaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOMENSAJE(String value) {
        this.tipomensaje = value;
    }

    /**
     * Gets the value of the categoriamensaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCATEGORIAMENSAJE() {
        return categoriamensaje;
    }

    /**
     * Sets the value of the categoriamensaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCATEGORIAMENSAJE(String value) {
        this.categoriamensaje = value;
    }

    /**
     * Gets the value of the numeromensaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROMENSAJE() {
        return numeromensaje;
    }

    /**
     * Sets the value of the numeromensaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROMENSAJE(String value) {
        this.numeromensaje = value;
    }

}
