
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CONTRATO_PRESEN_6MAS9MAS3_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CONTRATO_PRESEN_6MAS9MAS3_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CLAVE_CLASIFICACION" type="{http://www.isban.es/webservices/TDCs}CLAVE_CLASIFICACION_INTER_Type"/>
 *         &lt;element name="NUMERO_CONTRATO_1" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_9_Type"/>
 *         &lt;element name="NUMERO_CONTRATO_2" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONTRATO_PRESEN_6MAS9MAS3_Type", propOrder = {
    "claveclasificacion",
    "numerocontrato1",
    "numerocontrato2"
})
public class CONTRATOPRESEN6MAS9MAS3Type {

    @XmlElement(name = "CLAVE_CLASIFICACION", required = true)
    protected String claveclasificacion;
    @XmlElement(name = "NUMERO_CONTRATO_1", required = true)
    protected String numerocontrato1;
    @XmlElement(name = "NUMERO_CONTRATO_2", required = true)
    protected String numerocontrato2;

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
     * Gets the value of the numerocontrato1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROCONTRATO1() {
        return numerocontrato1;
    }

    /**
     * Sets the value of the numerocontrato1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROCONTRATO1(String value) {
        this.numerocontrato1 = value;
    }

    /**
     * Gets the value of the numerocontrato2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROCONTRATO2() {
        return numerocontrato2;
    }

    /**
     * Sets the value of the numerocontrato2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROCONTRATO2(String value) {
        this.numerocontrato2 = value;
    }

}
