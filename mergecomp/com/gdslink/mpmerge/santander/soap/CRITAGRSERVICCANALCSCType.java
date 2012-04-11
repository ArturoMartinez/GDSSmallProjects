
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CRIT_AGR_SERVIC_CANAL_CSC_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRIT_AGR_SERVIC_CANAL_CSC_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="CANAL" type="{http://www.isban.es/webservices/TDCs}CODIGO_DE_CANAL_Type"/>
 *         &lt;element name="CANAL_ELECT" type="{http://www.isban.es/webservices/TDCs}CANAL_BASICO_Type"/>
 *         &lt;element name="COD_CRIT_AGRUPACION" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRIT_AGR_SERVIC_CANAL_CSC_Type", propOrder = {
    "empresa",
    "canal",
    "canalelect",
    "codcritagrupacion"
})
public class CRITAGRSERVICCANALCSCType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "CANAL", required = true)
    protected String canal;
    @XmlElement(name = "CANAL_ELECT", required = true)
    protected String canalelect;
    @XmlElement(name = "COD_CRIT_AGRUPACION", required = true)
    protected String codcritagrupacion;

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
     * Gets the value of the canal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCANAL() {
        return canal;
    }

    /**
     * Sets the value of the canal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCANAL(String value) {
        this.canal = value;
    }

    /**
     * Gets the value of the canalelect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCANALELECT() {
        return canalelect;
    }

    /**
     * Sets the value of the canalelect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCANALELECT(String value) {
        this.canalelect = value;
    }

    /**
     * Gets the value of the codcritagrupacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODCRITAGRUPACION() {
        return codcritagrupacion;
    }

    /**
     * Sets the value of the codcritagrupacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODCRITAGRUPACION(String value) {
        this.codcritagrupacion = value;
    }

}
