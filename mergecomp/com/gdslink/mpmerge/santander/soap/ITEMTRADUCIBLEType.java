
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ITEM_TRADUCIBLE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ITEM_TRADUCIBLE_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CLAVE_CONCATENADA" type="{http://www.isban.es/webservices/TDCs}CLAVE_CONCATENADA_Type"/>
 *         &lt;element name="CODIGO_TIPO_DE_DATO" type="{http://www.isban.es/webservices/TDCs}CODIGO_TIPO_DE_DATO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ITEM_TRADUCIBLE_Type", propOrder = {
    "claveconcatenada",
    "codigotipodedato"
})
public class ITEMTRADUCIBLEType {

    @XmlElement(name = "CLAVE_CONCATENADA", required = true)
    protected String claveconcatenada;
    @XmlElement(name = "CODIGO_TIPO_DE_DATO", required = true)
    protected String codigotipodedato;

    /**
     * Gets the value of the claveconcatenada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLAVECONCATENADA() {
        return claveconcatenada;
    }

    /**
     * Sets the value of the claveconcatenada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLAVECONCATENADA(String value) {
        this.claveconcatenada = value;
    }

    /**
     * Gets the value of the codigotipodedato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOTIPODEDATO() {
        return codigotipodedato;
    }

    /**
     * Sets the value of the codigotipodedato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOTIPODEDATO(String value) {
        this.codigotipodedato = value;
    }

}
