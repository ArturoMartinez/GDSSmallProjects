
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SUBGRUPO_RANKING_CENTRO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SUBGRUPO_RANKING_CENTRO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GRUPO_RANKING_CENTRO" type="{http://www.isban.es/webservices/TDCs}GRUPO_RANKING_CENTRO_Type"/>
 *         &lt;element name="COD_ALFANUM_2" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SUBGRUPO_RANKING_CENTRO_Type", propOrder = {
    "gruporankingcentro",
    "codalfanum2"
})
public class SUBGRUPORANKINGCENTROType {

    @XmlElement(name = "GRUPO_RANKING_CENTRO", required = true)
    protected String gruporankingcentro;
    @XmlElement(name = "COD_ALFANUM_2", required = true)
    protected String codalfanum2;

    /**
     * Gets the value of the gruporankingcentro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRUPORANKINGCENTRO() {
        return gruporankingcentro;
    }

    /**
     * Sets the value of the gruporankingcentro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRUPORANKINGCENTRO(String value) {
        this.gruporankingcentro = value;
    }

    /**
     * Gets the value of the codalfanum2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODALFANUM2() {
        return codalfanum2;
    }

    /**
     * Sets the value of the codalfanum2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODALFANUM2(String value) {
        this.codalfanum2 = value;
    }

}
