
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MOT_DEVOLUCION_DOC_CAMARA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MOT_DEVOLUCION_DOC_CAMARA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COD_IDENT_SUBSISTEMA" type="{http://www.isban.es/webservices/TDCs}SUBSISTEMA_Type"/>
 *         &lt;element name="COD_MOT_DEVOLUCION" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MOT_DEVOLUCION_DOC_CAMARA_Type", propOrder = {
    "codidentsubsistema",
    "codmotdevolucion"
})
public class MOTDEVOLUCIONDOCCAMARAType {

    @XmlElement(name = "COD_IDENT_SUBSISTEMA", required = true)
    protected String codidentsubsistema;
    @XmlElement(name = "COD_MOT_DEVOLUCION", required = true)
    protected String codmotdevolucion;

    /**
     * Gets the value of the codidentsubsistema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIDENTSUBSISTEMA() {
        return codidentsubsistema;
    }

    /**
     * Sets the value of the codidentsubsistema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIDENTSUBSISTEMA(String value) {
        this.codidentsubsistema = value;
    }

    /**
     * Gets the value of the codmotdevolucion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODMOTDEVOLUCION() {
        return codmotdevolucion;
    }

    /**
     * Sets the value of the codmotdevolucion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODMOTDEVOLUCION(String value) {
        this.codmotdevolucion = value;
    }

}
