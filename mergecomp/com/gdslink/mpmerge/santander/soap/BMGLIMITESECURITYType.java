
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BMG_LIMITE_SECURITY_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BMG_LIMITE_SECURITY_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BMG_SECURITY" type="{http://www.isban.es/webservices/TDCs}BMG_SECURITY_Type"/>
 *         &lt;element name="ID_LIMITE" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_5_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BMG_LIMITE_SECURITY_Type", propOrder = {
    "bmgsecurity",
    "idlimite"
})
public class BMGLIMITESECURITYType {

    @XmlElement(name = "BMG_SECURITY", required = true)
    protected String bmgsecurity;
    @XmlElement(name = "ID_LIMITE")
    protected int idlimite;

    /**
     * Gets the value of the bmgsecurity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBMGSECURITY() {
        return bmgsecurity;
    }

    /**
     * Sets the value of the bmgsecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBMGSECURITY(String value) {
        this.bmgsecurity = value;
    }

    /**
     * Gets the value of the idlimite property.
     * 
     */
    public int getIDLIMITE() {
        return idlimite;
    }

    /**
     * Sets the value of the idlimite property.
     * 
     */
    public void setIDLIMITE(int value) {
        this.idlimite = value;
    }

}
