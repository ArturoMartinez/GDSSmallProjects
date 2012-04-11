
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ID_PREGUNTA_DP_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ID_PREGUNTA_DP_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_FORMULARIO_DP" type="{http://www.isban.es/webservices/TDCc}ID_FORMULARIO_DP_Type"/>
 *         &lt;element name="COD_PREGUNTA_DP" type="{http://www.isban.es/webservices/TDCs}COD_ALFAJUSTI_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ID_PREGUNTA_DP_Type", propOrder = {
    "idformulariodp",
    "codpreguntadp"
})
public class IDPREGUNTADPType {

    @XmlElement(name = "ID_FORMULARIO_DP", required = true)
    protected IDFORMULARIODPType idformulariodp;
    @XmlElement(name = "COD_PREGUNTA_DP", required = true)
    protected String codpreguntadp;

    /**
     * Gets the value of the idformulariodp property.
     * 
     * @return
     *     possible object is
     *     {@link IDFORMULARIODPType }
     *     
     */
    public IDFORMULARIODPType getIDFORMULARIODP() {
        return idformulariodp;
    }

    /**
     * Sets the value of the idformulariodp property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDFORMULARIODPType }
     *     
     */
    public void setIDFORMULARIODP(IDFORMULARIODPType value) {
        this.idformulariodp = value;
    }

    /**
     * Gets the value of the codpreguntadp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODPREGUNTADP() {
        return codpreguntadp;
    }

    /**
     * Sets the value of the codpreguntadp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODPREGUNTADP(String value) {
        this.codpreguntadp = value;
    }

}
