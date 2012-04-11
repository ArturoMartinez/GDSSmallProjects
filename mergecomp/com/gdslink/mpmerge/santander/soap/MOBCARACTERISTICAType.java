
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MOB_CARACTERISTICA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MOB_CARACTERISTICA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_CARACT" type="{http://www.isban.es/webservices/TDCs}MOB_TIP_CARACT_Type"/>
 *         &lt;element name="CARACTERISTICA" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_7_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MOB_CARACTERISTICA_Type", propOrder = {
    "tipocaract",
    "caracteristica"
})
public class MOBCARACTERISTICAType {

    @XmlElement(name = "TIPO_CARACT", required = true)
    protected String tipocaract;
    @XmlElement(name = "CARACTERISTICA")
    protected int caracteristica;

    /**
     * Gets the value of the tipocaract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOCARACT() {
        return tipocaract;
    }

    /**
     * Sets the value of the tipocaract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOCARACT(String value) {
        this.tipocaract = value;
    }

    /**
     * Gets the value of the caracteristica property.
     * 
     */
    public int getCARACTERISTICA() {
        return caracteristica;
    }

    /**
     * Sets the value of the caracteristica property.
     * 
     */
    public void setCARACTERISTICA(int value) {
        this.caracteristica = value;
    }

}
