
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MOB_ASIENTO_OBB_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MOB_ASIENTO_OBB_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OBB" type="{http://www.isban.es/webservices/TDCc}MOB_OBB_Type"/>
 *         &lt;element name="ASIENTO" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MOB_ASIENTO_OBB_Type", propOrder = {
    "obb",
    "asiento"
})
public class MOBASIENTOOBBType {

    @XmlElement(name = "OBB", required = true)
    protected MOBOBBType obb;
    @XmlElement(name = "ASIENTO", required = true)
    protected String asiento;

    /**
     * Gets the value of the obb property.
     * 
     * @return
     *     possible object is
     *     {@link MOBOBBType }
     *     
     */
    public MOBOBBType getOBB() {
        return obb;
    }

    /**
     * Sets the value of the obb property.
     * 
     * @param value
     *     allowed object is
     *     {@link MOBOBBType }
     *     
     */
    public void setOBB(MOBOBBType value) {
        this.obb = value;
    }

    /**
     * Gets the value of the asiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASIENTO() {
        return asiento;
    }

    /**
     * Sets the value of the asiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASIENTO(String value) {
        this.asiento = value;
    }

}
