
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CONTRATO_LOCAL_LAR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CONTRATO_LOCAL_LAR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_CONTRATO" type="{http://www.isban.es/webservices/TDCs}TIPO_CONTRATO_LOCAL_Type"/>
 *         &lt;element name="CUENTA_40" type="{http://www.isban.es/webservices/TDCs}CONTR_LOCAL_LOCALIZACION_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONTRATO_LOCAL_LAR_Type", propOrder = {
    "tipocontrato",
    "cuenta40"
})
public class CONTRATOLOCALLARType {

    @XmlElement(name = "TIPO_CONTRATO", required = true)
    protected String tipocontrato;
    @XmlElement(name = "CUENTA_40", required = true)
    protected String cuenta40;

    /**
     * Gets the value of the tipocontrato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOCONTRATO() {
        return tipocontrato;
    }

    /**
     * Sets the value of the tipocontrato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOCONTRATO(String value) {
        this.tipocontrato = value;
    }

    /**
     * Gets the value of the cuenta40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUENTA40() {
        return cuenta40;
    }

    /**
     * Sets the value of the cuenta40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUENTA40(String value) {
        this.cuenta40 = value;
    }

}
