
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CIUDAD_EEUU_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CIUDAD_EEUU_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COD_ESTADO_EEUU" type="{http://www.isban.es/webservices/TDCs}COD_ESTADO_EEUU_Type"/>
 *         &lt;element name="CODIGO_CONDADO" type="{http://www.isban.es/webservices/TDCs}CODIGO_CONDADO_Type"/>
 *         &lt;element name="COD_CIUDAD_USA" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_6_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CIUDAD_EEUU_Type", propOrder = {
    "codestadoeeuu",
    "codigocondado",
    "codciudadusa"
})
public class CIUDADEEUUType {

    @XmlElement(name = "COD_ESTADO_EEUU", required = true)
    protected String codestadoeeuu;
    @XmlElement(name = "CODIGO_CONDADO")
    protected int codigocondado;
    @XmlElement(name = "COD_CIUDAD_USA", required = true)
    protected String codciudadusa;

    /**
     * Gets the value of the codestadoeeuu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODESTADOEEUU() {
        return codestadoeeuu;
    }

    /**
     * Sets the value of the codestadoeeuu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODESTADOEEUU(String value) {
        this.codestadoeeuu = value;
    }

    /**
     * Gets the value of the codigocondado property.
     * 
     */
    public int getCODIGOCONDADO() {
        return codigocondado;
    }

    /**
     * Sets the value of the codigocondado property.
     * 
     */
    public void setCODIGOCONDADO(int value) {
        this.codigocondado = value;
    }

    /**
     * Gets the value of the codciudadusa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODCIUDADUSA() {
        return codciudadusa;
    }

    /**
     * Sets the value of the codciudadusa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODCIUDADUSA(String value) {
        this.codciudadusa = value;
    }

}
