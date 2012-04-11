
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for REMESA_COMPENSACION_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REMESA_COMPENSACION_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CENTRO" type="{http://www.isban.es/webservices/TDCc}CENTRO_Type"/>
 *         &lt;element name="FECHA_REMESA" type="{http://www.isban.es/webservices/TDCs}FECHA_GENERICA_Type"/>
 *         &lt;element name="REF_REMESA" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_10_SIN_ESP_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REMESA_COMPENSACION_Type", propOrder = {
    "centro",
    "fecharemesa",
    "refremesa"
})
public class REMESACOMPENSACIONType {

    @XmlElement(name = "CENTRO", required = true)
    protected CENTROType centro;
    @XmlElement(name = "FECHA_REMESA", required = true)
    protected XMLGregorianCalendar fecharemesa;
    @XmlElement(name = "REF_REMESA", required = true)
    protected String refremesa;

    /**
     * Gets the value of the centro property.
     * 
     * @return
     *     possible object is
     *     {@link CENTROType }
     *     
     */
    public CENTROType getCENTRO() {
        return centro;
    }

    /**
     * Sets the value of the centro property.
     * 
     * @param value
     *     allowed object is
     *     {@link CENTROType }
     *     
     */
    public void setCENTRO(CENTROType value) {
        this.centro = value;
    }

    /**
     * Gets the value of the fecharemesa property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFECHAREMESA() {
        return fecharemesa;
    }

    /**
     * Sets the value of the fecharemesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFECHAREMESA(XMLGregorianCalendar value) {
        this.fecharemesa = value;
    }

    /**
     * Gets the value of the refremesa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFREMESA() {
        return refremesa;
    }

    /**
     * Sets the value of the refremesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFREMESA(String value) {
        this.refremesa = value;
    }

}
