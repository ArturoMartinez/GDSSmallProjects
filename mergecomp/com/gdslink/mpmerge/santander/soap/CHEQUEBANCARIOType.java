
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CHEQUE_BANCARIO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CHEQUE_BANCARIO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CLAVE_CLASIFICACION" type="{http://www.isban.es/webservices/TDCs}CLAVE_CLASIFICACION_INTER_Type"/>
 *         &lt;element name="NUMERO_CUENTA_CHEQUE" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_7_Type"/>
 *         &lt;element name="DIGITO_DE_CONTROL" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_1_Type"/>
 *         &lt;element name="NUMERO_DE_CHEQUE" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_6_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CHEQUE_BANCARIO_Type", propOrder = {
    "claveclasificacion",
    "numerocuentacheque",
    "digitodecontrol",
    "numerodecheque"
})
public class CHEQUEBANCARIOType {

    @XmlElement(name = "CLAVE_CLASIFICACION", required = true)
    protected String claveclasificacion;
    @XmlElement(name = "NUMERO_CUENTA_CHEQUE", required = true)
    protected String numerocuentacheque;
    @XmlElement(name = "DIGITO_DE_CONTROL", required = true)
    protected String digitodecontrol;
    @XmlElement(name = "NUMERO_DE_CHEQUE", required = true)
    protected String numerodecheque;

    /**
     * Gets the value of the claveclasificacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLAVECLASIFICACION() {
        return claveclasificacion;
    }

    /**
     * Sets the value of the claveclasificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLAVECLASIFICACION(String value) {
        this.claveclasificacion = value;
    }

    /**
     * Gets the value of the numerocuentacheque property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROCUENTACHEQUE() {
        return numerocuentacheque;
    }

    /**
     * Sets the value of the numerocuentacheque property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROCUENTACHEQUE(String value) {
        this.numerocuentacheque = value;
    }

    /**
     * Gets the value of the digitodecontrol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIGITODECONTROL() {
        return digitodecontrol;
    }

    /**
     * Sets the value of the digitodecontrol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIGITODECONTROL(String value) {
        this.digitodecontrol = value;
    }

    /**
     * Gets the value of the numerodecheque property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERODECHEQUE() {
        return numerodecheque;
    }

    /**
     * Sets the value of the numerodecheque property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERODECHEQUE(String value) {
        this.numerodecheque = value;
    }

}
