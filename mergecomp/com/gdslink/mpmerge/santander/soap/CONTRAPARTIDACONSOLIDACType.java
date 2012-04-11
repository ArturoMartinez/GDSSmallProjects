
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CONTRAPARTIDA_CONSOLIDAC_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CONTRAPARTIDA_CONSOLIDAC_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA_ALFANUM_3" type="{http://www.isban.es/webservices/TDCc}ENTORNO_CONSOLIDAC_FINAN_Type"/>
 *         &lt;element name="COD_ALFANUM_3" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONTRAPARTIDA_CONSOLIDAC_Type", propOrder = {
    "empresaalfanum3",
    "codalfanum3"
})
public class CONTRAPARTIDACONSOLIDACType {

    @XmlElement(name = "EMPRESA_ALFANUM_3", required = true)
    protected ENTORNOCONSOLIDACFINANType empresaalfanum3;
    @XmlElement(name = "COD_ALFANUM_3", required = true)
    protected String codalfanum3;

    /**
     * Gets the value of the empresaalfanum3 property.
     * 
     * @return
     *     possible object is
     *     {@link ENTORNOCONSOLIDACFINANType }
     *     
     */
    public ENTORNOCONSOLIDACFINANType getEMPRESAALFANUM3() {
        return empresaalfanum3;
    }

    /**
     * Sets the value of the empresaalfanum3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENTORNOCONSOLIDACFINANType }
     *     
     */
    public void setEMPRESAALFANUM3(ENTORNOCONSOLIDACFINANType value) {
        this.empresaalfanum3 = value;
    }

    /**
     * Gets the value of the codalfanum3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODALFANUM3() {
        return codalfanum3;
    }

    /**
     * Sets the value of the codalfanum3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODALFANUM3(String value) {
        this.codalfanum3 = value;
    }

}
