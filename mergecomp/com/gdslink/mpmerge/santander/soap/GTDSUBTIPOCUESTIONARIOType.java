
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GTD_SUBTIPO_CUESTIONARIO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GTD_SUBTIPO_CUESTIONARIO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GTD_TIPO_CUESTIONARIO" type="{http://www.isban.es/webservices/TDCc}GTD_TIPO_CUESTIONARIO_Type"/>
 *         &lt;element name="COD_SUBTIPO_CUESTIONARIO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GTD_SUBTIPO_CUESTIONARIO_Type", propOrder = {
    "gtdtipocuestionario",
    "codsubtipocuestionario"
})
public class GTDSUBTIPOCUESTIONARIOType {

    @XmlElement(name = "GTD_TIPO_CUESTIONARIO", required = true)
    protected GTDTIPOCUESTIONARIOType gtdtipocuestionario;
    @XmlElement(name = "COD_SUBTIPO_CUESTIONARIO", required = true)
    protected String codsubtipocuestionario;

    /**
     * Gets the value of the gtdtipocuestionario property.
     * 
     * @return
     *     possible object is
     *     {@link GTDTIPOCUESTIONARIOType }
     *     
     */
    public GTDTIPOCUESTIONARIOType getGTDTIPOCUESTIONARIO() {
        return gtdtipocuestionario;
    }

    /**
     * Sets the value of the gtdtipocuestionario property.
     * 
     * @param value
     *     allowed object is
     *     {@link GTDTIPOCUESTIONARIOType }
     *     
     */
    public void setGTDTIPOCUESTIONARIO(GTDTIPOCUESTIONARIOType value) {
        this.gtdtipocuestionario = value;
    }

    /**
     * Gets the value of the codsubtipocuestionario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODSUBTIPOCUESTIONARIO() {
        return codsubtipocuestionario;
    }

    /**
     * Sets the value of the codsubtipocuestionario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODSUBTIPOCUESTIONARIO(String value) {
        this.codsubtipocuestionario = value;
    }

}
