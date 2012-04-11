
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MOTIVO_INCIDENCIA_TJT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MOTIVO_INCIDENCIA_TJT_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INCIDENCIA_FACT_TJT" type="{http://www.isban.es/webservices/TDCc}INCIDENCIA_FACT_TJT_Type"/>
 *         &lt;element name="MOTIVO_INCIDENCIA" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MOTIVO_INCIDENCIA_TJT_Type", propOrder = {
    "incidenciafacttjt",
    "motivoincidencia"
})
public class MOTIVOINCIDENCIATJTType {

    @XmlElement(name = "INCIDENCIA_FACT_TJT", required = true)
    protected INCIDENCIAFACTTJTType incidenciafacttjt;
    @XmlElement(name = "MOTIVO_INCIDENCIA")
    protected int motivoincidencia;

    /**
     * Gets the value of the incidenciafacttjt property.
     * 
     * @return
     *     possible object is
     *     {@link INCIDENCIAFACTTJTType }
     *     
     */
    public INCIDENCIAFACTTJTType getINCIDENCIAFACTTJT() {
        return incidenciafacttjt;
    }

    /**
     * Sets the value of the incidenciafacttjt property.
     * 
     * @param value
     *     allowed object is
     *     {@link INCIDENCIAFACTTJTType }
     *     
     */
    public void setINCIDENCIAFACTTJT(INCIDENCIAFACTTJTType value) {
        this.incidenciafacttjt = value;
    }

    /**
     * Gets the value of the motivoincidencia property.
     * 
     */
    public int getMOTIVOINCIDENCIA() {
        return motivoincidencia;
    }

    /**
     * Sets the value of the motivoincidencia property.
     * 
     */
    public void setMOTIVOINCIDENCIA(int value) {
        this.motivoincidencia = value;
    }

}
