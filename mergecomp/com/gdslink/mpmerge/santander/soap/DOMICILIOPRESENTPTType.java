
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DOMICILIO_PRESENT_PT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DOMICILIO_PRESENT_PT_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_VIA" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_6_Type"/>
 *         &lt;element name="NOMBRE_VIA" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_30_Type"/>
 *         &lt;element name="TIPO_PUERTA" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *         &lt;element name="NUMERO_VIA" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_5_Type"/>
 *         &lt;element name="RESTO_DOMIC" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_20_Type"/>
 *         &lt;element name="LOCALIDAD" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_5_Type"/>
 *         &lt;element name="CODIGO_POSTAL" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_7_Type"/>
 *         &lt;element name="DISTRITO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *         &lt;element name="CONCELHO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *         &lt;element name="FREGRESIA" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *         &lt;element name="CODIGO_REGION" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DOMICILIO_PRESENT_PT_Type", propOrder = {
    "tipovia",
    "nombrevia",
    "tipopuerta",
    "numerovia",
    "restodomic",
    "localidad",
    "codigopostal",
    "distrito",
    "concelho",
    "fregresia",
    "codigoregion"
})
public class DOMICILIOPRESENTPTType {

    @XmlElement(name = "TIPO_VIA", required = true)
    protected String tipovia;
    @XmlElement(name = "NOMBRE_VIA", required = true)
    protected String nombrevia;
    @XmlElement(name = "TIPO_PUERTA", required = true)
    protected String tipopuerta;
    @XmlElement(name = "NUMERO_VIA", required = true)
    protected String numerovia;
    @XmlElement(name = "RESTO_DOMIC", required = true)
    protected String restodomic;
    @XmlElement(name = "LOCALIDAD", required = true)
    protected String localidad;
    @XmlElement(name = "CODIGO_POSTAL", required = true)
    protected String codigopostal;
    @XmlElement(name = "DISTRITO", required = true)
    protected String distrito;
    @XmlElement(name = "CONCELHO", required = true)
    protected String concelho;
    @XmlElement(name = "FREGRESIA", required = true)
    protected String fregresia;
    @XmlElement(name = "CODIGO_REGION", required = true)
    protected String codigoregion;

    /**
     * Gets the value of the tipovia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOVIA() {
        return tipovia;
    }

    /**
     * Sets the value of the tipovia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOVIA(String value) {
        this.tipovia = value;
    }

    /**
     * Gets the value of the nombrevia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBREVIA() {
        return nombrevia;
    }

    /**
     * Sets the value of the nombrevia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBREVIA(String value) {
        this.nombrevia = value;
    }

    /**
     * Gets the value of the tipopuerta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOPUERTA() {
        return tipopuerta;
    }

    /**
     * Sets the value of the tipopuerta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOPUERTA(String value) {
        this.tipopuerta = value;
    }

    /**
     * Gets the value of the numerovia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROVIA() {
        return numerovia;
    }

    /**
     * Sets the value of the numerovia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROVIA(String value) {
        this.numerovia = value;
    }

    /**
     * Gets the value of the restodomic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESTODOMIC() {
        return restodomic;
    }

    /**
     * Sets the value of the restodomic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESTODOMIC(String value) {
        this.restodomic = value;
    }

    /**
     * Gets the value of the localidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCALIDAD() {
        return localidad;
    }

    /**
     * Sets the value of the localidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCALIDAD(String value) {
        this.localidad = value;
    }

    /**
     * Gets the value of the codigopostal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOPOSTAL() {
        return codigopostal;
    }

    /**
     * Sets the value of the codigopostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOPOSTAL(String value) {
        this.codigopostal = value;
    }

    /**
     * Gets the value of the distrito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISTRITO() {
        return distrito;
    }

    /**
     * Sets the value of the distrito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISTRITO(String value) {
        this.distrito = value;
    }

    /**
     * Gets the value of the concelho property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONCELHO() {
        return concelho;
    }

    /**
     * Sets the value of the concelho property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONCELHO(String value) {
        this.concelho = value;
    }

    /**
     * Gets the value of the fregresia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFREGRESIA() {
        return fregresia;
    }

    /**
     * Sets the value of the fregresia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFREGRESIA(String value) {
        this.fregresia = value;
    }

    /**
     * Gets the value of the codigoregion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOREGION() {
        return codigoregion;
    }

    /**
     * Sets the value of the codigoregion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOREGION(String value) {
        this.codigoregion = value;
    }

}
