
package com.gdslink.mpmerge.santander.soap;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VALOR_LIQUIDATIVO_FI_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VALOR_LIQUIDATIVO_FI_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VALOR_LIQUIDATIVO" type="{http://www.isban.es/webservices/TDCs}VALOR_DE_PARTICIPACION_Type"/>
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
@XmlType(name = "VALOR_LIQUIDATIVO_FI_Type", propOrder = {
    "valorliquidativo",
    "divisa"
})
public class VALORLIQUIDATIVOFIType {

    @XmlElement(name = "VALOR_LIQUIDATIVO", required = true)
    protected BigDecimal valorliquidativo;
    @XmlElement(name = "DIVISA", required = true)
    protected String divisa;

    /**
     * Gets the value of the valorliquidativo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVALORLIQUIDATIVO() {
        return valorliquidativo;
    }

    /**
     * Sets the value of the valorliquidativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVALORLIQUIDATIVO(BigDecimal value) {
        this.valorliquidativo = value;
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