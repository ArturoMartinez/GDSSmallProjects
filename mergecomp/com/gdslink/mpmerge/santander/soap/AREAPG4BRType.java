
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AREAPG4_BR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AREAPG4_BR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INDTRX" type="{http://www.isban.es/webservices/TDCs}INDICADOR_GENERICO_Type"/>
 *         &lt;element name="TRANSAC" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_4_Type"/>
 *         &lt;element name="INDDEBITO" type="{http://www.isban.es/webservices/TDCs}INDICADOR_GENERICO_Type"/>
 *         &lt;element name="INDCADCTA" type="{http://www.isban.es/webservices/TDCs}INDICADOR_GENERICO_Type"/>
 *         &lt;element name="INDCRIPT" type="{http://www.isban.es/webservices/TDCs}INDICADOR_GENERICO_Type"/>
 *         &lt;element name="INDAUTLIM" type="{http://www.isban.es/webservices/TDCs}INDICADOR_GENERICO_Type"/>
 *         &lt;element name="INDAGHIBR" type="{http://www.isban.es/webservices/TDCs}INDICADOR_GENERICO_Type"/>
 *         &lt;element name="INDMULTREQ" type="{http://www.isban.es/webservices/TDCs}INDICADOR_GENERICO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AREAPG4_BR_Type", propOrder = {
    "indtrx",
    "transac",
    "inddebito",
    "indcadcta",
    "indcript",
    "indautlim",
    "indaghibr",
    "indmultreq"
})
public class AREAPG4BRType {

    @XmlElement(name = "INDTRX", required = true)
    protected String indtrx;
    @XmlElement(name = "TRANSAC", required = true)
    protected String transac;
    @XmlElement(name = "INDDEBITO", required = true)
    protected String inddebito;
    @XmlElement(name = "INDCADCTA", required = true)
    protected String indcadcta;
    @XmlElement(name = "INDCRIPT", required = true)
    protected String indcript;
    @XmlElement(name = "INDAUTLIM", required = true)
    protected String indautlim;
    @XmlElement(name = "INDAGHIBR", required = true)
    protected String indaghibr;
    @XmlElement(name = "INDMULTREQ", required = true)
    protected String indmultreq;

    /**
     * Gets the value of the indtrx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDTRX() {
        return indtrx;
    }

    /**
     * Sets the value of the indtrx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDTRX(String value) {
        this.indtrx = value;
    }

    /**
     * Gets the value of the transac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSAC() {
        return transac;
    }

    /**
     * Sets the value of the transac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSAC(String value) {
        this.transac = value;
    }

    /**
     * Gets the value of the inddebito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDDEBITO() {
        return inddebito;
    }

    /**
     * Sets the value of the inddebito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDDEBITO(String value) {
        this.inddebito = value;
    }

    /**
     * Gets the value of the indcadcta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDCADCTA() {
        return indcadcta;
    }

    /**
     * Sets the value of the indcadcta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDCADCTA(String value) {
        this.indcadcta = value;
    }

    /**
     * Gets the value of the indcript property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDCRIPT() {
        return indcript;
    }

    /**
     * Sets the value of the indcript property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDCRIPT(String value) {
        this.indcript = value;
    }

    /**
     * Gets the value of the indautlim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDAUTLIM() {
        return indautlim;
    }

    /**
     * Sets the value of the indautlim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDAUTLIM(String value) {
        this.indautlim = value;
    }

    /**
     * Gets the value of the indaghibr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDAGHIBR() {
        return indaghibr;
    }

    /**
     * Sets the value of the indaghibr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDAGHIBR(String value) {
        this.indaghibr = value;
    }

    /**
     * Gets the value of the indmultreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDMULTREQ() {
        return indmultreq;
    }

    /**
     * Sets the value of the indmultreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDMULTREQ(String value) {
        this.indmultreq = value;
    }

}
