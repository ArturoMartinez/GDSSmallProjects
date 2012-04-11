
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GRUPO_PROCESO_PCAS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GRUPO_PROCESO_PCAS_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PROCESO_PCAS" type="{http://www.isban.es/webservices/TDCc}PROCESO_PCAS_Type"/>
 *         &lt;element name="COD_GRUPOC_PROCESO" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GRUPO_PROCESO_PCAS_Type", propOrder = {
    "procesopcas",
    "codgrupocproceso"
})
public class GRUPOPROCESOPCASType {

    @XmlElement(name = "PROCESO_PCAS", required = true)
    protected PROCESOPCASType procesopcas;
    @XmlElement(name = "COD_GRUPOC_PROCESO")
    protected int codgrupocproceso;

    /**
     * Gets the value of the procesopcas property.
     * 
     * @return
     *     possible object is
     *     {@link PROCESOPCASType }
     *     
     */
    public PROCESOPCASType getPROCESOPCAS() {
        return procesopcas;
    }

    /**
     * Sets the value of the procesopcas property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROCESOPCASType }
     *     
     */
    public void setPROCESOPCAS(PROCESOPCASType value) {
        this.procesopcas = value;
    }

    /**
     * Gets the value of the codgrupocproceso property.
     * 
     */
    public int getCODGRUPOCPROCESO() {
        return codgrupocproceso;
    }

    /**
     * Sets the value of the codgrupocproceso property.
     * 
     */
    public void setCODGRUPOCPROCESO(int value) {
        this.codgrupocproceso = value;
    }

}
