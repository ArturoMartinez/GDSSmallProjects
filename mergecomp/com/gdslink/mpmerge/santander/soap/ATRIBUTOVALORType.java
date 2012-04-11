
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATRIBUTO_VALOR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ATRIBUTO_VALOR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COD_ATRIBUTO_PRODUCTO" type="{http://www.isban.es/webservices/TDCs}COD_ATRIBUTO_PRODUCTO_Type"/>
 *         &lt;element name="VALOR_1" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_25_Type"/>
 *         &lt;element name="VALOR_2" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_25_Type"/>
 *         &lt;element name="VALOR_3" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_10_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATRIBUTO_VALOR_Type", propOrder = {
    "codatributoproducto",
    "valor1",
    "valor2",
    "valor3"
})
public class ATRIBUTOVALORType {

    @XmlElement(name = "COD_ATRIBUTO_PRODUCTO", required = true)
    protected String codatributoproducto;
    @XmlElement(name = "VALOR_1", required = true)
    protected String valor1;
    @XmlElement(name = "VALOR_2", required = true)
    protected String valor2;
    @XmlElement(name = "VALOR_3", required = true)
    protected String valor3;

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
     * Gets the value of the valor1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALOR1() {
        return valor1;
    }

    /**
     * Sets the value of the valor1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALOR1(String value) {
        this.valor1 = value;
    }

    /**
     * Gets the value of the valor2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALOR2() {
        return valor2;
    }

    /**
     * Sets the value of the valor2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALOR2(String value) {
        this.valor2 = value;
    }

    /**
     * Gets the value of the valor3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALOR3() {
        return valor3;
    }

    /**
     * Sets the value of the valor3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALOR3(String value) {
        this.valor3 = value;
    }

}
