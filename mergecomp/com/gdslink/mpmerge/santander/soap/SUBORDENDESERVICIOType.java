
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SUBORDEN_DE_SERVICIO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SUBORDEN_DE_SERVICIO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ORDEN_DE_SERVICIO" type="{http://www.isban.es/webservices/TDCc}ORDEN_DE_SERVICIO_Type"/>
 *         &lt;element name="SUBORDEN" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_7_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SUBORDEN_DE_SERVICIO_Type", propOrder = {
    "ordendeservicio",
    "suborden"
})
public class SUBORDENDESERVICIOType {

    @XmlElement(name = "ORDEN_DE_SERVICIO", required = true)
    protected ORDENDESERVICIOType ordendeservicio;
    @XmlElement(name = "SUBORDEN", required = true)
    protected String suborden;

    /**
     * Gets the value of the ordendeservicio property.
     * 
     * @return
     *     possible object is
     *     {@link ORDENDESERVICIOType }
     *     
     */
    public ORDENDESERVICIOType getORDENDESERVICIO() {
        return ordendeservicio;
    }

    /**
     * Sets the value of the ordendeservicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORDENDESERVICIOType }
     *     
     */
    public void setORDENDESERVICIO(ORDENDESERVICIOType value) {
        this.ordendeservicio = value;
    }

    /**
     * Gets the value of the suborden property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBORDEN() {
        return suborden;
    }

    /**
     * Sets the value of the suborden property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBORDEN(String value) {
        this.suborden = value;
    }

}
