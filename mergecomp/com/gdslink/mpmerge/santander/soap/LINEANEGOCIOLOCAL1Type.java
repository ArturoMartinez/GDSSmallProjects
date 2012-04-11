
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LINEA_NEGOCIO_LOCAL_1_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LINEA_NEGOCIO_LOCAL_1_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="ID_LINEA_NEGOCIO_LOCAL_1" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LINEA_NEGOCIO_LOCAL_1_Type", propOrder = {
    "empresa",
    "idlineanegociolocal1"
})
public class LINEANEGOCIOLOCAL1Type {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "ID_LINEA_NEGOCIO_LOCAL_1", required = true)
    protected String idlineanegociolocal1;

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
     * Gets the value of the idlineanegociolocal1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDLINEANEGOCIOLOCAL1() {
        return idlineanegociolocal1;
    }

    /**
     * Sets the value of the idlineanegociolocal1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDLINEANEGOCIOLOCAL1(String value) {
        this.idlineanegociolocal1 = value;
    }

}
