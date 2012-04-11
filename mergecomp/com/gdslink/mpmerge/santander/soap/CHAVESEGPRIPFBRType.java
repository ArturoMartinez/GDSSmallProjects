
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CHAVE_SEG_PRI_PF_BR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CHAVE_SEG_PRI_PF_BR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SEGMENTO_PRI_PF_BR" type="{http://www.isban.es/webservices/TDCs}SEGMENTO_PRI_PF_BR_Type"/>
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
@XmlType(name = "CHAVE_SEG_PRI_PF_BR_Type", propOrder = {
    "segmentopripfbr",
    "tipodepersonabr",
    "classe"
})
public class CHAVESEGPRIPFBRType {

    @XmlElement(name = "SEGMENTO_PRI_PF_BR", required = true)
    protected String segmentopripfbr;
    @XmlElement(name = "TIPO_DE_PERSONA_BR", required = true)
    protected String tipodepersonabr;
    @XmlElement(name = "CLASSE", required = true)
    protected String classe;

    /**
     * Gets the value of the segmentopripfbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEGMENTOPRIPFBR() {
        return segmentopripfbr;
    }

    /**
     * Sets the value of the segmentopripfbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEGMENTOPRIPFBR(String value) {
        this.segmentopripfbr = value;
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
