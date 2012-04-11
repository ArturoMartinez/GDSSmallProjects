
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for INTERV_POLIZA_INTMED_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INTERV_POLIZA_INTMED_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NUM_POLIZA_INTMED" type="{http://www.isban.es/webservices/TDCs}NUM_POLIZA_INTMED_Type"/>
 *         &lt;element name="TIPO_INTERVENCION_INTMED" type="{http://www.isban.es/webservices/TDCs}TIPO_INTERVENCION_INTMED_Type"/>
 *         &lt;element name="NUM_ORDEN_INT" type="{http://www.isban.es/webservices/TDCs}ORDEN_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INTERV_POLIZA_INTMED_Type", propOrder = {
    "numpolizaintmed",
    "tipointervencionintmed",
    "numordenint"
})
public class INTERVPOLIZAINTMEDType {

    @XmlElement(name = "NUM_POLIZA_INTMED", required = true)
    protected String numpolizaintmed;
    @XmlElement(name = "TIPO_INTERVENCION_INTMED", required = true)
    protected String tipointervencionintmed;
    @XmlElement(name = "NUM_ORDEN_INT")
    protected int numordenint;

    /**
     * Gets the value of the numpolizaintmed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMPOLIZAINTMED() {
        return numpolizaintmed;
    }

    /**
     * Sets the value of the numpolizaintmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMPOLIZAINTMED(String value) {
        this.numpolizaintmed = value;
    }

    /**
     * Gets the value of the tipointervencionintmed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOINTERVENCIONINTMED() {
        return tipointervencionintmed;
    }

    /**
     * Sets the value of the tipointervencionintmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOINTERVENCIONINTMED(String value) {
        this.tipointervencionintmed = value;
    }

    /**
     * Gets the value of the numordenint property.
     * 
     */
    public int getNUMORDENINT() {
        return numordenint;
    }

    /**
     * Sets the value of the numordenint property.
     * 
     */
    public void setNUMORDENINT(int value) {
        this.numordenint = value;
    }

}
