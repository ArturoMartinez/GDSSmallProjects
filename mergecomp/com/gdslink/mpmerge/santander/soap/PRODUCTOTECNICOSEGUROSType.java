
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PRODUCTO_TECNICO_SEGUROS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PRODUCTO_TECNICO_SEGUROS_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COD_COMPANIA_SEG" type="{http://www.isban.es/webservices/TDCs}COMPANIA_DE_SEGUROS_Type"/>
 *         &lt;element name="COD_PRODUCTO_TECNICO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRODUCTO_TECNICO_SEGUROS_Type", propOrder = {
    "codcompaniaseg",
    "codproductotecnico"
})
public class PRODUCTOTECNICOSEGUROSType {

    @XmlElement(name = "COD_COMPANIA_SEG", required = true)
    protected String codcompaniaseg;
    @XmlElement(name = "COD_PRODUCTO_TECNICO", required = true)
    protected String codproductotecnico;

    /**
     * Gets the value of the codcompaniaseg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODCOMPANIASEG() {
        return codcompaniaseg;
    }

    /**
     * Sets the value of the codcompaniaseg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODCOMPANIASEG(String value) {
        this.codcompaniaseg = value;
    }

    /**
     * Gets the value of the codproductotecnico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODPRODUCTOTECNICO() {
        return codproductotecnico;
    }

    /**
     * Sets the value of the codproductotecnico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODPRODUCTOTECNICO(String value) {
        this.codproductotecnico = value;
    }

}
