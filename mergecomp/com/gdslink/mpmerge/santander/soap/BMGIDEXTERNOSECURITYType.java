
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BMG_ID_EXTERNO_SECURITY_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BMG_ID_EXTERNO_SECURITY_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BMG_TIPO_ID_SECURITY" type="{http://www.isban.es/webservices/TDCs}BMG_TIPO_ID_SECURITY_Type"/>
 *         &lt;element name="BMG_COD_ID_EXT_SECURITY" type="{http://www.isban.es/webservices/TDCs}STRING_30_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BMG_ID_EXTERNO_SECURITY_Type", propOrder = {
    "bmgtipoidsecurity",
    "bmgcodidextsecurity"
})
public class BMGIDEXTERNOSECURITYType {

    @XmlElement(name = "BMG_TIPO_ID_SECURITY", required = true)
    protected String bmgtipoidsecurity;
    @XmlElement(name = "BMG_COD_ID_EXT_SECURITY", required = true)
    protected String bmgcodidextsecurity;

    /**
     * Gets the value of the bmgtipoidsecurity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBMGTIPOIDSECURITY() {
        return bmgtipoidsecurity;
    }

    /**
     * Sets the value of the bmgtipoidsecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBMGTIPOIDSECURITY(String value) {
        this.bmgtipoidsecurity = value;
    }

    /**
     * Gets the value of the bmgcodidextsecurity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBMGCODIDEXTSECURITY() {
        return bmgcodidextsecurity;
    }

    /**
     * Sets the value of the bmgcodidextsecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBMGCODIDEXTSECURITY(String value) {
        this.bmgcodidextsecurity = value;
    }

}
