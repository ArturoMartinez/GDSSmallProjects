
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RAMAL_COMPTO_BR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RAMAL_COMPTO_BR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RAMAL_1" type="{http://www.isban.es/webservices/TDCs}RAMAL_1_BR_Type"/>
 *         &lt;element name="RAMAL_2" type="{http://www.isban.es/webservices/TDCs}RAMAL_2_BR_Type"/>
 *         &lt;element name="RAMAL_3" type="{http://www.isban.es/webservices/TDCs}RAMAL_3_BR_Type"/>
 *         &lt;element name="RAMAL_4" type="{http://www.isban.es/webservices/TDCs}RAMAL_4_BR_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RAMAL_COMPTO_BR_Type", propOrder = {
    "ramal1",
    "ramal2",
    "ramal3",
    "ramal4"
})
public class RAMALCOMPTOBRType {

    @XmlElement(name = "RAMAL_1", required = true)
    protected String ramal1;
    @XmlElement(name = "RAMAL_2", required = true)
    protected String ramal2;
    @XmlElement(name = "RAMAL_3", required = true)
    protected String ramal3;
    @XmlElement(name = "RAMAL_4", required = true)
    protected String ramal4;

    /**
     * Gets the value of the ramal1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRAMAL1() {
        return ramal1;
    }

    /**
     * Sets the value of the ramal1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRAMAL1(String value) {
        this.ramal1 = value;
    }

    /**
     * Gets the value of the ramal2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRAMAL2() {
        return ramal2;
    }

    /**
     * Sets the value of the ramal2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRAMAL2(String value) {
        this.ramal2 = value;
    }

    /**
     * Gets the value of the ramal3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRAMAL3() {
        return ramal3;
    }

    /**
     * Sets the value of the ramal3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRAMAL3(String value) {
        this.ramal3 = value;
    }

    /**
     * Gets the value of the ramal4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRAMAL4() {
        return ramal4;
    }

    /**
     * Sets the value of the ramal4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRAMAL4(String value) {
        this.ramal4 = value;
    }

}
