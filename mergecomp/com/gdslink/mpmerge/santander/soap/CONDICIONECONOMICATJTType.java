
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CONDICION_ECONOMICA_TJT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CONDICION_ECONOMICA_TJT_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SUBTIPO_DE_PRODUCTO" type="{http://www.isban.es/webservices/TDCc}SUBTIPO_DE_PRODUCTO_Type"/>
 *         &lt;element name="IND_VERTIENTE" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_1_Type"/>
 *         &lt;element name="CONPROD" type="{http://www.isban.es/webservices/TDCs}CODIGO_DE_PRODUCTO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONDICION_ECONOMICA_TJT_Type", propOrder = {
    "subtipodeproducto",
    "indvertiente",
    "conprod"
})
public class CONDICIONECONOMICATJTType {

    @XmlElement(name = "SUBTIPO_DE_PRODUCTO", required = true)
    protected SUBTIPODEPRODUCTOType subtipodeproducto;
    @XmlElement(name = "IND_VERTIENTE", required = true)
    protected String indvertiente;
    @XmlElement(name = "CONPROD", required = true)
    protected String conprod;

    /**
     * Gets the value of the subtipodeproducto property.
     * 
     * @return
     *     possible object is
     *     {@link SUBTIPODEPRODUCTOType }
     *     
     */
    public SUBTIPODEPRODUCTOType getSUBTIPODEPRODUCTO() {
        return subtipodeproducto;
    }

    /**
     * Sets the value of the subtipodeproducto property.
     * 
     * @param value
     *     allowed object is
     *     {@link SUBTIPODEPRODUCTOType }
     *     
     */
    public void setSUBTIPODEPRODUCTO(SUBTIPODEPRODUCTOType value) {
        this.subtipodeproducto = value;
    }

    /**
     * Gets the value of the indvertiente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDVERTIENTE() {
        return indvertiente;
    }

    /**
     * Sets the value of the indvertiente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDVERTIENTE(String value) {
        this.indvertiente = value;
    }

    /**
     * Gets the value of the conprod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONPROD() {
        return conprod;
    }

    /**
     * Sets the value of the conprod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONPROD(String value) {
        this.conprod = value;
    }

}
