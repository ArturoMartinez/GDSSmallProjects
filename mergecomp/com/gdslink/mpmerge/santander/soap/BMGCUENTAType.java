
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BMG_CUENTA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BMG_CUENTA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODIGO_BIC" type="{http://www.isban.es/webservices/TDCc}CODIGO_BIC_Type"/>
 *         &lt;element name="BMG_NUMERO_CUENTA" type="{http://www.isban.es/webservices/TDCs}STRING_35_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BMG_CUENTA_Type", propOrder = {
    "codigobic",
    "bmgnumerocuenta"
})
public class BMGCUENTAType {

    @XmlElement(name = "CODIGO_BIC", required = true)
    protected CODIGOBICType codigobic;
    @XmlElement(name = "BMG_NUMERO_CUENTA", required = true)
    protected String bmgnumerocuenta;

    /**
     * Gets the value of the codigobic property.
     * 
     * @return
     *     possible object is
     *     {@link CODIGOBICType }
     *     
     */
    public CODIGOBICType getCODIGOBIC() {
        return codigobic;
    }

    /**
     * Sets the value of the codigobic property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODIGOBICType }
     *     
     */
    public void setCODIGOBIC(CODIGOBICType value) {
        this.codigobic = value;
    }

    /**
     * Gets the value of the bmgnumerocuenta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBMGNUMEROCUENTA() {
        return bmgnumerocuenta;
    }

    /**
     * Sets the value of the bmgnumerocuenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBMGNUMEROCUENTA(String value) {
        this.bmgnumerocuenta = value;
    }

}
