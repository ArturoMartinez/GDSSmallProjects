
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SUBTIPO_GR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SUBTIPO_GR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_FUNCION_GR" type="{http://www.isban.es/webservices/TDCc}TIPO_FUNCION_GR_Type"/>
 *         &lt;element name="CODIGO_DE_ROL" type="{http://www.isban.es/webservices/TDCs}COD_ALFAJUSTI_3_Type"/>
 *         &lt;element name="TIP_IDENTIF_GR" type="{http://www.isban.es/webservices/TDCs}COD_ALFAJUSTI_4_Type"/>
 *         &lt;element name="TIP_IDENTIF_PRIVADA" type="{http://www.isban.es/webservices/TDCs}COD_ALFAJUSTI_4_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SUBTIPO_GR_Type", propOrder = {
    "tipofunciongr",
    "codigoderol",
    "tipidentifgr",
    "tipidentifprivada"
})
public class SUBTIPOGRType {

    @XmlElement(name = "TIPO_FUNCION_GR", required = true)
    protected TIPOFUNCIONGRType tipofunciongr;
    @XmlElement(name = "CODIGO_DE_ROL", required = true)
    protected String codigoderol;
    @XmlElement(name = "TIP_IDENTIF_GR", required = true)
    protected String tipidentifgr;
    @XmlElement(name = "TIP_IDENTIF_PRIVADA", required = true)
    protected String tipidentifprivada;

    /**
     * Gets the value of the tipofunciongr property.
     * 
     * @return
     *     possible object is
     *     {@link TIPOFUNCIONGRType }
     *     
     */
    public TIPOFUNCIONGRType getTIPOFUNCIONGR() {
        return tipofunciongr;
    }

    /**
     * Sets the value of the tipofunciongr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIPOFUNCIONGRType }
     *     
     */
    public void setTIPOFUNCIONGR(TIPOFUNCIONGRType value) {
        this.tipofunciongr = value;
    }

    /**
     * Gets the value of the codigoderol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGODEROL() {
        return codigoderol;
    }

    /**
     * Sets the value of the codigoderol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGODEROL(String value) {
        this.codigoderol = value;
    }

    /**
     * Gets the value of the tipidentifgr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPIDENTIFGR() {
        return tipidentifgr;
    }

    /**
     * Sets the value of the tipidentifgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPIDENTIFGR(String value) {
        this.tipidentifgr = value;
    }

    /**
     * Gets the value of the tipidentifprivada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPIDENTIFPRIVADA() {
        return tipidentifprivada;
    }

    /**
     * Sets the value of the tipidentifprivada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPIDENTIFPRIVADA(String value) {
        this.tipidentifprivada = value;
    }

}
