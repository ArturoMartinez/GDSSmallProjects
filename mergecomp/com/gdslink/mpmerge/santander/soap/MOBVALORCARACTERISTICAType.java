
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MOB_VALOR_CARACTERISTICA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MOB_VALOR_CARACTERISTICA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CARACTERISTICA" type="{http://www.isban.es/webservices/TDCc}MOB_CARACTERISTICA_Type"/>
 *         &lt;element name="CONCEPTO" type="{http://www.isban.es/webservices/TDCs}CONCEPTO_DGO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MOB_VALOR_CARACTERISTICA_Type", propOrder = {
    "caracteristica",
    "concepto"
})
public class MOBVALORCARACTERISTICAType {

    @XmlElement(name = "CARACTERISTICA", required = true)
    protected MOBCARACTERISTICAType caracteristica;
    @XmlElement(name = "CONCEPTO", required = true)
    protected String concepto;

    /**
     * Gets the value of the caracteristica property.
     * 
     * @return
     *     possible object is
     *     {@link MOBCARACTERISTICAType }
     *     
     */
    public MOBCARACTERISTICAType getCARACTERISTICA() {
        return caracteristica;
    }

    /**
     * Sets the value of the caracteristica property.
     * 
     * @param value
     *     allowed object is
     *     {@link MOBCARACTERISTICAType }
     *     
     */
    public void setCARACTERISTICA(MOBCARACTERISTICAType value) {
        this.caracteristica = value;
    }

    /**
     * Gets the value of the concepto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONCEPTO() {
        return concepto;
    }

    /**
     * Sets the value of the concepto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONCEPTO(String value) {
        this.concepto = value;
    }

}
