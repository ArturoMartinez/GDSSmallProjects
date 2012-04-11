
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ID_FORMULARIO_DP_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ID_FORMULARIO_DP_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="RAZONREC" type="{http://www.isban.es/webservices/TDCs}RAZON_RECLAMACION_RECLAM_Type"/>
 *         &lt;element name="CODPROEM" type="{http://www.isban.es/webservices/TDCs}COD_ALFAJUSTI_4_Type"/>
 *         &lt;element name="CODAGRUP" type="{http://www.isban.es/webservices/TDCs}COD_ALFAJUSTI_4_Type"/>
 *         &lt;element name="IDFORM" type="{http://www.isban.es/webservices/TDCs}COD_ALFAJUSTI_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ID_FORMULARIO_DP_Type", propOrder = {
    "empresa",
    "razonrec",
    "codproem",
    "codagrup",
    "idform"
})
public class IDFORMULARIODPType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "RAZONREC", required = true)
    protected String razonrec;
    @XmlElement(name = "CODPROEM", required = true)
    protected String codproem;
    @XmlElement(name = "CODAGRUP", required = true)
    protected String codagrup;
    @XmlElement(name = "IDFORM", required = true)
    protected String idform;

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
     * Gets the value of the razonrec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRAZONREC() {
        return razonrec;
    }

    /**
     * Sets the value of the razonrec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRAZONREC(String value) {
        this.razonrec = value;
    }

    /**
     * Gets the value of the codproem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODPROEM() {
        return codproem;
    }

    /**
     * Sets the value of the codproem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODPROEM(String value) {
        this.codproem = value;
    }

    /**
     * Gets the value of the codagrup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODAGRUP() {
        return codagrup;
    }

    /**
     * Sets the value of the codagrup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODAGRUP(String value) {
        this.codagrup = value;
    }

    /**
     * Gets the value of the idform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDFORM() {
        return idform;
    }

    /**
     * Sets the value of the idform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDFORM(String value) {
        this.idform = value;
    }

}
