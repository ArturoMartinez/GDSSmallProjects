
package com.gdslink.mpmerge.santander.soap;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IMPORTE_15_15_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IMPORTE_15_15_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NUM_IMPORTE_15_15" type="{http://www.isban.es/webservices/TDCs}NUMERO_DECIMAL_15_15_Type"/>
 *         &lt;element name="DIVISA" type="{http://www.isban.es/webservices/TDCs}DIVISA_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IMPORTE_15_15_Type", propOrder = {
    "numimporte1515",
    "divisa"
})
public class IMPORTE1515Type {

    @XmlElement(name = "NUM_IMPORTE_15_15", required = true)
    protected BigDecimal numimporte1515;
    @XmlElement(name = "DIVISA", required = true)
    protected String divisa;

    /**
     * Gets the value of the numimporte1515 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNUMIMPORTE1515() {
        return numimporte1515;
    }

    /**
     * Sets the value of the numimporte1515 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNUMIMPORTE1515(BigDecimal value) {
        this.numimporte1515 = value;
    }

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

}
