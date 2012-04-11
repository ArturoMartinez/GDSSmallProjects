
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ID_SUBTIPO_PERDIDA_DP_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ID_SUBTIPO_PERDIDA_DP_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_TIPO_PERDIDA_DP" type="{http://www.isban.es/webservices/TDCc}ID_TIPO_PERDIDA_DP_Type"/>
 *         &lt;element name="COD_SUBTIPO_PERDIDA" type="{http://www.isban.es/webservices/TDCs}COD_ALFAJUSTI_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ID_SUBTIPO_PERDIDA_DP_Type", propOrder = {
    "idtipoperdidadp",
    "codsubtipoperdida"
})
public class IDSUBTIPOPERDIDADPType {

    @XmlElement(name = "ID_TIPO_PERDIDA_DP", required = true)
    protected IDTIPOPERDIDADPType idtipoperdidadp;
    @XmlElement(name = "COD_SUBTIPO_PERDIDA", required = true)
    protected String codsubtipoperdida;

    /**
     * Gets the value of the idtipoperdidadp property.
     * 
     * @return
     *     possible object is
     *     {@link IDTIPOPERDIDADPType }
     *     
     */
    public IDTIPOPERDIDADPType getIDTIPOPERDIDADP() {
        return idtipoperdidadp;
    }

    /**
     * Sets the value of the idtipoperdidadp property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDTIPOPERDIDADPType }
     *     
     */
    public void setIDTIPOPERDIDADP(IDTIPOPERDIDADPType value) {
        this.idtipoperdidadp = value;
    }

    /**
     * Gets the value of the codsubtipoperdida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODSUBTIPOPERDIDA() {
        return codsubtipoperdida;
    }

    /**
     * Sets the value of the codsubtipoperdida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODSUBTIPOPERDIDA(String value) {
        this.codsubtipoperdida = value;
    }

}
