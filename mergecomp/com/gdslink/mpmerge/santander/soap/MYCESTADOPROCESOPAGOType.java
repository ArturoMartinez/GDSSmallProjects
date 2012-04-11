
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MYC_ESTADO_PROCESO_PAGO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MYC_ESTADO_PROCESO_PAGO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COD_EST_PROCESO" type="{http://www.isban.es/webservices/TDCs}COD_ALFAJUSTI_2_Type"/>
 *         &lt;element name="COD_PRODUCTO" type="{http://www.isban.es/webservices/TDCs}MYC_PRODUCTO_Type"/>
 *         &lt;element name="COD_PROCESO" type="{http://www.isban.es/webservices/TDCs}MYC_PROCESO_Type"/>
 *         &lt;element name="COD_SISTEMA" type="{http://www.isban.es/webservices/TDCs}MYC_SISTEMA_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MYC_ESTADO_PROCESO_PAGO_Type", propOrder = {
    "codestproceso",
    "codproducto",
    "codproceso",
    "codsistema"
})
public class MYCESTADOPROCESOPAGOType {

    @XmlElement(name = "COD_EST_PROCESO", required = true)
    protected String codestproceso;
    @XmlElement(name = "COD_PRODUCTO", required = true)
    protected String codproducto;
    @XmlElement(name = "COD_PROCESO", required = true)
    protected String codproceso;
    @XmlElement(name = "COD_SISTEMA", required = true)
    protected String codsistema;

    /**
     * Gets the value of the codestproceso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODESTPROCESO() {
        return codestproceso;
    }

    /**
     * Sets the value of the codestproceso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODESTPROCESO(String value) {
        this.codestproceso = value;
    }

    /**
     * Gets the value of the codproducto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODPRODUCTO() {
        return codproducto;
    }

    /**
     * Sets the value of the codproducto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODPRODUCTO(String value) {
        this.codproducto = value;
    }

    /**
     * Gets the value of the codproceso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODPROCESO() {
        return codproceso;
    }

    /**
     * Sets the value of the codproceso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODPROCESO(String value) {
        this.codproceso = value;
    }

    /**
     * Gets the value of the codsistema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODSISTEMA() {
        return codsistema;
    }

    /**
     * Sets the value of the codsistema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODSISTEMA(String value) {
        this.codsistema = value;
    }

}
