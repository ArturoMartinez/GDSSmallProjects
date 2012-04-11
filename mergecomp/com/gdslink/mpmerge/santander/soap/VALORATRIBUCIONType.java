
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VALOR_ATRIBUCION_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VALOR_ATRIBUCION_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="TIPO_ATRIBUCION" type="{http://www.isban.es/webservices/TDCs}TIPO_ATRIBUCION_Type"/>
 *         &lt;element name="COD_ALFANUM_2" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VALOR_ATRIBUCION_Type", propOrder = {
    "empresa",
    "tipoatribucion",
    "codalfanum2"
})
public class VALORATRIBUCIONType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "TIPO_ATRIBUCION", required = true)
    protected String tipoatribucion;
    @XmlElement(name = "COD_ALFANUM_2", required = true)
    protected String codalfanum2;

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
     * Gets the value of the tipoatribucion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOATRIBUCION() {
        return tipoatribucion;
    }

    /**
     * Sets the value of the tipoatribucion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOATRIBUCION(String value) {
        this.tipoatribucion = value;
    }

    /**
     * Gets the value of the codalfanum2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODALFANUM2() {
        return codalfanum2;
    }

    /**
     * Sets the value of the codalfanum2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODALFANUM2(String value) {
        this.codalfanum2 = value;
    }

}
