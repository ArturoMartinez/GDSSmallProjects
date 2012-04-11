
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BMG_FLUJO_NOMINAL_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BMG_FLUJO_NOMINAL_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BMG_SECURITY" type="{http://www.isban.es/webservices/TDCs}BMG_SECURITY_Type"/>
 *         &lt;element name="ID_OPERACIONES" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_5_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BMG_FLUJO_NOMINAL_Type", propOrder = {
    "bmgsecurity",
    "idoperaciones"
})
public class BMGFLUJONOMINALType {

    @XmlElement(name = "BMG_SECURITY", required = true)
    protected String bmgsecurity;
    @XmlElement(name = "ID_OPERACIONES")
    protected int idoperaciones;

    /**
     * Gets the value of the bmgsecurity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBMGSECURITY() {
        return bmgsecurity;
    }

    /**
     * Sets the value of the bmgsecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBMGSECURITY(String value) {
        this.bmgsecurity = value;
    }

    /**
     * Gets the value of the idoperaciones property.
     * 
     */
    public int getIDOPERACIONES() {
        return idoperaciones;
    }

    /**
     * Sets the value of the idoperaciones property.
     * 
     */
    public void setIDOPERACIONES(int value) {
        this.idoperaciones = value;
    }

}
