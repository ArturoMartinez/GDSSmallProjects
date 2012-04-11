
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CONTRATO_BR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CONTRATO_BR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENTIDAD_BR" type="{http://www.isban.es/webservices/TDCs}ENTIDAD_BR_Type"/>
 *         &lt;element name="SUCURSAL_BR" type="{http://www.isban.es/webservices/TDCs}SUCURSAL_BR_Type"/>
 *         &lt;element name="NRO_CUENTA_BR" type="{http://www.isban.es/webservices/TDCs}NRO_CONTRATO_BR_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONTRATO_BR_Type", propOrder = {
    "entidadbr",
    "sucursalbr",
    "nrocuentabr"
})
public class CONTRATOBRType {

    @XmlElement(name = "ENTIDAD_BR", required = true)
    protected String entidadbr;
    @XmlElement(name = "SUCURSAL_BR", required = true)
    protected String sucursalbr;
    @XmlElement(name = "NRO_CUENTA_BR", required = true)
    protected String nrocuentabr;

    /**
     * Gets the value of the entidadbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENTIDADBR() {
        return entidadbr;
    }

    /**
     * Sets the value of the entidadbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENTIDADBR(String value) {
        this.entidadbr = value;
    }

    /**
     * Gets the value of the sucursalbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUCURSALBR() {
        return sucursalbr;
    }

    /**
     * Sets the value of the sucursalbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUCURSALBR(String value) {
        this.sucursalbr = value;
    }

    /**
     * Gets the value of the nrocuentabr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNROCUENTABR() {
        return nrocuentabr;
    }

    /**
     * Sets the value of the nrocuentabr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNROCUENTABR(String value) {
        this.nrocuentabr = value;
    }

}
