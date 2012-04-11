
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MARCA_CONTABLE_PNC_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MARCA_CONTABLE_PNC_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NORMATIVA_PNC" type="{http://www.isban.es/webservices/TDCc}NORMATIVA_PNC_Type"/>
 *         &lt;element name="COD_MARCA_CONTABLE" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MARCA_CONTABLE_PNC_Type", propOrder = {
    "normativapnc",
    "codmarcacontable"
})
public class MARCACONTABLEPNCType {

    @XmlElement(name = "NORMATIVA_PNC", required = true)
    protected NORMATIVAPNCType normativapnc;
    @XmlElement(name = "COD_MARCA_CONTABLE", required = true)
    protected String codmarcacontable;

    /**
     * Gets the value of the normativapnc property.
     * 
     * @return
     *     possible object is
     *     {@link NORMATIVAPNCType }
     *     
     */
    public NORMATIVAPNCType getNORMATIVAPNC() {
        return normativapnc;
    }

    /**
     * Sets the value of the normativapnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link NORMATIVAPNCType }
     *     
     */
    public void setNORMATIVAPNC(NORMATIVAPNCType value) {
        this.normativapnc = value;
    }

    /**
     * Gets the value of the codmarcacontable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODMARCACONTABLE() {
        return codmarcacontable;
    }

    /**
     * Sets the value of the codmarcacontable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODMARCACONTABLE(String value) {
        this.codmarcacontable = value;
    }

}
