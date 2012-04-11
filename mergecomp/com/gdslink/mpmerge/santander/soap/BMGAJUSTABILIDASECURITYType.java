
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BMG_AJUSTABILIDA_SECURITY_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BMG_AJUSTABILIDA_SECURITY_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BMG_AJUSTABILIDA_SECURITY" type="{http://www.isban.es/webservices/TDCs}BMG_SECURITY_Type"/>
 *         &lt;element name="BMG_TIPO_AJUSTE_INDEXACIO" type="{http://www.isban.es/webservices/TDCs}BMG_TIP_AJUSTE_INDEXACION_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BMG_AJUSTABILIDA_SECURITY_Type", propOrder = {
    "bmgajustabilidasecurity",
    "bmgtipoajusteindexacio"
})
public class BMGAJUSTABILIDASECURITYType {

    @XmlElement(name = "BMG_AJUSTABILIDA_SECURITY", required = true)
    protected String bmgajustabilidasecurity;
    @XmlElement(name = "BMG_TIPO_AJUSTE_INDEXACIO", required = true)
    protected String bmgtipoajusteindexacio;

    /**
     * Gets the value of the bmgajustabilidasecurity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBMGAJUSTABILIDASECURITY() {
        return bmgajustabilidasecurity;
    }

    /**
     * Sets the value of the bmgajustabilidasecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBMGAJUSTABILIDASECURITY(String value) {
        this.bmgajustabilidasecurity = value;
    }

    /**
     * Gets the value of the bmgtipoajusteindexacio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBMGTIPOAJUSTEINDEXACIO() {
        return bmgtipoajusteindexacio;
    }

    /**
     * Sets the value of the bmgtipoajusteindexacio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBMGTIPOAJUSTEINDEXACIO(String value) {
        this.bmgtipoajusteindexacio = value;
    }

}
