
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FIGURA_GESTOR_JUDICIAL_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FIGURA_GESTOR_JUDICIAL_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_DE_GESTOR_JUDICIAL" type="{http://www.isban.es/webservices/TDCc}TIPO_DE_GESTOR_JUDICIAL_Type"/>
 *         &lt;element name="COD_FIGURA_GESTOR_JUDICIA" type="{http://www.isban.es/webservices/TDCs}COD_FIGURA_GESTOR_JUDICIA_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FIGURA_GESTOR_JUDICIAL_Type", propOrder = {
    "tipodegestorjudicial",
    "codfiguragestorjudicia"
})
public class FIGURAGESTORJUDICIALType {

    @XmlElement(name = "TIPO_DE_GESTOR_JUDICIAL", required = true)
    protected TIPODEGESTORJUDICIALType tipodegestorjudicial;
    @XmlElement(name = "COD_FIGURA_GESTOR_JUDICIA", required = true)
    protected String codfiguragestorjudicia;

    /**
     * Gets the value of the tipodegestorjudicial property.
     * 
     * @return
     *     possible object is
     *     {@link TIPODEGESTORJUDICIALType }
     *     
     */
    public TIPODEGESTORJUDICIALType getTIPODEGESTORJUDICIAL() {
        return tipodegestorjudicial;
    }

    /**
     * Sets the value of the tipodegestorjudicial property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIPODEGESTORJUDICIALType }
     *     
     */
    public void setTIPODEGESTORJUDICIAL(TIPODEGESTORJUDICIALType value) {
        this.tipodegestorjudicial = value;
    }

    /**
     * Gets the value of the codfiguragestorjudicia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODFIGURAGESTORJUDICIA() {
        return codfiguragestorjudicia;
    }

    /**
     * Sets the value of the codfiguragestorjudicia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODFIGURAGESTORJUDICIA(String value) {
        this.codfiguragestorjudicia = value;
    }

}
