
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CAT_CAUSAL_ROP_LOCAL_2_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CAT_CAUSAL_ROP_LOCAL_2_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMPRESA_CON_COD_ALFANUM2" type="{http://www.isban.es/webservices/TDCc}CAT_CAUSAL_ROP_LOCAL_1_Type"/>
 *         &lt;element name="COD_ALFANUM2" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CAT_CAUSAL_ROP_LOCAL_2_Type", propOrder = {
    "empresaconcodalfanum2",
    "codalfanum2"
})
public class CATCAUSALROPLOCAL2Type {

    @XmlElement(name = "EMPRESA_CON_COD_ALFANUM2", required = true)
    protected CATCAUSALROPLOCAL1Type empresaconcodalfanum2;
    @XmlElement(name = "COD_ALFANUM2", required = true)
    protected String codalfanum2;

    /**
     * Gets the value of the empresaconcodalfanum2 property.
     * 
     * @return
     *     possible object is
     *     {@link CATCAUSALROPLOCAL1Type }
     *     
     */
    public CATCAUSALROPLOCAL1Type getEMPRESACONCODALFANUM2() {
        return empresaconcodalfanum2;
    }

    /**
     * Sets the value of the empresaconcodalfanum2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CATCAUSALROPLOCAL1Type }
     *     
     */
    public void setEMPRESACONCODALFANUM2(CATCAUSALROPLOCAL1Type value) {
        this.empresaconcodalfanum2 = value;
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
