
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COMPT_INDICA_BR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COMPT_INDICA_BR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PEVINSAN" type="{http://www.isban.es/webservices/TDCs}INDICADOR_GENERICO_Type"/>
 *         &lt;element name="PECODEMP" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_4_Type"/>
 *         &lt;element name="PEINDREL" type="{http://www.isban.es/webservices/TDCs}INDICADOR_GENERICO_Type"/>
 *         &lt;element name="PEINDCON" type="{http://www.isban.es/webservices/TDCs}INDICADOR_GENERICO_Type"/>
 *         &lt;element name="PEINDGRU" type="{http://www.isban.es/webservices/TDCs}INDICADOR_GENERICO_Type"/>
 *         &lt;element name="PEINDAVI" type="{http://www.isban.es/webservices/TDCs}INDICADOR_GENERICO_Type"/>
 *         &lt;element name="PEINDNO1" type="{http://www.isban.es/webservices/TDCs}INDICADOR_GENERICO_Type"/>
 *         &lt;element name="PEINDNO2" type="{http://www.isban.es/webservices/TDCs}INDICADOR_GENERICO_Type"/>
 *         &lt;element name="PEINDNO3" type="{http://www.isban.es/webservices/TDCs}INDICADOR_GENERICO_Type"/>
 *         &lt;element name="PEINDNO4" type="{http://www.isban.es/webservices/TDCs}INDICADOR_GENERICO_Type"/>
 *         &lt;element name="PEINDNO5" type="{http://www.isban.es/webservices/TDCs}INDICADOR_GENERICO_Type"/>
 *         &lt;element name="PEACTRIU" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_5_Type"/>
 *         &lt;element name="PESUBSEG" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_3_Type"/>
 *         &lt;element name="PESUBSEG2" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_3_Type"/>
 *         &lt;element name="PEIDIOMA" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COMPT_INDICA_BR_Type", propOrder = {
    "pevinsan",
    "pecodemp",
    "peindrel",
    "peindcon",
    "peindgru",
    "peindavi",
    "peindno1",
    "peindno2",
    "peindno3",
    "peindno4",
    "peindno5",
    "peactriu",
    "pesubseg",
    "pesubseg2",
    "peidioma"
})
public class COMPTINDICABRType {

    @XmlElement(name = "PEVINSAN", required = true)
    protected String pevinsan;
    @XmlElement(name = "PECODEMP", required = true)
    protected String pecodemp;
    @XmlElement(name = "PEINDREL", required = true)
    protected String peindrel;
    @XmlElement(name = "PEINDCON", required = true)
    protected String peindcon;
    @XmlElement(name = "PEINDGRU", required = true)
    protected String peindgru;
    @XmlElement(name = "PEINDAVI", required = true)
    protected String peindavi;
    @XmlElement(name = "PEINDNO1", required = true)
    protected String peindno1;
    @XmlElement(name = "PEINDNO2", required = true)
    protected String peindno2;
    @XmlElement(name = "PEINDNO3", required = true)
    protected String peindno3;
    @XmlElement(name = "PEINDNO4", required = true)
    protected String peindno4;
    @XmlElement(name = "PEINDNO5", required = true)
    protected String peindno5;
    @XmlElement(name = "PEACTRIU", required = true)
    protected String peactriu;
    @XmlElement(name = "PESUBSEG", required = true)
    protected String pesubseg;
    @XmlElement(name = "PESUBSEG2", required = true)
    protected String pesubseg2;
    @XmlElement(name = "PEIDIOMA", required = true)
    protected String peidioma;

    /**
     * Gets the value of the pevinsan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPEVINSAN() {
        return pevinsan;
    }

    /**
     * Sets the value of the pevinsan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPEVINSAN(String value) {
        this.pevinsan = value;
    }

    /**
     * Gets the value of the pecodemp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPECODEMP() {
        return pecodemp;
    }

    /**
     * Sets the value of the pecodemp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPECODEMP(String value) {
        this.pecodemp = value;
    }

    /**
     * Gets the value of the peindrel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPEINDREL() {
        return peindrel;
    }

    /**
     * Sets the value of the peindrel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPEINDREL(String value) {
        this.peindrel = value;
    }

    /**
     * Gets the value of the peindcon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPEINDCON() {
        return peindcon;
    }

    /**
     * Sets the value of the peindcon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPEINDCON(String value) {
        this.peindcon = value;
    }

    /**
     * Gets the value of the peindgru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPEINDGRU() {
        return peindgru;
    }

    /**
     * Sets the value of the peindgru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPEINDGRU(String value) {
        this.peindgru = value;
    }

    /**
     * Gets the value of the peindavi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPEINDAVI() {
        return peindavi;
    }

    /**
     * Sets the value of the peindavi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPEINDAVI(String value) {
        this.peindavi = value;
    }

    /**
     * Gets the value of the peindno1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPEINDNO1() {
        return peindno1;
    }

    /**
     * Sets the value of the peindno1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPEINDNO1(String value) {
        this.peindno1 = value;
    }

    /**
     * Gets the value of the peindno2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPEINDNO2() {
        return peindno2;
    }

    /**
     * Sets the value of the peindno2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPEINDNO2(String value) {
        this.peindno2 = value;
    }

    /**
     * Gets the value of the peindno3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPEINDNO3() {
        return peindno3;
    }

    /**
     * Sets the value of the peindno3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPEINDNO3(String value) {
        this.peindno3 = value;
    }

    /**
     * Gets the value of the peindno4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPEINDNO4() {
        return peindno4;
    }

    /**
     * Sets the value of the peindno4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPEINDNO4(String value) {
        this.peindno4 = value;
    }

    /**
     * Gets the value of the peindno5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPEINDNO5() {
        return peindno5;
    }

    /**
     * Sets the value of the peindno5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPEINDNO5(String value) {
        this.peindno5 = value;
    }

    /**
     * Gets the value of the peactriu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPEACTRIU() {
        return peactriu;
    }

    /**
     * Sets the value of the peactriu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPEACTRIU(String value) {
        this.peactriu = value;
    }

    /**
     * Gets the value of the pesubseg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPESUBSEG() {
        return pesubseg;
    }

    /**
     * Sets the value of the pesubseg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPESUBSEG(String value) {
        this.pesubseg = value;
    }

    /**
     * Gets the value of the pesubseg2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPESUBSEG2() {
        return pesubseg2;
    }

    /**
     * Sets the value of the pesubseg2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPESUBSEG2(String value) {
        this.pesubseg2 = value;
    }

    /**
     * Gets the value of the peidioma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPEIDIOMA() {
        return peidioma;
    }

    /**
     * Sets the value of the peidioma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPEIDIOMA(String value) {
        this.peidioma = value;
    }

}
