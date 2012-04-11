
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POS_MOROSIDAD_PNC_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POS_MOROSIDAD_PNC_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="TIPO_MOVIMIENTO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *         &lt;element name="TIPO_MOROSIDAD" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POS_MOROSIDAD_PNC_Type", propOrder = {
    "empresa",
    "tipomovimiento",
    "tipomorosidad"
})
public class POSMOROSIDADPNCType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "TIPO_MOVIMIENTO", required = true)
    protected String tipomovimiento;
    @XmlElement(name = "TIPO_MOROSIDAD", required = true)
    protected String tipomorosidad;

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
     * Gets the value of the tipomorosidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOMOROSIDAD() {
        return tipomorosidad;
    }

    /**
     * Sets the value of the tipomorosidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOMOROSIDAD(String value) {
        this.tipomorosidad = value;
    }

}
