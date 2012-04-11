
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CONFIRMATIONS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CONFIRMATIONS_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CONFIRMATION_TYPE" type="{http://www.isban.es/webservices/TDCs}CONFIRMATION_TYPE_Type"/>
 *         &lt;element name="KEY_SIGNATURE" type="{http://www.isban.es/webservices/TDCc}KEY_SIGNATURE_Type"/>
 *         &lt;element name="DIGITAL_SIGNATURE" type="{http://www.isban.es/webservices/TDCs}DIGITAL_SIGNATURE_Type"/>
 *         &lt;element name="OTP" type="{http://www.isban.es/webservices/TDCs}OTP_Type"/>
 *         &lt;element name="UNIVERSAL_SIGNATURE" type="{http://www.isban.es/webservices/TDCs}DIGITAL_SIGNATURE_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONFIRMATIONS_Type", propOrder = {
    "confirmationtype",
    "keysignature",
    "digitalsignature",
    "otp",
    "universalsignature"
})
public class CONFIRMATIONSType {

    @XmlElement(name = "CONFIRMATION_TYPE", required = true)
    protected String confirmationtype;
    @XmlElement(name = "KEY_SIGNATURE", required = true)
    protected KEYSIGNATUREType keysignature;
    @XmlElement(name = "DIGITAL_SIGNATURE", required = true)
    protected String digitalsignature;
    @XmlElement(name = "OTP", required = true)
    protected String otp;
    @XmlElement(name = "UNIVERSAL_SIGNATURE", required = true)
    protected String universalsignature;

    /**
     * Gets the value of the confirmationtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONFIRMATIONTYPE() {
        return confirmationtype;
    }

    /**
     * Sets the value of the confirmationtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONFIRMATIONTYPE(String value) {
        this.confirmationtype = value;
    }

    /**
     * Gets the value of the keysignature property.
     * 
     * @return
     *     possible object is
     *     {@link KEYSIGNATUREType }
     *     
     */
    public KEYSIGNATUREType getKEYSIGNATURE() {
        return keysignature;
    }

    /**
     * Sets the value of the keysignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link KEYSIGNATUREType }
     *     
     */
    public void setKEYSIGNATURE(KEYSIGNATUREType value) {
        this.keysignature = value;
    }

    /**
     * Gets the value of the digitalsignature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIGITALSIGNATURE() {
        return digitalsignature;
    }

    /**
     * Sets the value of the digitalsignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIGITALSIGNATURE(String value) {
        this.digitalsignature = value;
    }

    /**
     * Gets the value of the otp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTP() {
        return otp;
    }

    /**
     * Sets the value of the otp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTP(String value) {
        this.otp = value;
    }

    /**
     * Gets the value of the universalsignature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNIVERSALSIGNATURE() {
        return universalsignature;
    }

    /**
     * Sets the value of the universalsignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNIVERSALSIGNATURE(String value) {
        this.universalsignature = value;
    }

}
