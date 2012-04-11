
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DOMICILIO_PRESENT_ESPE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DOMICILIO_PRESENT_ESPE_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DESCRIPCION_DOMICILIO" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_40_Type"/>
 *         &lt;element name="LOCALIDAD" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_5_Type"/>
 *         &lt;element name="CODIGO_POSTAL" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_7_Type"/>
 *         &lt;element name="DISTRITO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *         &lt;element name="CONCELHO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *         &lt;element name="FREGUESIA" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *         &lt;element name="CODIGO_DE_REGION" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DOMICILIO_PRESENT_ESPE_Type", propOrder = {
    "descripciondomicilio",
    "localidad",
    "codigopostal",
    "distrito",
    "concelho",
    "freguesia",
    "codigoderegion"
})
public class DOMICILIOPRESENTESPEType {

    @XmlElement(name = "DESCRIPCION_DOMICILIO", required = true)
    protected String descripciondomicilio;
    @XmlElement(name = "LOCALIDAD", required = true)
    protected String localidad;
    @XmlElement(name = "CODIGO_POSTAL", required = true)
    protected String codigopostal;
    @XmlElement(name = "DISTRITO", required = true)
    protected String distrito;
    @XmlElement(name = "CONCELHO", required = true)
    protected String concelho;
    @XmlElement(name = "FREGUESIA", required = true)
    protected String freguesia;
    @XmlElement(name = "CODIGO_DE_REGION", required = true)
    protected String codigoderegion;

    /**
     * Gets the value of the descripciondomicilio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPCIONDOMICILIO() {
        return descripciondomicilio;
    }

    /**
     * Sets the value of the descripciondomicilio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPCIONDOMICILIO(String value) {
        this.descripciondomicilio = value;
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
     * Gets the value of the freguesia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFREGUESIA() {
        return freguesia;
    }

    /**
     * Sets the value of the freguesia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFREGUESIA(String value) {
        this.freguesia = value;
    }

    /**
     * Gets the value of the codigoderegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGODEREGION() {
        return codigoderegion;
    }

    /**
     * Sets the value of the codigoderegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGODEREGION(String value) {
        this.codigoderegion = value;
    }

}
