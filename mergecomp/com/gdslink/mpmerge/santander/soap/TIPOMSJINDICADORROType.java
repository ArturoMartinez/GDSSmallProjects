
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TIPO_MSJ_INDICADOR_RO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIPO_MSJ_INDICADOR_RO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AMBITO_INTERNO_RO" type="{http://www.isban.es/webservices/TDCs}AMBITO_INTERNO_RO_Type"/>
 *         &lt;element name="COD_TIPO_MSJ_INDICADOR_RO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIPO_MSJ_INDICADOR_RO_Type", propOrder = {
    "ambitointernoro",
    "codtipomsjindicadorro"
})
public class TIPOMSJINDICADORROType {

    @XmlElement(name = "AMBITO_INTERNO_RO", required = true)
    protected String ambitointernoro;
    @XmlElement(name = "COD_TIPO_MSJ_INDICADOR_RO", required = true)
    protected String codtipomsjindicadorro;

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
     * Gets the value of the codtipomsjindicadorro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODTIPOMSJINDICADORRO() {
        return codtipomsjindicadorro;
    }

    /**
     * Sets the value of the codtipomsjindicadorro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODTIPOMSJINDICADORRO(String value) {
        this.codtipomsjindicadorro = value;
    }

}
