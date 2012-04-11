
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GRUPO_SERVICIOS_CANAL_CSC_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GRUPO_SERVICIOS_CANAL_CSC_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CRIT_AGR_SERVIC_CANAL_CSC" type="{http://www.isban.es/webservices/TDCc}CRIT_AGR_SERVIC_CANAL_CSC_Type"/>
 *         &lt;element name="COD_GRUPO_SERVICIO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GRUPO_SERVICIOS_CANAL_CSC_Type", propOrder = {
    "critagrserviccanalcsc",
    "codgruposervicio"
})
public class GRUPOSERVICIOSCANALCSCType {

    @XmlElement(name = "CRIT_AGR_SERVIC_CANAL_CSC", required = true)
    protected CRITAGRSERVICCANALCSCType critagrserviccanalcsc;
    @XmlElement(name = "COD_GRUPO_SERVICIO", required = true)
    protected String codgruposervicio;

    /**
     * Gets the value of the critagrserviccanalcsc property.
     * 
     * @return
     *     possible object is
     *     {@link CRITAGRSERVICCANALCSCType }
     *     
     */
    public CRITAGRSERVICCANALCSCType getCRITAGRSERVICCANALCSC() {
        return critagrserviccanalcsc;
    }

    /**
     * Sets the value of the critagrserviccanalcsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRITAGRSERVICCANALCSCType }
     *     
     */
    public void setCRITAGRSERVICCANALCSC(CRITAGRSERVICCANALCSCType value) {
        this.critagrserviccanalcsc = value;
    }

    /**
     * Gets the value of the codgruposervicio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODGRUPOSERVICIO() {
        return codgruposervicio;
    }

    /**
     * Sets the value of the codgruposervicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODGRUPOSERVICIO(String value) {
        this.codgruposervicio = value;
    }

}
