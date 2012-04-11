
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CHAVE_TIPO_RESIDENCIA_BR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CHAVE_TIPO_RESIDENCIA_BR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_RESIDENCIA_BR" type="{http://www.isban.es/webservices/TDCs}TIPO_DE_RESIDENCIA_BR_Type"/>
 *         &lt;element name="INDICADOR" type="{http://www.isban.es/webservices/TDCs}INDICADOR_GENERICO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CHAVE_TIPO_RESIDENCIA_BR_Type", propOrder = {
    "tiporesidenciabr",
    "indicador"
})
public class CHAVETIPORESIDENCIABRType {

    @XmlElement(name = "TIPO_RESIDENCIA_BR", required = true)
    protected String tiporesidenciabr;
    @XmlElement(name = "INDICADOR", required = true)
    protected String indicador;

    /**
     * Gets the value of the tiporesidenciabr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPORESIDENCIABR() {
        return tiporesidenciabr;
    }

    /**
     * Sets the value of the tiporesidenciabr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPORESIDENCIABR(String value) {
        this.tiporesidenciabr = value;
    }

    /**
     * Gets the value of the indicador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDICADOR() {
        return indicador;
    }

    /**
     * Sets the value of the indicador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDICADOR(String value) {
        this.indicador = value;
    }

}
