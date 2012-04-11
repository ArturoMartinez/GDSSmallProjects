
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AGRUPACION_CAMPO_PS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AGRUPACION_CAMPO_PS_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_AGRUPACION_CAMPO_PS" type="{http://www.isban.es/webservices/TDCc}TIPO_AGRUPACION_CAMPO_PS_Type"/>
 *         &lt;element name="CODIGO_DE_CAMPO" type="{http://www.isban.es/webservices/TDCs}CODIGO_ATRIBUTO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AGRUPACION_CAMPO_PS_Type", propOrder = {
    "tipoagrupacioncampops",
    "codigodecampo"
})
public class AGRUPACIONCAMPOPSType {

    @XmlElement(name = "TIPO_AGRUPACION_CAMPO_PS", required = true)
    protected TIPOAGRUPACIONCAMPOPSType tipoagrupacioncampops;
    @XmlElement(name = "CODIGO_DE_CAMPO", required = true)
    protected String codigodecampo;

    /**
     * Gets the value of the tipoagrupacioncampops property.
     * 
     * @return
     *     possible object is
     *     {@link TIPOAGRUPACIONCAMPOPSType }
     *     
     */
    public TIPOAGRUPACIONCAMPOPSType getTIPOAGRUPACIONCAMPOPS() {
        return tipoagrupacioncampops;
    }

    /**
     * Sets the value of the tipoagrupacioncampops property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIPOAGRUPACIONCAMPOPSType }
     *     
     */
    public void setTIPOAGRUPACIONCAMPOPS(TIPOAGRUPACIONCAMPOPSType value) {
        this.tipoagrupacioncampops = value;
    }

    /**
     * Gets the value of the codigodecampo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGODECAMPO() {
        return codigodecampo;
    }

    /**
     * Sets the value of the codigodecampo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGODECAMPO(String value) {
        this.codigodecampo = value;
    }

}
