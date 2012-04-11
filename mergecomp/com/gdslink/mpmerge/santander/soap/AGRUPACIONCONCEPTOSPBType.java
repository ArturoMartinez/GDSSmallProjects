
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AGRUPACION_CONCEPTOS_PB_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AGRUPACION_CONCEPTOS_PB_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BLOQUE_CONCEPTOS_PB" type="{http://www.isban.es/webservices/TDCc}BLOQUE_CONCEPTOS_PB_Type"/>
 *         &lt;element name="COD_AGRUPACION_CONCEPTOS" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AGRUPACION_CONCEPTOS_PB_Type", propOrder = {
    "bloqueconceptospb",
    "codagrupacionconceptos"
})
public class AGRUPACIONCONCEPTOSPBType {

    @XmlElement(name = "BLOQUE_CONCEPTOS_PB", required = true)
    protected BLOQUECONCEPTOSPBType bloqueconceptospb;
    @XmlElement(name = "COD_AGRUPACION_CONCEPTOS", required = true)
    protected String codagrupacionconceptos;

    /**
     * Gets the value of the bloqueconceptospb property.
     * 
     * @return
     *     possible object is
     *     {@link BLOQUECONCEPTOSPBType }
     *     
     */
    public BLOQUECONCEPTOSPBType getBLOQUECONCEPTOSPB() {
        return bloqueconceptospb;
    }

    /**
     * Sets the value of the bloqueconceptospb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BLOQUECONCEPTOSPBType }
     *     
     */
    public void setBLOQUECONCEPTOSPB(BLOQUECONCEPTOSPBType value) {
        this.bloqueconceptospb = value;
    }

    /**
     * Gets the value of the codagrupacionconceptos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODAGRUPACIONCONCEPTOS() {
        return codagrupacionconceptos;
    }

    /**
     * Sets the value of the codagrupacionconceptos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODAGRUPACIONCONCEPTOS(String value) {
        this.codagrupacionconceptos = value;
    }

}
