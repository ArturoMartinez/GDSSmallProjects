
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for com.banesto.al.mtxcor.gestion_m.f.cb.CBK_getMISMOAllApplicants_IN_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.banesto.al.mtxcor.gestion_m.f.cb.CBK_getMISMOAllApplicants_IN_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BureauId" type="{http://www.isban.es/webservices/TDCs}ENTERO_LARGO_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "com.banesto.al.mtxcor.gestion_m.f.cb.CBK_getMISMOAllApplicants_IN_Type", namespace = "http://www.isban.es/webservices/GESTION/Gestion_m/F_mtxcor_gestion_m/sovereign/intranet/cbTypes/v1", propOrder = {
    "bureauId"
})
public class ComBanestoAlMtxcorGestionMFCbCBKGetMISMOAllApplicantsINType {

    @XmlElement(name = "BureauId")
    protected Long bureauId;

    /**
     * Gets the value of the bureauId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBureauId() {
        return bureauId;
    }

    /**
     * Sets the value of the bureauId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBureauId(Long value) {
        this.bureauId = value;
    }

}
