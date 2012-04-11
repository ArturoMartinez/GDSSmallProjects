
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BALANCE_EEFF_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BALANCE_EEFF_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PLAN_CONTABLE_EEFF" type="{http://www.isban.es/webservices/TDCc}PLAN_CONTABLE_EEFF_Type"/>
 *         &lt;element name="COD_EXPEDIENTE_EEFF" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_10_Type"/>
 *         &lt;element name="FECHA_BALANCE_EEFF" type="{http://www.isban.es/webservices/TDCs}FECHA_AAAAMMDD_GUION_Type"/>
 *         &lt;element name="TIMESTAMP_INI_EEFF" type="{http://www.isban.es/webservices/TDCs}TIMESTAMP_ALTA_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BALANCE_EEFF_Type", propOrder = {
    "plancontableeeff",
    "codexpedienteeeff",
    "fechabalanceeeff",
    "timestampinieeff"
})
public class BALANCEEEFFType {

    @XmlElement(name = "PLAN_CONTABLE_EEFF", required = true)
    protected PLANCONTABLEEEFFType plancontableeeff;
    @XmlElement(name = "COD_EXPEDIENTE_EEFF")
    protected long codexpedienteeeff;
    @XmlElement(name = "FECHA_BALANCE_EEFF", required = true)
    protected XMLGregorianCalendar fechabalanceeeff;
    @XmlElement(name = "TIMESTAMP_INI_EEFF", required = true)
    protected XMLGregorianCalendar timestampinieeff;

    /**
     * Gets the value of the plancontableeeff property.
     * 
     * @return
     *     possible object is
     *     {@link PLANCONTABLEEEFFType }
     *     
     */
    public PLANCONTABLEEEFFType getPLANCONTABLEEEFF() {
        return plancontableeeff;
    }

    /**
     * Sets the value of the plancontableeeff property.
     * 
     * @param value
     *     allowed object is
     *     {@link PLANCONTABLEEEFFType }
     *     
     */
    public void setPLANCONTABLEEEFF(PLANCONTABLEEEFFType value) {
        this.plancontableeeff = value;
    }

    /**
     * Gets the value of the codexpedienteeeff property.
     * 
     */
    public long getCODEXPEDIENTEEEFF() {
        return codexpedienteeeff;
    }

    /**
     * Sets the value of the codexpedienteeeff property.
     * 
     */
    public void setCODEXPEDIENTEEEFF(long value) {
        this.codexpedienteeeff = value;
    }

    /**
     * Gets the value of the fechabalanceeeff property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFECHABALANCEEEFF() {
        return fechabalanceeeff;
    }

    /**
     * Sets the value of the fechabalanceeeff property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFECHABALANCEEEFF(XMLGregorianCalendar value) {
        this.fechabalanceeeff = value;
    }

    /**
     * Gets the value of the timestampinieeff property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTIMESTAMPINIEEFF() {
        return timestampinieeff;
    }

    /**
     * Sets the value of the timestampinieeff property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTIMESTAMPINIEEFF(XMLGregorianCalendar value) {
        this.timestampinieeff = value;
    }

}
