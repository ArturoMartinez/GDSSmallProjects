
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PREGUNTA_VALCOR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PREGUNTA_VALCOR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_CUESTIONARIO_VALCOR" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *         &lt;element name="FECHA_INI_PREGUNTA" type="{http://www.isban.es/webservices/TDCs}FECHA_AAAAMMDD_GUION_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PREGUNTA_VALCOR_Type", propOrder = {
    "idcuestionariovalcor",
    "fechainipregunta"
})
public class PREGUNTAVALCORType {

    @XmlElement(name = "ID_CUESTIONARIO_VALCOR", required = true)
    protected String idcuestionariovalcor;
    @XmlElement(name = "FECHA_INI_PREGUNTA", required = true)
    protected XMLGregorianCalendar fechainipregunta;

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
     * Gets the value of the fechainipregunta property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFECHAINIPREGUNTA() {
        return fechainipregunta;
    }

    /**
     * Sets the value of the fechainipregunta property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFECHAINIPREGUNTA(XMLGregorianCalendar value) {
        this.fechainipregunta = value;
    }

}
