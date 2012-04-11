
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CLAVTCEE_BR_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CLAVTCEE_BR_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INDTCE_BR" type="{http://www.isban.es/webservices/TDCs}INDICADOR_GENERICO_Type"/>
 *         &lt;element name="CODENT" type="{http://www.isban.es/webservices/TDCs}ENTIDAD_BR_Type"/>
 *         &lt;element name="FCAMBI_BR" type="{http://www.isban.es/webservices/TDCs}FECHA_AAAAMMDD_GUION_Type"/>
 *         &lt;element name="CDMOED_BR" type="{http://www.isban.es/webservices/TDCs}MOEDA_BR_Type"/>
 *         &lt;element name="INDDIV_BR" type="{http://www.isban.es/webservices/TDCs}INDICADOR_GENERICO_Type"/>
 *         &lt;element name="SEGMEN_BR" type="{http://www.isban.es/webservices/TDCs}COD_SEG_BR_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CLAVTCEE_BR_Type", propOrder = {
    "indtcebr",
    "codent",
    "fcambibr",
    "cdmoedbr",
    "inddivbr",
    "segmenbr"
})
public class CLAVTCEEBRType {

    @XmlElement(name = "INDTCE_BR", required = true)
    protected String indtcebr;
    @XmlElement(name = "CODENT", required = true)
    protected String codent;
    @XmlElement(name = "FCAMBI_BR", required = true)
    protected XMLGregorianCalendar fcambibr;
    @XmlElement(name = "CDMOED_BR", required = true)
    protected String cdmoedbr;
    @XmlElement(name = "INDDIV_BR", required = true)
    protected String inddivbr;
    @XmlElement(name = "SEGMEN_BR", required = true)
    protected String segmenbr;

    /**
     * Gets the value of the indtcebr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDTCEBR() {
        return indtcebr;
    }

    /**
     * Sets the value of the indtcebr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDTCEBR(String value) {
        this.indtcebr = value;
    }

    /**
     * Gets the value of the codent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODENT() {
        return codent;
    }

    /**
     * Sets the value of the codent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODENT(String value) {
        this.codent = value;
    }

    /**
     * Gets the value of the fcambibr property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFCAMBIBR() {
        return fcambibr;
    }

    /**
     * Sets the value of the fcambibr property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFCAMBIBR(XMLGregorianCalendar value) {
        this.fcambibr = value;
    }

    /**
     * Gets the value of the cdmoedbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDMOEDBR() {
        return cdmoedbr;
    }

    /**
     * Sets the value of the cdmoedbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDMOEDBR(String value) {
        this.cdmoedbr = value;
    }

    /**
     * Gets the value of the inddivbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDDIVBR() {
        return inddivbr;
    }

    /**
     * Sets the value of the inddivbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDDIVBR(String value) {
        this.inddivbr = value;
    }

    /**
     * Gets the value of the segmenbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEGMENBR() {
        return segmenbr;
    }

    /**
     * Sets the value of the segmenbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEGMENBR(String value) {
        this.segmenbr = value;
    }

}
