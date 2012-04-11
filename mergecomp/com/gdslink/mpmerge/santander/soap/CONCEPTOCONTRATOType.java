
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CONCEPTO_CONTRATO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CONCEPTO_CONTRATO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SIT_CONCEPTO_CONTRAT" type="{http://www.isban.es/webservices/TDCc}SIT_CONCEPTO_CONTRATO_Type"/>
 *         &lt;element name="TIP_MOROSIDAD" type="{http://www.isban.es/webservices/TDCs}TIPO_MOROSIDAD_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONCEPTO_CONTRATO_Type", propOrder = {
    "sitconceptocontrat",
    "tipmorosidad"
})
public class CONCEPTOCONTRATOType {

    @XmlElement(name = "SIT_CONCEPTO_CONTRAT", required = true)
    protected SITCONCEPTOCONTRATOType sitconceptocontrat;
    @XmlElement(name = "TIP_MOROSIDAD", required = true)
    protected String tipmorosidad;

    /**
     * Gets the value of the sitconceptocontrat property.
     * 
     * @return
     *     possible object is
     *     {@link SITCONCEPTOCONTRATOType }
     *     
     */
    public SITCONCEPTOCONTRATOType getSITCONCEPTOCONTRAT() {
        return sitconceptocontrat;
    }

    /**
     * Sets the value of the sitconceptocontrat property.
     * 
     * @param value
     *     allowed object is
     *     {@link SITCONCEPTOCONTRATOType }
     *     
     */
    public void setSITCONCEPTOCONTRAT(SITCONCEPTOCONTRATOType value) {
        this.sitconceptocontrat = value;
    }

    /**
     * Gets the value of the tipmorosidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPMOROSIDAD() {
        return tipmorosidad;
    }

    /**
     * Sets the value of the tipmorosidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPMOROSIDAD(String value) {
        this.tipmorosidad = value;
    }

}
