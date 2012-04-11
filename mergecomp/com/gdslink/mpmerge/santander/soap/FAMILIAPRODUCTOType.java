
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FAMILIA_PRODUCTO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FAMILIA_PRODUCTO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CLASE_FAMILIA" type="{http://www.isban.es/webservices/TDCc}CLASE_FAMILIA_PRODUCTO_Type"/>
 *         &lt;element name="COD_FAMILIA_PRODUCTO" type="{http://www.isban.es/webservices/TDCs}COD_FAMILIA_PRODUCTO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FAMILIA_PRODUCTO_Type", propOrder = {
    "clasefamilia",
    "codfamiliaproducto"
})
public class FAMILIAPRODUCTOType {

    @XmlElement(name = "CLASE_FAMILIA", required = true)
    protected CLASEFAMILIAPRODUCTOType clasefamilia;
    @XmlElement(name = "COD_FAMILIA_PRODUCTO", required = true)
    protected String codfamiliaproducto;

    /**
     * Gets the value of the clasefamilia property.
     * 
     * @return
     *     possible object is
     *     {@link CLASEFAMILIAPRODUCTOType }
     *     
     */
    public CLASEFAMILIAPRODUCTOType getCLASEFAMILIA() {
        return clasefamilia;
    }

    /**
     * Sets the value of the clasefamilia property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLASEFAMILIAPRODUCTOType }
     *     
     */
    public void setCLASEFAMILIA(CLASEFAMILIAPRODUCTOType value) {
        this.clasefamilia = value;
    }

    /**
     * Gets the value of the codfamiliaproducto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODFAMILIAPRODUCTO() {
        return codfamiliaproducto;
    }

    /**
     * Sets the value of the codfamiliaproducto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODFAMILIAPRODUCTO(String value) {
        this.codfamiliaproducto = value;
    }

}
