
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CHEQUE_LOCAL_BANCARIO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CHEQUE_LOCAL_BANCARIO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_CHEQUE_LOCAL" type="{http://www.isban.es/webservices/TDCs}TIPO_CHEQUE_LOCAL_Type"/>
 *         &lt;element name="CHEQUE_TRANSITO" type="{http://www.isban.es/webservices/TDCs}CHEQUE_TRANSITO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CHEQUE_LOCAL_BANCARIO_Type", propOrder = {
    "tipochequelocal",
    "chequetransito"
})
public class CHEQUELOCALBANCARIOType {

    @XmlElement(name = "TIPO_CHEQUE_LOCAL", required = true)
    protected String tipochequelocal;
    @XmlElement(name = "CHEQUE_TRANSITO", required = true)
    protected String chequetransito;

    /**
     * Gets the value of the tipochequelocal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOCHEQUELOCAL() {
        return tipochequelocal;
    }

    /**
     * Sets the value of the tipochequelocal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOCHEQUELOCAL(String value) {
        this.tipochequelocal = value;
    }

    /**
     * Gets the value of the chequetransito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHEQUETRANSITO() {
        return chequetransito;
    }

    /**
     * Sets the value of the chequetransito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHEQUETRANSITO(String value) {
        this.chequetransito = value;
    }

}
