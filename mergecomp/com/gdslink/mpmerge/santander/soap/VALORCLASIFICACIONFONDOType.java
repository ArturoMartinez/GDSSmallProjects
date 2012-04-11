
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VALOR_CLASIFICACION_FONDO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VALOR_CLASIFICACION_FONDO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IND_CLASIFICACION_FONDO" type="{http://www.isban.es/webservices/TDCc}IND_CLASIFICACION_FONDO_Type"/>
 *         &lt;element name="COD_VALOR_INDICADOR" type="{http://www.isban.es/webservices/TDCs}COD_ALFAJUSTI_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VALOR_CLASIFICACION_FONDO_Type", propOrder = {
    "indclasificacionfondo",
    "codvalorindicador"
})
public class VALORCLASIFICACIONFONDOType {

    @XmlElement(name = "IND_CLASIFICACION_FONDO", required = true)
    protected INDCLASIFICACIONFONDOType indclasificacionfondo;
    @XmlElement(name = "COD_VALOR_INDICADOR", required = true)
    protected String codvalorindicador;

    /**
     * Gets the value of the indclasificacionfondo property.
     * 
     * @return
     *     possible object is
     *     {@link INDCLASIFICACIONFONDOType }
     *     
     */
    public INDCLASIFICACIONFONDOType getINDCLASIFICACIONFONDO() {
        return indclasificacionfondo;
    }

    /**
     * Sets the value of the indclasificacionfondo property.
     * 
     * @param value
     *     allowed object is
     *     {@link INDCLASIFICACIONFONDOType }
     *     
     */
    public void setINDCLASIFICACIONFONDO(INDCLASIFICACIONFONDOType value) {
        this.indclasificacionfondo = value;
    }

    /**
     * Gets the value of the codvalorindicador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODVALORINDICADOR() {
        return codvalorindicador;
    }

    /**
     * Sets the value of the codvalorindicador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODVALORINDICADOR(String value) {
        this.codvalorindicador = value;
    }

}
