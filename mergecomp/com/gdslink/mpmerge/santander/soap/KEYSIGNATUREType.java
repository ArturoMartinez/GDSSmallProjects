
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KEY_SIGNATURE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KEY_SIGNATURE_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="POSITIONS" type="{http://www.isban.es/webservices/TDCs}POSITIONS_Type"/>
 *         &lt;element name="POSITION_VALUES" type="{http://www.isban.es/webservices/TDCs}POSITION_VALUES_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KEY_SIGNATURE_Type", propOrder = {
    "positions",
    "positionvalues"
})
public class KEYSIGNATUREType {

    @XmlElement(name = "POSITIONS", required = true)
    protected String positions;
    @XmlElement(name = "POSITION_VALUES", required = true)
    protected String positionvalues;

    /**
     * Gets the value of the positions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSITIONS() {
        return positions;
    }

    /**
     * Sets the value of the positions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSITIONS(String value) {
        this.positions = value;
    }

    /**
     * Gets the value of the positionvalues property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSITIONVALUES() {
        return positionvalues;
    }

    /**
     * Sets the value of the positionvalues property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSITIONVALUES(String value) {
        this.positionvalues = value;
    }

}
