
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COB_BENEF_SEGUROS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COB_BENEF_SEGUROS_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CAMPO" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_8_Type"/>
 *         &lt;element name="VALOR_CAMPO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COB_BENEF_SEGUROS_Type", propOrder = {
    "campo",
    "valorcampo"
})
public class COBBENEFSEGUROSType {

    @XmlElement(name = "CAMPO", required = true)
    protected String campo;
    @XmlElement(name = "VALOR_CAMPO", required = true)
    protected String valorcampo;

    /**
     * Gets the value of the campo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAMPO() {
        return campo;
    }

    /**
     * Sets the value of the campo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAMPO(String value) {
        this.campo = value;
    }

    /**
     * Gets the value of the valorcampo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALORCAMPO() {
        return valorcampo;
    }

    /**
     * Sets the value of the valorcampo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALORCAMPO(String value) {
        this.valorcampo = value;
    }

}
