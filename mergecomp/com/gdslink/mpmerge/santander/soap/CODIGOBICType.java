
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CODIGO_BIC_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CODIGO_BIC_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENTIDAD_BIC" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_4_Type"/>
 *         &lt;element name="PAIS_BIC" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *         &lt;element name="LOCATOR_BIC" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *         &lt;element name="BRANCH" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CODIGO_BIC_Type", propOrder = {
    "entidadbic",
    "paisbic",
    "locatorbic",
    "branch"
})
public class CODIGOBICType {

    @XmlElement(name = "ENTIDAD_BIC", required = true)
    protected String entidadbic;
    @XmlElement(name = "PAIS_BIC", required = true)
    protected String paisbic;
    @XmlElement(name = "LOCATOR_BIC", required = true)
    protected String locatorbic;
    @XmlElement(name = "BRANCH", required = true)
    protected String branch;

    /**
     * Gets the value of the entidadbic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENTIDADBIC() {
        return entidadbic;
    }

    /**
     * Sets the value of the entidadbic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENTIDADBIC(String value) {
        this.entidadbic = value;
    }

    /**
     * Gets the value of the paisbic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAISBIC() {
        return paisbic;
    }

    /**
     * Sets the value of the paisbic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAISBIC(String value) {
        this.paisbic = value;
    }

    /**
     * Gets the value of the locatorbic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCATORBIC() {
        return locatorbic;
    }

    /**
     * Sets the value of the locatorbic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCATORBIC(String value) {
        this.locatorbic = value;
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRANCH() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRANCH(String value) {
        this.branch = value;
    }

}
