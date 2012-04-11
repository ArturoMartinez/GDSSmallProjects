
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FILE_HANDLER_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FILE_HANDLER_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="REPOSITORIO_ALIAS" type="{http://www.isban.es/webservices/TDCs}REPOSITORIO_ALIAS_Type"/>
 *         &lt;element name="URI" type="{http://www.isban.es/webservices/TDCs}URI_Type"/>
 *         &lt;element name="FILE_NAME" type="{http://www.isban.es/webservices/TDCs}FILE_NAME_Type"/>
 *         &lt;element name="MIME_TYPE" type="{http://www.isban.es/webservices/TDCs}MIME_TYPE_Type"/>
 *         &lt;element name="TRANSFORMATIONS" type="{http://www.isban.es/webservices/TDCs}TRANSFORMATIONS_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FILE_HANDLER_Type", propOrder = {
    "repositorioalias",
    "uri",
    "filename",
    "mimetype",
    "transformations"
})
public class FILEHANDLERType {

    @XmlElement(name = "REPOSITORIO_ALIAS", required = true)
    protected String repositorioalias;
    @XmlElement(name = "URI", required = true)
    protected String uri;
    @XmlElement(name = "FILE_NAME", required = true)
    protected String filename;
    @XmlElement(name = "MIME_TYPE", required = true)
    protected String mimetype;
    @XmlElement(name = "TRANSFORMATIONS", required = true)
    protected String transformations;

    /**
     * Gets the value of the repositorioalias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREPOSITORIOALIAS() {
        return repositorioalias;
    }

    /**
     * Sets the value of the repositorioalias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREPOSITORIOALIAS(String value) {
        this.repositorioalias = value;
    }

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURI() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURI(String value) {
        this.uri = value;
    }

    /**
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFILENAME() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFILENAME(String value) {
        this.filename = value;
    }

    /**
     * Gets the value of the mimetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIMETYPE() {
        return mimetype;
    }

    /**
     * Sets the value of the mimetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIMETYPE(String value) {
        this.mimetype = value;
    }

    /**
     * Gets the value of the transformations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSFORMATIONS() {
        return transformations;
    }

    /**
     * Sets the value of the transformations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSFORMATIONS(String value) {
        this.transformations = value;
    }

}
