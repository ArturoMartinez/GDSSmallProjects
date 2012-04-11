
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SUBFAMILIA_PRODUCTO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SUBFAMILIA_PRODUCTO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FAMILIA_PRODUCTO" type="{http://www.isban.es/webservices/TDCc}FAMILIA_PRODUCTO_Type"/>
 *         &lt;element name="COD_SUBFAMILIA_PRODUCTO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SUBFAMILIA_PRODUCTO_Type", propOrder = {
    "familiaproducto",
    "codsubfamiliaproducto"
})
public class SUBFAMILIAPRODUCTOType {

    @XmlElement(name = "FAMILIA_PRODUCTO", required = true)
    protected FAMILIAPRODUCTOType familiaproducto;
    @XmlElement(name = "COD_SUBFAMILIA_PRODUCTO", required = true)
    protected String codsubfamiliaproducto;

    /**
     * Gets the value of the familiaproducto property.
     * 
     * @return
     *     possible object is
     *     {@link FAMILIAPRODUCTOType }
     *     
     */
    public FAMILIAPRODUCTOType getFAMILIAPRODUCTO() {
        return familiaproducto;
    }

    /**
     * Sets the value of the familiaproducto property.
     * 
     * @param value
     *     allowed object is
     *     {@link FAMILIAPRODUCTOType }
     *     
     */
    public void setFAMILIAPRODUCTO(FAMILIAPRODUCTOType value) {
        this.familiaproducto = value;
    }

    /**
     * Gets the value of the codsubfamiliaproducto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODSUBFAMILIAPRODUCTO() {
        return codsubfamiliaproducto;
    }

    /**
     * Sets the value of the codsubfamiliaproducto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODSUBFAMILIAPRODUCTO(String value) {
        this.codsubfamiliaproducto = value;
    }

}
