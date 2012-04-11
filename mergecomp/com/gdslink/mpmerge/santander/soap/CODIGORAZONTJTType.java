
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CODIGO_RAZON_TJT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CODIGO_RAZON_TJT_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_FRANQUICIA_DISPUTA" type="{http://www.isban.es/webservices/TDCs}TIPO_FRANQUICIA_DISPUTA_Type"/>
 *         &lt;element name="COD_RAZON" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_4_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CODIGO_RAZON_TJT_Type", propOrder = {
    "tipofranquiciadisputa",
    "codrazon"
})
public class CODIGORAZONTJTType {

    @XmlElement(name = "TIPO_FRANQUICIA_DISPUTA")
    protected int tipofranquiciadisputa;
    @XmlElement(name = "COD_RAZON")
    protected int codrazon;

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
     * Gets the value of the codrazon property.
     * 
     */
    public int getCODRAZON() {
        return codrazon;
    }

    /**
     * Sets the value of the codrazon property.
     * 
     */
    public void setCODRAZON(int value) {
        this.codrazon = value;
    }

}
