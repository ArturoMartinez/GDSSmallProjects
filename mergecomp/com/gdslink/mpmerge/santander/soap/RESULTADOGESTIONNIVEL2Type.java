
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RESULTADO_GESTION_NIVEL2_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RESULTADO_GESTION_NIVEL2_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RESULTADO_GESTION_NIVEL1" type="{http://www.isban.es/webservices/TDCc}RESULTADO_GESTION_NIVEL1_Type"/>
 *         &lt;element name="COD_MOTIVO_DEL_RESULTADO" type="{http://www.isban.es/webservices/TDCs}COD_MOTIVO_DEL_RESULTADO_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RESULTADO_GESTION_NIVEL2_Type", propOrder = {
    "resultadogestionnivel1",
    "codmotivodelresultado"
})
public class RESULTADOGESTIONNIVEL2Type {

    @XmlElement(name = "RESULTADO_GESTION_NIVEL1", required = true)
    protected RESULTADOGESTIONNIVEL1Type resultadogestionnivel1;
    @XmlElement(name = "COD_MOTIVO_DEL_RESULTADO", required = true)
    protected String codmotivodelresultado;

    /**
     * Gets the value of the resultadogestionnivel1 property.
     * 
     * @return
     *     possible object is
     *     {@link RESULTADOGESTIONNIVEL1Type }
     *     
     */
    public RESULTADOGESTIONNIVEL1Type getRESULTADOGESTIONNIVEL1() {
        return resultadogestionnivel1;
    }

    /**
     * Sets the value of the resultadogestionnivel1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RESULTADOGESTIONNIVEL1Type }
     *     
     */
    public void setRESULTADOGESTIONNIVEL1(RESULTADOGESTIONNIVEL1Type value) {
        this.resultadogestionnivel1 = value;
    }

    /**
     * Gets the value of the codmotivodelresultado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODMOTIVODELRESULTADO() {
        return codmotivodelresultado;
    }

    /**
     * Sets the value of the codmotivodelresultado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODMOTIVODELRESULTADO(String value) {
        this.codmotivodelresultado = value;
    }

}
