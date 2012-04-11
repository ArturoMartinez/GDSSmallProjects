
package com.gdslink.mpmerge.santander.soap;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COTIZACION_VALORES_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COTIZACION_VALORES_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NUMERO_IMPORTE_VALORES" type="{http://www.isban.es/webservices/TDCs}NUMERO_IMPORTE_VALORES_Type"/>
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
@XmlType(name = "COTIZACION_VALORES_Type", propOrder = {
    "numeroimportevalores",
    "divisa"
})
public class COTIZACIONVALORESType {

    @XmlElement(name = "NUMERO_IMPORTE_VALORES", required = true)
    protected BigDecimal numeroimportevalores;
    @XmlElement(name = "DIVISA", required = true)
    protected String divisa;

    /**
     * Gets the value of the numeroimportevalores property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNUMEROIMPORTEVALORES() {
        return numeroimportevalores;
    }

    /**
     * Sets the value of the numeroimportevalores property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNUMEROIMPORTEVALORES(BigDecimal value) {
        this.numeroimportevalores = value;
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
