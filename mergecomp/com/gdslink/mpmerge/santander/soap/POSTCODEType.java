
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POST_CODE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POST_CODE_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODIGO_DE_AREA" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *         &lt;element name="CODIGO_DE_DISTRITO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *         &lt;element name="CODIGO_DE_SECTOR" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_1_Type"/>
 *         &lt;element name="CODIGO_DE_GRUPO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POST_CODE_Type", propOrder = {
    "codigodearea",
    "codigodedistrito",
    "codigodesector",
    "codigodegrupo"
})
public class POSTCODEType {

    @XmlElement(name = "CODIGO_DE_AREA", required = true)
    protected String codigodearea;
    @XmlElement(name = "CODIGO_DE_DISTRITO", required = true)
    protected String codigodedistrito;
    @XmlElement(name = "CODIGO_DE_SECTOR", required = true)
    protected String codigodesector;
    @XmlElement(name = "CODIGO_DE_GRUPO", required = true)
    protected String codigodegrupo;

    /**
     * Gets the value of the codigodearea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGODEAREA() {
        return codigodearea;
    }

    /**
     * Sets the value of the codigodearea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGODEAREA(String value) {
        this.codigodearea = value;
    }

    /**
     * Gets the value of the codigodedistrito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGODEDISTRITO() {
        return codigodedistrito;
    }

    /**
     * Sets the value of the codigodedistrito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGODEDISTRITO(String value) {
        this.codigodedistrito = value;
    }

    /**
     * Gets the value of the codigodesector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGODESECTOR() {
        return codigodesector;
    }

    /**
     * Sets the value of the codigodesector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGODESECTOR(String value) {
        this.codigodesector = value;
    }

    /**
     * Gets the value of the codigodegrupo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGODEGRUPO() {
        return codigodegrupo;
    }

    /**
     * Sets the value of the codigodegrupo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGODEGRUPO(String value) {
        this.codigodegrupo = value;
    }

}
