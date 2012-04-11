
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NATURALEZA_PLAN_CONSOLI_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NATURALEZA_PLAN_CONSOLI_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENTORNO" type="{http://www.isban.es/webservices/TDCc}ENTORNO_CONSOLIDAC_FINAN_Type"/>
 *         &lt;element name="COD_ALFANUM_2" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NATURALEZA_PLAN_CONSOLI_Type", propOrder = {
    "entorno",
    "codalfanum2"
})
public class NATURALEZAPLANCONSOLIType {

    @XmlElement(name = "ENTORNO", required = true)
    protected ENTORNOCONSOLIDACFINANType entorno;
    @XmlElement(name = "COD_ALFANUM_2", required = true)
    protected String codalfanum2;

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
     * Gets the value of the codalfanum2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODALFANUM2() {
        return codalfanum2;
    }

    /**
     * Sets the value of the codalfanum2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODALFANUM2(String value) {
        this.codalfanum2 = value;
    }

}
