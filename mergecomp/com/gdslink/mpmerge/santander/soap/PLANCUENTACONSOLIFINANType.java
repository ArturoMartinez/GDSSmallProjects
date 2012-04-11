
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PLAN_CUENTA_CONSOLI_FINAN_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PLAN_CUENTA_CONSOLI_FINAN_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENTORNO" type="{http://www.isban.es/webservices/TDCc}ENTORNO_CONSOLIDAC_FINAN_Type"/>
 *         &lt;element name="COD_ALFANUM_8" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_8_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PLAN_CUENTA_CONSOLI_FINAN_Type", propOrder = {
    "entorno",
    "codalfanum8"
})
public class PLANCUENTACONSOLIFINANType {

    @XmlElement(name = "ENTORNO", required = true)
    protected ENTORNOCONSOLIDACFINANType entorno;
    @XmlElement(name = "COD_ALFANUM_8", required = true)
    protected String codalfanum8;

    /**
     * Gets the value of the entorno property.
     * 
     * @return
     *     possible object is
     *     {@link ENTORNOCONSOLIDACFINANType }
     *     
     */
    public ENTORNOCONSOLIDACFINANType getENTORNO() {
        return entorno;
    }

    /**
     * Sets the value of the entorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENTORNOCONSOLIDACFINANType }
     *     
     */
    public void setENTORNO(ENTORNOCONSOLIDACFINANType value) {
        this.entorno = value;
    }

    /**
     * Gets the value of the codalfanum8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODALFANUM8() {
        return codalfanum8;
    }

    /**
     * Sets the value of the codalfanum8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODALFANUM8(String value) {
        this.codalfanum8 = value;
    }

}
