
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DATOS_REGISTRO_INMUEBLE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DATOS_REGISTRO_INMUEBLE_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NUMERO_REGISTRO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *         &lt;element name="LIBRO" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_6_Type"/>
 *         &lt;element name="TOMO" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_6_Type"/>
 *         &lt;element name="FOLIO" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_6_Type"/>
 *         &lt;element name="SECCION" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_25_Type"/>
 *         &lt;element name="NUMERO_REGISTRAL" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_9_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DATOS_REGISTRO_INMUEBLE_Type", propOrder = {
    "numeroregistro",
    "libro",
    "tomo",
    "folio",
    "seccion",
    "numeroregistral"
})
public class DATOSREGISTROINMUEBLEType {

    @XmlElement(name = "NUMERO_REGISTRO", required = true)
    protected String numeroregistro;
    @XmlElement(name = "LIBRO", required = true)
    protected String libro;
    @XmlElement(name = "TOMO", required = true)
    protected String tomo;
    @XmlElement(name = "FOLIO", required = true)
    protected String folio;
    @XmlElement(name = "SECCION", required = true)
    protected String seccion;
    @XmlElement(name = "NUMERO_REGISTRAL", required = true)
    protected String numeroregistral;

    /**
     * Gets the value of the numeroregistro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROREGISTRO() {
        return numeroregistro;
    }

    /**
     * Sets the value of the numeroregistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROREGISTRO(String value) {
        this.numeroregistro = value;
    }

    /**
     * Gets the value of the libro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIBRO() {
        return libro;
    }

    /**
     * Sets the value of the libro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIBRO(String value) {
        this.libro = value;
    }

    /**
     * Gets the value of the tomo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOMO() {
        return tomo;
    }

    /**
     * Sets the value of the tomo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOMO(String value) {
        this.tomo = value;
    }

    /**
     * Gets the value of the folio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOLIO() {
        return folio;
    }

    /**
     * Sets the value of the folio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOLIO(String value) {
        this.folio = value;
    }

    /**
     * Gets the value of the seccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSECCION() {
        return seccion;
    }

    /**
     * Sets the value of the seccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSECCION(String value) {
        this.seccion = value;
    }

    /**
     * Gets the value of the numeroregistral property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROREGISTRAL() {
        return numeroregistral;
    }

    /**
     * Sets the value of the numeroregistral property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROREGISTRAL(String value) {
        this.numeroregistral = value;
    }

}
