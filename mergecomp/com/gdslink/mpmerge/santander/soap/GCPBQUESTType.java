
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GCPB_QUEST_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCPB_QUEST_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GCPB_XPED" type="{http://www.isban.es/webservices/TDCc}GCPB_EXPED_Type"/>
 *         &lt;element name="TIMESINI_PBC" type="{http://www.isban.es/webservices/TDCs}TIMESTAMP_ALTA_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCPB_QUEST_Type", propOrder = {
    "gcpbxped",
    "timesinipbc"
})
public class GCPBQUESTType {

    @XmlElement(name = "GCPB_XPED", required = true)
    protected GCPBEXPEDType gcpbxped;
    @XmlElement(name = "TIMESINI_PBC", required = true)
    protected XMLGregorianCalendar timesinipbc;

    /**
     * Gets the value of the gcpbxped property.
     * 
     * @return
     *     possible object is
     *     {@link GCPBEXPEDType }
     *     
     */
    public GCPBEXPEDType getGCPBXPED() {
        return gcpbxped;
    }

    /**
     * Sets the value of the gcpbxped property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCPBEXPEDType }
     *     
     */
    public void setGCPBXPED(GCPBEXPEDType value) {
        this.gcpbxped = value;
    }

    /**
     * Gets the value of the timesinipbc property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTIMESINIPBC() {
        return timesinipbc;
    }

    /**
     * Sets the value of the timesinipbc property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTIMESINIPBC(XMLGregorianCalendar value) {
        this.timesinipbc = value;
    }

}
