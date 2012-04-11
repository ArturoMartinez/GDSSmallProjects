
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PT_BIEN_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PT_BIEN_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PT_OFICINA" type="{http://www.isban.es/webservices/TDCs}PT_OFICINA_Type"/>
 *         &lt;element name="PT_NUMERO_DE_BIEN" type="{http://www.isban.es/webservices/TDCs}PT_NUMERO_DE_BIEN_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PT_BIEN_Type", propOrder = {
    "ptoficina",
    "ptnumerodebien"
})
public class PTBIENType {

    @XmlElement(name = "PT_OFICINA", required = true)
    protected String ptoficina;
    @XmlElement(name = "PT_NUMERO_DE_BIEN")
    protected long ptnumerodebien;

    /**
     * Gets the value of the ptoficina property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTOFICINA() {
        return ptoficina;
    }

    /**
     * Sets the value of the ptoficina property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTOFICINA(String value) {
        this.ptoficina = value;
    }

    /**
     * Gets the value of the ptnumerodebien property.
     * 
     */
    public long getPTNUMERODEBIEN() {
        return ptnumerodebien;
    }

    /**
     * Sets the value of the ptnumerodebien property.
     * 
     */
    public void setPTNUMERODEBIEN(long value) {
        this.ptnumerodebien = value;
    }

}
