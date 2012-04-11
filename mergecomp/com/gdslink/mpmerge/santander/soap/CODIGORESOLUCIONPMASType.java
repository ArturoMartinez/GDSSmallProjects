
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CODIGO_RESOLUCION_PMAS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CODIGO_RESOLUCION_PMAS_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIP_RESULTADO" type="{http://www.isban.es/webservices/TDCs}TIP_RESOLUCION_OPER_PMAS_Type"/>
 *         &lt;element name="COD_RESULTADO" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_4_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CODIGO_RESOLUCION_PMAS_Type", propOrder = {
    "tipresultado",
    "codresultado"
})
public class CODIGORESOLUCIONPMASType {

    @XmlElement(name = "TIP_RESULTADO", required = true)
    protected String tipresultado;
    @XmlElement(name = "COD_RESULTADO", required = true)
    protected String codresultado;

    /**
     * Gets the value of the tipresultado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPRESULTADO() {
        return tipresultado;
    }

    /**
     * Sets the value of the tipresultado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPRESULTADO(String value) {
        this.tipresultado = value;
    }

    /**
     * Gets the value of the codresultado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODRESULTADO() {
        return codresultado;
    }

    /**
     * Sets the value of the codresultado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODRESULTADO(String value) {
        this.codresultado = value;
    }

}
