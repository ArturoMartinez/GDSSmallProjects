
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LINEA_NEGOCIO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LINEA_NEGOCIO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="METODO_COMERCIAL" type="{http://www.isban.es/webservices/TDCc}METODO_COMERCIAL_Type"/>
 *         &lt;element name="COD_LINEA_NEGOCIO" type="{http://www.isban.es/webservices/TDCs}COD_LINEA_NEGOCIO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LINEA_NEGOCIO_Type", propOrder = {
    "metodocomercial",
    "codlineanegocio"
})
public class LINEANEGOCIOType {

    @XmlElement(name = "METODO_COMERCIAL", required = true)
    protected METODOCOMERCIALType metodocomercial;
    @XmlElement(name = "COD_LINEA_NEGOCIO", required = true)
    protected String codlineanegocio;

    /**
     * Gets the value of the metodocomercial property.
     * 
     * @return
     *     possible object is
     *     {@link METODOCOMERCIALType }
     *     
     */
    public METODOCOMERCIALType getMETODOCOMERCIAL() {
        return metodocomercial;
    }

    /**
     * Sets the value of the metodocomercial property.
     * 
     * @param value
     *     allowed object is
     *     {@link METODOCOMERCIALType }
     *     
     */
    public void setMETODOCOMERCIAL(METODOCOMERCIALType value) {
        this.metodocomercial = value;
    }

    /**
     * Gets the value of the codlineanegocio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODLINEANEGOCIO() {
        return codlineanegocio;
    }

    /**
     * Sets the value of the codlineanegocio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODLINEANEGOCIO(String value) {
        this.codlineanegocio = value;
    }

}
