
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DIRECCION_EXTRANJERA_AL_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DIRECCION_EXTRANJERA_AL_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PAIS" type="{http://www.isban.es/webservices/TDCs}PAIS_Type"/>
 *         &lt;element name="LINEA1" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_60_Type"/>
 *         &lt;element name="LINEA2" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_60_Type"/>
 *         &lt;element name="LINEA3" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_60_Type"/>
 *         &lt;element name="PDELIVERYNOTE" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_50_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DIRECCION_EXTRANJERA_AL_Type", propOrder = {
    "pais",
    "linea1",
    "linea2",
    "linea3",
    "pdeliverynote"
})
public class DIRECCIONEXTRANJERAALType {

    @XmlElement(name = "PAIS", required = true)
    protected String pais;
    @XmlElement(name = "LINEA1", required = true)
    protected String linea1;
    @XmlElement(name = "LINEA2", required = true)
    protected String linea2;
    @XmlElement(name = "LINEA3", required = true)
    protected String linea3;
    @XmlElement(name = "PDELIVERYNOTE", required = true)
    protected String pdeliverynote;

    /**
     * Gets the value of the pais property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAIS() {
        return pais;
    }

    /**
     * Sets the value of the pais property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAIS(String value) {
        this.pais = value;
    }

    /**
     * Gets the value of the linea1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINEA1() {
        return linea1;
    }

    /**
     * Sets the value of the linea1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINEA1(String value) {
        this.linea1 = value;
    }

    /**
     * Gets the value of the linea2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINEA2() {
        return linea2;
    }

    /**
     * Sets the value of the linea2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINEA2(String value) {
        this.linea2 = value;
    }

    /**
     * Gets the value of the linea3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINEA3() {
        return linea3;
    }

    /**
     * Sets the value of the linea3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINEA3(String value) {
        this.linea3 = value;
    }

    /**
     * Gets the value of the pdeliverynote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDELIVERYNOTE() {
        return pdeliverynote;
    }

    /**
     * Sets the value of the pdeliverynote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDELIVERYNOTE(String value) {
        this.pdeliverynote = value;
    }

}
