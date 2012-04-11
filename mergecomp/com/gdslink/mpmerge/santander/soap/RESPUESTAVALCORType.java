
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RESPUESTA_VALCOR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RESPUESTA_VALCOR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="ID_CUESTIONARIO_VALCOR" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *         &lt;element name="ID_RESPUESTA_VALCOR" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *         &lt;element name="FECHA_INI_RESPUESTA" type="{http://www.isban.es/webservices/TDCs}FECHA_AAAAMMDD_GUION_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RESPUESTA_VALCOR_Type", propOrder = {
    "empresa",
    "idcuestionariovalcor",
    "idrespuestavalcor",
    "fechainirespuesta"
})
public class RESPUESTAVALCORType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "ID_CUESTIONARIO_VALCOR", required = true)
    protected String idcuestionariovalcor;
    @XmlElement(name = "ID_RESPUESTA_VALCOR", required = true)
    protected String idrespuestavalcor;
    @XmlElement(name = "FECHA_INI_RESPUESTA", required = true)
    protected XMLGregorianCalendar fechainirespuesta;

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
     * Gets the value of the idcuestionariovalcor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDCUESTIONARIOVALCOR() {
        return idcuestionariovalcor;
    }

    /**
     * Sets the value of the idcuestionariovalcor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDCUESTIONARIOVALCOR(String value) {
        this.idcuestionariovalcor = value;
    }

    /**
     * Gets the value of the idrespuestavalcor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDRESPUESTAVALCOR() {
        return idrespuestavalcor;
    }

    /**
     * Sets the value of the idrespuestavalcor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDRESPUESTAVALCOR(String value) {
        this.idrespuestavalcor = value;
    }

    /**
     * Gets the value of the fechainirespuesta property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFECHAINIRESPUESTA() {
        return fechainirespuesta;
    }

    /**
     * Sets the value of the fechainirespuesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFECHAINIRESPUESTA(XMLGregorianCalendar value) {
        this.fechainirespuesta = value;
    }

}
