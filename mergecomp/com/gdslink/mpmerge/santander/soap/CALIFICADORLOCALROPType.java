
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CALIFICADOR_LOCAL_ROP_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CALIFICADOR_LOCAL_ROP_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="TIPO_CALIFICADOR_ROP" type="{http://www.isban.es/webservices/TDCs}TIPO_CALIFICADOR_ROP_Type"/>
 *         &lt;element name="CODIGO_ALFANUM_8" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_8_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CALIFICADOR_LOCAL_ROP_Type", propOrder = {
    "empresa",
    "tipocalificadorrop",
    "codigoalfanum8"
})
public class CALIFICADORLOCALROPType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "TIPO_CALIFICADOR_ROP", required = true)
    protected String tipocalificadorrop;
    @XmlElement(name = "CODIGO_ALFANUM_8", required = true)
    protected String codigoalfanum8;

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
     * Gets the value of the tipocalificadorrop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOCALIFICADORROP() {
        return tipocalificadorrop;
    }

    /**
     * Sets the value of the tipocalificadorrop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOCALIFICADORROP(String value) {
        this.tipocalificadorrop = value;
    }

    /**
     * Gets the value of the codigoalfanum8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOALFANUM8() {
        return codigoalfanum8;
    }

    /**
     * Sets the value of the codigoalfanum8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOALFANUM8(String value) {
        this.codigoalfanum8 = value;
    }

}
