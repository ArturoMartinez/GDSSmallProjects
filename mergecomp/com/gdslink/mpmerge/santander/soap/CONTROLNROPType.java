
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CONTROL_NROP_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CONTROL_NROP_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="MODULO_ROP" type="{http://www.isban.es/webservices/TDCs}MODULO_ROP_Type"/>
 *         &lt;element name="COD_ALFANUM_3" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONTROL_NROP_Type", propOrder = {
    "empresa",
    "modulorop",
    "codalfanum3"
})
public class CONTROLNROPType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "MODULO_ROP", required = true)
    protected String modulorop;
    @XmlElement(name = "COD_ALFANUM_3", required = true)
    protected String codalfanum3;

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
     * Gets the value of the modulorop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMODULOROP() {
        return modulorop;
    }

    /**
     * Sets the value of the modulorop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODULOROP(String value) {
        this.modulorop = value;
    }

    /**
     * Gets the value of the codalfanum3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODALFANUM3() {
        return codalfanum3;
    }

    /**
     * Sets the value of the codalfanum3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODALFANUM3(String value) {
        this.codalfanum3 = value;
    }

}
