
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TIPO_PREFIJO_TLF_UK_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIPO_PREFIJO_TLF_UK_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_NUMERO_TELEFONICO" type="{http://www.isban.es/webservices/TDCs}TIPO_NUMERO_TELEFONICO_UK_Type"/>
 *         &lt;element name="CODIGO_ALFANUM_5" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_5_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIPO_PREFIJO_TLF_UK_Type", propOrder = {
    "tiponumerotelefonico",
    "codigoalfanum5"
})
public class TIPOPREFIJOTLFUKType {

    @XmlElement(name = "TIPO_NUMERO_TELEFONICO", required = true)
    protected String tiponumerotelefonico;
    @XmlElement(name = "CODIGO_ALFANUM_5", required = true)
    protected String codigoalfanum5;

    /**
     * Gets the value of the tiponumerotelefonico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPONUMEROTELEFONICO() {
        return tiponumerotelefonico;
    }

    /**
     * Sets the value of the tiponumerotelefonico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPONUMEROTELEFONICO(String value) {
        this.tiponumerotelefonico = value;
    }

    /**
     * Gets the value of the codigoalfanum5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOALFANUM5() {
        return codigoalfanum5;
    }

    /**
     * Sets the value of the codigoalfanum5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOALFANUM5(String value) {
        this.codigoalfanum5 = value;
    }

}
