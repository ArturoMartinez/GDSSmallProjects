
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATRIBUTO_TIPO_GESTOR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ATRIBUTO_TIPO_GESTOR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="COD_ATRIBUTO_TIPO_GESTOR" type="{http://www.isban.es/webservices/TDCs}COD_ATRIBUTO_TIPO_GESTOR_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATRIBUTO_TIPO_GESTOR_Type", propOrder = {
    "empresa",
    "codatributotipogestor"
})
public class ATRIBUTOTIPOGESTORType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "COD_ATRIBUTO_TIPO_GESTOR", required = true)
    protected String codatributotipogestor;

    /**
     * Gets the value of the empresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPRESA() {
        return empresa;
    }

    /**
     * Sets the value of the empresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPRESA(String value) {
        this.empresa = value;
    }

    /**
     * Gets the value of the codatributotipogestor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODATRIBUTOTIPOGESTOR() {
        return codatributotipogestor;
    }

    /**
     * Sets the value of the codatributotipogestor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODATRIBUTOTIPOGESTOR(String value) {
        this.codatributotipogestor = value;
    }

}
