
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for INSTRUCCION_GESTOR_CBLE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INSTRUCCION_GESTOR_CBLE_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ORDEN_DE_SERVICIO" type="{http://www.isban.es/webservices/TDCc}ORDEN_DE_SERVICIO_Type"/>
 *         &lt;element name="REFERENCIA_DE_FACTORIA" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_40_Type"/>
 *         &lt;element name="OPERACION_GESTOR_CONTABLE" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *         &lt;element name="TIP_CONCEPTO_GESTOR_CBLE" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INSTRUCCION_GESTOR_CBLE_Type", propOrder = {
    "ordendeservicio",
    "referenciadefactoria",
    "operaciongestorcontable",
    "tipconceptogestorcble"
})
public class INSTRUCCIONGESTORCBLEType {

    @XmlElement(name = "ORDEN_DE_SERVICIO", required = true)
    protected ORDENDESERVICIOType ordendeservicio;
    @XmlElement(name = "REFERENCIA_DE_FACTORIA", required = true)
    protected String referenciadefactoria;
    @XmlElement(name = "OPERACION_GESTOR_CONTABLE", required = true)
    protected String operaciongestorcontable;
    @XmlElement(name = "TIP_CONCEPTO_GESTOR_CBLE", required = true)
    protected String tipconceptogestorcble;

    /**
     * Gets the value of the ordendeservicio property.
     * 
     * @return
     *     possible object is
     *     {@link ORDENDESERVICIOType }
     *     
     */
    public ORDENDESERVICIOType getORDENDESERVICIO() {
        return ordendeservicio;
    }

    /**
     * Sets the value of the ordendeservicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORDENDESERVICIOType }
     *     
     */
    public void setORDENDESERVICIO(ORDENDESERVICIOType value) {
        this.ordendeservicio = value;
    }

    /**
     * Gets the value of the referenciadefactoria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFERENCIADEFACTORIA() {
        return referenciadefactoria;
    }

    /**
     * Sets the value of the referenciadefactoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFERENCIADEFACTORIA(String value) {
        this.referenciadefactoria = value;
    }

    /**
     * Gets the value of the operaciongestorcontable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPERACIONGESTORCONTABLE() {
        return operaciongestorcontable;
    }

    /**
     * Sets the value of the operaciongestorcontable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPERACIONGESTORCONTABLE(String value) {
        this.operaciongestorcontable = value;
    }

    /**
     * Gets the value of the tipconceptogestorcble property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPCONCEPTOGESTORCBLE() {
        return tipconceptogestorcble;
    }

    /**
     * Sets the value of the tipconceptogestorcble property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPCONCEPTOGESTORCBLE(String value) {
        this.tipconceptogestorcble = value;
    }

}
