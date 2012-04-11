
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CUENTA_PLAN_CONSOLI_FINAN_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CUENTA_PLAN_CONSOLI_FINAN_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PLAN_CUENTA" type="{http://www.isban.es/webservices/TDCc}PLAN_CUENTA_CONSOLI_FINAN_Type"/>
 *         &lt;element name="COD_ALFANUM_30" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_30_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CUENTA_PLAN_CONSOLI_FINAN_Type", propOrder = {
    "plancuenta",
    "codalfanum30"
})
public class CUENTAPLANCONSOLIFINANType {

    @XmlElement(name = "PLAN_CUENTA", required = true)
    protected PLANCUENTACONSOLIFINANType plancuenta;
    @XmlElement(name = "COD_ALFANUM_30", required = true)
    protected String codalfanum30;

    /**
     * Gets the value of the plancuenta property.
     * 
     * @return
     *     possible object is
     *     {@link PLANCUENTACONSOLIFINANType }
     *     
     */
    public PLANCUENTACONSOLIFINANType getPLANCUENTA() {
        return plancuenta;
    }

    /**
     * Sets the value of the plancuenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link PLANCUENTACONSOLIFINANType }
     *     
     */
    public void setPLANCUENTA(PLANCUENTACONSOLIFINANType value) {
        this.plancuenta = value;
    }

    /**
     * Gets the value of the codalfanum30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODALFANUM30() {
        return codalfanum30;
    }

    /**
     * Sets the value of the codalfanum30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODALFANUM30(String value) {
        this.codalfanum30 = value;
    }

}
