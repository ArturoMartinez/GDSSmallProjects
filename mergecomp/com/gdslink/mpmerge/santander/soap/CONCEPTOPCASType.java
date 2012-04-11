
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CONCEPTO_PCAS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CONCEPTO_PCAS_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="COD_CONCEPTO_PCAS" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_14_Type"/>
 *         &lt;element name="VALOR_CONCEPTO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONCEPTO_PCAS_Type", propOrder = {
    "empresa",
    "codconceptopcas",
    "valorconcepto"
})
public class CONCEPTOPCASType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "COD_CONCEPTO_PCAS", required = true)
    protected String codconceptopcas;
    @XmlElement(name = "VALOR_CONCEPTO", required = true)
    protected String valorconcepto;

    /**
     * Gets the value of the empresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPRESA() {
        return empresa;
    }

    /**
     * Sets the value of the empresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPRESA(String value) {
        this.empresa = value;
    }

    /**
     * Gets the value of the codconceptopcas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODCONCEPTOPCAS() {
        return codconceptopcas;
    }

    /**
     * Sets the value of the codconceptopcas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODCONCEPTOPCAS(String value) {
        this.codconceptopcas = value;
    }

    /**
     * Gets the value of the valorconcepto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALORCONCEPTO() {
        return valorconcepto;
    }

    /**
     * Sets the value of the valorconcepto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALORCONCEPTO(String value) {
        this.valorconcepto = value;
    }

}
