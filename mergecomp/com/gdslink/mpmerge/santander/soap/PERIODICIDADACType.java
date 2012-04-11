
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PERIODICIDAD_AC_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PERIODICIDAD_AC_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SUBTIPO_DE_PRODUCTO" type="{http://www.isban.es/webservices/TDCc}SUBTIPO_DE_PRODUCTO_Type"/>
 *         &lt;element name="TIP_OPERATIVA_ACUERDO" type="{http://www.isban.es/webservices/TDCs}TIP_OPERATIVA_ACUERDO_Type"/>
 *         &lt;element name="TIPO_DE_PERIODO" type="{http://www.isban.es/webservices/TDCs}TIPO_DE_PERIODO_Type"/>
 *         &lt;element name="NUM_UNID_PERIODO" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PERIODICIDAD_AC_Type", propOrder = {
    "subtipodeproducto",
    "tipoperativaacuerdo",
    "tipodeperiodo",
    "numunidperiodo"
})
public class PERIODICIDADACType {

    @XmlElement(name = "SUBTIPO_DE_PRODUCTO", required = true)
    protected SUBTIPODEPRODUCTOType subtipodeproducto;
    @XmlElement(name = "TIP_OPERATIVA_ACUERDO", required = true)
    protected String tipoperativaacuerdo;
    @XmlElement(name = "TIPO_DE_PERIODO", required = true)
    protected String tipodeperiodo;
    @XmlElement(name = "NUM_UNID_PERIODO")
    protected int numunidperiodo;

    /**
     * Gets the value of the subtipodeproducto property.
     * 
     * @return
     *     possible object is
     *     {@link SUBTIPODEPRODUCTOType }
     *     
     */
    public SUBTIPODEPRODUCTOType getSUBTIPODEPRODUCTO() {
        return subtipodeproducto;
    }

    /**
     * Sets the value of the subtipodeproducto property.
     * 
     * @param value
     *     allowed object is
     *     {@link SUBTIPODEPRODUCTOType }
     *     
     */
    public void setSUBTIPODEPRODUCTO(SUBTIPODEPRODUCTOType value) {
        this.subtipodeproducto = value;
    }

    /**
     * Gets the value of the tipoperativaacuerdo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOPERATIVAACUERDO() {
        return tipoperativaacuerdo;
    }

    /**
     * Sets the value of the tipoperativaacuerdo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOPERATIVAACUERDO(String value) {
        this.tipoperativaacuerdo = value;
    }

    /**
     * Gets the value of the tipodeperiodo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODEPERIODO() {
        return tipodeperiodo;
    }

    /**
     * Sets the value of the tipodeperiodo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODEPERIODO(String value) {
        this.tipodeperiodo = value;
    }

    /**
     * Gets the value of the numunidperiodo property.
     * 
     */
    public int getNUMUNIDPERIODO() {
        return numunidperiodo;
    }

    /**
     * Sets the value of the numunidperiodo property.
     * 
     */
    public void setNUMUNIDPERIODO(int value) {
        this.numunidperiodo = value;
    }

}
