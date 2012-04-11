
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IDENTIF_ORGANISMO_GR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IDENTIF_ORGANISMO_GR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BIC_ISO" type="{http://www.isban.es/webservices/TDCs}BIC_ISO_Type"/>
 *         &lt;element name="IBEI_ISO" type="{http://www.isban.es/webservices/TDCs}IBEI_ISO_Type"/>
 *         &lt;element name="BEI_ISO" type="{http://www.isban.es/webservices/TDCs}BEI_ISO_Type"/>
 *         &lt;element name="EANGLN_ISO" type="{http://www.isban.es/webservices/TDCs}EANGLN_ISO_Type"/>
 *         &lt;element name="CHIPS_ISO" type="{http://www.isban.es/webservices/TDCs}CHIPS_ISO_Type"/>
 *         &lt;element name="DUNS_ISO" type="{http://www.isban.es/webservices/TDCs}DUNS_ISO_Type"/>
 *         &lt;element name="RELCLBAN_ISO" type="{http://www.isban.es/webservices/TDCs}COD_ALFAJUSTI_35_Type"/>
 *         &lt;element name="TASAID_ISO" type="{http://www.isban.es/webservices/TDCs}COD_ALFAJUSTI_35_Type"/>
 *         &lt;element name="IDENPRO_ISO" type="{http://www.isban.es/webservices/TDCs}COD_ALFAJUSTI_35_Type"/>
 *         &lt;element name="ENTIDPRO_ISO" type="{http://www.isban.es/webservices/TDCs}COD_ALFAJUSTI_35_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IDENTIF_ORGANISMO_GR_Type", propOrder = {
    "biciso",
    "ibeiiso",
    "beiiso",
    "eanglniso",
    "chipsiso",
    "dunsiso",
    "relclbaniso",
    "tasaidiso",
    "idenproiso",
    "entidproiso"
})
public class IDENTIFORGANISMOGRType {

    @XmlElement(name = "BIC_ISO", required = true)
    protected String biciso;
    @XmlElement(name = "IBEI_ISO", required = true)
    protected String ibeiiso;
    @XmlElement(name = "BEI_ISO", required = true)
    protected String beiiso;
    @XmlElement(name = "EANGLN_ISO", required = true)
    protected String eanglniso;
    @XmlElement(name = "CHIPS_ISO", required = true)
    protected String chipsiso;
    @XmlElement(name = "DUNS_ISO", required = true)
    protected String dunsiso;
    @XmlElement(name = "RELCLBAN_ISO", required = true)
    protected String relclbaniso;
    @XmlElement(name = "TASAID_ISO", required = true)
    protected String tasaidiso;
    @XmlElement(name = "IDENPRO_ISO", required = true)
    protected String idenproiso;
    @XmlElement(name = "ENTIDPRO_ISO", required = true)
    protected String entidproiso;

    /**
     * Gets the value of the biciso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBICISO() {
        return biciso;
    }

    /**
     * Sets the value of the biciso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBICISO(String value) {
        this.biciso = value;
    }

    /**
     * Gets the value of the ibeiiso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBEIISO() {
        return ibeiiso;
    }

    /**
     * Sets the value of the ibeiiso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBEIISO(String value) {
        this.ibeiiso = value;
    }

    /**
     * Gets the value of the beiiso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEIISO() {
        return beiiso;
    }

    /**
     * Sets the value of the beiiso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEIISO(String value) {
        this.beiiso = value;
    }

    /**
     * Gets the value of the eanglniso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEANGLNISO() {
        return eanglniso;
    }

    /**
     * Sets the value of the eanglniso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEANGLNISO(String value) {
        this.eanglniso = value;
    }

    /**
     * Gets the value of the chipsiso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHIPSISO() {
        return chipsiso;
    }

    /**
     * Sets the value of the chipsiso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHIPSISO(String value) {
        this.chipsiso = value;
    }

    /**
     * Gets the value of the dunsiso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUNSISO() {
        return dunsiso;
    }

    /**
     * Sets the value of the dunsiso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUNSISO(String value) {
        this.dunsiso = value;
    }

    /**
     * Gets the value of the relclbaniso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRELCLBANISO() {
        return relclbaniso;
    }

    /**
     * Sets the value of the relclbaniso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRELCLBANISO(String value) {
        this.relclbaniso = value;
    }

    /**
     * Gets the value of the tasaidiso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTASAIDISO() {
        return tasaidiso;
    }

    /**
     * Sets the value of the tasaidiso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTASAIDISO(String value) {
        this.tasaidiso = value;
    }

    /**
     * Gets the value of the idenproiso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDENPROISO() {
        return idenproiso;
    }

    /**
     * Sets the value of the idenproiso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDENPROISO(String value) {
        this.idenproiso = value;
    }

    /**
     * Gets the value of the entidproiso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENTIDPROISO() {
        return entidproiso;
    }

    /**
     * Sets the value of the entidproiso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENTIDPROISO(String value) {
        this.entidproiso = value;
    }

}
