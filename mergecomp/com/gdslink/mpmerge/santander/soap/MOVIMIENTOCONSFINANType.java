
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MOVIMIENTO_CONS_FINAN_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MOVIMIENTO_CONS_FINAN_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENTORNO_CONSOLIDAC_FINAN" type="{http://www.isban.es/webservices/TDCc}ENTORNO_CONSOLIDAC_FINAN_Type"/>
 *         &lt;element name="COD_ESCENARIO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *         &lt;element name="COD_SOCIEDAD_ACCIONISTA" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_5_Type"/>
 *         &lt;element name="COD_SOCIEDAD_PARTICIPADA" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_5_Type"/>
 *         &lt;element name="COD_TIPO_CARTERA" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *         &lt;element name="CODIGO_EMISOR_PARTENON" type="{http://www.isban.es/webservices/TDCs}CODIGO_EMISOR_PARTENON_Type"/>
 *         &lt;element name="FECHA_OPERACION" type="{http://www.isban.es/webservices/TDCs}FECHA_OPERACION_Type"/>
 *         &lt;element name="CODIGO_AJUSTE" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_9_Type"/>
 *         &lt;element name="DESGLOSE_CONSO_FINAN" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_5_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MOVIMIENTO_CONS_FINAN_Type", propOrder = {
    "entornoconsolidacfinan",
    "codescenario",
    "codsociedadaccionista",
    "codsociedadparticipada",
    "codtipocartera",
    "codigoemisorpartenon",
    "fechaoperacion",
    "codigoajuste",
    "desgloseconsofinan"
})
public class MOVIMIENTOCONSFINANType {

    @XmlElement(name = "ENTORNO_CONSOLIDAC_FINAN", required = true)
    protected ENTORNOCONSOLIDACFINANType entornoconsolidacfinan;
    @XmlElement(name = "COD_ESCENARIO", required = true)
    protected String codescenario;
    @XmlElement(name = "COD_SOCIEDAD_ACCIONISTA", required = true)
    protected String codsociedadaccionista;
    @XmlElement(name = "COD_SOCIEDAD_PARTICIPADA", required = true)
    protected String codsociedadparticipada;
    @XmlElement(name = "COD_TIPO_CARTERA", required = true)
    protected String codtipocartera;
    @XmlElement(name = "CODIGO_EMISOR_PARTENON", required = true)
    protected String codigoemisorpartenon;
    @XmlElement(name = "FECHA_OPERACION", required = true)
    protected XMLGregorianCalendar fechaoperacion;
    @XmlElement(name = "CODIGO_AJUSTE")
    protected int codigoajuste;
    @XmlElement(name = "DESGLOSE_CONSO_FINAN", required = true)
    protected String desgloseconsofinan;

    /**
     * Gets the value of the entornoconsolidacfinan property.
     * 
     * @return
     *     possible object is
     *     {@link ENTORNOCONSOLIDACFINANType }
     *     
     */
    public ENTORNOCONSOLIDACFINANType getENTORNOCONSOLIDACFINAN() {
        return entornoconsolidacfinan;
    }

    /**
     * Sets the value of the entornoconsolidacfinan property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENTORNOCONSOLIDACFINANType }
     *     
     */
    public void setENTORNOCONSOLIDACFINAN(ENTORNOCONSOLIDACFINANType value) {
        this.entornoconsolidacfinan = value;
    }

    /**
     * Gets the value of the codescenario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODESCENARIO() {
        return codescenario;
    }

    /**
     * Sets the value of the codescenario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODESCENARIO(String value) {
        this.codescenario = value;
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

    /**
     * Gets the value of the fechaoperacion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFECHAOPERACION() {
        return fechaoperacion;
    }

    /**
     * Sets the value of the fechaoperacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFECHAOPERACION(XMLGregorianCalendar value) {
        this.fechaoperacion = value;
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
     * Gets the value of the desgloseconsofinan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESGLOSECONSOFINAN() {
        return desgloseconsofinan;
    }

    /**
     * Sets the value of the desgloseconsofinan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESGLOSECONSOFINAN(String value) {
        this.desgloseconsofinan = value;
    }

}
