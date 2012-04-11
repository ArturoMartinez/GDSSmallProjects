
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ERROR_GAU_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ERROR_GAU_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_MOTIVO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *         &lt;element name="COD_MOTIVO" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_4_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ERROR_GAU_Type", propOrder = {
    "tipomotivo",
    "codmotivo"
})
public class ERRORGAUType {

    @XmlElement(name = "TIPO_MOTIVO", required = true)
    protected String tipomotivo;
    @XmlElement(name = "COD_MOTIVO", required = true)
    protected String codmotivo;

    /**
     * Gets the value of the tipomotivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOMOTIVO() {
        return tipomotivo;
    }

    /**
     * Sets the value of the tipomotivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOMOTIVO(String value) {
        this.tipomotivo = value;
    }

    /**
     * Gets the value of the codmotivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODMOTIVO() {
        return codmotivo;
    }

    /**
     * Sets the value of the codmotivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODMOTIVO(String value) {
        this.codmotivo = value;
    }

}
