
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ID_EVENTO_TRAREP_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ID_EVENTO_TRAREP_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_OPERACION_TRAREP" type="{http://www.isban.es/webservices/TDCc}ID_OPERACION_TRAREP_Type"/>
 *         &lt;element name="COD_EVENTO" type="{http://www.isban.es/webservices/TDCs}CODIGO_NUMERICO_15_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ID_EVENTO_TRAREP_Type", propOrder = {
    "idoperaciontrarep",
    "codevento"
})
public class IDEVENTOTRAREPType {

    @XmlElement(name = "ID_OPERACION_TRAREP", required = true)
    protected IDOPERACIONTRAREPType idoperaciontrarep;
    @XmlElement(name = "COD_EVENTO")
    protected long codevento;

    /**
     * Gets the value of the idoperaciontrarep property.
     * 
     * @return
     *     possible object is
     *     {@link IDOPERACIONTRAREPType }
     *     
     */
    public IDOPERACIONTRAREPType getIDOPERACIONTRAREP() {
        return idoperaciontrarep;
    }

    /**
     * Sets the value of the idoperaciontrarep property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDOPERACIONTRAREPType }
     *     
     */
    public void setIDOPERACIONTRAREP(IDOPERACIONTRAREPType value) {
        this.idoperaciontrarep = value;
    }

    /**
     * Gets the value of the codevento property.
     * 
     */
    public long getCODEVENTO() {
        return codevento;
    }

    /**
     * Sets the value of the codevento property.
     * 
     */
    public void setCODEVENTO(long value) {
        this.codevento = value;
    }

}
