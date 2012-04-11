
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COMPT_BASICOS_3_BR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COMPT_BASICOS_3_BR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PENACPER" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_3_Type"/>
 *         &lt;element name="PEPAIRES" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_3_Type"/>
 *         &lt;element name="PESECPER" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_3_Type"/>
 *         &lt;element name="PETIPOCU" type="{http://www.isban.es/webservices/TDCs}TIPO_DOCUM_PERSONA_BR_Type"/>
 *         &lt;element name="PECODACT" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_8_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COMPT_BASICOS_3_BR_Type", propOrder = {
    "penacper",
    "pepaires",
    "pesecper",
    "petipocu",
    "pecodact"
})
public class COMPTBASICOS3BRType {

    @XmlElement(name = "PENACPER", required = true)
    protected String penacper;
    @XmlElement(name = "PEPAIRES", required = true)
    protected String pepaires;
    @XmlElement(name = "PESECPER", required = true)
    protected String pesecper;
    @XmlElement(name = "PETIPOCU", required = true)
    protected String petipocu;
    @XmlElement(name = "PECODACT", required = true)
    protected String pecodact;

    /**
     * Gets the value of the penacper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPENACPER() {
        return penacper;
    }

    /**
     * Sets the value of the penacper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPENACPER(String value) {
        this.penacper = value;
    }

    /**
     * Gets the value of the pepaires property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPEPAIRES() {
        return pepaires;
    }

    /**
     * Sets the value of the pepaires property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPEPAIRES(String value) {
        this.pepaires = value;
    }

    /**
     * Gets the value of the pesecper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPESECPER() {
        return pesecper;
    }

    /**
     * Sets the value of the pesecper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPESECPER(String value) {
        this.pesecper = value;
    }

    /**
     * Gets the value of the petipocu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPETIPOCU() {
        return petipocu;
    }

    /**
     * Sets the value of the petipocu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPETIPOCU(String value) {
        this.petipocu = value;
    }

    /**
     * Gets the value of the pecodact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPECODACT() {
        return pecodact;
    }

    /**
     * Sets the value of the pecodact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPECODACT(String value) {
        this.pecodact = value;
    }

}
