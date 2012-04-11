
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TIPO_OPERACION_MISPAG_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIPO_OPERACION_MISPAG_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NATURALEZA_PAGO_MISPAG" type="{http://www.isban.es/webservices/TDCc}NATURALEZA_PAGO_MISPAG_Type"/>
 *         &lt;element name="IND_TIP_OPERACION" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIPO_OPERACION_MISPAG_Type", propOrder = {
    "naturalezapagomispag",
    "indtipoperacion"
})
public class TIPOOPERACIONMISPAGType {

    @XmlElement(name = "NATURALEZA_PAGO_MISPAG", required = true)
    protected NATURALEZAPAGOMISPAGType naturalezapagomispag;
    @XmlElement(name = "IND_TIP_OPERACION", required = true)
    protected String indtipoperacion;

    /**
     * Gets the value of the naturalezapagomispag property.
     * 
     * @return
     *     possible object is
     *     {@link NATURALEZAPAGOMISPAGType }
     *     
     */
    public NATURALEZAPAGOMISPAGType getNATURALEZAPAGOMISPAG() {
        return naturalezapagomispag;
    }

    /**
     * Sets the value of the naturalezapagomispag property.
     * 
     * @param value
     *     allowed object is
     *     {@link NATURALEZAPAGOMISPAGType }
     *     
     */
    public void setNATURALEZAPAGOMISPAG(NATURALEZAPAGOMISPAGType value) {
        this.naturalezapagomispag = value;
    }

    /**
     * Gets the value of the indtipoperacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDTIPOPERACION() {
        return indtipoperacion;
    }

    /**
     * Sets the value of the indtipoperacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDTIPOPERACION(String value) {
        this.indtipoperacion = value;
    }

}
