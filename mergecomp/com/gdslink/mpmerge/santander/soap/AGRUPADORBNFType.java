
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AGRUPADOR_BNF_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AGRUPADOR_BNF_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CENTRO" type="{http://www.isban.es/webservices/TDCc}CENTRO_Type"/>
 *         &lt;element name="COD_AGRUPADOR" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_7_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AGRUPADOR_BNF_Type", propOrder = {
    "centro",
    "codagrupador"
})
public class AGRUPADORBNFType {

    @XmlElement(name = "CENTRO", required = true)
    protected CENTROType centro;
    @XmlElement(name = "COD_AGRUPADOR", required = true)
    protected String codagrupador;

    /**
     * Gets the value of the centro property.
     * 
     * @return
     *     possible object is
     *     {@link CENTROType }
     *     
     */
    public CENTROType getCENTRO() {
        return centro;
    }

    /**
     * Sets the value of the centro property.
     * 
     * @param value
     *     allowed object is
     *     {@link CENTROType }
     *     
     */
    public void setCENTRO(CENTROType value) {
        this.centro = value;
    }

    /**
     * Gets the value of the codagrupador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODAGRUPADOR() {
        return codagrupador;
    }

    /**
     * Sets the value of the codagrupador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODAGRUPADOR(String value) {
        this.codagrupador = value;
    }

}
