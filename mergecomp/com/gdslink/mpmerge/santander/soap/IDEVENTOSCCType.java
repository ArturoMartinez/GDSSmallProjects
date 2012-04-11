
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ID_EVENTO_SCC_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ID_EVENTO_SCC_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="COD_EVENTO" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_17_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ID_EVENTO_SCC_Type", propOrder = {
    "empresa",
    "codevento"
})
public class IDEVENTOSCCType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "COD_EVENTO", required = true)
    protected String codevento;

    /**
     * Gets the value of the empresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPRESA() {
        return empresa;
    }

    /**
     * Sets the value of the empresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPRESA(String value) {
        this.empresa = value;
    }

    /**
     * Gets the value of the codevento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODEVENTO() {
        return codevento;
    }

    /**
     * Sets the value of the codevento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODEVENTO(String value) {
        this.codevento = value;
    }

}
