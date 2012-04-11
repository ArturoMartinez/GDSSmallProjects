
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IDENT_OFICIAL_PERSONA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IDENT_OFICIAL_PERSONA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_DOCUMENTO_OFIC" type="{http://www.isban.es/webservices/TDCs}TIPO_DOC_IDENTIFICACION_Type"/>
 *         &lt;element name="CODIGO_DE_DOCUMENTO" type="{http://www.isban.es/webservices/TDCs}CODIGO_DOCUMENTO_OFICIAL_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IDENT_OFICIAL_PERSONA_Type", propOrder = {
    "tipodocumentoofic",
    "codigodedocumento"
})
public class IDENTOFICIALPERSONAType {

    @XmlElement(name = "TIPO_DOCUMENTO_OFIC", required = true)
    protected String tipodocumentoofic;
    @XmlElement(name = "CODIGO_DE_DOCUMENTO", required = true)
    protected String codigodedocumento;

    /**
     * Gets the value of the tipodocumentoofic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODOCUMENTOOFIC() {
        return tipodocumentoofic;
    }

    /**
     * Sets the value of the tipodocumentoofic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODOCUMENTOOFIC(String value) {
        this.tipodocumentoofic = value;
    }

    /**
     * Gets the value of the codigodedocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGODEDOCUMENTO() {
        return codigodedocumento;
    }

    /**
     * Sets the value of the codigodedocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGODEDOCUMENTO(String value) {
        this.codigodedocumento = value;
    }

}
