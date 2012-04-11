
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VTC_CONSO_FINAN_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VTC_CONSO_FINAN_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PERIODO_CONSOLIDAC_FINAN" type="{http://www.isban.es/webservices/TDCc}PERIODO_CONSOLIDAC_FINAN_Type"/>
 *         &lt;element name="COD_SOCIEDAD" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_5_Type"/>
 *         &lt;element name="CODIGO_AJUSTE" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_9_Type"/>
 *         &lt;element name="COD_SOCIEDAD_PARTICIPADA" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_5_Type"/>
 *         &lt;element name="COD_SOCIEDAD_TENEDORA" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_5_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VTC_CONSO_FINAN_Type", propOrder = {
    "periodoconsolidacfinan",
    "codsociedad",
    "codigoajuste",
    "codsociedadparticipada",
    "codsociedadtenedora"
})
public class VTCCONSOFINANType {

    @XmlElement(name = "PERIODO_CONSOLIDAC_FINAN", required = true)
    protected PERIODOCONSOLIDACFINANType periodoconsolidacfinan;
    @XmlElement(name = "COD_SOCIEDAD", required = true)
    protected String codsociedad;
    @XmlElement(name = "CODIGO_AJUSTE")
    protected int codigoajuste;
    @XmlElement(name = "COD_SOCIEDAD_PARTICIPADA", required = true)
    protected String codsociedadparticipada;
    @XmlElement(name = "COD_SOCIEDAD_TENEDORA", required = true)
    protected String codsociedadtenedora;

    /**
     * Gets the value of the periodoconsolidacfinan property.
     * 
     * @return
     *     possible object is
     *     {@link PERIODOCONSOLIDACFINANType }
     *     
     */
    public PERIODOCONSOLIDACFINANType getPERIODOCONSOLIDACFINAN() {
        return periodoconsolidacfinan;
    }

    /**
     * Sets the value of the periodoconsolidacfinan property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERIODOCONSOLIDACFINANType }
     *     
     */
    public void setPERIODOCONSOLIDACFINAN(PERIODOCONSOLIDACFINANType value) {
        this.periodoconsolidacfinan = value;
    }

    /**
     * Gets the value of the codsociedad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODSOCIEDAD() {
        return codsociedad;
    }

    /**
     * Sets the value of the codsociedad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODSOCIEDAD(String value) {
        this.codsociedad = value;
    }

    /**
     * Gets the value of the codigoajuste property.
     * 
     */
    public int getCODIGOAJUSTE() {
        return codigoajuste;
    }

    /**
     * Sets the value of the codigoajuste property.
     * 
     */
    public void setCODIGOAJUSTE(int value) {
        this.codigoajuste = value;
    }

    /**
     * Gets the value of the codsociedadparticipada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODSOCIEDADPARTICIPADA() {
        return codsociedadparticipada;
    }

    /**
     * Sets the value of the codsociedadparticipada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODSOCIEDADPARTICIPADA(String value) {
        this.codsociedadparticipada = value;
    }

    /**
     * Gets the value of the codsociedadtenedora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODSOCIEDADTENEDORA() {
        return codsociedadtenedora;
    }

    /**
     * Sets the value of the codsociedadtenedora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODSOCIEDADTENEDORA(String value) {
        this.codsociedadtenedora = value;
    }

}
