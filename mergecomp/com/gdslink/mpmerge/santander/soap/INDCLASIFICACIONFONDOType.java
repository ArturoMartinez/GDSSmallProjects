
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IND_CLASIFICACION_FONDO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IND_CLASIFICACION_FONDO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COD_ALFANUM2" type="{http://www.isban.es/webservices/TDCs}TIPO_CLASIFICACION_FONDO_Type"/>
 *         &lt;element name="COD_ALFANUM3" type="{http://www.isban.es/webservices/TDCs}COD_ALFAJUSTI_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IND_CLASIFICACION_FONDO_Type", propOrder = {
    "codalfanum2",
    "codalfanum3"
})
public class INDCLASIFICACIONFONDOType {

    @XmlElement(name = "COD_ALFANUM2", required = true)
    protected String codalfanum2;
    @XmlElement(name = "COD_ALFANUM3", required = true)
    protected String codalfanum3;

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
