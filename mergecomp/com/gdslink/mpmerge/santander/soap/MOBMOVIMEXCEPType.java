
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MOB_MOVIM_EXCEP_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MOB_MOVIM_EXCEP_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OBB" type="{http://www.isban.es/webservices/TDCc}MOB_OBB_Type"/>
 *         &lt;element name="TIP_CONTABILIDAD_MVTO" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *         &lt;element name="NRO_MOVIMIENTO" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_4_Type"/>
 *         &lt;element name="MOB_EXCEPCION" type="{http://www.isban.es/webservices/TDCs}MOB_EXCEPCION_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MOB_MOVIM_EXCEP_Type", propOrder = {
    "obb",
    "tipcontabilidadmvto",
    "nromovimiento",
    "mobexcepcion"
})
public class MOBMOVIMEXCEPType {

    @XmlElement(name = "OBB", required = true)
    protected MOBOBBType obb;
    @XmlElement(name = "TIP_CONTABILIDAD_MVTO", required = true)
    protected String tipcontabilidadmvto;
    @XmlElement(name = "NRO_MOVIMIENTO")
    protected int nromovimiento;
    @XmlElement(name = "MOB_EXCEPCION", required = true)
    protected String mobexcepcion;

    /**
     * Gets the value of the obb property.
     * 
     * @return
     *     possible object is
     *     {@link MOBOBBType }
     *     
     */
    public MOBOBBType getOBB() {
        return obb;
    }

    /**
     * Sets the value of the obb property.
     * 
     * @param value
     *     allowed object is
     *     {@link MOBOBBType }
     *     
     */
    public void setOBB(MOBOBBType value) {
        this.obb = value;
    }

    /**
     * Gets the value of the tipcontabilidadmvto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPCONTABILIDADMVTO() {
        return tipcontabilidadmvto;
    }

    /**
     * Sets the value of the tipcontabilidadmvto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPCONTABILIDADMVTO(String value) {
        this.tipcontabilidadmvto = value;
    }

    /**
     * Gets the value of the nromovimiento property.
     * 
     */
    public int getNROMOVIMIENTO() {
        return nromovimiento;
    }

    /**
     * Sets the value of the nromovimiento property.
     * 
     */
    public void setNROMOVIMIENTO(int value) {
        this.nromovimiento = value;
    }

    /**
     * Gets the value of the mobexcepcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOBEXCEPCION() {
        return mobexcepcion;
    }

    /**
     * Sets the value of the mobexcepcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOBEXCEPCION(String value) {
        this.mobexcepcion = value;
    }

}
