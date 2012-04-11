
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SUBAGRUP_MOVIMIENTOS_DGO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SUBAGRUP_MOVIMIENTOS_DGO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AGRUP_MOVIMIENTOS" type="{http://www.isban.es/webservices/TDCs}AGRUP_MOVIMIENTOS_DGO_Type"/>
 *         &lt;element name="SUBAGRUP_MOVIMIENTOS" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SUBAGRUP_MOVIMIENTOS_DGO_Type", propOrder = {
    "agrupmovimientos",
    "subagrupmovimientos"
})
public class SUBAGRUPMOVIMIENTOSDGOType {

    @XmlElement(name = "AGRUP_MOVIMIENTOS", required = true)
    protected String agrupmovimientos;
    @XmlElement(name = "SUBAGRUP_MOVIMIENTOS", required = true)
    protected String subagrupmovimientos;

    /**
     * Gets the value of the agrupmovimientos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGRUPMOVIMIENTOS() {
        return agrupmovimientos;
    }

    /**
     * Sets the value of the agrupmovimientos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGRUPMOVIMIENTOS(String value) {
        this.agrupmovimientos = value;
    }

    /**
     * Gets the value of the subagrupmovimientos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBAGRUPMOVIMIENTOS() {
        return subagrupmovimientos;
    }

    /**
     * Sets the value of the subagrupmovimientos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBAGRUPMOVIMIENTOS(String value) {
        this.subagrupmovimientos = value;
    }

}
