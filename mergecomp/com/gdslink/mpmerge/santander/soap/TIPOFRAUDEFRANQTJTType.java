
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TIPO_FRAUDE_FRANQ_TJT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIPO_FRAUDE_FRANQ_TJT_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="TIPO_FRANQUICIA_DISPUTA" type="{http://www.isban.es/webservices/TDCs}TIPO_FRANQUICIA_DISPUTA_Type"/>
 *         &lt;element name="COD_FRAUDE" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIPO_FRAUDE_FRANQ_TJT_Type", propOrder = {
    "empresa",
    "tipofranquiciadisputa",
    "codfraude"
})
public class TIPOFRAUDEFRANQTJTType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "TIPO_FRANQUICIA_DISPUTA")
    protected int tipofranquiciadisputa;
    @XmlElement(name = "COD_FRAUDE")
    protected int codfraude;

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
     * Gets the value of the tipofranquiciadisputa property.
     * 
     */
    public int getTIPOFRANQUICIADISPUTA() {
        return tipofranquiciadisputa;
    }

    /**
     * Sets the value of the tipofranquiciadisputa property.
     * 
     */
    public void setTIPOFRANQUICIADISPUTA(int value) {
        this.tipofranquiciadisputa = value;
    }

    /**
     * Gets the value of the codfraude property.
     * 
     */
    public int getCODFRAUDE() {
        return codfraude;
    }

    /**
     * Sets the value of the codfraude property.
     * 
     */
    public void setCODFRAUDE(int value) {
        this.codfraude = value;
    }

}
