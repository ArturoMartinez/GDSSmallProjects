
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TELEFONO_INTER_REGULADO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TELEFONO_INTER_REGULADO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PREFIJO_INTERNACIONAL" type="{http://www.isban.es/webservices/TDCs}PREFIJO_INTERNACIONAL_REG_Type"/>
 *         &lt;element name="PREFIJO_NACIONAL" type="{http://www.isban.es/webservices/TDCs}PREFIJO_NACIONAL_REG_Type"/>
 *         &lt;element name="NUMERO_ABONADO" type="{http://www.isban.es/webservices/TDCs}NUMERO_ABONADO_REG_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TELEFONO_INTER_REGULADO_Type", propOrder = {
    "prefijointernacional",
    "prefijonacional",
    "numeroabonado"
})
public class TELEFONOINTERREGULADOType {

    @XmlElement(name = "PREFIJO_INTERNACIONAL", required = true)
    protected String prefijointernacional;
    @XmlElement(name = "PREFIJO_NACIONAL", required = true)
    protected String prefijonacional;
    @XmlElement(name = "NUMERO_ABONADO", required = true)
    protected String numeroabonado;

    /**
     * Gets the value of the prefijointernacional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPREFIJOINTERNACIONAL() {
        return prefijointernacional;
    }

    /**
     * Sets the value of the prefijointernacional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPREFIJOINTERNACIONAL(String value) {
        this.prefijointernacional = value;
    }

    /**
     * Gets the value of the prefijonacional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPREFIJONACIONAL() {
        return prefijonacional;
    }

    /**
     * Sets the value of the prefijonacional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPREFIJONACIONAL(String value) {
        this.prefijonacional = value;
    }

    /**
     * Gets the value of the numeroabonado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROABONADO() {
        return numeroabonado;
    }

    /**
     * Sets the value of the numeroabonado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROABONADO(String value) {
        this.numeroabonado = value;
    }

}
