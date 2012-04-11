
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OPERACION_DE_NEGOCIO_PB_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OPERACION_DE_NEGOCIO_PB_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SUBTIPO_DE_PRODUCTO" type="{http://www.isban.es/webservices/TDCc}SUBTIPO_DE_PRODUCTO_Type"/>
 *         &lt;element name="COD_OPERACION_NEGOCIO" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_7_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OPERACION_DE_NEGOCIO_PB_Type", propOrder = {
    "subtipodeproducto",
    "codoperacionnegocio"
})
public class OPERACIONDENEGOCIOPBType {

    @XmlElement(name = "SUBTIPO_DE_PRODUCTO", required = true)
    protected SUBTIPODEPRODUCTOType subtipodeproducto;
    @XmlElement(name = "COD_OPERACION_NEGOCIO", required = true)
    protected String codoperacionnegocio;

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
     * Gets the value of the codoperacionnegocio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODOPERACIONNEGOCIO() {
        return codoperacionnegocio;
    }

    /**
     * Sets the value of the codoperacionnegocio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODOPERACIONNEGOCIO(String value) {
        this.codoperacionnegocio = value;
    }

}
