
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AREAPG2_BR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AREAPG2_BR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CHVCANAL" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_14_Type"/>
 *         &lt;element name="NUMSUPER" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_8_Type"/>
 *         &lt;element name="PAN" type="{http://www.isban.es/webservices/TDCs}PAN_BR_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AREAPG2_BR_Type", propOrder = {
    "chvcanal",
    "numsuper",
    "pan"
})
public class AREAPG2BRType {

    @XmlElement(name = "CHVCANAL", required = true)
    protected String chvcanal;
    @XmlElement(name = "NUMSUPER", required = true)
    protected String numsuper;
    @XmlElement(name = "PAN", required = true)
    protected String pan;

    /**
     * Gets the value of the chvcanal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHVCANAL() {
        return chvcanal;
    }

    /**
     * Sets the value of the chvcanal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHVCANAL(String value) {
        this.chvcanal = value;
    }

    /**
     * Gets the value of the numsuper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMSUPER() {
        return numsuper;
    }

    /**
     * Sets the value of the numsuper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMSUPER(String value) {
        this.numsuper = value;
    }

    /**
     * Gets the value of the pan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAN() {
        return pan;
    }

    /**
     * Sets the value of the pan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAN(String value) {
        this.pan = value;
    }

}
