
package com.gdslink.mpmerge.santander.soap;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RETV081_TCEE_BR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RETV081_TCEE_BR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODENT" type="{http://www.isban.es/webservices/TDCs}ENTIDAD_BR_Type"/>
 *         &lt;element name="FCAMBI_BR" type="{http://www.isban.es/webservices/TDCs}FECHA_AAAAMMDD_GUION_Type"/>
 *         &lt;element name="CDMOED_BR" type="{http://www.isban.es/webservices/TDCs}MOEDA_BR_Type"/>
 *         &lt;element name="INDDIV_BR" type="{http://www.isban.es/webservices/TDCs}INDICADOR_GENERICO_Type"/>
 *         &lt;element name="INDCOT_BR" type="{http://www.isban.es/webservices/TDCs}INDICADOR_GENERICO_Type"/>
 *         &lt;element name="CAMBFI_BR" type="{http://www.isban.es/webservices/TDCs}TAXA_HEXA_BR_Type"/>
 *         &lt;element name="CAMBBA_BR" type="{http://www.isban.es/webservices/TDCs}TAXA_HEXA_BR_Type"/>
 *         &lt;element name="CAMBAL_BR" type="{http://www.isban.es/webservices/TDCs}TAXA_HEXA_BR_Type"/>
 *         &lt;element name="SEGMEN_BR" type="{http://www.isban.es/webservices/TDCs}COD_SEG_BR_Type"/>
 *         &lt;element name="ULTMOD_BR" type="{http://www.isban.es/webservices/TDCs}TIMESTAMP_FGUION_HPUNTO_Type"/>
 *         &lt;element name="BANCUL_BR" type="{http://www.isban.es/webservices/TDCs}ENTIDAD_BR_Type"/>
 *         &lt;element name="OFICUL_BR" type="{http://www.isban.es/webservices/TDCs}SUCURSAL_BR_Type"/>
 *         &lt;element name="NUMTER_BR" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_4_Type"/>
 *         &lt;element name="USULTM_BR" type="{http://www.isban.es/webservices/TDCs}USER_ID_BR_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RETV081_TCEE_BR_Type", propOrder = {
    "codent",
    "fcambibr",
    "cdmoedbr",
    "inddivbr",
    "indcotbr",
    "cambfibr",
    "cambbabr",
    "cambalbr",
    "segmenbr",
    "ultmodbr",
    "banculbr",
    "oficulbr",
    "numterbr",
    "usultmbr"
})
public class RETV081TCEEBRType {

    @XmlElement(name = "CODENT", required = true)
    protected String codent;
    @XmlElement(name = "FCAMBI_BR", required = true)
    protected XMLGregorianCalendar fcambibr;
    @XmlElement(name = "CDMOED_BR", required = true)
    protected String cdmoedbr;
    @XmlElement(name = "INDDIV_BR", required = true)
    protected String inddivbr;
    @XmlElement(name = "INDCOT_BR", required = true)
    protected String indcotbr;
    @XmlElement(name = "CAMBFI_BR", required = true)
    protected BigDecimal cambfibr;
    @XmlElement(name = "CAMBBA_BR", required = true)
    protected BigDecimal cambbabr;
    @XmlElement(name = "CAMBAL_BR", required = true)
    protected BigDecimal cambalbr;
    @XmlElement(name = "SEGMEN_BR", required = true)
    protected String segmenbr;
    @XmlElement(name = "ULTMOD_BR", required = true)
    protected XMLGregorianCalendar ultmodbr;
    @XmlElement(name = "BANCUL_BR", required = true)
    protected String banculbr;
    @XmlElement(name = "OFICUL_BR", required = true)
    protected String oficulbr;
    @XmlElement(name = "NUMTER_BR", required = true)
    protected String numterbr;
    @XmlElement(name = "USULTM_BR", required = true)
    protected String usultmbr;

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
     * Gets the value of the fcambibr property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFCAMBIBR() {
        return fcambibr;
    }

    /**
     * Sets the value of the fcambibr property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFCAMBIBR(XMLGregorianCalendar value) {
        this.fcambibr = value;
    }

    /**
     * Gets the value of the cdmoedbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDMOEDBR() {
        return cdmoedbr;
    }

    /**
     * Sets the value of the cdmoedbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDMOEDBR(String value) {
        this.cdmoedbr = value;
    }

    /**
     * Gets the value of the inddivbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDDIVBR() {
        return inddivbr;
    }

    /**
     * Sets the value of the inddivbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDDIVBR(String value) {
        this.inddivbr = value;
    }

    /**
     * Gets the value of the indcotbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDCOTBR() {
        return indcotbr;
    }

    /**
     * Sets the value of the indcotbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDCOTBR(String value) {
        this.indcotbr = value;
    }

    /**
     * Gets the value of the cambfibr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCAMBFIBR() {
        return cambfibr;
    }

    /**
     * Sets the value of the cambfibr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCAMBFIBR(BigDecimal value) {
        this.cambfibr = value;
    }

    /**
     * Gets the value of the cambbabr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCAMBBABR() {
        return cambbabr;
    }

    /**
     * Sets the value of the cambbabr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCAMBBABR(BigDecimal value) {
        this.cambbabr = value;
    }

    /**
     * Gets the value of the cambalbr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCAMBALBR() {
        return cambalbr;
    }

    /**
     * Sets the value of the cambalbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCAMBALBR(BigDecimal value) {
        this.cambalbr = value;
    }

    /**
     * Gets the value of the segmenbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEGMENBR() {
        return segmenbr;
    }

    /**
     * Sets the value of the segmenbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEGMENBR(String value) {
        this.segmenbr = value;
    }

    /**
     * Gets the value of the ultmodbr property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getULTMODBR() {
        return ultmodbr;
    }

    /**
     * Sets the value of the ultmodbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setULTMODBR(XMLGregorianCalendar value) {
        this.ultmodbr = value;
    }

    /**
     * Gets the value of the banculbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBANCULBR() {
        return banculbr;
    }

    /**
     * Sets the value of the banculbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBANCULBR(String value) {
        this.banculbr = value;
    }

    /**
     * Gets the value of the oficulbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOFICULBR() {
        return oficulbr;
    }

    /**
     * Sets the value of the oficulbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOFICULBR(String value) {
        this.oficulbr = value;
    }

    /**
     * Gets the value of the numterbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMTERBR() {
        return numterbr;
    }

    /**
     * Sets the value of the numterbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMTERBR(String value) {
        this.numterbr = value;
    }

    /**
     * Gets the value of the usultmbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSULTMBR() {
        return usultmbr;
    }

    /**
     * Sets the value of the usultmbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSULTMBR(String value) {
        this.usultmbr = value;
    }

}
