
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EJECUCION_LLAMADA_GLP_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EJECUCION_LLAMADA_GLP_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODIGO_DE_CONVERSACION" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *         &lt;element name="LLAMADA_GLP" type="{http://www.isban.es/webservices/TDCc}LLAMADA_GLP_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EJECUCION_LLAMADA_GLP_Type", propOrder = {
    "codigodeconversacion",
    "llamadaglp"
})
public class EJECUCIONLLAMADAGLPType {

    @XmlElement(name = "CODIGO_DE_CONVERSACION", required = true)
    protected String codigodeconversacion;
    @XmlElement(name = "LLAMADA_GLP", required = true)
    protected LLAMADAGLPType llamadaglp;

    /**
     * Gets the value of the codigodeconversacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGODECONVERSACION() {
        return codigodeconversacion;
    }

    /**
     * Sets the value of the codigodeconversacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGODECONVERSACION(String value) {
        this.codigodeconversacion = value;
    }

    /**
     * Gets the value of the llamadaglp property.
     * 
     * @return
     *     possible object is
     *     {@link LLAMADAGLPType }
     *     
     */
    public LLAMADAGLPType getLLAMADAGLP() {
        return llamadaglp;
    }

    /**
     * Sets the value of the llamadaglp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LLAMADAGLPType }
     *     
     */
    public void setLLAMADAGLP(LLAMADAGLPType value) {
        this.llamadaglp = value;
    }

}
