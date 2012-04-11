
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for INTERV_POLIZA_DIS_INTMED_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INTERV_POLIZA_DIS_INTMED_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NUM_POLIZA_DISTR_INTMED" type="{http://www.isban.es/webservices/TDCc}NUM_POLIZA_DISTR_INTMED_Type"/>
 *         &lt;element name="TIPO_INTERVENCION_INTMED" type="{http://www.isban.es/webservices/TDCs}TIPO_INTERVENCION_INTMED_Type"/>
 *         &lt;element name="NUM_ORDEN_INTER" type="{http://www.isban.es/webservices/TDCs}ORDEN_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INTERV_POLIZA_DIS_INTMED_Type", propOrder = {
    "numpolizadistrintmed",
    "tipointervencionintmed",
    "numordeninter"
})
public class INTERVPOLIZADISINTMEDType {

    @XmlElement(name = "NUM_POLIZA_DISTR_INTMED", required = true)
    protected NUMPOLIZADISTRINTMEDType numpolizadistrintmed;
    @XmlElement(name = "TIPO_INTERVENCION_INTMED", required = true)
    protected String tipointervencionintmed;
    @XmlElement(name = "NUM_ORDEN_INTER")
    protected int numordeninter;

    /**
     * Gets the value of the numpolizadistrintmed property.
     * 
     * @return
     *     possible object is
     *     {@link NUMPOLIZADISTRINTMEDType }
     *     
     */
    public NUMPOLIZADISTRINTMEDType getNUMPOLIZADISTRINTMED() {
        return numpolizadistrintmed;
    }

    /**
     * Sets the value of the numpolizadistrintmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link NUMPOLIZADISTRINTMEDType }
     *     
     */
    public void setNUMPOLIZADISTRINTMED(NUMPOLIZADISTRINTMEDType value) {
        this.numpolizadistrintmed = value;
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
     * Gets the value of the numordeninter property.
     * 
     */
    public int getNUMORDENINTER() {
        return numordeninter;
    }

    /**
     * Sets the value of the numordeninter property.
     * 
     */
    public void setNUMORDENINTER(int value) {
        this.numordeninter = value;
    }

}