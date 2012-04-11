
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SOCIEDAD_GRUPO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SOCIEDAD_GRUPO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_SOCIEDAD" type="{http://www.isban.es/webservices/TDCs}TIPO_SOCIEDAD_Type"/>
 *         &lt;element name="CODIGO_SOCIEDAD" type="{http://www.isban.es/webservices/TDCs}NUMERO_DE_PERSONA_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SOCIEDAD_GRUPO_Type", propOrder = {
    "tiposociedad",
    "codigosociedad"
})
public class SOCIEDADGRUPOType {

    @XmlElement(name = "TIPO_SOCIEDAD", required = true)
    protected String tiposociedad;
    @XmlElement(name = "CODIGO_SOCIEDAD")
    protected int codigosociedad;

    /**
     * Gets the value of the tiposociedad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOSOCIEDAD() {
        return tiposociedad;
    }

    /**
     * Sets the value of the tiposociedad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOSOCIEDAD(String value) {
        this.tiposociedad = value;
    }

    /**
     * Gets the value of the codigosociedad property.
     * 
     */
    public int getCODIGOSOCIEDAD() {
        return codigosociedad;
    }

    /**
     * Sets the value of the codigosociedad property.
     * 
     */
    public void setCODIGOSOCIEDAD(int value) {
        this.codigosociedad = value;
    }

}
