
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GTD_MODELO_CUESTIONARIO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GTD_MODELO_CUESTIONARIO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GTD_SUBTIPO_CUESTIONARIO" type="{http://www.isban.es/webservices/TDCc}GTD_SUBTIPO_CUESTIONARIO_Type"/>
 *         &lt;element name="COD_CUESTIONARIO" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_5_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GTD_MODELO_CUESTIONARIO_Type", propOrder = {
    "gtdsubtipocuestionario",
    "codcuestionario"
})
public class GTDMODELOCUESTIONARIOType {

    @XmlElement(name = "GTD_SUBTIPO_CUESTIONARIO", required = true)
    protected GTDSUBTIPOCUESTIONARIOType gtdsubtipocuestionario;
    @XmlElement(name = "COD_CUESTIONARIO", required = true)
    protected String codcuestionario;

    /**
     * Gets the value of the gtdsubtipocuestionario property.
     * 
     * @return
     *     possible object is
     *     {@link GTDSUBTIPOCUESTIONARIOType }
     *     
     */
    public GTDSUBTIPOCUESTIONARIOType getGTDSUBTIPOCUESTIONARIO() {
        return gtdsubtipocuestionario;
    }

    /**
     * Sets the value of the gtdsubtipocuestionario property.
     * 
     * @param value
     *     allowed object is
     *     {@link GTDSUBTIPOCUESTIONARIOType }
     *     
     */
    public void setGTDSUBTIPOCUESTIONARIO(GTDSUBTIPOCUESTIONARIOType value) {
        this.gtdsubtipocuestionario = value;
    }

    /**
     * Gets the value of the codcuestionario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODCUESTIONARIO() {
        return codcuestionario;
    }

    /**
     * Sets the value of the codcuestionario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODCUESTIONARIO(String value) {
        this.codcuestionario = value;
    }

}
