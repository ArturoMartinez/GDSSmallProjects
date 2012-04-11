
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ROL_INTERNO_GR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ROL_INTERNO_GR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_FUNCION_GR" type="{http://www.isban.es/webservices/TDCc}TIPO_FUNCION_GR_Type"/>
 *         &lt;element name="TIPO_ROL" type="{http://www.isban.es/webservices/TDCs}COD_ALFAJUSTI_3_Type"/>
 *         &lt;element name="TIP_ID_CLIENTE" type="{http://www.isban.es/webservices/TDCs}COD_ALFAJUSTI_4_Type"/>
 *         &lt;element name="ID_INTERNO_ROL" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_16_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ROL_INTERNO_GR_Type", propOrder = {
    "tipofunciongr",
    "tiporol",
    "tipidcliente",
    "idinternorol"
})
public class ROLINTERNOGRType {

    @XmlElement(name = "TIPO_FUNCION_GR", required = true)
    protected TIPOFUNCIONGRType tipofunciongr;
    @XmlElement(name = "TIPO_ROL", required = true)
    protected String tiporol;
    @XmlElement(name = "TIP_ID_CLIENTE", required = true)
    protected String tipidcliente;
    @XmlElement(name = "ID_INTERNO_ROL")
    protected long idinternorol;

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
     * Gets the value of the tiporol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOROL() {
        return tiporol;
    }

    /**
     * Sets the value of the tiporol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOROL(String value) {
        this.tiporol = value;
    }

    /**
     * Gets the value of the tipidcliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPIDCLIENTE() {
        return tipidcliente;
    }

    /**
     * Sets the value of the tipidcliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPIDCLIENTE(String value) {
        this.tipidcliente = value;
    }

    /**
     * Gets the value of the idinternorol property.
     * 
     */
    public long getIDINTERNOROL() {
        return idinternorol;
    }

    /**
     * Sets the value of the idinternorol property.
     * 
     */
    public void setIDINTERNOROL(long value) {
        this.idinternorol = value;
    }

}
