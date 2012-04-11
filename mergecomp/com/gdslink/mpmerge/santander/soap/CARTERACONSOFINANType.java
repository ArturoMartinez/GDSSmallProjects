
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CARTERA_CONSO_FINAN_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CARTERA_CONSO_FINAN_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PERIODO_CONSOLIDAC_FINAN" type="{http://www.isban.es/webservices/TDCc}PERIODO_CONSOLIDAC_FINAN_Type"/>
 *         &lt;element name="COD_SOCIEDAD_ACCIONISTA" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_5_Type"/>
 *         &lt;element name="COD_SOCIEDAD_PARTICIPADA" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_5_Type"/>
 *         &lt;element name="COD_TIPO_CARTERA" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *         &lt;element name="CODIGO_EMISOR_PARTENON" type="{http://www.isban.es/webservices/TDCs}CODIGO_EMISOR_PARTENON_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CARTERA_CONSO_FINAN_Type", propOrder = {
    "periodoconsolidacfinan",
    "codsociedadaccionista",
    "codsociedadparticipada",
    "codtipocartera",
    "codigoemisorpartenon"
})
public class CARTERACONSOFINANType {

    @XmlElement(name = "PERIODO_CONSOLIDAC_FINAN", required = true)
    protected PERIODOCONSOLIDACFINANType periodoconsolidacfinan;
    @XmlElement(name = "COD_SOCIEDAD_ACCIONISTA", required = true)
    protected String codsociedadaccionista;
    @XmlElement(name = "COD_SOCIEDAD_PARTICIPADA", required = true)
    protected String codsociedadparticipada;
    @XmlElement(name = "COD_TIPO_CARTERA", required = true)
    protected String codtipocartera;
    @XmlElement(name = "CODIGO_EMISOR_PARTENON", required = true)
    protected String codigoemisorpartenon;

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
     * Gets the value of the codsociedadaccionista property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODSOCIEDADACCIONISTA() {
        return codsociedadaccionista;
    }

    /**
     * Sets the value of the codsociedadaccionista property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODSOCIEDADACCIONISTA(String value) {
        this.codsociedadaccionista = value;
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
     * Gets the value of the codtipocartera property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODTIPOCARTERA() {
        return codtipocartera;
    }

    /**
     * Sets the value of the codtipocartera property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODTIPOCARTERA(String value) {
        this.codtipocartera = value;
    }

    /**
     * Gets the value of the codigoemisorpartenon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOEMISORPARTENON() {
        return codigoemisorpartenon;
    }

    /**
     * Sets the value of the codigoemisorpartenon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOEMISORPARTENON(String value) {
        this.codigoemisorpartenon = value;
    }

}
