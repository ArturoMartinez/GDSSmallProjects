
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LOCALIZADOR_PT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOCALIZADOR_PT_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CENTRO" type="{http://www.isban.es/webservices/TDCc}CENTRO_Type"/>
 *         &lt;element name="NUM_CONTRATO_LOCAL" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_11_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LOCALIZADOR_PT_Type", propOrder = {
    "centro",
    "numcontratolocal"
})
public class LOCALIZADORPTType {

    @XmlElement(name = "CENTRO", required = true)
    protected CENTROType centro;
    @XmlElement(name = "NUM_CONTRATO_LOCAL", required = true)
    protected String numcontratolocal;

    /**
     * Gets the value of the centro property.
     * 
     * @return
     *     possible object is
     *     {@link CENTROType }
     *     
     */
    public CENTROType getCENTRO() {
        return centro;
    }

    /**
     * Sets the value of the centro property.
     * 
     * @param value
     *     allowed object is
     *     {@link CENTROType }
     *     
     */
    public void setCENTRO(CENTROType value) {
        this.centro = value;
    }

    /**
     * Gets the value of the numcontratolocal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMCONTRATOLOCAL() {
        return numcontratolocal;
    }

    /**
     * Sets the value of the numcontratolocal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMCONTRATOLOCAL(String value) {
        this.numcontratolocal = value;
    }

}
