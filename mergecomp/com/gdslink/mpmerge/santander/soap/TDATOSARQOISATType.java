
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TDATOSARQOISAT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDATOSARQOISAT_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UsuNotes" type="{http://www.isban.es/webservices/TDCs}USUARIO_INTRANET_Type"/>
 *         &lt;element name="TknRACF" type="{http://www.isban.es/webservices/TDCs}TOKENRACF_Type"/>
 *         &lt;element name="Password" type="{http://www.isban.es/webservices/TDCs}PASSWORD_INTRANET_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDATOSARQOISAT_Type", propOrder = {
    "usuNotes",
    "tknRACF",
    "password"
})
public class TDATOSARQOISATType {

    @XmlElement(name = "UsuNotes", required = true)
    protected String usuNotes;
    @XmlElement(name = "TknRACF", required = true)
    protected String tknRACF;
    @XmlElement(name = "Password", required = true)
    protected String password;

    /**
     * Gets the value of the usuNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuNotes() {
        return usuNotes;
    }

    /**
     * Sets the value of the usuNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuNotes(String value) {
        this.usuNotes = value;
    }

    /**
     * Gets the value of the tknRACF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTknRACF() {
        return tknRACF;
    }

    /**
     * Sets the value of the tknRACF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTknRACF(String value) {
        this.tknRACF = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

}
