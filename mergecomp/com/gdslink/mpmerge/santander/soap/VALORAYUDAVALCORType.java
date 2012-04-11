
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VALOR_AYUDA_VALCOR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VALOR_AYUDA_VALCOR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COLUMNA_AYUDA_VALCOR" type="{http://www.isban.es/webservices/TDCc}COLUMNA_AYUDA_VALCOR_Type"/>
 *         &lt;element name="ID_AYUDA_VALCOR" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VALOR_AYUDA_VALCOR_Type", propOrder = {
    "columnaayudavalcor",
    "idayudavalcor"
})
public class VALORAYUDAVALCORType {

    @XmlElement(name = "COLUMNA_AYUDA_VALCOR", required = true)
    protected COLUMNAAYUDAVALCORType columnaayudavalcor;
    @XmlElement(name = "ID_AYUDA_VALCOR", required = true)
    protected String idayudavalcor;

    /**
     * Gets the value of the columnaayudavalcor property.
     * 
     * @return
     *     possible object is
     *     {@link COLUMNAAYUDAVALCORType }
     *     
     */
    public COLUMNAAYUDAVALCORType getCOLUMNAAYUDAVALCOR() {
        return columnaayudavalcor;
    }

    /**
     * Sets the value of the columnaayudavalcor property.
     * 
     * @param value
     *     allowed object is
     *     {@link COLUMNAAYUDAVALCORType }
     *     
     */
    public void setCOLUMNAAYUDAVALCOR(COLUMNAAYUDAVALCORType value) {
        this.columnaayudavalcor = value;
    }

    /**
     * Gets the value of the idayudavalcor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDAYUDAVALCOR() {
        return idayudavalcor;
    }

    /**
     * Sets the value of the idayudavalcor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDAYUDAVALCOR(String value) {
        this.idayudavalcor = value;
    }

}
