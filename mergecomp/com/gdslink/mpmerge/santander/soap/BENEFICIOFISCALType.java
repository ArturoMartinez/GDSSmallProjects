
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BENEFICIO_FISCAL_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BENEFICIO_FISCAL_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_DE_BENEFICIO_FISCAL" type="{http://www.isban.es/webservices/TDCs}TIPO_DE_BENEFICIO_FISCAL_Type"/>
 *         &lt;element name="COD_BENEFICIO" type="{http://www.isban.es/webservices/TDCs}SECUENCIAL_CORTO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BENEFICIO_FISCAL_Type", propOrder = {
    "tipodebeneficiofiscal",
    "codbeneficio"
})
public class BENEFICIOFISCALType {

    @XmlElement(name = "TIPO_DE_BENEFICIO_FISCAL", required = true)
    protected String tipodebeneficiofiscal;
    @XmlElement(name = "COD_BENEFICIO")
    protected int codbeneficio;

    /**
     * Gets the value of the tipodebeneficiofiscal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODEBENEFICIOFISCAL() {
        return tipodebeneficiofiscal;
    }

    /**
     * Sets the value of the tipodebeneficiofiscal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODEBENEFICIOFISCAL(String value) {
        this.tipodebeneficiofiscal = value;
    }

    /**
     * Gets the value of the codbeneficio property.
     * 
     */
    public int getCODBENEFICIO() {
        return codbeneficio;
    }

    /**
     * Sets the value of the codbeneficio property.
     * 
     */
    public void setCODBENEFICIO(int value) {
        this.codbeneficio = value;
    }

}
