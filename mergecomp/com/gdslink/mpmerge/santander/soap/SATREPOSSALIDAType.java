
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SATREPOSSALIDA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SATREPOSSALIDA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SATCMAXIMO" type="{http://www.isban.es/webservices/TDCs}SATCMAXIMO_Type"/>
 *         &lt;element name="SATLINEASPAGINA" type="{http://www.isban.es/webservices/TDCs}SATLINEASPAGINA_Type"/>
 *         &lt;element name="SATINDREPOS" type="{http://www.isban.es/webservices/TDCs}SATINDREPOS_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SATREPOSSALIDA_Type", propOrder = {
    "satcmaximo",
    "satlineaspagina",
    "satindrepos"
})
public class SATREPOSSALIDAType {

    @XmlElement(name = "SATCMAXIMO")
    protected int satcmaximo;
    @XmlElement(name = "SATLINEASPAGINA", required = true)
    protected String satlineaspagina;
    @XmlElement(name = "SATINDREPOS", required = true)
    protected String satindrepos;

    /**
     * Gets the value of the satcmaximo property.
     * 
     */
    public int getSATCMAXIMO() {
        return satcmaximo;
    }

    /**
     * Sets the value of the satcmaximo property.
     * 
     */
    public void setSATCMAXIMO(int value) {
        this.satcmaximo = value;
    }

    /**
     * Gets the value of the satlineaspagina property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSATLINEASPAGINA() {
        return satlineaspagina;
    }

    /**
     * Sets the value of the satlineaspagina property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSATLINEASPAGINA(String value) {
        this.satlineaspagina = value;
    }

    /**
     * Gets the value of the satindrepos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSATINDREPOS() {
        return satindrepos;
    }

    /**
     * Sets the value of the satindrepos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSATINDREPOS(String value) {
        this.satindrepos = value;
    }

}
