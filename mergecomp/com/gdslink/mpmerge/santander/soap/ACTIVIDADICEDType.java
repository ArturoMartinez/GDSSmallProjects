
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACTIVIDAD_ICED_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACTIVIDAD_ICED_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LLAMADA_GLD" type="{http://www.isban.es/webservices/TDCc}LLAMADA_GLD_Type"/>
 *         &lt;element name="CODIGO_ACTIVIDAD" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_4_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACTIVIDAD_ICED_Type", propOrder = {
    "llamadagld",
    "codigoactividad"
})
public class ACTIVIDADICEDType {

    @XmlElement(name = "LLAMADA_GLD", required = true)
    protected LLAMADAGLDType llamadagld;
    @XmlElement(name = "CODIGO_ACTIVIDAD", required = true)
    protected String codigoactividad;

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
     * Gets the value of the codigoactividad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOACTIVIDAD() {
        return codigoactividad;
    }

    /**
     * Sets the value of the codigoactividad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOACTIVIDAD(String value) {
        this.codigoactividad = value;
    }

}
