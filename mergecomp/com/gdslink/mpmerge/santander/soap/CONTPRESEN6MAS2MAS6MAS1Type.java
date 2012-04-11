
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CONT_PRESEN_6MAS2MAS6MAS1_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CONT_PRESEN_6MAS2MAS6MAS1_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CLAVE_CLASIFICACION" type="{http://www.isban.es/webservices/TDCs}CLAVE_CLASIFICACION_INTER_Type"/>
 *         &lt;element name="NUMERO_CONTRATO_1" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *         &lt;element name="NUMERO_CONTRATO_2" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_6_Type"/>
 *         &lt;element name="NUMERO_CONTRATO_3" type="{http://www.isban.es/webservices/TDCs}STRING_1_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONT_PRESEN_6MAS2MAS6MAS1_Type", propOrder = {
    "claveclasificacion",
    "numerocontrato1",
    "numerocontrato2",
    "numerocontrato3"
})
public class CONTPRESEN6MAS2MAS6MAS1Type {

    @XmlElement(name = "CLAVE_CLASIFICACION", required = true)
    protected String claveclasificacion;
    @XmlElement(name = "NUMERO_CONTRATO_1", required = true)
    protected String numerocontrato1;
    @XmlElement(name = "NUMERO_CONTRATO_2", required = true)
    protected String numerocontrato2;
    @XmlElement(name = "NUMERO_CONTRATO_3", required = true)
    protected String numerocontrato3;

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

    /**
     * Gets the value of the numerocontrato3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROCONTRATO3() {
        return numerocontrato3;
    }

    /**
     * Sets the value of the numerocontrato3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROCONTRATO3(String value) {
        this.numerocontrato3 = value;
    }

}
