
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AREAPG1S_BR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AREAPG1S_BR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODRET" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *         &lt;element name="TRANSAC" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_4_Type"/>
 *         &lt;element name="TPOPER" type="{http://www.isban.es/webservices/TDCs}INDICADOR_GENERICO_Type"/>
 *         &lt;element name="FECCONT" type="{http://www.isban.es/webservices/TDCs}FECHA_AAAAMMDD_Type"/>
 *         &lt;element name="CANALPG" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_2_Type"/>
 *         &lt;element name="CANALNIO" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_24_Type"/>
 *         &lt;element name="CONTRATO" type="{http://www.isban.es/webservices/TDCc}CONTRATO_BR_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AREAPG1S_BR_Type", propOrder = {
    "codret",
    "transac",
    "tpoper",
    "feccont",
    "canalpg",
    "canalnio",
    "contrato"
})
public class AREAPG1SBRType {

    @XmlElement(name = "CODRET", required = true)
    protected String codret;
    @XmlElement(name = "TRANSAC", required = true)
    protected String transac;
    @XmlElement(name = "TPOPER", required = true)
    protected String tpoper;
    @XmlElement(name = "FECCONT", required = true)
    protected XMLGregorianCalendar feccont;
    @XmlElement(name = "CANALPG", required = true)
    protected String canalpg;
    @XmlElement(name = "CANALNIO", required = true)
    protected String canalnio;
    @XmlElement(name = "CONTRATO", required = true)
    protected CONTRATOBRType contrato;

    /**
     * Gets the value of the codret property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODRET() {
        return codret;
    }

    /**
     * Sets the value of the codret property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODRET(String value) {
        this.codret = value;
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
     * Gets the value of the tpoper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTPOPER() {
        return tpoper;
    }

    /**
     * Sets the value of the tpoper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTPOPER(String value) {
        this.tpoper = value;
    }

    /**
     * Gets the value of the feccont property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFECCONT() {
        return feccont;
    }

    /**
     * Sets the value of the feccont property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFECCONT(XMLGregorianCalendar value) {
        this.feccont = value;
    }

    /**
     * Gets the value of the canalpg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCANALPG() {
        return canalpg;
    }

    /**
     * Sets the value of the canalpg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCANALPG(String value) {
        this.canalpg = value;
    }

    /**
     * Gets the value of the canalnio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCANALNIO() {
        return canalnio;
    }

    /**
     * Sets the value of the canalnio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCANALNIO(String value) {
        this.canalnio = value;
    }

    /**
     * Gets the value of the contrato property.
     * 
     * @return
     *     possible object is
     *     {@link CONTRATOBRType }
     *     
     */
    public CONTRATOBRType getCONTRATO() {
        return contrato;
    }

    /**
     * Sets the value of the contrato property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONTRATOBRType }
     *     
     */
    public void setCONTRATO(CONTRATOBRType value) {
        this.contrato = value;
    }

}
