
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TIP_RIESGO_OPER_IN_CORP_2_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIP_RIESGO_OPER_IN_CORP_2_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIP_RIESGO_OPER_BIS_II_1" type="{http://www.isban.es/webservices/TDCs}TIP_RIESGO_OPER_BIS_II_1_Type"/>
 *         &lt;element name="ID_TIP_RIESGO_IN_CORP_2" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIP_RIESGO_OPER_IN_CORP_2_Type", propOrder = {
    "tipriesgooperbisii1",
    "idtipriesgoincorp2"
})
public class TIPRIESGOOPERINCORP2Type {

    @XmlElement(name = "TIP_RIESGO_OPER_BIS_II_1", required = true)
    protected String tipriesgooperbisii1;
    @XmlElement(name = "ID_TIP_RIESGO_IN_CORP_2", required = true)
    protected String idtipriesgoincorp2;

    /**
     * Gets the value of the tipriesgooperbisii1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPRIESGOOPERBISII1() {
        return tipriesgooperbisii1;
    }

    /**
     * Sets the value of the tipriesgooperbisii1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPRIESGOOPERBISII1(String value) {
        this.tipriesgooperbisii1 = value;
    }

    /**
     * Gets the value of the idtipriesgoincorp2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDTIPRIESGOINCORP2() {
        return idtipriesgoincorp2;
    }

    /**
     * Sets the value of the idtipriesgoincorp2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDTIPRIESGOINCORP2(String value) {
        this.idtipriesgoincorp2 = value;
    }

}
