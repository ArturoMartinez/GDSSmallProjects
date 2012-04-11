
package com.gdslink.mpmerge.santander.soap;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IMPORTE_PRECISO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IMPORTE_PRECISO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NUMERO_IMPORTE_PRECISO" type="{http://www.isban.es/webservices/TDCs}NUMERO_PRECISO_Type"/>
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
@XmlType(name = "IMPORTE_PRECISO_Type", propOrder = {
    "numeroimportepreciso",
    "divisa"
})
public class IMPORTEPRECISOType {

    @XmlElement(name = "NUMERO_IMPORTE_PRECISO", required = true)
    protected BigDecimal numeroimportepreciso;
    @XmlElement(name = "DIVISA", required = true)
    protected String divisa;

    /**
     * Gets the value of the numeroimportepreciso property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNUMEROIMPORTEPRECISO() {
        return numeroimportepreciso;
    }

    /**
     * Sets the value of the numeroimportepreciso property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNUMEROIMPORTEPRECISO(BigDecimal value) {
        this.numeroimportepreciso = value;
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
