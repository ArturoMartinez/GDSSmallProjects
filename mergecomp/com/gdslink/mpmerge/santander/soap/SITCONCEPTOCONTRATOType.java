
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SIT_CONCEPTO_CONTRATO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SIT_CONCEPTO_CONTRATO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_MOVIMIENTO" type="{http://www.isban.es/webservices/TDCs}TIPO_MOVIMIENTO_Type"/>
 *         &lt;element name="SITUACION_CONCEPTO_CONTR_" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SIT_CONCEPTO_CONTRATO_Type", propOrder = {
    "tipomovimiento",
    "situacionconceptocontr"
})
public class SITCONCEPTOCONTRATOType {

    @XmlElement(name = "TIPO_MOVIMIENTO", required = true)
    protected String tipomovimiento;
    @XmlElement(name = "SITUACION_CONCEPTO_CONTR_", required = true)
    protected String situacionconceptocontr;

    /**
     * Gets the value of the tipomovimiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOMOVIMIENTO() {
        return tipomovimiento;
    }

    /**
     * Sets the value of the tipomovimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOMOVIMIENTO(String value) {
        this.tipomovimiento = value;
    }

    /**
     * Gets the value of the situacionconceptocontr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSITUACIONCONCEPTOCONTR() {
        return situacionconceptocontr;
    }

    /**
     * Sets the value of the situacionconceptocontr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSITUACIONCONCEPTOCONTR(String value) {
        this.situacionconceptocontr = value;
    }

}
