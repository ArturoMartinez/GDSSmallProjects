
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TRANSICION_LZD_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRANSICION_LZD_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_TRANSICION_LZD" type="{http://www.isban.es/webservices/TDCc}TIPO_TRANSICION_LZD_Type"/>
 *         &lt;element name="ID_TRANSICION" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRANSICION_LZD_Type", propOrder = {
    "tipotransicionlzd",
    "idtransicion"
})
public class TRANSICIONLZDType {

    @XmlElement(name = "TIPO_TRANSICION_LZD", required = true)
    protected TIPOTRANSICIONLZDType tipotransicionlzd;
    @XmlElement(name = "ID_TRANSICION", required = true)
    protected String idtransicion;

    /**
     * Gets the value of the tipotransicionlzd property.
     * 
     * @return
     *     possible object is
     *     {@link TIPOTRANSICIONLZDType }
     *     
     */
    public TIPOTRANSICIONLZDType getTIPOTRANSICIONLZD() {
        return tipotransicionlzd;
    }

    /**
     * Sets the value of the tipotransicionlzd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIPOTRANSICIONLZDType }
     *     
     */
    public void setTIPOTRANSICIONLZD(TIPOTRANSICIONLZDType value) {
        this.tipotransicionlzd = value;
    }

    /**
     * Gets the value of the idtransicion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDTRANSICION() {
        return idtransicion;
    }

    /**
     * Sets the value of the idtransicion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDTRANSICION(String value) {
        this.idtransicion = value;
    }

}
