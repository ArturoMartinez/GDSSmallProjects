
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ROL_COMP_INTERNO_GR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ROL_COMP_INTERNO_GR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_FUNCION_GR" type="{http://www.isban.es/webservices/TDCc}TIPO_FUNCION_GR_Type"/>
 *         &lt;element name="TIPO_ROL_GR" type="{http://www.isban.es/webservices/TDCc}TIPO_ROL_GR_Type"/>
 *         &lt;element name="TIP_IDENTIF_GR" type="{http://www.isban.es/webservices/TDCc}TIP_IDENTIF_GR_Type"/>
 *         &lt;element name="COD_INTERNO_ROL" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_16_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ROL_COMP_INTERNO_GR_Type", propOrder = {
    "tipofunciongr",
    "tiporolgr",
    "tipidentifgr",
    "codinternorol"
})
public class ROLCOMPINTERNOGRType {

    @XmlElement(name = "TIPO_FUNCION_GR", required = true)
    protected TIPOFUNCIONGRType tipofunciongr;
    @XmlElement(name = "TIPO_ROL_GR", required = true)
    protected TIPOROLGRType tiporolgr;
    @XmlElement(name = "TIP_IDENTIF_GR", required = true)
    protected TIPIDENTIFGRType tipidentifgr;
    @XmlElement(name = "COD_INTERNO_ROL")
    protected long codinternorol;

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
     * Gets the value of the tiporolgr property.
     * 
     * @return
     *     possible object is
     *     {@link TIPOROLGRType }
     *     
     */
    public TIPOROLGRType getTIPOROLGR() {
        return tiporolgr;
    }

    /**
     * Sets the value of the tiporolgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIPOROLGRType }
     *     
     */
    public void setTIPOROLGR(TIPOROLGRType value) {
        this.tiporolgr = value;
    }

    /**
     * Gets the value of the tipidentifgr property.
     * 
     * @return
     *     possible object is
     *     {@link TIPIDENTIFGRType }
     *     
     */
    public TIPIDENTIFGRType getTIPIDENTIFGR() {
        return tipidentifgr;
    }

    /**
     * Sets the value of the tipidentifgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIPIDENTIFGRType }
     *     
     */
    public void setTIPIDENTIFGR(TIPIDENTIFGRType value) {
        this.tipidentifgr = value;
    }

    /**
     * Gets the value of the codinternorol property.
     * 
     */
    public long getCODINTERNOROL() {
        return codinternorol;
    }

    /**
     * Sets the value of the codinternorol property.
     * 
     */
    public void setCODINTERNOROL(long value) {
        this.codinternorol = value;
    }

}
