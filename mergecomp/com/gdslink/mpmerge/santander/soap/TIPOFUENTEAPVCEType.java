
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TIPO_FUENTE_APV_CE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIPO_FUENTE_APV_CE_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COD_TIPO_FUENTE_APV_CE" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_5_Type"/>
 *         &lt;element name="COD_GRUPO_ENTIDAD_BIS" type="{http://www.isban.es/webservices/TDCs}COD_GRUPO_ENTIDAD_BIS_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIPO_FUENTE_APV_CE_Type", propOrder = {
    "codtipofuenteapvce",
    "codgrupoentidadbis"
})
public class TIPOFUENTEAPVCEType {

    @XmlElement(name = "COD_TIPO_FUENTE_APV_CE")
    protected int codtipofuenteapvce;
    @XmlElement(name = "COD_GRUPO_ENTIDAD_BIS", required = true)
    protected String codgrupoentidadbis;

    /**
     * Gets the value of the codtipofuenteapvce property.
     * 
     */
    public int getCODTIPOFUENTEAPVCE() {
        return codtipofuenteapvce;
    }

    /**
     * Sets the value of the codtipofuenteapvce property.
     * 
     */
    public void setCODTIPOFUENTEAPVCE(int value) {
        this.codtipofuenteapvce = value;
    }

    /**
     * Gets the value of the codgrupoentidadbis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODGRUPOENTIDADBIS() {
        return codgrupoentidadbis;
    }

    /**
     * Sets the value of the codgrupoentidadbis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODGRUPOENTIDADBIS(String value) {
        this.codgrupoentidadbis = value;
    }

}
