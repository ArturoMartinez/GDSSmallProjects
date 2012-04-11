
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TIP_RIESGO_OPER_LOCAL_2_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIP_RIESGO_OPER_LOCAL_2_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIP_RIESGO_OPER_LOCAL_1" type="{http://www.isban.es/webservices/TDCc}TIP_RIESGO_OPER_LOCAL_1_Type"/>
 *         &lt;element name="ID_TIP_RIESGO_LOCAL_2" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIP_RIESGO_OPER_LOCAL_2_Type", propOrder = {
    "tipriesgooperlocal1",
    "idtipriesgolocal2"
})
public class TIPRIESGOOPERLOCAL2Type {

    @XmlElement(name = "TIP_RIESGO_OPER_LOCAL_1", required = true)
    protected TIPRIESGOOPERLOCAL1Type tipriesgooperlocal1;
    @XmlElement(name = "ID_TIP_RIESGO_LOCAL_2", required = true)
    protected String idtipriesgolocal2;

    /**
     * Gets the value of the tipriesgooperlocal1 property.
     * 
     * @return
     *     possible object is
     *     {@link TIPRIESGOOPERLOCAL1Type }
     *     
     */
    public TIPRIESGOOPERLOCAL1Type getTIPRIESGOOPERLOCAL1() {
        return tipriesgooperlocal1;
    }

    /**
     * Sets the value of the tipriesgooperlocal1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIPRIESGOOPERLOCAL1Type }
     *     
     */
    public void setTIPRIESGOOPERLOCAL1(TIPRIESGOOPERLOCAL1Type value) {
        this.tipriesgooperlocal1 = value;
    }

    /**
     * Gets the value of the idtipriesgolocal2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDTIPRIESGOLOCAL2() {
        return idtipriesgolocal2;
    }

    /**
     * Sets the value of the idtipriesgolocal2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDTIPRIESGOLOCAL2(String value) {
        this.idtipriesgolocal2 = value;
    }

}
