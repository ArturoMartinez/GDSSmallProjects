
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PERFIL_RESTRICCION_PCAS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PERFIL_RESTRICCION_PCAS_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="COD_PERFIL_RESTRICCION" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_15_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PERFIL_RESTRICCION_PCAS_Type", propOrder = {
    "empresa",
    "codperfilrestriccion"
})
public class PERFILRESTRICCIONPCASType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "COD_PERFIL_RESTRICCION", required = true)
    protected String codperfilrestriccion;

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
     * Gets the value of the codperfilrestriccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODPERFILRESTRICCION() {
        return codperfilrestriccion;
    }

    /**
     * Sets the value of the codperfilrestriccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODPERFILRESTRICCION(String value) {
        this.codperfilrestriccion = value;
    }

}
