
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CODIGO_CVC_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CODIGO_CVC_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DENOM_ATRIBUTO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *         &lt;element name="VALOR_ATRIBUTO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CODIGO_CVC_Type", propOrder = {
    "denomatributo",
    "valoratributo"
})
public class CODIGOCVCType {

    @XmlElement(name = "DENOM_ATRIBUTO", required = true)
    protected String denomatributo;
    @XmlElement(name = "VALOR_ATRIBUTO", required = true)
    protected String valoratributo;

    /**
     * Gets the value of the denomatributo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDENOMATRIBUTO() {
        return denomatributo;
    }

    /**
     * Sets the value of the denomatributo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDENOMATRIBUTO(String value) {
        this.denomatributo = value;
    }

    /**
     * Gets the value of the valoratributo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALORATRIBUTO() {
        return valoratributo;
    }

    /**
     * Sets the value of the valoratributo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALORATRIBUTO(String value) {
        this.valoratributo = value;
    }

}
