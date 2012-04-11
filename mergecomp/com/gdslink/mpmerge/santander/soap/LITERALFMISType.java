
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LITERAL_FMIS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LITERAL_FMIS_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="APLICACION_FMIS" type="{http://www.isban.es/webservices/TDCs}APLICACION_FMIS_Type"/>
 *         &lt;element name="COD_LITERAL" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_10_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LITERAL_FMIS_Type", propOrder = {
    "aplicacionfmis",
    "codliteral"
})
public class LITERALFMISType {

    @XmlElement(name = "APLICACION_FMIS", required = true)
    protected String aplicacionfmis;
    @XmlElement(name = "COD_LITERAL", required = true)
    protected String codliteral;

    /**
     * Gets the value of the aplicacionfmis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPLICACIONFMIS() {
        return aplicacionfmis;
    }

    /**
     * Sets the value of the aplicacionfmis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPLICACIONFMIS(String value) {
        this.aplicacionfmis = value;
    }

    /**
     * Gets the value of the codliteral property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODLITERAL() {
        return codliteral;
    }

    /**
     * Sets the value of the codliteral property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODLITERAL(String value) {
        this.codliteral = value;
    }

}
