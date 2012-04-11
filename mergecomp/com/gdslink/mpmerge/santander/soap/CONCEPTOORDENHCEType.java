
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CONCEPTO_ORDEN_HCE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CONCEPTO_ORDEN_HCE_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODIGO_ALFANUM_1" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_1_Type"/>
 *         &lt;element name="COD_ORDEN_HCE" type="{http://www.isban.es/webservices/TDCs}COD_ORDEN_HCE_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONCEPTO_ORDEN_HCE_Type", propOrder = {
    "codigoalfanum1",
    "codordenhce"
})
public class CONCEPTOORDENHCEType {

    @XmlElement(name = "CODIGO_ALFANUM_1", required = true)
    protected String codigoalfanum1;
    @XmlElement(name = "COD_ORDEN_HCE", required = true)
    protected String codordenhce;

    /**
     * Gets the value of the codigoalfanum1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOALFANUM1() {
        return codigoalfanum1;
    }

    /**
     * Sets the value of the codigoalfanum1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOALFANUM1(String value) {
        this.codigoalfanum1 = value;
    }

    /**
     * Gets the value of the codordenhce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODORDENHCE() {
        return codordenhce;
    }

    /**
     * Sets the value of the codordenhce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODORDENHCE(String value) {
        this.codordenhce = value;
    }

}
