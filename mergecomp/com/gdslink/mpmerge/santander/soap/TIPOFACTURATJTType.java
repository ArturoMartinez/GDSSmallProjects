
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TIPO_FACTURA_TJT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIPO_FACTURA_TJT_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="INDICADOR" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_1_Type"/>
 *         &lt;element name="TIPO_FACTURA" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_4_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIPO_FACTURA_TJT_Type", propOrder = {
    "empresa",
    "indicador",
    "tipofactura"
})
public class TIPOFACTURATJTType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "INDICADOR")
    protected int indicador;
    @XmlElement(name = "TIPO_FACTURA")
    protected int tipofactura;

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
     * Gets the value of the indicador property.
     * 
     */
    public int getINDICADOR() {
        return indicador;
    }

    /**
     * Sets the value of the indicador property.
     * 
     */
    public void setINDICADOR(int value) {
        this.indicador = value;
    }

    /**
     * Gets the value of the tipofactura property.
     * 
     */
    public int getTIPOFACTURA() {
        return tipofactura;
    }

    /**
     * Sets the value of the tipofactura property.
     * 
     */
    public void setTIPOFACTURA(int value) {
        this.tipofactura = value;
    }

}
