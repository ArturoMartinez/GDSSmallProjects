
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SUBTEMA_CONSULTA_CSN_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SUBTEMA_CONSULTA_CSN_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TEMA_CONSULTA_CSN" type="{http://www.isban.es/webservices/TDCc}TEMA_CONSULTA_CSN_Type"/>
 *         &lt;element name="CODIGO_NUM_3" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SUBTEMA_CONSULTA_CSN_Type", propOrder = {
    "temaconsultacsn",
    "codigonum3"
})
public class SUBTEMACONSULTACSNType {

    @XmlElement(name = "TEMA_CONSULTA_CSN", required = true)
    protected TEMACONSULTACSNType temaconsultacsn;
    @XmlElement(name = "CODIGO_NUM_3", required = true)
    protected String codigonum3;

    /**
     * Gets the value of the temaconsultacsn property.
     * 
     * @return
     *     possible object is
     *     {@link TEMACONSULTACSNType }
     *     
     */
    public TEMACONSULTACSNType getTEMACONSULTACSN() {
        return temaconsultacsn;
    }

    /**
     * Sets the value of the temaconsultacsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TEMACONSULTACSNType }
     *     
     */
    public void setTEMACONSULTACSN(TEMACONSULTACSNType value) {
        this.temaconsultacsn = value;
    }

    /**
     * Gets the value of the codigonum3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGONUM3() {
        return codigonum3;
    }

    /**
     * Sets the value of the codigonum3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGONUM3(String value) {
        this.codigonum3 = value;
    }

}
