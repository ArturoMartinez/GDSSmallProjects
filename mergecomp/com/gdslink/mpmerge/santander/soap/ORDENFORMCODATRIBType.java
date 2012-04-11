
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ORDEN_FORM_COD_ATRIB_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ORDEN_FORM_COD_ATRIB_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COD_ATRIBUTO_PRODUCTO" type="{http://www.isban.es/webservices/TDCs}COD_ATRIBUTO_PRODUCTO_Type"/>
 *         &lt;element name="CODIGO_NUMERICO_1" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_1_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ORDEN_FORM_COD_ATRIB_Type", propOrder = {
    "codatributoproducto",
    "codigonumerico1"
})
public class ORDENFORMCODATRIBType {

    @XmlElement(name = "COD_ATRIBUTO_PRODUCTO", required = true)
    protected String codatributoproducto;
    @XmlElement(name = "CODIGO_NUMERICO_1")
    protected int codigonumerico1;

    /**
     * Gets the value of the codatributoproducto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODATRIBUTOPRODUCTO() {
        return codatributoproducto;
    }

    /**
     * Sets the value of the codatributoproducto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODATRIBUTOPRODUCTO(String value) {
        this.codatributoproducto = value;
    }

    /**
     * Gets the value of the codigonumerico1 property.
     * 
     */
    public int getCODIGONUMERICO1() {
        return codigonumerico1;
    }

    /**
     * Sets the value of the codigonumerico1 property.
     * 
     */
    public void setCODIGONUMERICO1(int value) {
        this.codigonumerico1 = value;
    }

}
