
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DOMICILIO_PRESENT_BFPO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DOMICILIO_PRESENT_BFPO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DESCRIPCION_1" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_56_Type"/>
 *         &lt;element name="DESCRIPCION_2" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_30_Type"/>
 *         &lt;element name="DESCRIPCION_3" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_30_Type"/>
 *         &lt;element name="DESCRIPCION_4" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_30_Type"/>
 *         &lt;element name="NUM_BFPO" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_5_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DOMICILIO_PRESENT_BFPO_Type", propOrder = {
    "descripcion1",
    "descripcion2",
    "descripcion3",
    "descripcion4",
    "numbfpo"
})
public class DOMICILIOPRESENTBFPOType {

    @XmlElement(name = "DESCRIPCION_1", required = true)
    protected String descripcion1;
    @XmlElement(name = "DESCRIPCION_2", required = true)
    protected String descripcion2;
    @XmlElement(name = "DESCRIPCION_3", required = true)
    protected String descripcion3;
    @XmlElement(name = "DESCRIPCION_4", required = true)
    protected String descripcion4;
    @XmlElement(name = "NUM_BFPO", required = true)
    protected String numbfpo;

    /**
     * Gets the value of the descripcion1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPCION1() {
        return descripcion1;
    }

    /**
     * Sets the value of the descripcion1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPCION1(String value) {
        this.descripcion1 = value;
    }

    /**
     * Gets the value of the descripcion2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPCION2() {
        return descripcion2;
    }

    /**
     * Sets the value of the descripcion2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPCION2(String value) {
        this.descripcion2 = value;
    }

    /**
     * Gets the value of the descripcion3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPCION3() {
        return descripcion3;
    }

    /**
     * Sets the value of the descripcion3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPCION3(String value) {
        this.descripcion3 = value;
    }

    /**
     * Gets the value of the descripcion4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPCION4() {
        return descripcion4;
    }

    /**
     * Sets the value of the descripcion4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPCION4(String value) {
        this.descripcion4 = value;
    }

    /**
     * Gets the value of the numbfpo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMBFPO() {
        return numbfpo;
    }

    /**
     * Sets the value of the numbfpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMBFPO(String value) {
        this.numbfpo = value;
    }

}
