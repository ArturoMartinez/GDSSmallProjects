
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FREGUESIA_PT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FREGUESIA_PT_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CONCELHO_PT" type="{http://www.isban.es/webservices/TDCc}CONCELHO_PT_Type"/>
 *         &lt;element name="COD_FREGUESIA" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FREGUESIA_PT_Type", propOrder = {
    "concelhopt",
    "codfreguesia"
})
public class FREGUESIAPTType {

    @XmlElement(name = "CONCELHO_PT", required = true)
    protected CONCELHOPTType concelhopt;
    @XmlElement(name = "COD_FREGUESIA", required = true)
    protected String codfreguesia;

    /**
     * Gets the value of the concelhopt property.
     * 
     * @return
     *     possible object is
     *     {@link CONCELHOPTType }
     *     
     */
    public CONCELHOPTType getCONCELHOPT() {
        return concelhopt;
    }

    /**
     * Sets the value of the concelhopt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONCELHOPTType }
     *     
     */
    public void setCONCELHOPT(CONCELHOPTType value) {
        this.concelhopt = value;
    }

    /**
     * Gets the value of the codfreguesia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODFREGUESIA() {
        return codfreguesia;
    }

    /**
     * Sets the value of the codfreguesia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODFREGUESIA(String value) {
        this.codfreguesia = value;
    }

}
