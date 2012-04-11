
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for INTERACCION_CIC_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INTERACCION_CIC_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CENTRO_DE_INTERACCION" type="{http://www.isban.es/webservices/TDCc}CENTRO_Type"/>
 *         &lt;element name="NRO_DE_INTERACCI0N_CIC" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_16_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INTERACCION_CIC_Type", propOrder = {
    "centrodeinteraccion",
    "nrodeinteracci0NCIC"
})
public class INTERACCIONCICType {

    @XmlElement(name = "CENTRO_DE_INTERACCION", required = true)
    protected CENTROType centrodeinteraccion;
    @XmlElement(name = "NRO_DE_INTERACCI0N_CIC", required = true)
    protected String nrodeinteracci0NCIC;

    /**
     * Gets the value of the centrodeinteraccion property.
     * 
     * @return
     *     possible object is
     *     {@link CENTROType }
     *     
     */
    public CENTROType getCENTRODEINTERACCION() {
        return centrodeinteraccion;
    }

    /**
     * Sets the value of the centrodeinteraccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link CENTROType }
     *     
     */
    public void setCENTRODEINTERACCION(CENTROType value) {
        this.centrodeinteraccion = value;
    }

    /**
     * Gets the value of the nrodeinteracci0NCIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRODEINTERACCI0NCIC() {
        return nrodeinteracci0NCIC;
    }

    /**
     * Sets the value of the nrodeinteracci0NCIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRODEINTERACCI0NCIC(String value) {
        this.nrodeinteracci0NCIC = value;
    }

}
