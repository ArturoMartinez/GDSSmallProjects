
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ESTADO_NOF_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ESTADO_NOF_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_MENSAJE_NOF" type="{http://www.isban.es/webservices/TDCc}ID_MENSAJE_NOF_Type"/>
 *         &lt;element name="COD_ESTADO_NOF" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ESTADO_NOF_Type", propOrder = {
    "idmensajenof",
    "codestadonof"
})
public class ESTADONOFType {

    @XmlElement(name = "ID_MENSAJE_NOF", required = true)
    protected IDMENSAJENOFType idmensajenof;
    @XmlElement(name = "COD_ESTADO_NOF", required = true)
    protected String codestadonof;

    /**
     * Gets the value of the idmensajenof property.
     * 
     * @return
     *     possible object is
     *     {@link IDMENSAJENOFType }
     *     
     */
    public IDMENSAJENOFType getIDMENSAJENOF() {
        return idmensajenof;
    }

    /**
     * Sets the value of the idmensajenof property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDMENSAJENOFType }
     *     
     */
    public void setIDMENSAJENOF(IDMENSAJENOFType value) {
        this.idmensajenof = value;
    }

    /**
     * Gets the value of the codestadonof property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODESTADONOF() {
        return codestadonof;
    }

    /**
     * Sets the value of the codestadonof property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODESTADONOF(String value) {
        this.codestadonof = value;
    }

}
