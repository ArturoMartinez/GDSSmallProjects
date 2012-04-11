
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PARAM_SERVICIO_AHEBMG_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PARAM_SERVICIO_AHEBMG_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SERVICIO_AHEBMG" type="{http://www.isban.es/webservices/TDCc}SERVICIO_AHEBMG_Type"/>
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
@XmlType(name = "PARAM_SERVICIO_AHEBMG_Type", propOrder = {
    "servicioahebmg",
    "codalfanum2"
})
public class PARAMSERVICIOAHEBMGType {

    @XmlElement(name = "SERVICIO_AHEBMG", required = true)
    protected SERVICIOAHEBMGType servicioahebmg;
    @XmlElement(name = "COD_ALFANUM_2", required = true)
    protected String codalfanum2;

    /**
     * Gets the value of the servicioahebmg property.
     * 
     * @return
     *     possible object is
     *     {@link SERVICIOAHEBMGType }
     *     
     */
    public SERVICIOAHEBMGType getSERVICIOAHEBMG() {
        return servicioahebmg;
    }

    /**
     * Sets the value of the servicioahebmg property.
     * 
     * @param value
     *     allowed object is
     *     {@link SERVICIOAHEBMGType }
     *     
     */
    public void setSERVICIOAHEBMG(SERVICIOAHEBMGType value) {
        this.servicioahebmg = value;
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
