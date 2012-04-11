
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATRIBUT_LDAP_CATALOG_CONT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ATRIBUT_LDAP_CATALOG_CONT_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CATEGORIA_ATRIBUTO_LDAP" type="{http://www.isban.es/webservices/TDCs}CATEGORIA_ATRIBUTO_LDAP_Type"/>
 *         &lt;element name="COD_ALFANUM_3" type="{http://www.isban.es/webservices/TDCs}COD_ALFANUM_3_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATRIBUT_LDAP_CATALOG_CONT_Type", propOrder = {
    "categoriaatributoldap",
    "codalfanum3"
})
public class ATRIBUTLDAPCATALOGCONTType {

    @XmlElement(name = "CATEGORIA_ATRIBUTO_LDAP", required = true)
    protected String categoriaatributoldap;
    @XmlElement(name = "COD_ALFANUM_3", required = true)
    protected String codalfanum3;

    /**
     * Gets the value of the categoriaatributoldap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCATEGORIAATRIBUTOLDAP() {
        return categoriaatributoldap;
    }

    /**
     * Sets the value of the categoriaatributoldap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCATEGORIAATRIBUTOLDAP(String value) {
        this.categoriaatributoldap = value;
    }

    /**
     * Gets the value of the codalfanum3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODALFANUM3() {
        return codalfanum3;
    }

    /**
     * Sets the value of the codalfanum3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODALFANUM3(String value) {
        this.codalfanum3 = value;
    }

}
