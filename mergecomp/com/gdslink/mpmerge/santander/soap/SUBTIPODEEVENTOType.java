
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SUBTIPO_DE_EVENTO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SUBTIPO_DE_EVENTO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_DE_EVENTO" type="{http://www.isban.es/webservices/TDCc}TIPO_DE_EVENTO_Type"/>
 *         &lt;element name="COD_SUBTIPO_DE_EVENTO" type="{http://www.isban.es/webservices/TDCs}COD_SUBTIPO_DE_EVENTO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SUBTIPO_DE_EVENTO_Type", propOrder = {
    "tipodeevento",
    "codsubtipodeevento"
})
public class SUBTIPODEEVENTOType {

    @XmlElement(name = "TIPO_DE_EVENTO", required = true)
    protected TIPODEEVENTOType tipodeevento;
    @XmlElement(name = "COD_SUBTIPO_DE_EVENTO", required = true)
    protected String codsubtipodeevento;

    /**
     * Gets the value of the tipodeevento property.
     * 
     * @return
     *     possible object is
     *     {@link TIPODEEVENTOType }
     *     
     */
    public TIPODEEVENTOType getTIPODEEVENTO() {
        return tipodeevento;
    }

    /**
     * Sets the value of the tipodeevento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIPODEEVENTOType }
     *     
     */
    public void setTIPODEEVENTO(TIPODEEVENTOType value) {
        this.tipodeevento = value;
    }

    /**
     * Gets the value of the codsubtipodeevento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODSUBTIPODEEVENTO() {
        return codsubtipodeevento;
    }

    /**
     * Sets the value of the codsubtipodeevento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODSUBTIPODEEVENTO(String value) {
        this.codsubtipodeevento = value;
    }

}
