
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LOCALIZADOR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOCALIZADOR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COMPONENTE_1" type="{http://www.isban.es/webservices/TDCs}CLAVE_CLASIFICACION_INTER_Type"/>
 *         &lt;element name="COMPONENTE_2" type="{http://www.isban.es/webservices/TDCs}CUENTA_LOCALIZADOR_CTO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LOCALIZADOR_Type", propOrder = {
    "componente1",
    "componente2"
})
public class LOCALIZADORType {

    @XmlElement(name = "COMPONENTE_1", required = true)
    protected String componente1;
    @XmlElement(name = "COMPONENTE_2", required = true)
    protected String componente2;

    /**
     * Gets the value of the componente1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPONENTE1() {
        return componente1;
    }

    /**
     * Sets the value of the componente1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPONENTE1(String value) {
        this.componente1 = value;
    }

    /**
     * Gets the value of the componente2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPONENTE2() {
        return componente2;
    }

    /**
     * Sets the value of the componente2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPONENTE2(String value) {
        this.componente2 = value;
    }

}
