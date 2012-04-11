
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TIPO_MARCAJE_TTGG_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIPO_MARCAJE_TTGG_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_TIPO_DE_DATO" type="{http://www.isban.es/webservices/TDCs}CODIGO_TIPO_DE_DATO_Type"/>
 *         &lt;element name="COD_TIPO_MARCAJE" type="{http://www.isban.es/webservices/TDCs}COD_TIPO_MARCAJE_TTGG_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIPO_MARCAJE_TTGG_Type", propOrder = {
    "idtipodedato",
    "codtipomarcaje"
})
public class TIPOMARCAJETTGGType {

    @XmlElement(name = "ID_TIPO_DE_DATO", required = true)
    protected String idtipodedato;
    @XmlElement(name = "COD_TIPO_MARCAJE", required = true)
    protected String codtipomarcaje;

    /**
     * Gets the value of the idtipodedato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDTIPODEDATO() {
        return idtipodedato;
    }

    /**
     * Sets the value of the idtipodedato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDTIPODEDATO(String value) {
        this.idtipodedato = value;
    }

    /**
     * Gets the value of the codtipomarcaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODTIPOMARCAJE() {
        return codtipomarcaje;
    }

    /**
     * Sets the value of the codtipomarcaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODTIPOMARCAJE(String value) {
        this.codtipomarcaje = value;
    }

}
