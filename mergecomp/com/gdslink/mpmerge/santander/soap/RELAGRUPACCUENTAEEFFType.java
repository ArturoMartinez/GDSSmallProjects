
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for REL_AGRUPAC_CUENTA_EEFF_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REL_AGRUPAC_CUENTA_EEFF_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PLAN_CONTABLE_EEFF" type="{http://www.isban.es/webservices/TDCc}PLAN_CONTABLE_EEFF_Type"/>
 *         &lt;element name="COD_MODELO_EEFF" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *         &lt;element name="COD_AGRUPACION_EEFF" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_6_Type"/>
 *         &lt;element name="COD_CUENTA_EEFF" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_6_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REL_AGRUPAC_CUENTA_EEFF_Type", propOrder = {
    "plancontableeeff",
    "codmodeloeeff",
    "codagrupacioneeff",
    "codcuentaeeff"
})
public class RELAGRUPACCUENTAEEFFType {

    @XmlElement(name = "PLAN_CONTABLE_EEFF", required = true)
    protected PLANCONTABLEEEFFType plancontableeeff;
    @XmlElement(name = "COD_MODELO_EEFF", required = true)
    protected String codmodeloeeff;
    @XmlElement(name = "COD_AGRUPACION_EEFF", required = true)
    protected String codagrupacioneeff;
    @XmlElement(name = "COD_CUENTA_EEFF", required = true)
    protected String codcuentaeeff;

    /**
     * Gets the value of the plancontableeeff property.
     * 
     * @return
     *     possible object is
     *     {@link PLANCONTABLEEEFFType }
     *     
     */
    public PLANCONTABLEEEFFType getPLANCONTABLEEEFF() {
        return plancontableeeff;
    }

    /**
     * Sets the value of the plancontableeeff property.
     * 
     * @param value
     *     allowed object is
     *     {@link PLANCONTABLEEEFFType }
     *     
     */
    public void setPLANCONTABLEEEFF(PLANCONTABLEEEFFType value) {
        this.plancontableeeff = value;
    }

    /**
     * Gets the value of the codmodeloeeff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODMODELOEEFF() {
        return codmodeloeeff;
    }

    /**
     * Sets the value of the codmodeloeeff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODMODELOEEFF(String value) {
        this.codmodeloeeff = value;
    }

    /**
     * Gets the value of the codagrupacioneeff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODAGRUPACIONEEFF() {
        return codagrupacioneeff;
    }

    /**
     * Sets the value of the codagrupacioneeff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODAGRUPACIONEEFF(String value) {
        this.codagrupacioneeff = value;
    }

    /**
     * Gets the value of the codcuentaeeff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODCUENTAEEFF() {
        return codcuentaeeff;
    }

    /**
     * Sets the value of the codcuentaeeff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODCUENTAEEFF(String value) {
        this.codcuentaeeff = value;
    }

}
