
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CONCEP_APLICI_TRANSF_INTE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CONCEP_APLICI_TRANSF_INTE_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SUBTIPO_DE_PRODUCTO" type="{http://www.isban.es/webservices/TDCc}SUBTIPO_DE_PRODUCTO_Type"/>
 *         &lt;element name="CODIGO_APLICACION" type="{http://www.isban.es/webservices/TDCs}CODIGO_APLICACION_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONCEP_APLICI_TRANSF_INTE_Type", propOrder = {
    "subtipodeproducto",
    "codigoaplicacion"
})
public class CONCEPAPLICITRANSFINTEType {

    @XmlElement(name = "SUBTIPO_DE_PRODUCTO", required = true)
    protected SUBTIPODEPRODUCTOType subtipodeproducto;
    @XmlElement(name = "CODIGO_APLICACION", required = true)
    protected String codigoaplicacion;

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
     * Gets the value of the codigoaplicacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOAPLICACION() {
        return codigoaplicacion;
    }

    /**
     * Sets the value of the codigoaplicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOAPLICACION(String value) {
        this.codigoaplicacion = value;
    }

}
