
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="processIncomingMessage" type="{http://www.isban.es/webservices/TDCs}DESCRIPCION_GENERAL_Type"/>
 *         &lt;element name="processID" type="{http://www.isban.es/webservices/TDCs}DESCRIPCION_GENERAL_Type"/>
 *         &lt;element name="processName" type="{http://www.isban.es/webservices/TDCs}DESCRIPCION_GENERAL_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessInfo", namespace = "http://www.gruposantander.es/webservices/genericFault", propOrder = {
    "processIncomingMessage",
    "processID",
    "processName"
})
public class ProcessInfo {

    @XmlElement(required = true)
    protected String processIncomingMessage;
    @XmlElement(required = true)
    protected String processID;
    @XmlElement(required = true)
    protected String processName;

    /**
     * Gets the value of the processIncomingMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessIncomingMessage() {
        return processIncomingMessage;
    }

    /**
     * Sets the value of the processIncomingMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessIncomingMessage(String value) {
        this.processIncomingMessage = value;
    }

    /**
     * Gets the value of the processID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessID() {
        return processID;
    }

    /**
     * Sets the value of the processID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessID(String value) {
        this.processID = value;
    }

    /**
     * Gets the value of the processName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessName() {
        return processName;
    }

    /**
     * Sets the value of the processName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessName(String value) {
        this.processName = value;
    }

}
