
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CAUSA_INTENTO_OBM_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CAUSA_INTENTO_OBM_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ESTADO_INTENTO_OBM" type="{http://www.isban.es/webservices/TDCc}ESTADO_INTENTO_OBM_Type"/>
 *         &lt;element name="COD_CAUSA" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CAUSA_INTENTO_OBM_Type", propOrder = {
    "estadointentoobm",
    "codcausa"
})
public class CAUSAINTENTOOBMType {

    @XmlElement(name = "ESTADO_INTENTO_OBM", required = true)
    protected ESTADOINTENTOOBMType estadointentoobm;
    @XmlElement(name = "COD_CAUSA", required = true)
    protected String codcausa;

    /**
     * Gets the value of the estadointentoobm property.
     * 
     * @return
     *     possible object is
     *     {@link ESTADOINTENTOOBMType }
     *     
     */
    public ESTADOINTENTOOBMType getESTADOINTENTOOBM() {
        return estadointentoobm;
    }

    /**
     * Sets the value of the estadointentoobm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESTADOINTENTOOBMType }
     *     
     */
    public void setESTADOINTENTOOBM(ESTADOINTENTOOBMType value) {
        this.estadointentoobm = value;
    }

    /**
     * Gets the value of the codcausa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODCAUSA() {
        return codcausa;
    }

    /**
     * Sets the value of the codcausa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODCAUSA(String value) {
        this.codcausa = value;
    }

}
