
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for INDICADOR_AMBITO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INDICADOR_AMBITO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AMBITO_INTERNO_RO" type="{http://www.isban.es/webservices/TDCs}AMBITO_INTERNO_RO_Type"/>
 *         &lt;element name="INDICADOR_RO" type="{http://www.isban.es/webservices/TDCs}INDICADOR_RO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INDICADOR_AMBITO_Type", propOrder = {
    "ambitointernoro",
    "indicadorro"
})
public class INDICADORAMBITOType {

    @XmlElement(name = "AMBITO_INTERNO_RO", required = true)
    protected String ambitointernoro;
    @XmlElement(name = "INDICADOR_RO", required = true)
    protected String indicadorro;

    /**
     * Gets the value of the ambitointernoro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMBITOINTERNORO() {
        return ambitointernoro;
    }

    /**
     * Sets the value of the ambitointernoro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMBITOINTERNORO(String value) {
        this.ambitointernoro = value;
    }

    /**
     * Gets the value of the indicadorro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDICADORRO() {
        return indicadorro;
    }

    /**
     * Sets the value of the indicadorro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDICADORRO(String value) {
        this.indicadorro = value;
    }

}
