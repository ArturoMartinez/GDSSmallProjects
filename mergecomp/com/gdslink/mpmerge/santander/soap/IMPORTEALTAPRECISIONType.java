
package com.gdslink.mpmerge.santander.soap;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IMPORTE_ALTA_PRECISION_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IMPORTE_ALTA_PRECISION_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NUMIMPORTE_ALTA_PRECISION" type="{http://www.isban.es/webservices/TDCs}NUMIMPORTE_ALTA_PRECISION_Type"/>
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
@XmlType(name = "IMPORTE_ALTA_PRECISION_Type", propOrder = {
    "numimportealtaprecision",
    "divisa"
})
public class IMPORTEALTAPRECISIONType {

    @XmlElement(name = "NUMIMPORTE_ALTA_PRECISION", required = true)
    protected BigDecimal numimportealtaprecision;
    @XmlElement(name = "DIVISA", required = true)
    protected String divisa;

    /**
     * Gets the value of the numimportealtaprecision property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNUMIMPORTEALTAPRECISION() {
        return numimportealtaprecision;
    }

    /**
     * Sets the value of the numimportealtaprecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNUMIMPORTEALTAPRECISION(BigDecimal value) {
        this.numimportealtaprecision = value;
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
