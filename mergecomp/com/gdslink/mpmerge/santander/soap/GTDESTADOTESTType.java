
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GTD_ESTADO_TEST_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GTD_ESTADO_TEST_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GTD_TIPO_CUESTIONARIO" type="{http://www.isban.es/webservices/TDCc}GTD_TIPO_CUESTIONARIO_Type"/>
 *         &lt;element name="COD_ESTADO_TEST" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GTD_ESTADO_TEST_Type", propOrder = {
    "gtdtipocuestionario",
    "codestadotest"
})
public class GTDESTADOTESTType {

    @XmlElement(name = "GTD_TIPO_CUESTIONARIO", required = true)
    protected GTDTIPOCUESTIONARIOType gtdtipocuestionario;
    @XmlElement(name = "COD_ESTADO_TEST", required = true)
    protected String codestadotest;

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
     * Gets the value of the codestadotest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODESTADOTEST() {
        return codestadotest;
    }

    /**
     * Sets the value of the codestadotest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODESTADOTEST(String value) {
        this.codestadotest = value;
    }

}
