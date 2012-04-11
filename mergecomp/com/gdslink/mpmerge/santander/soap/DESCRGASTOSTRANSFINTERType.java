
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DESCR_GASTOS_TRANSF_INTER_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DESCR_GASTOS_TRANSF_INTER_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INDICADOR_GASTOS" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_1_Type"/>
 *         &lt;element name="INDICADOR_GASTOS_POR_CTA" type="{http://www.isban.es/webservices/TDCs}INDICADOR_GASTOS_POR_CTA_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DESCR_GASTOS_TRANSF_INTER_Type", propOrder = {
    "indicadorgastos",
    "indicadorgastosporcta"
})
public class DESCRGASTOSTRANSFINTERType {

    @XmlElement(name = "INDICADOR_GASTOS", required = true)
    protected String indicadorgastos;
    @XmlElement(name = "INDICADOR_GASTOS_POR_CTA", required = true)
    protected String indicadorgastosporcta;

    /**
     * Gets the value of the indicadorgastos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDICADORGASTOS() {
        return indicadorgastos;
    }

    /**
     * Sets the value of the indicadorgastos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDICADORGASTOS(String value) {
        this.indicadorgastos = value;
    }

    /**
     * Gets the value of the indicadorgastosporcta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDICADORGASTOSPORCTA() {
        return indicadorgastosporcta;
    }

    /**
     * Sets the value of the indicadorgastosporcta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDICADORGASTOSPORCTA(String value) {
        this.indicadorgastosporcta = value;
    }

}
