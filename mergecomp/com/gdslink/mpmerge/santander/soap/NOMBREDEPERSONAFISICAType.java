
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NOMBRE_DE_PERSONA_FISICA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NOMBRE_DE_PERSONA_FISICA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NOMBRE" type="{http://www.isban.es/webservices/TDCs}NOMBRE_DE_PILA_Type"/>
 *         &lt;element name="PART_PRIMER_APELLIDO" type="{http://www.isban.es/webservices/TDCs}PARTICULA_Type"/>
 *         &lt;element name="PRIMER_APELLIDO" type="{http://www.isban.es/webservices/TDCs}APELLIDO_Type"/>
 *         &lt;element name="PART_SEGUNDO_APELLIDO" type="{http://www.isban.es/webservices/TDCs}PARTICULA_Type"/>
 *         &lt;element name="SEGUNDO_APELLIDO" type="{http://www.isban.es/webservices/TDCs}APELLIDO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NOMBRE_DE_PERSONA_FISICA_Type", propOrder = {
    "nombre",
    "partprimerapellido",
    "primerapellido",
    "partsegundoapellido",
    "segundoapellido"
})
public class NOMBREDEPERSONAFISICAType {

    @XmlElement(name = "NOMBRE", required = true)
    protected String nombre;
    @XmlElement(name = "PART_PRIMER_APELLIDO", required = true)
    protected String partprimerapellido;
    @XmlElement(name = "PRIMER_APELLIDO", required = true)
    protected String primerapellido;
    @XmlElement(name = "PART_SEGUNDO_APELLIDO", required = true)
    protected String partsegundoapellido;
    @XmlElement(name = "SEGUNDO_APELLIDO", required = true)
    protected String segundoapellido;

    /**
     * Gets the value of the nombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBRE() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBRE(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the partprimerapellido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARTPRIMERAPELLIDO() {
        return partprimerapellido;
    }

    /**
     * Sets the value of the partprimerapellido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARTPRIMERAPELLIDO(String value) {
        this.partprimerapellido = value;
    }

    /**
     * Gets the value of the primerapellido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRIMERAPELLIDO() {
        return primerapellido;
    }

    /**
     * Sets the value of the primerapellido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRIMERAPELLIDO(String value) {
        this.primerapellido = value;
    }

    /**
     * Gets the value of the partsegundoapellido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARTSEGUNDOAPELLIDO() {
        return partsegundoapellido;
    }

    /**
     * Sets the value of the partsegundoapellido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARTSEGUNDOAPELLIDO(String value) {
        this.partsegundoapellido = value;
    }

    /**
     * Gets the value of the segundoapellido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEGUNDOAPELLIDO() {
        return segundoapellido;
    }

    /**
     * Sets the value of the segundoapellido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEGUNDOAPELLIDO(String value) {
        this.segundoapellido = value;
    }

}
