
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CODFUNCION_FRANQUICIA_TJT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CODFUNCION_FRANQUICIA_TJT_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="TIPO_FRANQUICIA_DISPUTA" type="{http://www.isban.es/webservices/TDCs}TIPO_FRANQUICIA_DISPUTA_Type"/>
 *         &lt;element name="COD_SOLUCION_INCIDENCIA" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_2_Type"/>
 *         &lt;element name="COD_FUNCION_FRANQUICIA" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_3_Type"/>
 *         &lt;element name="IND_CHARGEBACK" type="{http://www.isban.es/webservices/TDCs}INDICADOR_SI-NO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CODFUNCION_FRANQUICIA_TJT_Type", propOrder = {
    "empresa",
    "tipofranquiciadisputa",
    "codsolucionincidencia",
    "codfuncionfranquicia",
    "indchargeback"
})
public class CODFUNCIONFRANQUICIATJTType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "TIPO_FRANQUICIA_DISPUTA")
    protected int tipofranquiciadisputa;
    @XmlElement(name = "COD_SOLUCION_INCIDENCIA")
    protected int codsolucionincidencia;
    @XmlElement(name = "COD_FUNCION_FRANQUICIA")
    protected int codfuncionfranquicia;
    @XmlElement(name = "IND_CHARGEBACK", required = true)
    protected String indchargeback;

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
     * Gets the value of the tipofranquiciadisputa property.
     * 
     */
    public int getTIPOFRANQUICIADISPUTA() {
        return tipofranquiciadisputa;
    }

    /**
     * Sets the value of the tipofranquiciadisputa property.
     * 
     */
    public void setTIPOFRANQUICIADISPUTA(int value) {
        this.tipofranquiciadisputa = value;
    }

    /**
     * Gets the value of the codsolucionincidencia property.
     * 
     */
    public int getCODSOLUCIONINCIDENCIA() {
        return codsolucionincidencia;
    }

    /**
     * Sets the value of the codsolucionincidencia property.
     * 
     */
    public void setCODSOLUCIONINCIDENCIA(int value) {
        this.codsolucionincidencia = value;
    }

    /**
     * Gets the value of the codfuncionfranquicia property.
     * 
     */
    public int getCODFUNCIONFRANQUICIA() {
        return codfuncionfranquicia;
    }

    /**
     * Sets the value of the codfuncionfranquicia property.
     * 
     */
    public void setCODFUNCIONFRANQUICIA(int value) {
        this.codfuncionfranquicia = value;
    }

    /**
     * Gets the value of the indchargeback property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDCHARGEBACK() {
        return indchargeback;
    }

    /**
     * Sets the value of the indchargeback property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDCHARGEBACK(String value) {
        this.indchargeback = value;
    }

}
