
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for INCIDENCIA_CARGA_CONS_FIN_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INCIDENCIA_CARGA_CONS_FIN_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PERIODO" type="{http://www.isban.es/webservices/TDCc}PERIODO_Type"/>
 *         &lt;element name="COD_SOCIEDAD" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_5_Type"/>
 *         &lt;element name="COD_INCIDENCIA" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_5_Type"/>
 *         &lt;element name="TIP_CARGA" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INCIDENCIA_CARGA_CONS_FIN_Type", propOrder = {
    "periodo",
    "codsociedad",
    "codincidencia",
    "tipcarga"
})
public class INCIDENCIACARGACONSFINType {

    @XmlElement(name = "PERIODO", required = true)
    protected PERIODOType periodo;
    @XmlElement(name = "COD_SOCIEDAD", required = true)
    protected String codsociedad;
    @XmlElement(name = "COD_INCIDENCIA", required = true)
    protected String codincidencia;
    @XmlElement(name = "TIP_CARGA", required = true)
    protected String tipcarga;

    /**
     * Gets the value of the periodo property.
     * 
     * @return
     *     possible object is
     *     {@link PERIODOType }
     *     
     */
    public PERIODOType getPERIODO() {
        return periodo;
    }

    /**
     * Sets the value of the periodo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERIODOType }
     *     
     */
    public void setPERIODO(PERIODOType value) {
        this.periodo = value;
    }

    /**
     * Gets the value of the codsociedad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODSOCIEDAD() {
        return codsociedad;
    }

    /**
     * Sets the value of the codsociedad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODSOCIEDAD(String value) {
        this.codsociedad = value;
    }

    /**
     * Gets the value of the codincidencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODINCIDENCIA() {
        return codincidencia;
    }

    /**
     * Sets the value of the codincidencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODINCIDENCIA(String value) {
        this.codincidencia = value;
    }

    /**
     * Gets the value of the tipcarga property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPCARGA() {
        return tipcarga;
    }

    /**
     * Sets the value of the tipcarga property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPCARGA(String value) {
        this.tipcarga = value;
    }

}
