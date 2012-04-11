
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AREAPG1_BR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AREAPG1_BR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODENT" type="{http://www.isban.es/webservices/TDCs}ENTIDAD_BR_Type"/>
 *         &lt;element name="CENTALT" type="{http://www.isban.es/webservices/TDCs}SUCURSAL_BR_Type"/>
 *         &lt;element name="TRANSAC" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_4_Type"/>
 *         &lt;element name="TPOPER" type="{http://www.isban.es/webservices/TDCs}INDICADOR_GENERICO_Type"/>
 *         &lt;element name="CANALPG" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_2_Type"/>
 *         &lt;element name="CANALNSU" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_24_Type"/>
 *         &lt;element name="MEIOPG" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_2_Type"/>
 *         &lt;element name="DTORIGEM" type="{http://www.isban.es/webservices/TDCs}FECHA_AAAAMMDD_Type"/>
 *         &lt;element name="HRORIGEM" type="{http://www.isban.es/webservices/TDCs}HORA_HHMMSS_PUNTO_Type"/>
 *         &lt;element name="TPCDCLI" type="{http://www.isban.es/webservices/TDCs}INDICADOR_GENERICO_Type"/>
 *         &lt;element name="INDAGEND" type="{http://www.isban.es/webservices/TDCs}INDICADOR_GENERICO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AREAPG1_BR_Type", propOrder = {
    "codent",
    "centalt",
    "transac",
    "tpoper",
    "canalpg",
    "canalnsu",
    "meiopg",
    "dtorigem",
    "hrorigem",
    "tpcdcli",
    "indagend"
})
public class AREAPG1BRType {

    @XmlElement(name = "CODENT", required = true)
    protected String codent;
    @XmlElement(name = "CENTALT", required = true)
    protected String centalt;
    @XmlElement(name = "TRANSAC", required = true)
    protected String transac;
    @XmlElement(name = "TPOPER", required = true)
    protected String tpoper;
    @XmlElement(name = "CANALPG", required = true)
    protected String canalpg;
    @XmlElement(name = "CANALNSU", required = true)
    protected String canalnsu;
    @XmlElement(name = "MEIOPG", required = true)
    protected String meiopg;
    @XmlElement(name = "DTORIGEM", required = true)
    protected XMLGregorianCalendar dtorigem;
    @XmlElement(name = "HRORIGEM", required = true)
    protected XMLGregorianCalendar hrorigem;
    @XmlElement(name = "TPCDCLI", required = true)
    protected String tpcdcli;
    @XmlElement(name = "INDAGEND", required = true)
    protected String indagend;

    /**
     * Gets the value of the codent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODENT() {
        return codent;
    }

    /**
     * Sets the value of the codent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODENT(String value) {
        this.codent = value;
    }

    /**
     * Gets the value of the centalt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCENTALT() {
        return centalt;
    }

    /**
     * Sets the value of the centalt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCENTALT(String value) {
        this.centalt = value;
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
     * Gets the value of the canalnsu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCANALNSU() {
        return canalnsu;
    }

    /**
     * Sets the value of the canalnsu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCANALNSU(String value) {
        this.canalnsu = value;
    }

    /**
     * Gets the value of the meiopg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEIOPG() {
        return meiopg;
    }

    /**
     * Sets the value of the meiopg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEIOPG(String value) {
        this.meiopg = value;
    }

    /**
     * Gets the value of the dtorigem property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTORIGEM() {
        return dtorigem;
    }

    /**
     * Sets the value of the dtorigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTORIGEM(XMLGregorianCalendar value) {
        this.dtorigem = value;
    }

    /**
     * Gets the value of the hrorigem property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHRORIGEM() {
        return hrorigem;
    }

    /**
     * Sets the value of the hrorigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHRORIGEM(XMLGregorianCalendar value) {
        this.hrorigem = value;
    }

    /**
     * Gets the value of the tpcdcli property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTPCDCLI() {
        return tpcdcli;
    }

    /**
     * Sets the value of the tpcdcli property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTPCDCLI(String value) {
        this.tpcdcli = value;
    }

    /**
     * Gets the value of the indagend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDAGEND() {
        return indagend;
    }

    /**
     * Sets the value of the indagend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDAGEND(String value) {
        this.indagend = value;
    }

}
