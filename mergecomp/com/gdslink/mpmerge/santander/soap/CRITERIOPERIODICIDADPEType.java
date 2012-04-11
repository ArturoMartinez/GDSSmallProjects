
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CRITERIO_PERIODICIDAD_PE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRITERIO_PERIODICIDAD_PE_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="TIPO_PERIODICIDAD" type="{http://www.isban.es/webservices/TDCs}TIPO_DE_PERIODO_Type"/>
 *         &lt;element name="VALOR_TIPO_PERIODICIDAD" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRITERIO_PERIODICIDAD_PE_Type", propOrder = {
    "empresa",
    "tipoperiodicidad",
    "valortipoperiodicidad"
})
public class CRITERIOPERIODICIDADPEType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "TIPO_PERIODICIDAD", required = true)
    protected String tipoperiodicidad;
    @XmlElement(name = "VALOR_TIPO_PERIODICIDAD", required = true)
    protected String valortipoperiodicidad;

    /**
     * Gets the value of the empresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPRESA() {
        return empresa;
    }

    /**
     * Sets the value of the empresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPRESA(String value) {
        this.empresa = value;
    }

    /**
     * Gets the value of the tipoperiodicidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOPERIODICIDAD() {
        return tipoperiodicidad;
    }

    /**
     * Sets the value of the tipoperiodicidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOPERIODICIDAD(String value) {
        this.tipoperiodicidad = value;
    }

    /**
     * Gets the value of the valortipoperiodicidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALORTIPOPERIODICIDAD() {
        return valortipoperiodicidad;
    }

    /**
     * Sets the value of the valortipoperiodicidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALORTIPOPERIODICIDAD(String value) {
        this.valortipoperiodicidad = value;
    }

}
