
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MOB_MOVIMIENTO_OBB_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MOB_MOVIMIENTO_OBB_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MOB_ASIENTO_OBB" type="{http://www.isban.es/webservices/TDCc}MOB_ASIENTO_OBB_Type"/>
 *         &lt;element name="INDICADOR_DH" type="{http://www.isban.es/webservices/TDCs}INDICADOR_DEBE_HABER_Type"/>
 *         &lt;element name="CONCEPTO" type="{http://www.isban.es/webservices/TDCs}CONCEPTO_DGO_Type"/>
 *         &lt;element name="CARACTERISTICA" type="{http://www.isban.es/webservices/TDCc}MOB_CARACTERISTICA_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MOB_MOVIMIENTO_OBB_Type", propOrder = {
    "mobasientoobb",
    "indicadordh",
    "concepto",
    "caracteristica"
})
public class MOBMOVIMIENTOOBBType {

    @XmlElement(name = "MOB_ASIENTO_OBB", required = true)
    protected MOBASIENTOOBBType mobasientoobb;
    @XmlElement(name = "INDICADOR_DH", required = true)
    protected String indicadordh;
    @XmlElement(name = "CONCEPTO", required = true)
    protected String concepto;
    @XmlElement(name = "CARACTERISTICA", required = true)
    protected MOBCARACTERISTICAType caracteristica;

    /**
     * Gets the value of the mobasientoobb property.
     * 
     * @return
     *     possible object is
     *     {@link MOBASIENTOOBBType }
     *     
     */
    public MOBASIENTOOBBType getMOBASIENTOOBB() {
        return mobasientoobb;
    }

    /**
     * Sets the value of the mobasientoobb property.
     * 
     * @param value
     *     allowed object is
     *     {@link MOBASIENTOOBBType }
     *     
     */
    public void setMOBASIENTOOBB(MOBASIENTOOBBType value) {
        this.mobasientoobb = value;
    }

    /**
     * Gets the value of the indicadordh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDICADORDH() {
        return indicadordh;
    }

    /**
     * Sets the value of the indicadordh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDICADORDH(String value) {
        this.indicadordh = value;
    }

    /**
     * Gets the value of the concepto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONCEPTO() {
        return concepto;
    }

    /**
     * Sets the value of the concepto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONCEPTO(String value) {
        this.concepto = value;
    }

    /**
     * Gets the value of the caracteristica property.
     * 
     * @return
     *     possible object is
     *     {@link MOBCARACTERISTICAType }
     *     
     */
    public MOBCARACTERISTICAType getCARACTERISTICA() {
        return caracteristica;
    }

    /**
     * Sets the value of the caracteristica property.
     * 
     * @param value
     *     allowed object is
     *     {@link MOBCARACTERISTICAType }
     *     
     */
    public void setCARACTERISTICA(MOBCARACTERISTICAType value) {
        this.caracteristica = value;
    }

}
