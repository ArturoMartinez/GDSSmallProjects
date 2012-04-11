
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MOB_GRUPO_FIJO_CONCEP_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MOB_GRUPO_FIJO_CONCEP_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_OPERACION" type="{http://www.isban.es/webservices/TDCs}MOB_TIPO_OPERACION_Type"/>
 *         &lt;element name="CLASE_OPERACION" type="{http://www.isban.es/webservices/TDCs}CLASE_DE_OPERACION_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MOB_GRUPO_FIJO_CONCEP_Type", propOrder = {
    "tipooperacion",
    "claseoperacion"
})
public class MOBGRUPOFIJOCONCEPType {

    @XmlElement(name = "TIPO_OPERACION", required = true)
    protected String tipooperacion;
    @XmlElement(name = "CLASE_OPERACION", required = true)
    protected String claseoperacion;

    /**
     * Gets the value of the tipooperacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOOPERACION() {
        return tipooperacion;
    }

    /**
     * Sets the value of the tipooperacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOOPERACION(String value) {
        this.tipooperacion = value;
    }

    /**
     * Gets the value of the claseoperacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASEOPERACION() {
        return claseoperacion;
    }

    /**
     * Sets the value of the claseoperacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASEOPERACION(String value) {
        this.claseoperacion = value;
    }

}
