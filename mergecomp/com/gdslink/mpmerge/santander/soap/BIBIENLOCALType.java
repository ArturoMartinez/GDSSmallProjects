
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BI_BIEN_LOCAL_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BI_BIEN_LOCAL_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="BI_TIPO_BUSQUEDA" type="{http://www.isban.es/webservices/TDCc}BI_TIPO_BUSQUEDA_Type"/>
 *         &lt;element name="COD_LOCAL_BIEN" type="{http://www.isban.es/webservices/TDCs}STRING_60_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BI_BIEN_LOCAL_Type", propOrder = {
    "empresa",
    "bitipobusqueda",
    "codlocalbien"
})
public class BIBIENLOCALType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "BI_TIPO_BUSQUEDA", required = true)
    protected BITIPOBUSQUEDAType bitipobusqueda;
    @XmlElement(name = "COD_LOCAL_BIEN", required = true)
    protected String codlocalbien;

    /**
     * Gets the value of the empresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPRESA() {
        return empresa;
    }

    /**
     * Sets the value of the empresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPRESA(String value) {
        this.empresa = value;
    }

    /**
     * Gets the value of the bitipobusqueda property.
     * 
     * @return
     *     possible object is
     *     {@link BITIPOBUSQUEDAType }
     *     
     */
    public BITIPOBUSQUEDAType getBITIPOBUSQUEDA() {
        return bitipobusqueda;
    }

    /**
     * Sets the value of the bitipobusqueda property.
     * 
     * @param value
     *     allowed object is
     *     {@link BITIPOBUSQUEDAType }
     *     
     */
    public void setBITIPOBUSQUEDA(BITIPOBUSQUEDAType value) {
        this.bitipobusqueda = value;
    }

    /**
     * Gets the value of the codlocalbien property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODLOCALBIEN() {
        return codlocalbien;
    }

    /**
     * Sets the value of the codlocalbien property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODLOCALBIEN(String value) {
        this.codlocalbien = value;
    }

}
