
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MOB_OBJETO_OPER_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MOB_OBJETO_OPER_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OBJETO_OPERATIVO" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_8_Type"/>
 *         &lt;element name="VERSION" type="{http://www.isban.es/webservices/TDCs}CANTIDAD_BREVE_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MOB_OBJETO_OPER_Type", propOrder = {
    "objetooperativo",
    "version"
})
public class MOBOBJETOOPERType {

    @XmlElement(name = "OBJETO_OPERATIVO", required = true)
    protected String objetooperativo;
    @XmlElement(name = "VERSION")
    protected int version;

    /**
     * Gets the value of the objetooperativo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBJETOOPERATIVO() {
        return objetooperativo;
    }

    /**
     * Sets the value of the objetooperativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBJETOOPERATIVO(String value) {
        this.objetooperativo = value;
    }

    /**
     * Gets the value of the version property.
     * 
     */
    public int getVERSION() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     */
    public void setVERSION(int value) {
        this.version = value;
    }

}
