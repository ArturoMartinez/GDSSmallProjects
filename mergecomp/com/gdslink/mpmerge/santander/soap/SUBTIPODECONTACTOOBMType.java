
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SUBTIPO_DE_CONTACTO_OBM_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SUBTIPO_DE_CONTACTO_OBM_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INSTALACION_OBM" type="{http://www.isban.es/webservices/TDCc}INSTALACION_OBM_Type"/>
 *         &lt;element name="COD_SUBTIPO_CONTACTO_OBM" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SUBTIPO_DE_CONTACTO_OBM_Type", propOrder = {
    "instalacionobm",
    "codsubtipocontactoobm"
})
public class SUBTIPODECONTACTOOBMType {

    @XmlElement(name = "INSTALACION_OBM", required = true)
    protected INSTALACIONOBMType instalacionobm;
    @XmlElement(name = "COD_SUBTIPO_CONTACTO_OBM", required = true)
    protected String codsubtipocontactoobm;

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
     * Gets the value of the codsubtipocontactoobm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODSUBTIPOCONTACTOOBM() {
        return codsubtipocontactoobm;
    }

    /**
     * Sets the value of the codsubtipocontactoobm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODSUBTIPOCONTACTOOBM(String value) {
        this.codsubtipocontactoobm = value;
    }

}
