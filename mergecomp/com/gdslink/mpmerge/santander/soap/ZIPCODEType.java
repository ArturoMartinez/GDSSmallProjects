
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZIP_CODE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZIP_CODE_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZIPCODE" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_5_Type"/>
 *         &lt;element name="CODIGO_CONDADO" type="{http://www.isban.es/webservices/TDCs}CODIGO_CONDADO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZIP_CODE_Type", propOrder = {
    "zipcode",
    "codigocondado"
})
public class ZIPCODEType {

    @XmlElement(name = "ZIPCODE", required = true)
    protected String zipcode;
    @XmlElement(name = "CODIGO_CONDADO")
    protected int codigocondado;

    /**
     * Gets the value of the zipcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZIPCODE() {
        return zipcode;
    }

    /**
     * Sets the value of the zipcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZIPCODE(String value) {
        this.zipcode = value;
    }

    /**
     * Gets the value of the codigocondado property.
     * 
     */
    public int getCODIGOCONDADO() {
        return codigocondado;
    }

    /**
     * Sets the value of the codigocondado property.
     * 
     */
    public void setCODIGOCONDADO(int value) {
        this.codigocondado = value;
    }

}
