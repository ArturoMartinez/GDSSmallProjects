
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for INM_USO_INMUEBLE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INM_USO_INMUEBLE_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INM_GRUPO_USO" type="{http://www.isban.es/webservices/TDCs}INM_GRUPO_USO_Type"/>
 *         &lt;element name="COD_USO" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INM_USO_INMUEBLE_Type", propOrder = {
    "inmgrupouso",
    "coduso"
})
public class INMUSOINMUEBLEType {

    @XmlElement(name = "INM_GRUPO_USO", required = true)
    protected String inmgrupouso;
    @XmlElement(name = "COD_USO", required = true)
    protected String coduso;

    /**
     * Gets the value of the inmgrupouso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINMGRUPOUSO() {
        return inmgrupouso;
    }

    /**
     * Sets the value of the inmgrupouso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINMGRUPOUSO(String value) {
        this.inmgrupouso = value;
    }

    /**
     * Gets the value of the coduso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODUSO() {
        return coduso;
    }

    /**
     * Sets the value of the coduso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODUSO(String value) {
        this.coduso = value;
    }

}
