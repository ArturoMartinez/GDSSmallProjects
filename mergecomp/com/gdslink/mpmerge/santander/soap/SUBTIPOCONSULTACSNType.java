
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SUBTIPO_CONSULTA_CSN_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SUBTIPO_CONSULTA_CSN_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_CONSULTA_CSN" type="{http://www.isban.es/webservices/TDCc}TIPO_CONSULTA_CSN_Type"/>
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
@XmlType(name = "SUBTIPO_CONSULTA_CSN_Type", propOrder = {
    "tipoconsultacsn",
    "codigonum3"
})
public class SUBTIPOCONSULTACSNType {

    @XmlElement(name = "TIPO_CONSULTA_CSN", required = true)
    protected TIPOCONSULTACSNType tipoconsultacsn;
    @XmlElement(name = "CODIGO_NUM_3", required = true)
    protected String codigonum3;

    /**
     * Gets the value of the tipoconsultacsn property.
     * 
     * @return
     *     possible object is
     *     {@link TIPOCONSULTACSNType }
     *     
     */
    public TIPOCONSULTACSNType getTIPOCONSULTACSN() {
        return tipoconsultacsn;
    }

    /**
     * Sets the value of the tipoconsultacsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIPOCONSULTACSNType }
     *     
     */
    public void setTIPOCONSULTACSN(TIPOCONSULTACSNType value) {
        this.tipoconsultacsn = value;
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
