
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CODIGO_POSTAL_USA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CODIGO_POSTAL_USA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COD_POSTAL" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUM_5_Type"/>
 *         &lt;element name="DETALLE_CP" type="{http://www.isban.es/webservices/TDCs}STRING_4_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CODIGO_POSTAL_USA_Type", propOrder = {
    "codpostal",
    "detallecp"
})
public class CODIGOPOSTALUSAType {

    @XmlElement(name = "COD_POSTAL", required = true)
    protected String codpostal;
    @XmlElement(name = "DETALLE_CP", required = true)
    protected String detallecp;

    /**
     * Gets the value of the codpostal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODPOSTAL() {
        return codpostal;
    }

    /**
     * Sets the value of the codpostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODPOSTAL(String value) {
        this.codpostal = value;
    }

    /**
     * Gets the value of the detallecp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDETALLECP() {
        return detallecp;
    }

    /**
     * Sets the value of the detallecp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDETALLECP(String value) {
        this.detallecp = value;
    }

}
