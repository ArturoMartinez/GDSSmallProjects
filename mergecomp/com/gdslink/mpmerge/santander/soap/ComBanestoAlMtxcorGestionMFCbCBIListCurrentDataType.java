
package com.gdslink.mpmerge.santander.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for com.banesto.al.mtxcor.gestion_m.f.cb.CBI_ListCurrentData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.banesto.al.mtxcor.gestion_m.f.cb.CBI_ListCurrentData_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentData" type="{http://www.isban.es/webservices/GESTION/Gestion_m/F_mtxcor_gestion_m/sovereign/intranet/cbTypes/v1}com.banesto.al.mtxcor.gestion_m.f.cb.CBK_CurrentData_Type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "com.banesto.al.mtxcor.gestion_m.f.cb.CBI_ListCurrentData_Type", namespace = "http://www.isban.es/webservices/GESTION/Gestion_m/F_mtxcor_gestion_m/sovereign/intranet/cbTypes/v1", propOrder = {
    "currentData"
})
public class ComBanestoAlMtxcorGestionMFCbCBIListCurrentDataType {

    @XmlElement(name = "CurrentData", nillable = true)
    protected List<ComBanestoAlMtxcorGestionMFCbCBKCurrentDataType> currentData;

    /**
     * Gets the value of the currentData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currentData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrentData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComBanestoAlMtxcorGestionMFCbCBKCurrentDataType }
     * 
     * 
     */
    public List<ComBanestoAlMtxcorGestionMFCbCBKCurrentDataType> getCurrentData() {
        if (currentData == null) {
            currentData = new ArrayList<ComBanestoAlMtxcorGestionMFCbCBKCurrentDataType>();
        }
        return this.currentData;
    }

}
