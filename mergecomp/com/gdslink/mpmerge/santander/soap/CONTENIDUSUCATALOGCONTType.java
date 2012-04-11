
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CONTENID_USU_CATALOG_CONT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CONTENID_USU_CATALOG_CONT_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="USUARIO_PORTAL" type="{http://www.isban.es/webservices/TDCs}UID_Type"/>
 *         &lt;element name="CODIGO_CONTENIDO" type="{http://www.isban.es/webservices/TDCs}CONTENIDO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONTENID_USU_CATALOG_CONT_Type", propOrder = {
    "usuarioportal",
    "codigocontenido"
})
public class CONTENIDUSUCATALOGCONTType {

    @XmlElement(name = "USUARIO_PORTAL", required = true)
    protected String usuarioportal;
    @XmlElement(name = "CODIGO_CONTENIDO", required = true)
    protected String codigocontenido;

    /**
     * Gets the value of the usuarioportal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSUARIOPORTAL() {
        return usuarioportal;
    }

    /**
     * Sets the value of the usuarioportal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSUARIOPORTAL(String value) {
        this.usuarioportal = value;
    }

    /**
     * Gets the value of the codigocontenido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOCONTENIDO() {
        return codigocontenido;
    }

    /**
     * Sets the value of the codigocontenido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOCONTENIDO(String value) {
        this.codigocontenido = value;
    }

}
