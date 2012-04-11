
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ESTADO_ICED_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ESTADO_ICED_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LLAMADA_GLD" type="{http://www.isban.es/webservices/TDCc}LLAMADA_GLD_Type"/>
 *         &lt;element name="CODIGO_ESTADO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ESTADO_ICED_Type", propOrder = {
    "llamadagld",
    "codigoestado"
})
public class ESTADOICEDType {

    @XmlElement(name = "LLAMADA_GLD", required = true)
    protected LLAMADAGLDType llamadagld;
    @XmlElement(name = "CODIGO_ESTADO", required = true)
    protected String codigoestado;

    /**
     * Gets the value of the llamadagld property.
     * 
     * @return
     *     possible object is
     *     {@link LLAMADAGLDType }
     *     
     */
    public LLAMADAGLDType getLLAMADAGLD() {
        return llamadagld;
    }

    /**
     * Sets the value of the llamadagld property.
     * 
     * @param value
     *     allowed object is
     *     {@link LLAMADAGLDType }
     *     
     */
    public void setLLAMADAGLD(LLAMADAGLDType value) {
        this.llamadagld = value;
    }

    /**
     * Gets the value of the codigoestado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOESTADO() {
        return codigoestado;
    }

    /**
     * Sets the value of the codigoestado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOESTADO(String value) {
        this.codigoestado = value;
    }

}
