
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SERVICIO_CONTABLE_JUSNUE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SERVICIO_CONTABLE_JUSNUE_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SUBTIPO_DE_PRODUCTO" type="{http://www.isban.es/webservices/TDCc}SUBTIPO_DE_PRODUCTO_Type"/>
 *         &lt;element name="CONCEPTO_DE_SALDO" type="{http://www.isban.es/webservices/TDCs}CONCEPTO_DE_SALDO_Type"/>
 *         &lt;element name="SECTOR_CONTABLE" type="{http://www.isban.es/webservices/TDCs}SECTOR_CONTABLE_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SERVICIO_CONTABLE_JUSNUE_Type", propOrder = {
    "subtipodeproducto",
    "conceptodesaldo",
    "sectorcontable"
})
public class SERVICIOCONTABLEJUSNUEType {

    @XmlElement(name = "SUBTIPO_DE_PRODUCTO", required = true)
    protected SUBTIPODEPRODUCTOType subtipodeproducto;
    @XmlElement(name = "CONCEPTO_DE_SALDO", required = true)
    protected String conceptodesaldo;
    @XmlElement(name = "SECTOR_CONTABLE", required = true)
    protected String sectorcontable;

    /**
     * Gets the value of the subtipodeproducto property.
     * 
     * @return
     *     possible object is
     *     {@link SUBTIPODEPRODUCTOType }
     *     
     */
    public SUBTIPODEPRODUCTOType getSUBTIPODEPRODUCTO() {
        return subtipodeproducto;
    }

    /**
     * Sets the value of the subtipodeproducto property.
     * 
     * @param value
     *     allowed object is
     *     {@link SUBTIPODEPRODUCTOType }
     *     
     */
    public void setSUBTIPODEPRODUCTO(SUBTIPODEPRODUCTOType value) {
        this.subtipodeproducto = value;
    }

    /**
     * Gets the value of the conceptodesaldo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONCEPTODESALDO() {
        return conceptodesaldo;
    }

    /**
     * Sets the value of the conceptodesaldo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONCEPTODESALDO(String value) {
        this.conceptodesaldo = value;
    }

    /**
     * Gets the value of the sectorcontable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSECTORCONTABLE() {
        return sectorcontable;
    }

    /**
     * Sets the value of the sectorcontable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSECTORCONTABLE(String value) {
        this.sectorcontable = value;
    }

}
