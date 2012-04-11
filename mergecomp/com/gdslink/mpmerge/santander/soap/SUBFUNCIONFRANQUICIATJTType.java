
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SUBFUNCION_FRANQUICIA_TJT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SUBFUNCION_FRANQUICIA_TJT_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODFUNCION_FRANQUICIA_TJT" type="{http://www.isban.es/webservices/TDCc}CODFUNCION_FRANQUICIA_TJT_Type"/>
 *         &lt;element name="CODSUBFUNCION_FRQ_TJT" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_1_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SUBFUNCION_FRANQUICIA_TJT_Type", propOrder = {
    "codfuncionfranquiciatjt",
    "codsubfuncionfrqtjt"
})
public class SUBFUNCIONFRANQUICIATJTType {

    @XmlElement(name = "CODFUNCION_FRANQUICIA_TJT", required = true)
    protected CODFUNCIONFRANQUICIATJTType codfuncionfranquiciatjt;
    @XmlElement(name = "CODSUBFUNCION_FRQ_TJT", required = true)
    protected String codsubfuncionfrqtjt;

    /**
     * Gets the value of the codfuncionfranquiciatjt property.
     * 
     * @return
     *     possible object is
     *     {@link CODFUNCIONFRANQUICIATJTType }
     *     
     */
    public CODFUNCIONFRANQUICIATJTType getCODFUNCIONFRANQUICIATJT() {
        return codfuncionfranquiciatjt;
    }

    /**
     * Sets the value of the codfuncionfranquiciatjt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODFUNCIONFRANQUICIATJTType }
     *     
     */
    public void setCODFUNCIONFRANQUICIATJT(CODFUNCIONFRANQUICIATJTType value) {
        this.codfuncionfranquiciatjt = value;
    }

    /**
     * Gets the value of the codsubfuncionfrqtjt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODSUBFUNCIONFRQTJT() {
        return codsubfuncionfrqtjt;
    }

    /**
     * Sets the value of the codsubfuncionfrqtjt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODSUBFUNCIONFRQTJT(String value) {
        this.codsubfuncionfrqtjt = value;
    }

}
