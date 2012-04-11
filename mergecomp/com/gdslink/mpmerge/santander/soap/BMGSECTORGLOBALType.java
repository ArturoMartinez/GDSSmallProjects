
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BMG_SECTOR_GLOBAL_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BMG_SECTOR_GLOBAL_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BMG_TIPO_SECTOR" type="{http://www.isban.es/webservices/TDCs}BMG_TIPO_SECTOR_Type"/>
 *         &lt;element name="ID_SECTOR_GLOBAL" type="{http://www.isban.es/webservices/TDCs}STRING_15_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BMG_SECTOR_GLOBAL_Type", propOrder = {
    "bmgtiposector",
    "idsectorglobal"
})
public class BMGSECTORGLOBALType {

    @XmlElement(name = "BMG_TIPO_SECTOR", required = true)
    protected String bmgtiposector;
    @XmlElement(name = "ID_SECTOR_GLOBAL", required = true)
    protected String idsectorglobal;

    /**
     * Gets the value of the bmgtiposector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBMGTIPOSECTOR() {
        return bmgtiposector;
    }

    /**
     * Sets the value of the bmgtiposector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBMGTIPOSECTOR(String value) {
        this.bmgtiposector = value;
    }

    /**
     * Gets the value of the idsectorglobal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDSECTORGLOBAL() {
        return idsectorglobal;
    }

    /**
     * Sets the value of the idsectorglobal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDSECTORGLOBAL(String value) {
        this.idsectorglobal = value;
    }

}
