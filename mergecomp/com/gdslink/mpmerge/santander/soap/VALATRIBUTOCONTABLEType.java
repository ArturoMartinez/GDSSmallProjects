
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VAL_ATRIBUTO_CONTABLE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VAL_ATRIBUTO_CONTABLE_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DEN_ATRIBUTO_CONTABLE" type="{http://www.isban.es/webservices/TDCc}DEN_ATRIBUTO_CONTABLE_Type"/>
 *         &lt;element name="VALOR_ATRIBUTO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VAL_ATRIBUTO_CONTABLE_Type", propOrder = {
    "denatributocontable",
    "valoratributo"
})
public class VALATRIBUTOCONTABLEType {

    @XmlElement(name = "DEN_ATRIBUTO_CONTABLE", required = true)
    protected DENATRIBUTOCONTABLEType denatributocontable;
    @XmlElement(name = "VALOR_ATRIBUTO", required = true)
    protected String valoratributo;

    /**
     * Gets the value of the denatributocontable property.
     * 
     * @return
     *     possible object is
     *     {@link DENATRIBUTOCONTABLEType }
     *     
     */
    public DENATRIBUTOCONTABLEType getDENATRIBUTOCONTABLE() {
        return denatributocontable;
    }

    /**
     * Sets the value of the denatributocontable property.
     * 
     * @param value
     *     allowed object is
     *     {@link DENATRIBUTOCONTABLEType }
     *     
     */
    public void setDENATRIBUTOCONTABLE(DENATRIBUTOCONTABLEType value) {
        this.denatributocontable = value;
    }

    /**
     * Gets the value of the valoratributo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALORATRIBUTO() {
        return valoratributo;
    }

    /**
     * Sets the value of the valoratributo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALORATRIBUTO(String value) {
        this.valoratributo = value;
    }

}
