
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BMG_SUBTIP_RELAC_FINANCIE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BMG_SUBTIP_RELAC_FINANCIE_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BMG_ID_ROL_RELAC_FINANCIE" type="{http://www.isban.es/webservices/TDCs}BMG_ID_ROL_RELAC_FINANCIE_Type"/>
 *         &lt;element name="COD_SUBTIP_RELAC_FINANCIE" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_SIN_ESP_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BMG_SUBTIP_RELAC_FINANCIE_Type", propOrder = {
    "bmgidrolrelacfinancie",
    "codsubtiprelacfinancie"
})
public class BMGSUBTIPRELACFINANCIEType {

    @XmlElement(name = "BMG_ID_ROL_RELAC_FINANCIE", required = true)
    protected String bmgidrolrelacfinancie;
    @XmlElement(name = "COD_SUBTIP_RELAC_FINANCIE", required = true)
    protected String codsubtiprelacfinancie;

    /**
     * Gets the value of the bmgidrolrelacfinancie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBMGIDROLRELACFINANCIE() {
        return bmgidrolrelacfinancie;
    }

    /**
     * Sets the value of the bmgidrolrelacfinancie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBMGIDROLRELACFINANCIE(String value) {
        this.bmgidrolrelacfinancie = value;
    }

    /**
     * Gets the value of the codsubtiprelacfinancie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODSUBTIPRELACFINANCIE() {
        return codsubtiprelacfinancie;
    }

    /**
     * Sets the value of the codsubtiprelacfinancie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODSUBTIPRELACFINANCIE(String value) {
        this.codsubtiprelacfinancie = value;
    }

}
