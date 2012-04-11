
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RESULTADO_GESTION_NIVEL1_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RESULTADO_GESTION_NIVEL1_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="CANAL" type="{http://www.isban.es/webservices/TDCs}CODIGO_DE_CANAL_Type"/>
 *         &lt;element name="COD_RESULTADO_GESTION" type="{http://www.isban.es/webservices/TDCs}COD_RESULTADO_GESTION_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RESULTADO_GESTION_NIVEL1_Type", propOrder = {
    "empresa",
    "canal",
    "codresultadogestion"
})
public class RESULTADOGESTIONNIVEL1Type {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "CANAL", required = true)
    protected String canal;
    @XmlElement(name = "COD_RESULTADO_GESTION", required = true)
    protected String codresultadogestion;

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
     * Gets the value of the canal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCANAL() {
        return canal;
    }

    /**
     * Sets the value of the canal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCANAL(String value) {
        this.canal = value;
    }

    /**
     * Gets the value of the codresultadogestion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODRESULTADOGESTION() {
        return codresultadogestion;
    }

    /**
     * Sets the value of the codresultadogestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODRESULTADOGESTION(String value) {
        this.codresultadogestion = value;
    }

}
