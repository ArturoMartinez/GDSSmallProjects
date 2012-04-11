
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CHAVE_SEG_SEC_PF_BR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CHAVE_SEG_SEC_PF_BR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SEGMENTO_SEC_PF_BR" type="{http://www.isban.es/webservices/TDCs}SEGMENTO_SEC_PF_BR_Type"/>
 *         &lt;element name="TIPO_DE_PERSONA_BR" type="{http://www.isban.es/webservices/TDCs}TIPO_DE_PERSONA_BR_Type"/>
 *         &lt;element name="CLASSE" type="{http://www.isban.es/webservices/TDCs}INDICADOR_GENERICO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CHAVE_SEG_SEC_PF_BR_Type", propOrder = {
    "segmentosecpfbr",
    "tipodepersonabr",
    "classe"
})
public class CHAVESEGSECPFBRType {

    @XmlElement(name = "SEGMENTO_SEC_PF_BR", required = true)
    protected String segmentosecpfbr;
    @XmlElement(name = "TIPO_DE_PERSONA_BR", required = true)
    protected String tipodepersonabr;
    @XmlElement(name = "CLASSE", required = true)
    protected String classe;

    /**
     * Gets the value of the segmentosecpfbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEGMENTOSECPFBR() {
        return segmentosecpfbr;
    }

    /**
     * Sets the value of the segmentosecpfbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEGMENTOSECPFBR(String value) {
        this.segmentosecpfbr = value;
    }

    /**
     * Gets the value of the tipodepersonabr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODEPERSONABR() {
        return tipodepersonabr;
    }

    /**
     * Sets the value of the tipodepersonabr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODEPERSONABR(String value) {
        this.tipodepersonabr = value;
    }

    /**
     * Gets the value of the classe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASSE() {
        return classe;
    }

    /**
     * Sets the value of the classe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASSE(String value) {
        this.classe = value;
    }

}
