
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SUBTIPO_DE_PRODUCTO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SUBTIPO_DE_PRODUCTO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_DE_PRODUCTO" type="{http://www.isban.es/webservices/TDCc}TIPO_DE_PRODUCTO_Type"/>
 *         &lt;element name="SUBTIPO_DE_PRODUCTO" type="{http://www.isban.es/webservices/TDCs}COD_SUBTIPO_PRODUCTO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SUBTIPO_DE_PRODUCTO_Type", propOrder = {
    "tipodeproducto",
    "subtipodeproducto"
})
public class SUBTIPODEPRODUCTOType {

    @XmlElement(name = "TIPO_DE_PRODUCTO", required = true)
    protected TIPODEPRODUCTOType tipodeproducto;
    @XmlElement(name = "SUBTIPO_DE_PRODUCTO", required = true)
    protected String subtipodeproducto;

    /**
     * Gets the value of the tipodeproducto property.
     * 
     * @return
     *     possible object is
     *     {@link TIPODEPRODUCTOType }
     *     
     */
    public TIPODEPRODUCTOType getTIPODEPRODUCTO() {
        return tipodeproducto;
    }

    /**
     * Sets the value of the tipodeproducto property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIPODEPRODUCTOType }
     *     
     */
    public void setTIPODEPRODUCTO(TIPODEPRODUCTOType value) {
        this.tipodeproducto = value;
    }

    /**
     * Gets the value of the subtipodeproducto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBTIPODEPRODUCTO() {
        return subtipodeproducto;
    }

    /**
     * Sets the value of the subtipodeproducto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBTIPODEPRODUCTO(String value) {
        this.subtipodeproducto = value;
    }

}
