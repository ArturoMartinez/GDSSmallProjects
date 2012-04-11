
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COMENTARIO_FACTOR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COMENTARIO_FACTOR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA_CON_COD_ALFANUM2" type="{http://www.isban.es/webservices/TDCc}TIPO_COMENTARIO_FACTOR_Type"/>
 *         &lt;element name="COD_ALFANUM2" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COMENTARIO_FACTOR_Type", propOrder = {
    "empresaconcodalfanum2",
    "codalfanum2"
})
public class COMENTARIOFACTORType {

    @XmlElement(name = "EMPRESA_CON_COD_ALFANUM2", required = true)
    protected TIPOCOMENTARIOFACTORType empresaconcodalfanum2;
    @XmlElement(name = "COD_ALFANUM2", required = true)
    protected String codalfanum2;

    /**
     * Gets the value of the empresaconcodalfanum2 property.
     * 
     * @return
     *     possible object is
     *     {@link TIPOCOMENTARIOFACTORType }
     *     
     */
    public TIPOCOMENTARIOFACTORType getEMPRESACONCODALFANUM2() {
        return empresaconcodalfanum2;
    }

    /**
     * Sets the value of the empresaconcodalfanum2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIPOCOMENTARIOFACTORType }
     *     
     */
    public void setEMPRESACONCODALFANUM2(TIPOCOMENTARIOFACTORType value) {
        this.empresaconcodalfanum2 = value;
    }

    /**
     * Gets the value of the codalfanum2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODALFANUM2() {
        return codalfanum2;
    }

    /**
     * Sets the value of the codalfanum2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODALFANUM2(String value) {
        this.codalfanum2 = value;
    }

}
