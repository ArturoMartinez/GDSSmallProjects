
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LINEA_NEGOCIO_LOCAL_2_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LINEA_NEGOCIO_LOCAL_2_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LINEA_NEGOCIO_LOCAL_1" type="{http://www.isban.es/webservices/TDCc}LINEA_NEGOCIO_LOCAL_1_Type"/>
 *         &lt;element name="ID_LINEA_NEGOCIO_LOCAL_2" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LINEA_NEGOCIO_LOCAL_2_Type", propOrder = {
    "lineanegociolocal1",
    "idlineanegociolocal2"
})
public class LINEANEGOCIOLOCAL2Type {

    @XmlElement(name = "LINEA_NEGOCIO_LOCAL_1", required = true)
    protected LINEANEGOCIOLOCAL1Type lineanegociolocal1;
    @XmlElement(name = "ID_LINEA_NEGOCIO_LOCAL_2", required = true)
    protected String idlineanegociolocal2;

    /**
     * Gets the value of the lineanegociolocal1 property.
     * 
     * @return
     *     possible object is
     *     {@link LINEANEGOCIOLOCAL1Type }
     *     
     */
    public LINEANEGOCIOLOCAL1Type getLINEANEGOCIOLOCAL1() {
        return lineanegociolocal1;
    }

    /**
     * Sets the value of the lineanegociolocal1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link LINEANEGOCIOLOCAL1Type }
     *     
     */
    public void setLINEANEGOCIOLOCAL1(LINEANEGOCIOLOCAL1Type value) {
        this.lineanegociolocal1 = value;
    }

    /**
     * Gets the value of the idlineanegociolocal2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDLINEANEGOCIOLOCAL2() {
        return idlineanegociolocal2;
    }

    /**
     * Sets the value of the idlineanegociolocal2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDLINEANEGOCIOLOCAL2(String value) {
        this.idlineanegociolocal2 = value;
    }

}
