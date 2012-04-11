
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="faultCode" type="{http://www.isban.es/webservices/TDCs}DESCRIPCION_GENERAL_Type"/>
 *         &lt;element name="code" type="{http://www.gruposantander.es/webservices/genericFault}faultcode"/>
 *         &lt;element name="reasons" type="{http://www.gruposantander.es/webservices/genericFault}faultreasons"/>
 *         &lt;element name="processInfo" type="{http://www.gruposantander.es/webservices/genericFault}ProcessInfo"/>
 *         &lt;element name="technicalException" type="{http://www.gruposantander.es/webservices/genericFault}TechnicalException"/>
 *         &lt;element name="additionalInfo" type="{http://www.isban.es/webservices/TDCs}DESCRIPCION_EXTRALARGA_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "faultCode",
    "code",
    "reasons",
    "processInfo",
    "technicalException",
    "additionalInfo"
})
@XmlRootElement(name = "Exception", namespace = "http://www.gruposantander.es/webservices/genericFault")
public class Exception {

    @XmlElement(required = true)
    protected String faultCode;
    @XmlElement(required = true)
    protected Faultcode code;
    @XmlElement(required = true)
    protected Faultreasons reasons;
    @XmlElement(required = true)
    protected ProcessInfo processInfo;
    @XmlElement(required = true)
    protected TechnicalException technicalException;
    @XmlElement(required = true)
    protected String additionalInfo;

    /**
     * Gets the value of the faultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultCode() {
        return faultCode;
    }

    /**
     * Sets the value of the faultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultCode(String value) {
        this.faultCode = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link Faultcode }
     *     
     */
    public Faultcode getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link Faultcode }
     *     
     */
    public void setCode(Faultcode value) {
        this.code = value;
    }

    /**
     * Gets the value of the reasons property.
     * 
     * @return
     *     possible object is
     *     {@link Faultreasons }
     *     
     */
    public Faultreasons getReasons() {
        return reasons;
    }

    /**
     * Sets the value of the reasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link Faultreasons }
     *     
     */
    public void setReasons(Faultreasons value) {
        this.reasons = value;
    }

    /**
     * Gets the value of the processInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessInfo }
     *     
     */
    public ProcessInfo getProcessInfo() {
        return processInfo;
    }

    /**
     * Sets the value of the processInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessInfo }
     *     
     */
    public void setProcessInfo(ProcessInfo value) {
        this.processInfo = value;
    }

    /**
     * Gets the value of the technicalException property.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalException }
     *     
     */
    public TechnicalException getTechnicalException() {
        return technicalException;
    }

    /**
     * Sets the value of the technicalException property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalException }
     *     
     */
    public void setTechnicalException(TechnicalException value) {
        this.technicalException = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

}
