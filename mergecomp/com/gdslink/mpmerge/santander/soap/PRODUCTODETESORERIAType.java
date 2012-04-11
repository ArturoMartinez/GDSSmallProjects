
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PRODUCTO_DE_TESORERIA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PRODUCTO_DE_TESORERIA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ESTRUCTURA_DE_TESORERIA" type="{http://www.isban.es/webservices/TDCc}ESTRUCTURA_DE_TESORERIA_Type"/>
 *         &lt;element name="TIPO_PRODUCTO" type="{http://www.isban.es/webservices/TDCs}TIPO_PRODUCTO_TESORERIA_Type"/>
 *         &lt;element name="NUMERO_DE_PRODUCTO" type="{http://www.isban.es/webservices/TDCs}NUMERO_CUENTA_INTERNO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRODUCTO_DE_TESORERIA_Type", propOrder = {
    "estructuradetesoreria",
    "tipoproducto",
    "numerodeproducto"
})
public class PRODUCTODETESORERIAType {

    @XmlElement(name = "ESTRUCTURA_DE_TESORERIA", required = true)
    protected ESTRUCTURADETESORERIAType estructuradetesoreria;
    @XmlElement(name = "TIPO_PRODUCTO", required = true)
    protected String tipoproducto;
    @XmlElement(name = "NUMERO_DE_PRODUCTO", required = true)
    protected String numerodeproducto;

    /**
     * Gets the value of the estructuradetesoreria property.
     * 
     * @return
     *     possible object is
     *     {@link ESTRUCTURADETESORERIAType }
     *     
     */
    public ESTRUCTURADETESORERIAType getESTRUCTURADETESORERIA() {
        return estructuradetesoreria;
    }

    /**
     * Sets the value of the estructuradetesoreria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESTRUCTURADETESORERIAType }
     *     
     */
    public void setESTRUCTURADETESORERIA(ESTRUCTURADETESORERIAType value) {
        this.estructuradetesoreria = value;
    }

    /**
     * Gets the value of the tipoproducto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOPRODUCTO() {
        return tipoproducto;
    }

    /**
     * Sets the value of the tipoproducto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOPRODUCTO(String value) {
        this.tipoproducto = value;
    }

    /**
     * Gets the value of the numerodeproducto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERODEPRODUCTO() {
        return numerodeproducto;
    }

    /**
     * Sets the value of the numerodeproducto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERODEPRODUCTO(String value) {
        this.numerodeproducto = value;
    }

}
