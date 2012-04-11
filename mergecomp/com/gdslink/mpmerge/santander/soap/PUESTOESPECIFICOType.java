
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PUESTO_ESPECIFICO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PUESTO_ESPECIFICO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PUESTO_TRABAJO" type="{http://www.isban.es/webservices/TDCc}PUESTO_TRABAJO_Type"/>
 *         &lt;element name="COD_PUESTO_ESP" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PUESTO_ESPECIFICO_Type", propOrder = {
    "puestotrabajo",
    "codpuestoesp"
})
public class PUESTOESPECIFICOType {

    @XmlElement(name = "PUESTO_TRABAJO", required = true)
    protected PUESTOTRABAJOType puestotrabajo;
    @XmlElement(name = "COD_PUESTO_ESP", required = true)
    protected String codpuestoesp;

    /**
     * Gets the value of the puestotrabajo property.
     * 
     * @return
     *     possible object is
     *     {@link PUESTOTRABAJOType }
     *     
     */
    public PUESTOTRABAJOType getPUESTOTRABAJO() {
        return puestotrabajo;
    }

    /**
     * Sets the value of the puestotrabajo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PUESTOTRABAJOType }
     *     
     */
    public void setPUESTOTRABAJO(PUESTOTRABAJOType value) {
        this.puestotrabajo = value;
    }

    /**
     * Gets the value of the codpuestoesp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODPUESTOESP() {
        return codpuestoesp;
    }

    /**
     * Sets the value of the codpuestoesp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODPUESTOESP(String value) {
        this.codpuestoesp = value;
    }

}
