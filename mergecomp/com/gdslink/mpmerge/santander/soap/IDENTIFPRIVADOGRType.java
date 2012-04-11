
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IDENTIF_PRIVADO_GR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IDENTIF_PRIVADO_GR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIP_ID_PRIVADA" type="{http://www.isban.es/webservices/TDCs}COD_ALFAJUSTI_4_Type"/>
 *         &lt;element name="ID_PRIVADA" type="{http://www.isban.es/webservices/TDCs}ID_PRIVADA_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IDENTIF_PRIVADO_GR_Type", propOrder = {
    "tipidprivada",
    "idprivada"
})
public class IDENTIFPRIVADOGRType {

    @XmlElement(name = "TIP_ID_PRIVADA", required = true)
    protected String tipidprivada;
    @XmlElement(name = "ID_PRIVADA", required = true)
    protected String idprivada;

    /**
     * Gets the value of the tipidprivada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPIDPRIVADA() {
        return tipidprivada;
    }

    /**
     * Sets the value of the tipidprivada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPIDPRIVADA(String value) {
        this.tipidprivada = value;
    }

    /**
     * Gets the value of the idprivada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDPRIVADA() {
        return idprivada;
    }

    /**
     * Sets the value of the idprivada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDPRIVADA(String value) {
        this.idprivada = value;
    }

}
