
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CONCEPTO_MULTIIDIOMA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CONCEPTO_MULTIIDIOMA_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODIGO_TIPO_DE_DATO" type="{http://www.isban.es/webservices/TDCs}CODIGO_TIPO_DE_DATO_Type"/>
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
@XmlType(name = "CONCEPTO_MULTIIDIOMA_Type", propOrder = {
    "codigotipodedato",
    "codalfanum3"
})
public class CONCEPTOMULTIIDIOMAType {

    @XmlElement(name = "CODIGO_TIPO_DE_DATO", required = true)
    protected String codigotipodedato;
    @XmlElement(name = "COD_ALFANUM_3", required = true)
    protected String codalfanum3;

    /**
     * Gets the value of the codigotipodedato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOTIPODEDATO() {
        return codigotipodedato;
    }

    /**
     * Sets the value of the codigotipodedato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOTIPODEDATO(String value) {
        this.codigotipodedato = value;
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
