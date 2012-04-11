
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CHAVE_TIPO_FATURA_BR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CHAVE_TIPO_FATURA_BR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_FATURA_BR" type="{http://www.isban.es/webservices/TDCs}TIPO_FATURA_BR_Type"/>
 *         &lt;element name="IND_NORMAL_CORRETORA_BR" type="{http://www.isban.es/webservices/TDCs}IND_NORMAL_CORRETORA_BR_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CHAVE_TIPO_FATURA_BR_Type", propOrder = {
    "tipofaturabr",
    "indnormalcorretorabr"
})
public class CHAVETIPOFATURABRType {

    @XmlElement(name = "TIPO_FATURA_BR")
    protected int tipofaturabr;
    @XmlElement(name = "IND_NORMAL_CORRETORA_BR", required = true)
    protected String indnormalcorretorabr;

    /**
     * Gets the value of the tipofaturabr property.
     * 
     */
    public int getTIPOFATURABR() {
        return tipofaturabr;
    }

    /**
     * Sets the value of the tipofaturabr property.
     * 
     */
    public void setTIPOFATURABR(int value) {
        this.tipofaturabr = value;
    }

    /**
     * Gets the value of the indnormalcorretorabr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDNORMALCORRETORABR() {
        return indnormalcorretorabr;
    }

    /**
     * Sets the value of the indnormalcorretorabr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDNORMALCORRETORABR(String value) {
        this.indnormalcorretorabr = value;
    }

}
