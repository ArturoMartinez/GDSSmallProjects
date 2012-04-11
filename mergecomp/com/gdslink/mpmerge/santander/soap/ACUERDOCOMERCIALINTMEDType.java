
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACUERDO_COMERCIAL_INTMED_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACUERDO_COMERCIAL_INTMED_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_INTERMEDIARIO_INTMED" type="{http://www.isban.es/webservices/TDCs}ID_INTERMEDIARIO_INTMED_Type"/>
 *         &lt;element name="ID_FABRICA_INTMED" type="{http://www.isban.es/webservices/TDCs}ID_FABRICA_INTMED_Type"/>
 *         &lt;element name="ID_DISTRIBUIDOR_INTMED" type="{http://www.isban.es/webservices/TDCs}ID_DISTRIBUIDOR_INTMED_Type"/>
 *         &lt;element name="ID_PRODUCTO_INTMED" type="{http://www.isban.es/webservices/TDCs}ID_PRODUCTO_INTMED_Type"/>
 *         &lt;element name="ID_CANAL_INTMED" type="{http://www.isban.es/webservices/TDCs}ID_CANAL_INTMED_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACUERDO_COMERCIAL_INTMED_Type", propOrder = {
    "idintermediariointmed",
    "idfabricaintmed",
    "iddistribuidorintmed",
    "idproductointmed",
    "idcanalintmed"
})
public class ACUERDOCOMERCIALINTMEDType {

    @XmlElement(name = "ID_INTERMEDIARIO_INTMED", required = true)
    protected String idintermediariointmed;
    @XmlElement(name = "ID_FABRICA_INTMED", required = true)
    protected String idfabricaintmed;
    @XmlElement(name = "ID_DISTRIBUIDOR_INTMED", required = true)
    protected String iddistribuidorintmed;
    @XmlElement(name = "ID_PRODUCTO_INTMED", required = true)
    protected String idproductointmed;
    @XmlElement(name = "ID_CANAL_INTMED", required = true)
    protected String idcanalintmed;

    /**
     * Gets the value of the idintermediariointmed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDINTERMEDIARIOINTMED() {
        return idintermediariointmed;
    }

    /**
     * Sets the value of the idintermediariointmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDINTERMEDIARIOINTMED(String value) {
        this.idintermediariointmed = value;
    }

    /**
     * Gets the value of the idfabricaintmed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDFABRICAINTMED() {
        return idfabricaintmed;
    }

    /**
     * Sets the value of the idfabricaintmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDFABRICAINTMED(String value) {
        this.idfabricaintmed = value;
    }

    /**
     * Gets the value of the iddistribuidorintmed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDDISTRIBUIDORINTMED() {
        return iddistribuidorintmed;
    }

    /**
     * Sets the value of the iddistribuidorintmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDDISTRIBUIDORINTMED(String value) {
        this.iddistribuidorintmed = value;
    }

    /**
     * Gets the value of the idproductointmed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDPRODUCTOINTMED() {
        return idproductointmed;
    }

    /**
     * Sets the value of the idproductointmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDPRODUCTOINTMED(String value) {
        this.idproductointmed = value;
    }

    /**
     * Gets the value of the idcanalintmed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDCANALINTMED() {
        return idcanalintmed;
    }

    /**
     * Sets the value of the idcanalintmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDCANALINTMED(String value) {
        this.idcanalintmed = value;
    }

}
