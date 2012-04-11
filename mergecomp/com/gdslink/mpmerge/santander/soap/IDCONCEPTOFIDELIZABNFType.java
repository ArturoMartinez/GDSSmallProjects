
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ID_CONCEPTO_FIDELIZA_BNF_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ID_CONCEPTO_FIDELIZA_BNF_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="COD_PARAM_FIDELIZA" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_2_Type"/>
 *         &lt;element name="COD_SUBPARAM_FIDELIZA" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ID_CONCEPTO_FIDELIZA_BNF_Type", propOrder = {
    "empresa",
    "codparamfideliza",
    "codsubparamfideliza"
})
public class IDCONCEPTOFIDELIZABNFType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "COD_PARAM_FIDELIZA")
    protected int codparamfideliza;
    @XmlElement(name = "COD_SUBPARAM_FIDELIZA")
    protected int codsubparamfideliza;

    /**
     * Gets the value of the empresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPRESA() {
        return empresa;
    }

    /**
     * Sets the value of the empresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPRESA(String value) {
        this.empresa = value;
    }

    /**
     * Gets the value of the codparamfideliza property.
     * 
     */
    public int getCODPARAMFIDELIZA() {
        return codparamfideliza;
    }

    /**
     * Sets the value of the codparamfideliza property.
     * 
     */
    public void setCODPARAMFIDELIZA(int value) {
        this.codparamfideliza = value;
    }

    /**
     * Gets the value of the codsubparamfideliza property.
     * 
     */
    public int getCODSUBPARAMFIDELIZA() {
        return codsubparamfideliza;
    }

    /**
     * Sets the value of the codsubparamfideliza property.
     * 
     */
    public void setCODSUBPARAMFIDELIZA(int value) {
        this.codsubparamfideliza = value;
    }

}
