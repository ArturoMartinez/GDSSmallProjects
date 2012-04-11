
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for METODO_CONSOLIDAC_FINAN_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="METODO_CONSOLIDAC_FINAN_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENTORNO_CONSOLIDAC_FINAN" type="{http://www.isban.es/webservices/TDCc}ENTORNO_CONSOLIDAC_FINAN_Type"/>
 *         &lt;element name="COD_ALFANUM_2" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "METODO_CONSOLIDAC_FINAN_Type", propOrder = {
    "entornoconsolidacfinan",
    "codalfanum2"
})
public class METODOCONSOLIDACFINANType {

    @XmlElement(name = "ENTORNO_CONSOLIDAC_FINAN", required = true)
    protected ENTORNOCONSOLIDACFINANType entornoconsolidacfinan;
    @XmlElement(name = "COD_ALFANUM_2", required = true)
    protected String codalfanum2;

    /**
     * Gets the value of the entornoconsolidacfinan property.
     * 
     * @return
     *     possible object is
     *     {@link ENTORNOCONSOLIDACFINANType }
     *     
     */
    public ENTORNOCONSOLIDACFINANType getENTORNOCONSOLIDACFINAN() {
        return entornoconsolidacfinan;
    }

    /**
     * Sets the value of the entornoconsolidacfinan property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENTORNOCONSOLIDACFINANType }
     *     
     */
    public void setENTORNOCONSOLIDACFINAN(ENTORNOCONSOLIDACFINANType value) {
        this.entornoconsolidacfinan = value;
    }

    /**
     * Gets the value of the codalfanum2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODALFANUM2() {
        return codalfanum2;
    }

    /**
     * Sets the value of the codalfanum2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODALFANUM2(String value) {
        this.codalfanum2 = value;
    }

}
