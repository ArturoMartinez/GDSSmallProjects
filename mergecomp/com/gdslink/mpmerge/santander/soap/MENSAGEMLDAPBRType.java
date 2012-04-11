
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MENSAGEM_LDAP_BR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MENSAGEM_LDAP_BR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACAO" type="{http://www.isban.es/webservices/TDCs}ACAO_LDAP_BR_Type"/>
 *         &lt;element name="STATUS" type="{http://www.isban.es/webservices/TDCs}STATUS_LDAP_BR_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MENSAGEM_LDAP_BR_Type", propOrder = {
    "acao",
    "status"
})
public class MENSAGEMLDAPBRType {

    @XmlElement(name = "ACAO", required = true)
    protected String acao;
    @XmlElement(name = "STATUS", required = true)
    protected String status;

    /**
     * Gets the value of the acao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACAO() {
        return acao;
    }

    /**
     * Sets the value of the acao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACAO(String value) {
        this.acao = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }

}
