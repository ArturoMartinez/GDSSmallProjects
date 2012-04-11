
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CONTRATO_PROPUESTA_PCC_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CONTRATO_PROPUESTA_PCC_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PROPUESTA_DE_RIESGO" type="{http://www.isban.es/webservices/TDCc}PROPUESTA_DE_RIESGO_Type"/>
 *         &lt;element name="CESTA" type="{http://www.isban.es/webservices/TDCc}CESTA_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONTRATO_PROPUESTA_PCC_Type", propOrder = {
    "propuestaderiesgo",
    "cesta"
})
public class CONTRATOPROPUESTAPCCType {

    @XmlElement(name = "PROPUESTA_DE_RIESGO", required = true)
    protected PROPUESTADERIESGOType propuestaderiesgo;
    @XmlElement(name = "CESTA", required = true)
    protected CESTAType cesta;

    /**
     * Gets the value of the propuestaderiesgo property.
     * 
     * @return
     *     possible object is
     *     {@link PROPUESTADERIESGOType }
     *     
     */
    public PROPUESTADERIESGOType getPROPUESTADERIESGO() {
        return propuestaderiesgo;
    }

    /**
     * Sets the value of the propuestaderiesgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPUESTADERIESGOType }
     *     
     */
    public void setPROPUESTADERIESGO(PROPUESTADERIESGOType value) {
        this.propuestaderiesgo = value;
    }

    /**
     * Gets the value of the cesta property.
     * 
     * @return
     *     possible object is
     *     {@link CESTAType }
     *     
     */
    public CESTAType getCESTA() {
        return cesta;
    }

    /**
     * Sets the value of the cesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link CESTAType }
     *     
     */
    public void setCESTA(CESTAType value) {
        this.cesta = value;
    }

}
