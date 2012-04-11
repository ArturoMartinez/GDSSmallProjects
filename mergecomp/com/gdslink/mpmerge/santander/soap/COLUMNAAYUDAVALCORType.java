
package com.gdslink.mpmerge.santander.soap;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for COLUMNA_AYUDA_VALCOR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLUMNA_AYUDA_VALCOR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="AREA_VALCOR" type="{http://www.isban.es/webservices/TDCs}AREA_VALCOR_Type"/>
 *         &lt;element name="VALOR_MIN_VALCOR" type="{http://www.isban.es/webservices/TDCs}NUMERO_DECIMAL_CORTO_Type"/>
 *         &lt;element name="FECHA_INI_AYUDA" type="{http://www.isban.es/webservices/TDCs}FECHA_AAAAMMDD_GUION_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COLUMNA_AYUDA_VALCOR_Type", propOrder = {
    "empresa",
    "areavalcor",
    "valorminvalcor",
    "fechainiayuda"
})
public class COLUMNAAYUDAVALCORType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "AREA_VALCOR", required = true)
    protected String areavalcor;
    @XmlElement(name = "VALOR_MIN_VALCOR", required = true)
    protected BigDecimal valorminvalcor;
    @XmlElement(name = "FECHA_INI_AYUDA", required = true)
    protected XMLGregorianCalendar fechainiayuda;

    /**
     * Gets the value of the empresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPRESA() {
        return empresa;
    }

    /**
     * Sets the value of the empresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPRESA(String value) {
        this.empresa = value;
    }

    /**
     * Gets the value of the areavalcor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAREAVALCOR() {
        return areavalcor;
    }

    /**
     * Sets the value of the areavalcor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAREAVALCOR(String value) {
        this.areavalcor = value;
    }

    /**
     * Gets the value of the valorminvalcor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVALORMINVALCOR() {
        return valorminvalcor;
    }

    /**
     * Sets the value of the valorminvalcor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVALORMINVALCOR(BigDecimal value) {
        this.valorminvalcor = value;
    }

    /**
     * Gets the value of the fechainiayuda property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFECHAINIAYUDA() {
        return fechainiayuda;
    }

    /**
     * Sets the value of the fechainiayuda property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFECHAINIAYUDA(XMLGregorianCalendar value) {
        this.fechainiayuda = value;
    }

}
