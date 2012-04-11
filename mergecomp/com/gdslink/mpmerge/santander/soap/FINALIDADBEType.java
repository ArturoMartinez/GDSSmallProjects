
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FINALIDAD_BE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FINALIDAD_BE_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COD_ESTADO_OFICIAL" type="{http://www.isban.es/webservices/TDCs}COD_ESTADO_OFICIAL_BE_Type"/>
 *         &lt;element name="COD_FINALIDAD" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_4_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FINALIDAD_BE_Type", propOrder = {
    "codestadooficial",
    "codfinalidad"
})
public class FINALIDADBEType {

    @XmlElement(name = "COD_ESTADO_OFICIAL", required = true)
    protected String codestadooficial;
    @XmlElement(name = "COD_FINALIDAD", required = true)
    protected String codfinalidad;

    /**
     * Gets the value of the codestadooficial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODESTADOOFICIAL() {
        return codestadooficial;
    }

    /**
     * Sets the value of the codestadooficial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODESTADOOFICIAL(String value) {
        this.codestadooficial = value;
    }

    /**
     * Gets the value of the codfinalidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODFINALIDAD() {
        return codfinalidad;
    }

    /**
     * Sets the value of the codfinalidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODFINALIDAD(String value) {
        this.codfinalidad = value;
    }

}
