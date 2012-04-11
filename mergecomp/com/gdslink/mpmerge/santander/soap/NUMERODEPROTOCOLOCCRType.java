
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NUMERO_DE_PROTOCOLO_CCR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NUMERO_DE_PROTOCOLO_CCR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA" type="{http://www.isban.es/webservices/TDCs}EMPRESA_Type"/>
 *         &lt;element name="CANAL" type="{http://www.isban.es/webservices/TDCs}CANAL_BASICO_Type"/>
 *         &lt;element name="CONNID" type="{http://www.isban.es/webservices/TDCs}CONNID_Type"/>
 *         &lt;element name="SECUENCIAL" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_5_Type"/>
 *         &lt;element name="ID_CCR_ASUNTO" type="{http://www.isban.es/webservices/TDCs}ID_CCR_ASUNTO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NUMERO_DE_PROTOCOLO_CCR_Type", propOrder = {
    "empresa",
    "canal",
    "connid",
    "secuencial",
    "idccrasunto"
})
public class NUMERODEPROTOCOLOCCRType {

    @XmlElement(name = "EMPRESA", required = true)
    protected String empresa;
    @XmlElement(name = "CANAL", required = true)
    protected String canal;
    @XmlElement(name = "CONNID", required = true)
    protected String connid;
    @XmlElement(name = "SECUENCIAL")
    protected int secuencial;
    @XmlElement(name = "ID_CCR_ASUNTO")
    protected long idccrasunto;

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
     * Gets the value of the connid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONNID() {
        return connid;
    }

    /**
     * Sets the value of the connid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONNID(String value) {
        this.connid = value;
    }

    /**
     * Gets the value of the secuencial property.
     * 
     */
    public int getSECUENCIAL() {
        return secuencial;
    }

    /**
     * Sets the value of the secuencial property.
     * 
     */
    public void setSECUENCIAL(int value) {
        this.secuencial = value;
    }

    /**
     * Gets the value of the idccrasunto property.
     * 
     */
    public long getIDCCRASUNTO() {
        return idccrasunto;
    }

    /**
     * Sets the value of the idccrasunto property.
     * 
     */
    public void setIDCCRASUNTO(long value) {
        this.idccrasunto = value;
    }

}
