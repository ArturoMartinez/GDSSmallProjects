
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DESCRIPCION_TRADUCIBLE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DESCRIPCION_TRADUCIBLE_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CLAVE_CONCATENADA" type="{http://www.isban.es/webservices/TDCs}CLAVE_CONCATENADA_Type"/>
 *         &lt;element name="CODIGO_TIPO_DE_DATO" type="{http://www.isban.es/webservices/TDCs}CODIGO_TIPO_DE_DATO_Type"/>
 *         &lt;element name="FORMATO_TEXTO" type="{http://www.isban.es/webservices/TDCs}FORMATO_TEXTO_Type"/>
 *         &lt;element name="IDIOMA_CORPORATIVO" type="{http://www.isban.es/webservices/TDCc}IDIOMA_CORPORATIVO_Type"/>
 *         &lt;element name="CONCEPTO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *         &lt;element name="DESCRIPCION" type="{http://www.isban.es/webservices/TDCs}DESCRIPCION_EXTRALARGA_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DESCRIPCION_TRADUCIBLE_Type", propOrder = {
    "claveconcatenada",
    "codigotipodedato",
    "formatotexto",
    "idiomacorporativo",
    "concepto",
    "descripcion"
})
public class DESCRIPCIONTRADUCIBLEType {

    @XmlElement(name = "CLAVE_CONCATENADA", required = true)
    protected String claveconcatenada;
    @XmlElement(name = "CODIGO_TIPO_DE_DATO", required = true)
    protected String codigotipodedato;
    @XmlElement(name = "FORMATO_TEXTO", required = true)
    protected String formatotexto;
    @XmlElement(name = "IDIOMA_CORPORATIVO", required = true)
    protected IDIOMACORPORATIVOType idiomacorporativo;
    @XmlElement(name = "CONCEPTO", required = true)
    protected String concepto;
    @XmlElement(name = "DESCRIPCION", required = true)
    protected String descripcion;

    /**
     * Gets the value of the claveconcatenada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLAVECONCATENADA() {
        return claveconcatenada;
    }

    /**
     * Sets the value of the claveconcatenada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLAVECONCATENADA(String value) {
        this.claveconcatenada = value;
    }

    /**
     * Gets the value of the codigotipodedato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOTIPODEDATO() {
        return codigotipodedato;
    }

    /**
     * Sets the value of the codigotipodedato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOTIPODEDATO(String value) {
        this.codigotipodedato = value;
    }

    /**
     * Gets the value of the formatotexto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORMATOTEXTO() {
        return formatotexto;
    }

    /**
     * Sets the value of the formatotexto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORMATOTEXTO(String value) {
        this.formatotexto = value;
    }

    /**
     * Gets the value of the idiomacorporativo property.
     * 
     * @return
     *     possible object is
     *     {@link IDIOMACORPORATIVOType }
     *     
     */
    public IDIOMACORPORATIVOType getIDIOMACORPORATIVO() {
        return idiomacorporativo;
    }

    /**
     * Sets the value of the idiomacorporativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDIOMACORPORATIVOType }
     *     
     */
    public void setIDIOMACORPORATIVO(IDIOMACORPORATIVOType value) {
        this.idiomacorporativo = value;
    }

    /**
     * Gets the value of the concepto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONCEPTO() {
        return concepto;
    }

    /**
     * Sets the value of the concepto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONCEPTO(String value) {
        this.concepto = value;
    }

    /**
     * Gets the value of the descripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPCION() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPCION(String value) {
        this.descripcion = value;
    }

}