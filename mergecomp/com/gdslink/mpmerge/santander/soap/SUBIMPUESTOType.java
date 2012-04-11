
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SUBIMPUESTO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SUBIMPUESTO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COD_IMPUESTO" type="{http://www.isban.es/webservices/TDCs}CODIGO_DE_IMPUESTO_Type"/>
 *         &lt;element name="COD_SUBIMPUESTO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SUBIMPUESTO_Type", propOrder = {
    "codimpuesto",
    "codsubimpuesto"
})
public class SUBIMPUESTOType {

    @XmlElement(name = "COD_IMPUESTO", required = true)
    protected String codimpuesto;
    @XmlElement(name = "COD_SUBIMPUESTO", required = true)
    protected String codsubimpuesto;

    /**
     * Gets the value of the codimpuesto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIMPUESTO() {
        return codimpuesto;
    }

    /**
     * Sets the value of the codimpuesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIMPUESTO(String value) {
        this.codimpuesto = value;
    }

    /**
     * Gets the value of the codsubimpuesto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODSUBIMPUESTO() {
        return codsubimpuesto;
    }

    /**
     * Sets the value of the codsubimpuesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODSUBIMPUESTO(String value) {
        this.codsubimpuesto = value;
    }

}
