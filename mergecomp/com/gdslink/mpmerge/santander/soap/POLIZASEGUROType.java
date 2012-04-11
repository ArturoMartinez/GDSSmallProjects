
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POLIZA_SEGURO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POLIZA_SEGURO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COMPANIA" type="{http://www.isban.es/webservices/TDCs}COMPANIA_DE_SEGUROS_Type"/>
 *         &lt;element name="RAMO" type="{http://www.isban.es/webservices/TDCs}RAMO_Type"/>
 *         &lt;element name="MODALIDAD" type="{http://www.isban.es/webservices/TDCs}MODALIDAD_Type"/>
 *         &lt;element name="NUMERO_POLIZA" type="{http://www.isban.es/webservices/TDCs}NUMERO_DE_POLIZA_Type"/>
 *         &lt;element name="NUMERO_CERTIFICADO" type="{http://www.isban.es/webservices/TDCs}NUMERO_DE_CERTIFICADO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POLIZA_SEGURO_Type", propOrder = {
    "compania",
    "ramo",
    "modalidad",
    "numeropoliza",
    "numerocertificado"
})
public class POLIZASEGUROType {

    @XmlElement(name = "COMPANIA", required = true)
    protected String compania;
    @XmlElement(name = "RAMO", required = true)
    protected String ramo;
    @XmlElement(name = "MODALIDAD", required = true)
    protected String modalidad;
    @XmlElement(name = "NUMERO_POLIZA", required = true)
    protected String numeropoliza;
    @XmlElement(name = "NUMERO_CERTIFICADO", required = true)
    protected String numerocertificado;

    /**
     * Gets the value of the compania property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPANIA() {
        return compania;
    }

    /**
     * Sets the value of the compania property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPANIA(String value) {
        this.compania = value;
    }

    /**
     * Gets the value of the ramo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRAMO() {
        return ramo;
    }

    /**
     * Sets the value of the ramo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRAMO(String value) {
        this.ramo = value;
    }

    /**
     * Gets the value of the modalidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMODALIDAD() {
        return modalidad;
    }

    /**
     * Sets the value of the modalidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODALIDAD(String value) {
        this.modalidad = value;
    }

    /**
     * Gets the value of the numeropoliza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROPOLIZA() {
        return numeropoliza;
    }

    /**
     * Sets the value of the numeropoliza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROPOLIZA(String value) {
        this.numeropoliza = value;
    }

    /**
     * Gets the value of the numerocertificado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROCERTIFICADO() {
        return numerocertificado;
    }

    /**
     * Sets the value of the numerocertificado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROCERTIFICADO(String value) {
        this.numerocertificado = value;
    }

}
