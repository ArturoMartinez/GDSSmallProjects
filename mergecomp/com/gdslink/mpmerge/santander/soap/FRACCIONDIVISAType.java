
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FRACCION_DIVISA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FRACCION_DIVISA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DIVISA" type="{http://www.isban.es/webservices/TDCs}DIVISA_Type"/>
 *         &lt;element name="NUM_SEC_FRACCION" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_1_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FRACCION_DIVISA_Type", propOrder = {
    "divisa",
    "numsecfraccion"
})
public class FRACCIONDIVISAType {

    @XmlElement(name = "DIVISA", required = true)
    protected String divisa;
    @XmlElement(name = "NUM_SEC_FRACCION", required = true)
    protected String numsecfraccion;

    /**
     * Gets the value of the divisa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIVISA() {
        return divisa;
    }

    /**
     * Sets the value of the divisa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIVISA(String value) {
        this.divisa = value;
    }

    /**
     * Gets the value of the numsecfraccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMSECFRACCION() {
        return numsecfraccion;
    }

    /**
     * Sets the value of the numsecfraccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMSECFRACCION(String value) {
        this.numsecfraccion = value;
    }

}
