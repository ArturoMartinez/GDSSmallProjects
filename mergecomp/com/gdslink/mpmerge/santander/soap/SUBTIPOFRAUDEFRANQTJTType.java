
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SUBTIPO_FRAUDE_FRANQ_TJT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SUBTIPO_FRAUDE_FRANQ_TJT_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_FRAUDE_FRANQ_TJT" type="{http://www.isban.es/webservices/TDCc}TIPO_FRAUDE_FRANQ_TJT_Type"/>
 *         &lt;element name="COD_SUBFRAUDE" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_1_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SUBTIPO_FRAUDE_FRANQ_TJT_Type", propOrder = {
    "tipofraudefranqtjt",
    "codsubfraude"
})
public class SUBTIPOFRAUDEFRANQTJTType {

    @XmlElement(name = "TIPO_FRAUDE_FRANQ_TJT", required = true)
    protected TIPOFRAUDEFRANQTJTType tipofraudefranqtjt;
    @XmlElement(name = "COD_SUBFRAUDE", required = true)
    protected String codsubfraude;

    /**
     * Gets the value of the tipofraudefranqtjt property.
     * 
     * @return
     *     possible object is
     *     {@link TIPOFRAUDEFRANQTJTType }
     *     
     */
    public TIPOFRAUDEFRANQTJTType getTIPOFRAUDEFRANQTJT() {
        return tipofraudefranqtjt;
    }

    /**
     * Sets the value of the tipofraudefranqtjt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIPOFRAUDEFRANQTJTType }
     *     
     */
    public void setTIPOFRAUDEFRANQTJT(TIPOFRAUDEFRANQTJTType value) {
        this.tipofraudefranqtjt = value;
    }

    /**
     * Gets the value of the codsubfraude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODSUBFRAUDE() {
        return codsubfraude;
    }

    /**
     * Sets the value of the codsubfraude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODSUBFRAUDE(String value) {
        this.codsubfraude = value;
    }

}
