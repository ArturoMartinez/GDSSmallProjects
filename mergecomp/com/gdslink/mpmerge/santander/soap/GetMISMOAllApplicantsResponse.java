
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="methodResult" type="{http://www.isban.es/webservices/GESTION/Gestion_m/F_mtxcor_gestion_m/sovereign/intranet/cbTypes/v1}com.banesto.al.mtxcor.gestion_m.f.cb.CBK_getMISMOAllApplicants_OUT_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "methodResult"
})
@XmlRootElement(name = "getMISMOAllApplicantsResponse", namespace = "http://www.isban.es/webservices/GESTION/Gestion_m/F_mtxcor_gestion_m/intranet/MTXSOVWS/v1")
public class GetMISMOAllApplicantsResponse {

    @XmlElement(required = true)
    protected ComBanestoAlMtxcorGestionMFCbCBKGetMISMOAllApplicantsOUTType methodResult;

    /**
     * Gets the value of the methodResult property.
     * 
     * @return
     *     possible object is
     *     {@link ComBanestoAlMtxcorGestionMFCbCBKGetMISMOAllApplicantsOUTType }
     *     
     */
    public ComBanestoAlMtxcorGestionMFCbCBKGetMISMOAllApplicantsOUTType getMethodResult() {
        return methodResult;
    }

    /**
     * Sets the value of the methodResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComBanestoAlMtxcorGestionMFCbCBKGetMISMOAllApplicantsOUTType }
     *     
     */
    public void setMethodResult(ComBanestoAlMtxcorGestionMFCbCBKGetMISMOAllApplicantsOUTType value) {
        this.methodResult = value;
    }

}
