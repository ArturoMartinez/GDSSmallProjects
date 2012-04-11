
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CONCEPTO_COMUN_CSB_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CONCEPTO_COMUN_CSB_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COD_CONCEPTO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *         &lt;element name="COD_NORMAS_CSB" type="{http://www.isban.es/webservices/TDCs}CODIGO_NORMAS_CSB_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONCEPTO_COMUN_CSB_Type", propOrder = {
    "codconcepto",
    "codnormascsb"
})
public class CONCEPTOCOMUNCSBType {

    @XmlElement(name = "COD_CONCEPTO", required = true)
    protected String codconcepto;
    @XmlElement(name = "COD_NORMAS_CSB", required = true)
    protected String codnormascsb;

    /**
     * Gets the value of the codconcepto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODCONCEPTO() {
        return codconcepto;
    }

    /**
     * Sets the value of the codconcepto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODCONCEPTO(String value) {
        this.codconcepto = value;
    }

    /**
     * Gets the value of the codnormascsb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODNORMASCSB() {
        return codnormascsb;
    }

    /**
     * Sets the value of the codnormascsb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODNORMASCSB(String value) {
        this.codnormascsb = value;
    }

}
