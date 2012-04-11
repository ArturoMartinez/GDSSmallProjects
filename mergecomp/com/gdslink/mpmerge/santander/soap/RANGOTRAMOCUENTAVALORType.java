
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RANGO_TRAMO_CUENTA_VALOR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RANGO_TRAMO_CUENTA_VALOR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TRAMO_CUENTA_DESDE" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_6_Type"/>
 *         &lt;element name="TRAMO_CUENTA_HASTA" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_6_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RANGO_TRAMO_CUENTA_VALOR_Type", propOrder = {
    "tramocuentadesde",
    "tramocuentahasta"
})
public class RANGOTRAMOCUENTAVALORType {

    @XmlElement(name = "TRAMO_CUENTA_DESDE", required = true)
    protected String tramocuentadesde;
    @XmlElement(name = "TRAMO_CUENTA_HASTA", required = true)
    protected String tramocuentahasta;

    /**
     * Gets the value of the tramocuentadesde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRAMOCUENTADESDE() {
        return tramocuentadesde;
    }

    /**
     * Sets the value of the tramocuentadesde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRAMOCUENTADESDE(String value) {
        this.tramocuentadesde = value;
    }

    /**
     * Gets the value of the tramocuentahasta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRAMOCUENTAHASTA() {
        return tramocuentahasta;
    }

    /**
     * Sets the value of the tramocuentahasta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRAMOCUENTAHASTA(String value) {
        this.tramocuentahasta = value;
    }

}
