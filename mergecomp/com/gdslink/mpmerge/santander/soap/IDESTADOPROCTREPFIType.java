
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ID_ESTADO_PROC_TREPFI_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ID_ESTADO_PROC_TREPFI_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_TIP_ESTADO_PROC_TREPFI" type="{http://www.isban.es/webservices/TDCc}ID_TIP_ESTADO_PROC_TREPFI_Type"/>
 *         &lt;element name="COD_ESTADO_PROC" type="{http://www.isban.es/webservices/TDCs}CODIGO_ALFANUM_1_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ID_ESTADO_PROC_TREPFI_Type", propOrder = {
    "idtipestadoproctrepfi",
    "codestadoproc"
})
public class IDESTADOPROCTREPFIType {

    @XmlElement(name = "ID_TIP_ESTADO_PROC_TREPFI", required = true)
    protected IDTIPESTADOPROCTREPFIType idtipestadoproctrepfi;
    @XmlElement(name = "COD_ESTADO_PROC", required = true)
    protected String codestadoproc;

    /**
     * Gets the value of the idtipestadoproctrepfi property.
     * 
     * @return
     *     possible object is
     *     {@link IDTIPESTADOPROCTREPFIType }
     *     
     */
    public IDTIPESTADOPROCTREPFIType getIDTIPESTADOPROCTREPFI() {
        return idtipestadoproctrepfi;
    }

    /**
     * Sets the value of the idtipestadoproctrepfi property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDTIPESTADOPROCTREPFIType }
     *     
     */
    public void setIDTIPESTADOPROCTREPFI(IDTIPESTADOPROCTREPFIType value) {
        this.idtipestadoproctrepfi = value;
    }

    /**
     * Gets the value of the codestadoproc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODESTADOPROC() {
        return codestadoproc;
    }

    /**
     * Sets the value of the codestadoproc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODESTADOPROC(String value) {
        this.codestadoproc = value;
    }

}
