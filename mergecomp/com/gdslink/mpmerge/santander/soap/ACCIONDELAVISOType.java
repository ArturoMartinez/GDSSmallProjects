
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACCION_DEL_AVISO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACCION_DEL_AVISO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CD_CIRCUITO" type="{http://www.isban.es/webservices/TDCs}COD_CIRCUITO_AVISO_Type"/>
 *         &lt;element name="CD_ACCION" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACCION_DEL_AVISO_Type", propOrder = {
    "cdcircuito",
    "cdaccion"
})
public class ACCIONDELAVISOType {

    @XmlElement(name = "CD_CIRCUITO", required = true)
    protected String cdcircuito;
    @XmlElement(name = "CD_ACCION", required = true)
    protected String cdaccion;

    /**
     * Gets the value of the cdcircuito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDCIRCUITO() {
        return cdcircuito;
    }

    /**
     * Sets the value of the cdcircuito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDCIRCUITO(String value) {
        this.cdcircuito = value;
    }

    /**
     * Gets the value of the cdaccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDACCION() {
        return cdaccion;
    }

    /**
     * Sets the value of the cdaccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDACCION(String value) {
        this.cdaccion = value;
    }

}
