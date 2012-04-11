
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for INSTRUCCION_SERVICIO_PE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INSTRUCCION_SERVICIO_PE_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ORDEN_DE_SERVICIO" type="{http://www.isban.es/webservices/TDCc}ORDEN_DE_SERVICIO_Type"/>
 *         &lt;element name="INTRUCCION_ORDEN_PE" type="{http://www.isban.es/webservices/TDCs}TIP_INSTRUCCION_ORDEN_PE_Type"/>
 *         &lt;element name="ORDEN" type="{http://www.isban.es/webservices/TDCs}ORDEN_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INSTRUCCION_SERVICIO_PE_Type", propOrder = {
    "ordendeservicio",
    "intruccionordenpe",
    "orden"
})
public class INSTRUCCIONSERVICIOPEType {

    @XmlElement(name = "ORDEN_DE_SERVICIO", required = true)
    protected ORDENDESERVICIOType ordendeservicio;
    @XmlElement(name = "INTRUCCION_ORDEN_PE", required = true)
    protected String intruccionordenpe;
    @XmlElement(name = "ORDEN")
    protected int orden;

    /**
     * Gets the value of the ordendeservicio property.
     * 
     * @return
     *     possible object is
     *     {@link ORDENDESERVICIOType }
     *     
     */
    public ORDENDESERVICIOType getORDENDESERVICIO() {
        return ordendeservicio;
    }

    /**
     * Sets the value of the ordendeservicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORDENDESERVICIOType }
     *     
     */
    public void setORDENDESERVICIO(ORDENDESERVICIOType value) {
        this.ordendeservicio = value;
    }

    /**
     * Gets the value of the intruccionordenpe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTRUCCIONORDENPE() {
        return intruccionordenpe;
    }

    /**
     * Sets the value of the intruccionordenpe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTRUCCIONORDENPE(String value) {
        this.intruccionordenpe = value;
    }

    /**
     * Gets the value of the orden property.
     * 
     */
    public int getORDEN() {
        return orden;
    }

    /**
     * Sets the value of the orden property.
     * 
     */
    public void setORDEN(int value) {
        this.orden = value;
    }

}
