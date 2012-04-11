
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OPERACION_GEM_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OPERACION_GEM_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FORMATO_ENTRADA_GEM" type="{http://www.isban.es/webservices/TDCc}FORMATO_ENTRADA_GEM_Type"/>
 *         &lt;element name="COD_OPERACION" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OPERACION_GEM_Type", propOrder = {
    "formatoentradagem",
    "codoperacion"
})
public class OPERACIONGEMType {

    @XmlElement(name = "FORMATO_ENTRADA_GEM", required = true)
    protected FORMATOENTRADAGEMType formatoentradagem;
    @XmlElement(name = "COD_OPERACION", required = true)
    protected String codoperacion;

    /**
     * Gets the value of the formatoentradagem property.
     * 
     * @return
     *     possible object is
     *     {@link FORMATOENTRADAGEMType }
     *     
     */
    public FORMATOENTRADAGEMType getFORMATOENTRADAGEM() {
        return formatoentradagem;
    }

    /**
     * Sets the value of the formatoentradagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link FORMATOENTRADAGEMType }
     *     
     */
    public void setFORMATOENTRADAGEM(FORMATOENTRADAGEMType value) {
        this.formatoentradagem = value;
    }

    /**
     * Gets the value of the codoperacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODOPERACION() {
        return codoperacion;
    }

    /**
     * Sets the value of the codoperacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODOPERACION(String value) {
        this.codoperacion = value;
    }

}
