
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUTO_JUDICIAL_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AUTO_JUDICIAL_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODIGO_DE_AUTO" type="{http://www.isban.es/webservices/TDCs}CODIGO_DE_AUTO_Type"/>
 *         &lt;element name="REFERENCIA_AUTO_JUDICIAL" type="{http://www.isban.es/webservices/TDCs}REFERENCIA_AUTO_JUDICIAL_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AUTO_JUDICIAL_Type", propOrder = {
    "codigodeauto",
    "referenciaautojudicial"
})
public class AUTOJUDICIALType {

    @XmlElement(name = "CODIGO_DE_AUTO")
    protected int codigodeauto;
    @XmlElement(name = "REFERENCIA_AUTO_JUDICIAL")
    protected int referenciaautojudicial;

    /**
     * Gets the value of the codigodeauto property.
     * 
     */
    public int getCODIGODEAUTO() {
        return codigodeauto;
    }

    /**
     * Sets the value of the codigodeauto property.
     * 
     */
    public void setCODIGODEAUTO(int value) {
        this.codigodeauto = value;
    }

    /**
     * Gets the value of the referenciaautojudicial property.
     * 
     */
    public int getREFERENCIAAUTOJUDICIAL() {
        return referenciaautojudicial;
    }

    /**
     * Sets the value of the referenciaautojudicial property.
     * 
     */
    public void setREFERENCIAAUTOJUDICIAL(int value) {
        this.referenciaautojudicial = value;
    }

}
