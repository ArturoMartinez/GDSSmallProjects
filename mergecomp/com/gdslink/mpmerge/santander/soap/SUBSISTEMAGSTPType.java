
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SUBSISTEMA_GSTP_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SUBSISTEMA_GSTP_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SISTEMA_GSTP" type="{http://www.isban.es/webservices/TDCs}SISTEMA_GSTP_Type"/>
 *         &lt;element name="COD_SUBSISTEMA_GSTP" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SUBSISTEMA_GSTP_Type", propOrder = {
    "sistemagstp",
    "codsubsistemagstp"
})
public class SUBSISTEMAGSTPType {

    @XmlElement(name = "SISTEMA_GSTP", required = true)
    protected String sistemagstp;
    @XmlElement(name = "COD_SUBSISTEMA_GSTP", required = true)
    protected String codsubsistemagstp;

    /**
     * Gets the value of the sistemagstp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSISTEMAGSTP() {
        return sistemagstp;
    }

    /**
     * Sets the value of the sistemagstp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSISTEMAGSTP(String value) {
        this.sistemagstp = value;
    }

    /**
     * Gets the value of the codsubsistemagstp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODSUBSISTEMAGSTP() {
        return codsubsistemagstp;
    }

    /**
     * Sets the value of the codsubsistemagstp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODSUBSISTEMAGSTP(String value) {
        this.codsubsistemagstp = value;
    }

}
