
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BMG_NUMERO_GRUPO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BMG_NUMERO_GRUPO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BMG_TIPO_GRUPO" type="{http://www.isban.es/webservices/TDCs}BMG_TIPO_GRUPO_Type"/>
 *         &lt;element name="BMG_CODIGO_GRUPO" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_9_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BMG_NUMERO_GRUPO_Type", propOrder = {
    "bmgtipogrupo",
    "bmgcodigogrupo"
})
public class BMGNUMEROGRUPOType {

    @XmlElement(name = "BMG_TIPO_GRUPO", required = true)
    protected String bmgtipogrupo;
    @XmlElement(name = "BMG_CODIGO_GRUPO")
    protected int bmgcodigogrupo;

    /**
     * Gets the value of the bmgtipogrupo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBMGTIPOGRUPO() {
        return bmgtipogrupo;
    }

    /**
     * Sets the value of the bmgtipogrupo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBMGTIPOGRUPO(String value) {
        this.bmgtipogrupo = value;
    }

    /**
     * Gets the value of the bmgcodigogrupo property.
     * 
     */
    public int getBMGCODIGOGRUPO() {
        return bmgcodigogrupo;
    }

    /**
     * Sets the value of the bmgcodigogrupo property.
     * 
     */
    public void setBMGCODIGOGRUPO(int value) {
        this.bmgcodigogrupo = value;
    }

}
