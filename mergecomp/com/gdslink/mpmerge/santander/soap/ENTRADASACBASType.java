
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ENTRADA_SACBAS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ENTRADA_SACBAS_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="APLICACION_EXT_SACBAS" type="{http://www.isban.es/webservices/TDCc}APLICACION_EXT_SACBAS_Type"/>
 *         &lt;element name="COD_ENTRADA_SACBAS" type="{http://www.isban.es/webservices/TDCs}COD_ENTRADA_SACBAS_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENTRADA_SACBAS_Type", propOrder = {
    "aplicacionextsacbas",
    "codentradasacbas"
})
public class ENTRADASACBASType {

    @XmlElement(name = "APLICACION_EXT_SACBAS", required = true)
    protected APLICACIONEXTSACBASType aplicacionextsacbas;
    @XmlElement(name = "COD_ENTRADA_SACBAS", required = true)
    protected String codentradasacbas;

    /**
     * Gets the value of the aplicacionextsacbas property.
     * 
     * @return
     *     possible object is
     *     {@link APLICACIONEXTSACBASType }
     *     
     */
    public APLICACIONEXTSACBASType getAPLICACIONEXTSACBAS() {
        return aplicacionextsacbas;
    }

    /**
     * Sets the value of the aplicacionextsacbas property.
     * 
     * @param value
     *     allowed object is
     *     {@link APLICACIONEXTSACBASType }
     *     
     */
    public void setAPLICACIONEXTSACBAS(APLICACIONEXTSACBASType value) {
        this.aplicacionextsacbas = value;
    }

    /**
     * Gets the value of the codentradasacbas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODENTRADASACBAS() {
        return codentradasacbas;
    }

    /**
     * Sets the value of the codentradasacbas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODENTRADASACBAS(String value) {
        this.codentradasacbas = value;
    }

}
