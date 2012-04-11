
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GR_CAT_PROPOSITO_PE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GR_CAT_PROPOSITO_PE_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COD_GR_CAT_PROPOSITO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *         &lt;element name="COD_CAT_PROPOSITO" type="{http://www.isban.es/webservices/TDCs}CATEG_PROPOSITO_PE_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GR_CAT_PROPOSITO_PE_Type", propOrder = {
    "codgrcatproposito",
    "codcatproposito"
})
public class GRCATPROPOSITOPEType {

    @XmlElement(name = "COD_GR_CAT_PROPOSITO", required = true)
    protected String codgrcatproposito;
    @XmlElement(name = "COD_CAT_PROPOSITO", required = true)
    protected String codcatproposito;

    /**
     * Gets the value of the codgrcatproposito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODGRCATPROPOSITO() {
        return codgrcatproposito;
    }

    /**
     * Sets the value of the codgrcatproposito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODGRCATPROPOSITO(String value) {
        this.codgrcatproposito = value;
    }

    /**
     * Gets the value of the codcatproposito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODCATPROPOSITO() {
        return codcatproposito;
    }

    /**
     * Sets the value of the codcatproposito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODCATPROPOSITO(String value) {
        this.codcatproposito = value;
    }

}
