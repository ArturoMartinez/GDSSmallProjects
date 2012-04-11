
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ADMINISTRACION_HACIENDA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ADMINISTRACION_HACIENDA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COD_DELEGACION_HACIENDA" type="{http://www.isban.es/webservices/TDCs}COD_DELEGACION_HACIENDA_Type"/>
 *         &lt;element name="COD_ADMIN_HACIENDA" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ADMINISTRACION_HACIENDA_Type", propOrder = {
    "coddelegacionhacienda",
    "codadminhacienda"
})
public class ADMINISTRACIONHACIENDAType {

    @XmlElement(name = "COD_DELEGACION_HACIENDA", required = true)
    protected String coddelegacionhacienda;
    @XmlElement(name = "COD_ADMIN_HACIENDA", required = true)
    protected String codadminhacienda;

    /**
     * Gets the value of the coddelegacionhacienda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODDELEGACIONHACIENDA() {
        return coddelegacionhacienda;
    }

    /**
     * Sets the value of the coddelegacionhacienda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODDELEGACIONHACIENDA(String value) {
        this.coddelegacionhacienda = value;
    }

    /**
     * Gets the value of the codadminhacienda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODADMINHACIENDA() {
        return codadminhacienda;
    }

    /**
     * Sets the value of the codadminhacienda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODADMINHACIENDA(String value) {
        this.codadminhacienda = value;
    }

}
