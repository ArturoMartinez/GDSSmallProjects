
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CONDICIO_AVISO_CONEX_CTAS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CONDICIO_AVISO_CONEX_CTAS_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CIRCUITO" type="{http://www.isban.es/webservices/TDCs}COD_CIRCUITO_CONEX_CTAS_Type"/>
 *         &lt;element name="OPCION_1_AVISO" type="{http://www.isban.es/webservices/TDCs}OPCION_1_AVISO_CONEX_CTAS_Type"/>
 *         &lt;element name="OPCION_2_AVISO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *         &lt;element name="OPCION_3_AVISO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONDICIO_AVISO_CONEX_CTAS_Type", propOrder = {
    "circuito",
    "opcion1AVISO",
    "opcion2AVISO",
    "opcion3AVISO"
})
public class CONDICIOAVISOCONEXCTASType {

    @XmlElement(name = "CIRCUITO", required = true)
    protected String circuito;
    @XmlElement(name = "OPCION_1_AVISO", required = true)
    protected String opcion1AVISO;
    @XmlElement(name = "OPCION_2_AVISO", required = true)
    protected String opcion2AVISO;
    @XmlElement(name = "OPCION_3_AVISO", required = true)
    protected String opcion3AVISO;

    /**
     * Gets the value of the circuito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIRCUITO() {
        return circuito;
    }

    /**
     * Sets the value of the circuito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIRCUITO(String value) {
        this.circuito = value;
    }

    /**
     * Gets the value of the opcion1AVISO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPCION1AVISO() {
        return opcion1AVISO;
    }

    /**
     * Sets the value of the opcion1AVISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPCION1AVISO(String value) {
        this.opcion1AVISO = value;
    }

    /**
     * Gets the value of the opcion2AVISO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPCION2AVISO() {
        return opcion2AVISO;
    }

    /**
     * Sets the value of the opcion2AVISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPCION2AVISO(String value) {
        this.opcion2AVISO = value;
    }

    /**
     * Gets the value of the opcion3AVISO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPCION3AVISO() {
        return opcion3AVISO;
    }

    /**
     * Sets the value of the opcion3AVISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPCION3AVISO(String value) {
        this.opcion3AVISO = value;
    }

}
