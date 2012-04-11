
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OPER_LOGICO_PERSONALIZAC_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OPER_LOGICO_PERSONALIZAC_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COMP1" type="{http://www.isban.es/webservices/TDCs}TIP_ATRIBUTO_CATALOG_CONT_Type"/>
 *         &lt;element name="COMP2" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OPER_LOGICO_PERSONALIZAC_Type", propOrder = {
    "comp1",
    "comp2"
})
public class OPERLOGICOPERSONALIZACType {

    @XmlElement(name = "COMP1", required = true)
    protected String comp1;
    @XmlElement(name = "COMP2", required = true)
    protected String comp2;

    /**
     * Gets the value of the comp1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMP1() {
        return comp1;
    }

    /**
     * Sets the value of the comp1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMP1(String value) {
        this.comp1 = value;
    }

    /**
     * Gets the value of the comp2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMP2() {
        return comp2;
    }

    /**
     * Sets the value of the comp2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMP2(String value) {
        this.comp2 = value;
    }

}
