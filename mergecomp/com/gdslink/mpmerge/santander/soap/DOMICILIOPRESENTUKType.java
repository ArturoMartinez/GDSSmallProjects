
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DOMICILIO_PRESENT_UK_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DOMICILIO_PRESENT_UK_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDENTIFICADOR_DE_CASA" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_56_Type"/>
 *         &lt;element name="NOMBRE_DEL_EDIFICIO" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_56_Type"/>
 *         &lt;element name="NOMBRE_DE_CALLE1" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_30_Type"/>
 *         &lt;element name="NOMBRE_DE_CALLE2" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_30_Type"/>
 *         &lt;element name="NOMBRE_DE_DISTRITO1" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_30_Type"/>
 *         &lt;element name="NOMBRE_DE_DISTRITO2" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_30_Type"/>
 *         &lt;element name="COD_PAIS_UK" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_4_Type"/>
 *         &lt;element name="COD_POSTAL_CIUDAD" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_4_Type"/>
 *         &lt;element name="COD_POSTAL_DOMICILIO" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_8_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DOMICILIO_PRESENT_UK_Type", propOrder = {
    "identificadordecasa",
    "nombredeledificio",
    "nombredecalle1",
    "nombredecalle2",
    "nombrededistrito1",
    "nombrededistrito2",
    "codpaisuk",
    "codpostalciudad",
    "codpostaldomicilio"
})
public class DOMICILIOPRESENTUKType {

    @XmlElement(name = "IDENTIFICADOR_DE_CASA", required = true)
    protected String identificadordecasa;
    @XmlElement(name = "NOMBRE_DEL_EDIFICIO", required = true)
    protected String nombredeledificio;
    @XmlElement(name = "NOMBRE_DE_CALLE1", required = true)
    protected String nombredecalle1;
    @XmlElement(name = "NOMBRE_DE_CALLE2", required = true)
    protected String nombredecalle2;
    @XmlElement(name = "NOMBRE_DE_DISTRITO1", required = true)
    protected String nombrededistrito1;
    @XmlElement(name = "NOMBRE_DE_DISTRITO2", required = true)
    protected String nombrededistrito2;
    @XmlElement(name = "COD_PAIS_UK", required = true)
    protected String codpaisuk;
    @XmlElement(name = "COD_POSTAL_CIUDAD", required = true)
    protected String codpostalciudad;
    @XmlElement(name = "COD_POSTAL_DOMICILIO", required = true)
    protected String codpostaldomicilio;

    /**
     * Gets the value of the identificadordecasa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDENTIFICADORDECASA() {
        return identificadordecasa;
    }

    /**
     * Sets the value of the identificadordecasa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDENTIFICADORDECASA(String value) {
        this.identificadordecasa = value;
    }

    /**
     * Gets the value of the nombredeledificio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBREDELEDIFICIO() {
        return nombredeledificio;
    }

    /**
     * Sets the value of the nombredeledificio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBREDELEDIFICIO(String value) {
        this.nombredeledificio = value;
    }

    /**
     * Gets the value of the nombredecalle1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBREDECALLE1() {
        return nombredecalle1;
    }

    /**
     * Sets the value of the nombredecalle1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBREDECALLE1(String value) {
        this.nombredecalle1 = value;
    }

    /**
     * Gets the value of the nombredecalle2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBREDECALLE2() {
        return nombredecalle2;
    }

    /**
     * Sets the value of the nombredecalle2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBREDECALLE2(String value) {
        this.nombredecalle2 = value;
    }

    /**
     * Gets the value of the nombrededistrito1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBREDEDISTRITO1() {
        return nombrededistrito1;
    }

    /**
     * Sets the value of the nombrededistrito1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBREDEDISTRITO1(String value) {
        this.nombrededistrito1 = value;
    }

    /**
     * Gets the value of the nombrededistrito2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBREDEDISTRITO2() {
        return nombrededistrito2;
    }

    /**
     * Sets the value of the nombrededistrito2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBREDEDISTRITO2(String value) {
        this.nombrededistrito2 = value;
    }

    /**
     * Gets the value of the codpaisuk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODPAISUK() {
        return codpaisuk;
    }

    /**
     * Sets the value of the codpaisuk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODPAISUK(String value) {
        this.codpaisuk = value;
    }

    /**
     * Gets the value of the codpostalciudad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODPOSTALCIUDAD() {
        return codpostalciudad;
    }

    /**
     * Sets the value of the codpostalciudad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODPOSTALCIUDAD(String value) {
        this.codpostalciudad = value;
    }

    /**
     * Gets the value of the codpostaldomicilio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODPOSTALDOMICILIO() {
        return codpostaldomicilio;
    }

    /**
     * Sets the value of the codpostaldomicilio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODPOSTALDOMICILIO(String value) {
        this.codpostaldomicilio = value;
    }

}
