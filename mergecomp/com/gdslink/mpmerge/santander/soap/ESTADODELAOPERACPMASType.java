
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ESTADO_DE_LA_OPERAC_PMAS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ESTADO_DE_LA_OPERAC_PMAS_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CLASE_DE_OPERACION_PMAS" type="{http://www.isban.es/webservices/TDCs}CLASE_DE_OPERACION_PMAS_Type"/>
 *         &lt;element name="CODESTD" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ESTADO_DE_LA_OPERAC_PMAS_Type", propOrder = {
    "clasedeoperacionpmas",
    "codestd"
})
public class ESTADODELAOPERACPMASType {

    @XmlElement(name = "CLASE_DE_OPERACION_PMAS", required = true)
    protected String clasedeoperacionpmas;
    @XmlElement(name = "CODESTD", required = true)
    protected String codestd;

    /**
     * Gets the value of the clasedeoperacionpmas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASEDEOPERACIONPMAS() {
        return clasedeoperacionpmas;
    }

    /**
     * Sets the value of the clasedeoperacionpmas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASEDEOPERACIONPMAS(String value) {
        this.clasedeoperacionpmas = value;
    }

    /**
     * Gets the value of the codestd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODESTD() {
        return codestd;
    }

    /**
     * Sets the value of the codestd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODESTD(String value) {
        this.codestd = value;
    }

}
