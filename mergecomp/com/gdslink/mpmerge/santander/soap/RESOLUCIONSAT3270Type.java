
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RESOLUCION_SAT_3270_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RESOLUCION_SAT_3270_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODIGO_RESOLUCION" type="{http://www.isban.es/webservices/TDCs}COD_RESOLUCION_Type"/>
 *         &lt;element name="SUBCODIGO_RESOLUCION" type="{http://www.isban.es/webservices/TDCs}SUBCOD_RESOLUCION_Type"/>
 *         &lt;element name="TEXTO_RESOLUCION" type="{http://www.isban.es/webservices/TDCs}TEXTO_RESOLUCION_SAT_Type"/>
 *         &lt;element name="ERROR_COD_RECIBIDO" type="{http://www.isban.es/webservices/TDCs}ERROR_CODE_RCBD_Type"/>
 *         &lt;element name="IND_FLAG_RECIBIDO" type="{http://www.isban.es/webservices/TDCs}IND_FLAG_RCBD_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RESOLUCION_SAT_3270_Type", propOrder = {
    "codigoresolucion",
    "subcodigoresolucion",
    "textoresolucion",
    "errorcodrecibido",
    "indflagrecibido"
})
public class RESOLUCIONSAT3270Type {

    @XmlElement(name = "CODIGO_RESOLUCION", required = true)
    protected String codigoresolucion;
    @XmlElement(name = "SUBCODIGO_RESOLUCION", required = true)
    protected String subcodigoresolucion;
    @XmlElement(name = "TEXTO_RESOLUCION", required = true)
    protected String textoresolucion;
    @XmlElement(name = "ERROR_COD_RECIBIDO", required = true)
    protected String errorcodrecibido;
    @XmlElement(name = "IND_FLAG_RECIBIDO", required = true)
    protected String indflagrecibido;

    /**
     * Gets the value of the codigoresolucion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGORESOLUCION() {
        return codigoresolucion;
    }

    /**
     * Sets the value of the codigoresolucion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGORESOLUCION(String value) {
        this.codigoresolucion = value;
    }

    /**
     * Gets the value of the subcodigoresolucion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBCODIGORESOLUCION() {
        return subcodigoresolucion;
    }

    /**
     * Sets the value of the subcodigoresolucion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBCODIGORESOLUCION(String value) {
        this.subcodigoresolucion = value;
    }

    /**
     * Gets the value of the textoresolucion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEXTORESOLUCION() {
        return textoresolucion;
    }

    /**
     * Sets the value of the textoresolucion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEXTORESOLUCION(String value) {
        this.textoresolucion = value;
    }

    /**
     * Gets the value of the errorcodrecibido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERRORCODRECIBIDO() {
        return errorcodrecibido;
    }

    /**
     * Sets the value of the errorcodrecibido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERRORCODRECIBIDO(String value) {
        this.errorcodrecibido = value;
    }

    /**
     * Gets the value of the indflagrecibido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDFLAGRECIBIDO() {
        return indflagrecibido;
    }

    /**
     * Sets the value of the indflagrecibido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDFLAGRECIBIDO(String value) {
        this.indflagrecibido = value;
    }

}
