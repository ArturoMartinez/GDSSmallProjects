
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CODIGO_AGRUPACION_TRABAJO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CODIGO_AGRUPACION_TRABAJO_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INDICADOR_TIPO_TRABAJO" type="{http://www.isban.es/webservices/TDCs}INDICADOR_TIPO_TRABAJO__Type"/>
 *         &lt;element name="COD_AGRUPACION_OCUPACION" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CODIGO_AGRUPACION_TRABAJO_Type", propOrder = {
    "indicadortipotrabajo",
    "codagrupacionocupacion"
})
public class CODIGOAGRUPACIONTRABAJOType {

    @XmlElement(name = "INDICADOR_TIPO_TRABAJO", required = true)
    protected String indicadortipotrabajo;
    @XmlElement(name = "COD_AGRUPACION_OCUPACION", required = true)
    protected String codagrupacionocupacion;

    /**
     * Gets the value of the indicadortipotrabajo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDICADORTIPOTRABAJO() {
        return indicadortipotrabajo;
    }

    /**
     * Sets the value of the indicadortipotrabajo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDICADORTIPOTRABAJO(String value) {
        this.indicadortipotrabajo = value;
    }

    /**
     * Gets the value of the codagrupacionocupacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODAGRUPACIONOCUPACION() {
        return codagrupacionocupacion;
    }

    /**
     * Sets the value of the codagrupacionocupacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODAGRUPACIONOCUPACION(String value) {
        this.codagrupacionocupacion = value;
    }

}
