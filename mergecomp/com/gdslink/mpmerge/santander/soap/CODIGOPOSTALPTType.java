
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CODIGO_POSTAL_PT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CODIGO_POSTAL_PT_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COD_ZONA_POSTAL" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_4_Type"/>
 *         &lt;element name="COD_COMPLEMENTO_POSTAL" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CODIGO_POSTAL_PT_Type", propOrder = {
    "codzonapostal",
    "codcomplementopostal"
})
public class CODIGOPOSTALPTType {

    @XmlElement(name = "COD_ZONA_POSTAL", required = true)
    protected String codzonapostal;
    @XmlElement(name = "COD_COMPLEMENTO_POSTAL", required = true)
    protected String codcomplementopostal;

    /**
     * Gets the value of the codzonapostal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODZONAPOSTAL() {
        return codzonapostal;
    }

    /**
     * Sets the value of the codzonapostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODZONAPOSTAL(String value) {
        this.codzonapostal = value;
    }

    /**
     * Gets the value of the codcomplementopostal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODCOMPLEMENTOPOSTAL() {
        return codcomplementopostal;
    }

    /**
     * Sets the value of the codcomplementopostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODCOMPLEMENTOPOSTAL(String value) {
        this.codcomplementopostal = value;
    }

}
