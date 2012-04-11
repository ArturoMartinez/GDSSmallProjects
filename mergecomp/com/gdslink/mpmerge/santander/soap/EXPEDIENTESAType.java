
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXPEDIENTE_SA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXPEDIENTE_SA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="COMPONENTE_2" type="{http://www.isban.es/webservices/TDCs}AGRUPACION_DE_CANAL_Type"/>
 *         &lt;element name="COMPONENTE_3" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_7_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXPEDIENTE_SA_Type", propOrder = {
    "empresa",
    "componente2",
    "componente3"
})
public class EXPEDIENTESAType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "COMPONENTE_2", required = true)
    protected String componente2;
    @XmlElement(name = "COMPONENTE_3", required = true)
    protected String componente3;

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
     * Gets the value of the componente2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPONENTE2() {
        return componente2;
    }

    /**
     * Sets the value of the componente2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPONENTE2(String value) {
        this.componente2 = value;
    }

    /**
     * Gets the value of the componente3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPONENTE3() {
        return componente3;
    }

    /**
     * Sets the value of the componente3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPONENTE3(String value) {
        this.componente3 = value;
    }

}
