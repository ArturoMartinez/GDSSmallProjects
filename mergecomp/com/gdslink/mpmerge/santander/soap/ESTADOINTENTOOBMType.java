
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ESTADO_INTENTO_OBM_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ESTADO_INTENTO_OBM_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INSTALACION_OBM" type="{http://www.isban.es/webservices/TDCc}INSTALACION_OBM_Type"/>
 *         &lt;element name="COD_ESTADO_INTENTO_OBM" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ESTADO_INTENTO_OBM_Type", propOrder = {
    "instalacionobm",
    "codestadointentoobm"
})
public class ESTADOINTENTOOBMType {

    @XmlElement(name = "INSTALACION_OBM", required = true)
    protected INSTALACIONOBMType instalacionobm;
    @XmlElement(name = "COD_ESTADO_INTENTO_OBM", required = true)
    protected String codestadointentoobm;

    /**
     * Gets the value of the instalacionobm property.
     * 
     * @return
     *     possible object is
     *     {@link INSTALACIONOBMType }
     *     
     */
    public INSTALACIONOBMType getINSTALACIONOBM() {
        return instalacionobm;
    }

    /**
     * Sets the value of the instalacionobm property.
     * 
     * @param value
     *     allowed object is
     *     {@link INSTALACIONOBMType }
     *     
     */
    public void setINSTALACIONOBM(INSTALACIONOBMType value) {
        this.instalacionobm = value;
    }

    /**
     * Gets the value of the codestadointentoobm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODESTADOINTENTOOBM() {
        return codestadointentoobm;
    }

    /**
     * Sets the value of the codestadointentoobm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODESTADOINTENTOOBM(String value) {
        this.codestadointentoobm = value;
    }

}
