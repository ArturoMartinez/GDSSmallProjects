
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COMPT_BASICOS_1_BR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COMPT_BASICOS_1_BR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PESUCADM" type="{http://www.isban.es/webservices/TDCs}SUCURSAL_BR_Type"/>
 *         &lt;element name="PEESTCIV" type="{http://www.isban.es/webservices/TDCs}TIPO_ESTADO_CIVIL_BR_Type"/>
 *         &lt;element name="PESEXPER" type="{http://www.isban.es/webservices/TDCs}TIPO_SEXO_BR_Type"/>
 *         &lt;element name="PETIPPER" type="{http://www.isban.es/webservices/TDCs}TIPO_DE_PERSONA_BR_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COMPT_BASICOS_1_BR_Type", propOrder = {
    "pesucadm",
    "peestciv",
    "pesexper",
    "petipper"
})
public class COMPTBASICOS1BRType {

    @XmlElement(name = "PESUCADM", required = true)
    protected String pesucadm;
    @XmlElement(name = "PEESTCIV", required = true)
    protected String peestciv;
    @XmlElement(name = "PESEXPER", required = true)
    protected String pesexper;
    @XmlElement(name = "PETIPPER", required = true)
    protected String petipper;

    /**
     * Gets the value of the pesucadm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPESUCADM() {
        return pesucadm;
    }

    /**
     * Sets the value of the pesucadm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPESUCADM(String value) {
        this.pesucadm = value;
    }

    /**
     * Gets the value of the peestciv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPEESTCIV() {
        return peestciv;
    }

    /**
     * Sets the value of the peestciv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPEESTCIV(String value) {
        this.peestciv = value;
    }

    /**
     * Gets the value of the pesexper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPESEXPER() {
        return pesexper;
    }

    /**
     * Sets the value of the pesexper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPESEXPER(String value) {
        this.pesexper = value;
    }

    /**
     * Gets the value of the petipper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPETIPPER() {
        return petipper;
    }

    /**
     * Sets the value of the petipper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPETIPPER(String value) {
        this.petipper = value;
    }

}
