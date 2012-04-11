
package com.gdslink.mpmerge.santander.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for com.banesto.al.mtxcor.gestion_m.f.cb.CBK_getMISMOAllApplicants_OUT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.banesto.al.mtxcor.gestion_m.f.cb.CBK_getMISMOAllApplicants_OUT_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MISMO_ApplicantLevel" type="{http://www.isban.es/webservices/GESTION/Gestion_m/F_mtxcor_gestion_m/sovereign/intranet/cbTypes/v1}com.banesto.al.mtxcor.gestion_m.f.cb.CBI_MISMO_Type" minOccurs="0"/>
 *         &lt;element name="mensaje" type="{http://www.isban.es/webservices/TDCs}DESCRIPCION_CORTA_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "com.banesto.al.mtxcor.gestion_m.f.cb.CBK_getMISMOAllApplicants_OUT_Type", namespace = "http://www.isban.es/webservices/GESTION/Gestion_m/F_mtxcor_gestion_m/sovereign/intranet/cbTypes/v1", propOrder = {
    "mismoApplicantLevel",
    "mensaje"
})
public class ComBanestoAlMtxcorGestionMFCbCBKGetMISMOAllApplicantsOUTType {

    @XmlElement(name = "MISMO_ApplicantLevel")
    protected ComBanestoAlMtxcorGestionMFCbCBIMISMOType mismoApplicantLevel;
    protected String mensaje;

    /**
     * Gets the value of the mismoApplicantLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ComBanestoAlMtxcorGestionMFCbCBIMISMOType }
     *     
     */
    public ComBanestoAlMtxcorGestionMFCbCBIMISMOType getMISMOApplicantLevel() {
        return mismoApplicantLevel;
    }

    /**
     * Sets the value of the mismoApplicantLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComBanestoAlMtxcorGestionMFCbCBIMISMOType }
     *     
     */
    public void setMISMOApplicantLevel(ComBanestoAlMtxcorGestionMFCbCBIMISMOType value) {
        this.mismoApplicantLevel = value;
    }

    /**
     * Gets the value of the mensaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Sets the value of the mensaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

}
