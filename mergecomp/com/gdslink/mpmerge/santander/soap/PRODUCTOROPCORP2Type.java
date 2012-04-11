
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PRODUCTO_ROP_CORP_2_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PRODUCTO_ROP_CORP_2_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIP_RIESGO_OPER_CORP_1" type="{http://www.isban.es/webservices/TDCs}PRODUCTO_ROP_CORP_1_Type"/>
 *         &lt;element name="ID_TIP_RIESGO_CORP_2" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRODUCTO_ROP_CORP_2_Type", propOrder = {
    "tipriesgoopercorp1",
    "idtipriesgocorp2"
})
public class PRODUCTOROPCORP2Type {

    @XmlElement(name = "TIP_RIESGO_OPER_CORP_1", required = true)
    protected String tipriesgoopercorp1;
    @XmlElement(name = "ID_TIP_RIESGO_CORP_2", required = true)
    protected String idtipriesgocorp2;

    /**
     * Gets the value of the tipriesgoopercorp1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPRIESGOOPERCORP1() {
        return tipriesgoopercorp1;
    }

    /**
     * Sets the value of the tipriesgoopercorp1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPRIESGOOPERCORP1(String value) {
        this.tipriesgoopercorp1 = value;
    }

    /**
     * Gets the value of the idtipriesgocorp2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDTIPRIESGOCORP2() {
        return idtipriesgocorp2;
    }

    /**
     * Sets the value of the idtipriesgocorp2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDTIPRIESGOCORP2(String value) {
        this.idtipriesgocorp2 = value;
    }

}
