
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MYC_ESTADO_SISTEMA_PAGO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MYC_ESTADO_SISTEMA_PAGO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MYC_ESTADO_PROCESO_PAGO" type="{http://www.isban.es/webservices/TDCc}MYC_ESTADO_PROCESO_PAGO_Type"/>
 *         &lt;element name="COD_EST_SISTEMA" type="{http://www.isban.es/webservices/TDCs}COD_ALFAJUSTI_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MYC_ESTADO_SISTEMA_PAGO_Type", propOrder = {
    "mycestadoprocesopago",
    "codestsistema"
})
public class MYCESTADOSISTEMAPAGOType {

    @XmlElement(name = "MYC_ESTADO_PROCESO_PAGO", required = true)
    protected MYCESTADOPROCESOPAGOType mycestadoprocesopago;
    @XmlElement(name = "COD_EST_SISTEMA", required = true)
    protected String codestsistema;

    /**
     * Gets the value of the mycestadoprocesopago property.
     * 
     * @return
     *     possible object is
     *     {@link MYCESTADOPROCESOPAGOType }
     *     
     */
    public MYCESTADOPROCESOPAGOType getMYCESTADOPROCESOPAGO() {
        return mycestadoprocesopago;
    }

    /**
     * Sets the value of the mycestadoprocesopago property.
     * 
     * @param value
     *     allowed object is
     *     {@link MYCESTADOPROCESOPAGOType }
     *     
     */
    public void setMYCESTADOPROCESOPAGO(MYCESTADOPROCESOPAGOType value) {
        this.mycestadoprocesopago = value;
    }

    /**
     * Gets the value of the codestsistema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODESTSISTEMA() {
        return codestsistema;
    }

    /**
     * Sets the value of the codestsistema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODESTSISTEMA(String value) {
        this.codestsistema = value;
    }

}
