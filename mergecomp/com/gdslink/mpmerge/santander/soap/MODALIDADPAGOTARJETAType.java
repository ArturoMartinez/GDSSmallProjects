
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MODALIDAD_PAGO_TARJETA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MODALIDAD_PAGO_TARJETA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FORMA_PAGO_TARJETA" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *         &lt;element name="COD_MODALIDAD_PAGO" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MODALIDAD_PAGO_TARJETA_Type", propOrder = {
    "formapagotarjeta",
    "codmodalidadpago"
})
public class MODALIDADPAGOTARJETAType {

    @XmlElement(name = "FORMA_PAGO_TARJETA", required = true)
    protected String formapagotarjeta;
    @XmlElement(name = "COD_MODALIDAD_PAGO")
    protected int codmodalidadpago;

    /**
     * Gets the value of the formapagotarjeta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORMAPAGOTARJETA() {
        return formapagotarjeta;
    }

    /**
     * Sets the value of the formapagotarjeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORMAPAGOTARJETA(String value) {
        this.formapagotarjeta = value;
    }

    /**
     * Gets the value of the codmodalidadpago property.
     * 
     */
    public int getCODMODALIDADPAGO() {
        return codmodalidadpago;
    }

    /**
     * Sets the value of the codmodalidadpago property.
     * 
     */
    public void setCODMODALIDADPAGO(int value) {
        this.codmodalidadpago = value;
    }

}
