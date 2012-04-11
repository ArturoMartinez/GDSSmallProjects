
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BMG_EXTRACTO_GL_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BMG_EXTRACTO_GL_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="BMG_CUENTA" type="{http://www.isban.es/webservices/TDCc}BMG_CUENTA_Type"/>
 *         &lt;element name="TIPO_MENSAJE_GSTP" type="{http://www.isban.es/webservices/TDCc}TIPO_MENSAJE_GSTP_Type"/>
 *         &lt;element name="FECHA_VALOR" type="{http://www.isban.es/webservices/TDCs}FECHA_GENERICA_Type"/>
 *         &lt;element name="COD_EXTRACTO" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_5_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BMG_EXTRACTO_GL_Type", propOrder = {
    "empresa",
    "bmgcuenta",
    "tipomensajegstp",
    "fechavalor",
    "codextracto"
})
public class BMGEXTRACTOGLType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "BMG_CUENTA", required = true)
    protected BMGCUENTAType bmgcuenta;
    @XmlElement(name = "TIPO_MENSAJE_GSTP", required = true)
    protected TIPOMENSAJEGSTPType tipomensajegstp;
    @XmlElement(name = "FECHA_VALOR", required = true)
    protected XMLGregorianCalendar fechavalor;
    @XmlElement(name = "COD_EXTRACTO")
    protected int codextracto;

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
     * Gets the value of the bmgcuenta property.
     * 
     * @return
     *     possible object is
     *     {@link BMGCUENTAType }
     *     
     */
    public BMGCUENTAType getBMGCUENTA() {
        return bmgcuenta;
    }

    /**
     * Sets the value of the bmgcuenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BMGCUENTAType }
     *     
     */
    public void setBMGCUENTA(BMGCUENTAType value) {
        this.bmgcuenta = value;
    }

    /**
     * Gets the value of the tipomensajegstp property.
     * 
     * @return
     *     possible object is
     *     {@link TIPOMENSAJEGSTPType }
     *     
     */
    public TIPOMENSAJEGSTPType getTIPOMENSAJEGSTP() {
        return tipomensajegstp;
    }

    /**
     * Sets the value of the tipomensajegstp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIPOMENSAJEGSTPType }
     *     
     */
    public void setTIPOMENSAJEGSTP(TIPOMENSAJEGSTPType value) {
        this.tipomensajegstp = value;
    }

    /**
     * Gets the value of the fechavalor property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFECHAVALOR() {
        return fechavalor;
    }

    /**
     * Sets the value of the fechavalor property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFECHAVALOR(XMLGregorianCalendar value) {
        this.fechavalor = value;
    }

    /**
     * Gets the value of the codextracto property.
     * 
     */
    public int getCODEXTRACTO() {
        return codextracto;
    }

    /**
     * Sets the value of the codextracto property.
     * 
     */
    public void setCODEXTRACTO(int value) {
        this.codextracto = value;
    }

}
