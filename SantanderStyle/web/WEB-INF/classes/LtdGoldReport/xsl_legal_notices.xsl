<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">



    <xsl:template name="PublicationTowns">
        <xsl:param name="curValue"/>
        <xsl:choose>
            <xsl:when test="$curValue = 'B'">Belfast</xsl:when>
            <xsl:when test="$curValue = 'C'">Cardiff</xsl:when>
            <xsl:when test="$curValue = 'E'">Edinburgh</xsl:when>
            <xsl:when test="$curValue = 'L'">London</xsl:when>

        </xsl:choose>
    </xsl:template>

    <xsl:template name="recordTypes">
        <xsl:param name="curValue"/>
        <xsl:choose>
            <xsl:when test="$curValue = 'K'">Intention to dissolve</xsl:when>
            <xsl:when test="$curValue = 'L'">Company dissolved</xsl:when>
            <xsl:when test="$curValue = 'M'">Company reinstated</xsl:when>
        </xsl:choose>
    </xsl:template>

    <xsl:template name="xsl_legal_notices">
        <div class="section" id="legal_notices">

            <h2>legal notices</h2>
            <h3>Section 652/653 Notices</h3>
            <div class="dataValue">
                <xsl:for-each select="LegalNotices/Notice6253">
                    <div style="padding-left:15px;float:left">
                      <xsl:value-of select="DateOfNotice/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="DateOfNotice/MM"/></span>&#xA0;<xsl:value-of select="DateOfNotice/CCYY"/>    
                  </div>
                  <div style="padding-left:15px;float:left;width:200px">
                     <xsl:call-template name="recordTypes">
                        <xsl:with-param name="curValue" select="RecordType"/>
                    </xsl:call-template>
                </div>          


                <br style="clear:both"/>
            </xsl:for-each>

        </div>
        <br style="clear:both"/>


        <h3>Administrators</h3>
        <h4>Appointments of administrators</h4>
        <br style="clear:both"/>
        <br style="clear:both"/>

        <div class="dataLabel">Document Lodged At</div>
        <div class="dataValue">
            <xsl:call-template name="PublicationTowns"><xsl:with-param name="curValue" select="LegalNotices/Administrators/Appointment/PublicationTown"/></xsl:call-template> On <xsl:value-of select="LegalNotices/Administrators/Appointment/LodgedDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="LegalNotices/Administrators/Appointment/LodgedDate/MM"/></span>&#xA0;<xsl:value-of select="LegalNotices/Administrators/Appointment/LodgedDate/CCYY"/>

        </div>
        <br style="clear:both"/>
        <div class="dataLabel">Administration Order Made On</div>
        <div class="dataValue">
            <xsl:value-of select="LegalNotices/Administrators/Appointment/AdminOrderDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="LegalNotices/Administrators/Appointment/AdminOrderDate/MM"/></span>&#xA0;<xsl:value-of select="LegalNotices/Administrators/Appointment/AdminOrderDate/CCYY"/>
        </div>
        <br style="clear:both"/>
        <div class="dataLabel">Administrator Appointed</div>
        <div class="dataValue">
            <xsl:value-of select="PresentationDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="PresentationDate/MM"/></span>&#xA0;<xsl:value-of select="PresentationDate/CCYY"/>

            <xsl:for-each select="LegalNotices/Administrators/Appointment/Administrator">
                <xsl:value-of select="Name"/>
                <br style="clear:both"/>
                <xsl:value-of select="FirmName"/>
                <br style="clear:both"/>
                <xsl:value-of select="AdministratorLocation"/>


                <br style="clear:both"/>
            </xsl:for-each>

        </div>
        <br style="clear:both"/>
        <br style="clear:both"/>

        <h4>discharge of administrators</h4>
        <br style="clear:both"/>
        <br style="clear:both"/>

        <div class="dataLabel">Administration Order Discharged</div>
        <div class="dataValue">
            <xsl:value-of select="LegalNotices/Administrators/Discharge/DischargeDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="LegalNotices/Administrators/Discharge/DischargeDate/MM"/></span>&#xA0;<xsl:value-of select="LegalNotices/Administrators/Discharge/DischargeDate/CCYY"/>

        </div>
        <br style="clear:both"/>
        <div class="dataLabel">Administrator Discharged</div>

        <div class="dataValue">
            <xsl:for-each select="LegalNotices/Administrators/Discharge/Administrator">
                <xsl:value-of select="Name"/>
                <br style="clear:both"/>
                <xsl:value-of select="FirmName"/>
                <br style="clear:both"/>
                <xsl:value-of select="AdministratorLocation"/>


                <br style="clear:both"/>
            </xsl:for-each>

        </div>
        <br style="clear:both"/>


            <h3>Winding up petitions</h3>
            <xsl:for-each select="LegalNotices/WindUp/Petition">
                
                <div class="dataLabel">date of petition presentation</div>
                <div class="dataValue">
                    <xsl:value-of select="PresentationDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="PresentationDate/MM"/></span>&#xA0;<xsl:value-of select="PresentationDate/CCYY"/>
                
                </div>
                <br style="clear:both"/>
                
                <div class="dataLabel">date of petition publication</div>
                <div class="dataValue">
                    <xsl:value-of select="PublicationDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="PublicationDate/MM"/></span>&#xA0;<xsl:value-of select="PublicationDate/CCYY"/>
                </div>
                <br style="clear:both"/>
                
                <div class="dataLabel">date of hearingn</div>
                <div class="dataValue">
                    <xsl:value-of select="HearingDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="HearingDate/MM"/></span>&#xA0;<xsl:value-of select="HearingDate/CCYY"/>
             
                </div>
                <br style="clear:both"/>
                
                <div class="dataLabel">court</div>
                <div class="dataValue">
                    <xsl:value-of select="CourtName"/>
                </div>
                <br style="clear:both"/>
                
                <div class="dataLabel">petitioners</div>
                <div class="dataValue" style="width:600px">
                    <xsl:for-each select="Petitioners">
                        <div style="border-bottom:1px dotted #DDD;font-size:10px">
                            <xsl:value-of select="Name"/><br/>
                            <xsl:value-of select="PetitionerLocation/LocationLine1"/>&#xA0;
                            <xsl:value-of select="PetitionerLocation/LocationLine2"/>&#xA0;
                            <xsl:value-of select="PetitionerLocation/LocationLine3"/>&#xA0;
                            <xsl:value-of select="PetitionerLocation/LocationLine4"/>&#xA0;
                            <xsl:value-of select="PetitionerLocation/LocationLine5"/>&#xA0;
                            <xsl:value-of select="PetitionerLocation/Postcode"/>
                        </div>
                        
                    </xsl:for-each>
                </div>
                <br style="clear:both"/>
                
                <div class="dataLabel">solicitors</div>
                <div class="dataValue" style="width:600px">
                    <xsl:for-each select="Solicitors">
                        <div style="border-bottom:1px dotted #DDD;font-size:10px">
                        <xsl:value-of select="FirmName"/>&#xA0;<xsl:value-of select="Name"/><br/>
                            <xsl:value-of select="SolicitorLocation/LocationLine1"/>&#xA0;
                            <xsl:value-of select="SolicitorLocation/LocationLine2"/>&#xA0;
                            <xsl:value-of select="SolicitorLocation/LocationLine3"/>&#xA0;
                            <xsl:value-of select="SolicitorLocation/LocationLine4"/>&#xA0;
                            <xsl:value-of select="SolicitorLocation/LocationLine5"/>&#xA0;
                            <xsl:value-of select="SolicitorLocation/Postcode"/>
                        </div>
                        
                    </xsl:for-each>
                </div>
                <br style="clear:both"/>
                <div style="border-bottom:1px solid #EEE;width:100%;margin:5px 0px 10px 0px"></div>
                
            </xsl:for-each>
            
        <h3>Dismissal of winding up petition</h3>
            <xsl:for-each select="LegalNotices/WindUp/Dismissal">
            <div class="dataLabel">Date of Dismissal Publication</div>
                <div class="dataValue">

                    <xsl:value-of select="PublicationDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="PublicationDate/MM"/></span>&#xA0;<xsl:value-of select="PublicationDate/CCYY"/>

                </div>
                <br style="clear:both"/>
                
            <div class="dataLabel">Date of original petition</div>
                <div class="dataValue">

                    <xsl:value-of select="OriginalPetitionDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="OriginalPetitionDate/MM"/></span>&#xA0;<xsl:value-of select="OriginalPetitionDate/CCYY"/>

                </div>
                <br style="clear:both"/>
                
            <div class="dataLabel">Date of hearing</div>
                <div class="dataValue">

                    <xsl:value-of select="HearingDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="HearingDate/MM"/></span>&#xA0;<xsl:value-of select="HearingDate/CCYY"/>

                </div>
                <br style="clear:both"/>
                
            <div class="dataLabel">Date of petition dismissal </div>
                <div class="dataValue">

                    <xsl:value-of select="DismissalDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="DismissalDate/MM"/></span>&#xA0;<xsl:value-of select="DismissalDate/CCYY"/>

                </div>
                <br style="clear:both"/>
                
                <div style="border-bottom:1px solid #EEE;width:100%;margin:5px 0px 10px 0px"></div>
            </xsl:for-each>
            
            <h3>Winding up order</h3>
            <xsl:for-each select="LegalNotices/WindUp/Order">
                <div class="dataLabel">publication date</div>
                <div class="dataValue">
                    <xsl:value-of select="PublicationDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="PublicationDate/MM"/></span>&#xA0;<xsl:value-of select="PublicationDate/CCYY"/>
               
                </div>
                <br style="clear:both"/>
                
                <div class="dataLabel">Order date</div>
                <div class="dataValue">
                    <xsl:value-of select="OrderDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="OrderDate/MM"/></span>&#xA0;<xsl:value-of select="OrderDate/CCYY"/>
               
                </div>
                <br style="clear:both"/>
                
                <div class="dataLabel">trading name</div>
                <div class="dataValue">
                    <xsl:value-of select="TradingName"/>
                </div>
                <br style="clear:both"/>
                
                <div style="border-bottom:1px solid #EEE;width:100%;margin:5px 0px 10px 0px"></div>
            </xsl:for-each>
            
            <h3>Winding up resolution</h3>
            <xsl:for-each select="LegalNotices/WindUp/Resolution">
                <div class="dataLabel">publication date</div>
                <div class="dataValue">
                    <xsl:value-of select="PublicationDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="PublicationDate/MM"/></span>&#xA0;<xsl:value-of select="PublicationDate/CCYY"/>
               
                </div>
                <br style="clear:both"/>
                
                <div class="dataLabel">resolution date</div>
                <div class="dataValue">
                    <xsl:value-of select="ResolutionDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="ResolutionDate/MM"/></span>&#xA0;<xsl:value-of select="ResolutionDate/CCYY"/>
               
                </div>
                <br style="clear:both"/>
                
                <div class="dataLabel">trading name</div>
                <div class="dataValue">
                    <xsl:value-of select="TradingName"/>
                </div>
                <br style="clear:both"/>
                
                <div style="border-bottom:1px solid #EEE;width:100%;margin:5px 0px 10px 0px"></div>
            </xsl:for-each>
            
        <h3>Receivers And Administrative Receivers</h3>
        <h4>Appointment Of Receiver</h4>
        <br style="clear:both"/>

        <div class="dataLabel">Date Form Registered</div>
        <div class="dataValue">
            <xsl:value-of select="LegalNotices/Receiver/Appointment/LodgedDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="LegalNotices/Receiver/Appointment/LodgedDate/MM"/></span>&#xA0;<xsl:value-of select="LegalNotices/Receiver/Appointment/LodgedDate/CCYY"/>

        </div>
        <br style="clear:both"/>
        <br style="clear:both"/>
        <xsl:for-each select="LegalNotices/Receiver/Appointment/ReceiverData">
            <div class="dataLabel">Date Of Appointment</div>
            <div class="dataValue">
             <xsl:value-of select="ReceiverDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="ReceiverDate/MM"/></span>&#xA0;<xsl:value-of select="ReceiverDate/CCYY"/>

         </div>
         <br style="clear:both"/>

         <div class="dataLabel">Administrative Receiver</div>
         <div class="dataValue"  style="padding-bottom:3px">
             <xsl:value-of select="FirmName"/><xsl:if test="FirmName != ''"><br/></xsl:if><xsl:value-of select="ReceiverName"/>
             <br/><xsl:value-of select="ReceiverLocation/LocationLine1"/>,&#xA0;<xsl:value-of select="ReceiverLocation/LocationLine2"/>,&#xA0;<xsl:value-of select="ReceiverLocation/LocationLine3"/>
         </div>
         <br style="clear:both"/>
     </xsl:for-each>
     <div class="dataLabel">Instrument Date</div>
     <div class="dataValue">

        <xsl:value-of select="LegalNotices/Receiver/Appointment/InstrumentDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="LegalNotices/Receiver/Appointment/InstrumentDate/MM"/></span>&#xA0;<xsl:value-of select="LegalNotices/Receiver/Appointment/InstrumentDate/CCYY"/>
    </div>
    <br style="clear:both"/>

    <div class="dataLabel">Instrument Holder</div>
    <div class="dataValue">
        <xsl:value-of select="LegalNotices/Receiver/Appointment/InstrumentHolder/Name"/>

    </div>
    <br style="clear:both"/>

    <h4>Cessation Of Receiver</h4>
    <br style="clear:both"/>

    <div class="dataLabel">Date Form Registered</div>
    <div class="dataValue">
        <xsl:value-of select="LegalNotices/Receiver/Cessation/LodgedDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="LegalNotices/Receiver/Cessation/LodgedDate/MM"/></span>&#xA0;<xsl:value-of select="LegalNotices/Receiver/Cessation/LodgedDate/CCYY"/>

    </div>
    <br style="clear:both"/>
    <br style="clear:both"/>
    <xsl:for-each select="LegalNotices/Receiver/Cessation/ReceiverData">
        <div class="dataLabel">Date Of Cessation</div>
        <div class="dataValue">
         <xsl:value-of select="CessationDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="CessationDate/MM"/></span>&#xA0;<xsl:value-of select="CessationDate/CCYY"/>

     </div>
     <br style="clear:both"/>

     <div class="dataLabel">Receiver Ceasing To Act</div>
     <div class="dataValue"  style="padding-bottom:3px">
         <xsl:value-of select="FirmName"/><xsl:if test="FirmName != ''"><br/></xsl:if><xsl:value-of select="ReceiverName"/>
         <br/><xsl:value-of select="ReceiverLocation/LocationLine1"/>,&#xA0;<xsl:value-of select="ReceiverLocation/LocationLine2"/>,&#xA0;<xsl:value-of select="ReceiverLocation/LocationLine3"/>
     </div>
     <br style="clear:both"/>
 </xsl:for-each>

 <br style="clear:both"/>
 <h3>Meetings of Creditors</h3>

<xsl:for-each select="LegalNotices/MeetingCreditors">
<div class="dataLabel">Date Of Publication</div>
 <div class="dataValue">
    <xsl:value-of select="PublicationDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="PublicationDate/MM"/></span>&#xA0;<xsl:value-of select="PublicationDate/CCYY"/>
    
</div>
 <br style="clear:both"/>
 <div class="dataLabel">Date Of Meeting</div>
 <div class="dataValue">
    <xsl:value-of select="MeetingDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="MeetingDate/MM"/></span>&#xA0;<xsl:value-of select="MeetingDate/CCYY"/>
    
</div>
 <br style="clear:both"/>
  <div class="dataLabel">At</div>
 <div class="dataValue stringTime">
    <xsl:value-of select="MeetingTime"/>
    
</div>
 <br style="clear:both"/>  <div class="dataLabel">Venue</div>
 <div class="dataValue">
   
    <xsl:value-of select="MeetingVenue/LocationLine1"/>,&#xA0;<xsl:value-of select="MeetingVenue/LocationLine2"/>,&#xA0;<xsl:value-of select="MeetingVenue/LocationLine3"/>,&#xA0;<xsl:value-of select="MeetingVenue/Postcode"/>
</div>
 <br style="clear:both"/>
 </xsl:for-each>

 <h3>Appointment Of Liquidators</h3>
 <h4>Compulsory Liquidator</h4>
 <br style="clear:both"/>

 <div class="dataLabel">Date Of Publication</div>
 <div class="dataValue">
    <xsl:value-of select="LegalNotices/Liquidators/PublicationDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="LegalNotices/Liquidators/PublicationDate/MM"/></span>&#xA0;<xsl:value-of select="LegalNotices/Liquidators/PublicationDate/CCYY"/>

</div>
<br style="clear:both"/>
<div class="dataLabel">Date Of Appointment</div>
<div class="dataValue">
 <xsl:value-of select="LegalNotices/Liquidators/AppointmentDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="LegalNotices/Liquidators/AppointmentDate/MM"/></span>&#xA0;<xsl:value-of select="LegalNotices/Liquidators/AppointmentDate/CCYY"/>
</div>
<br style="clear:both"/>
<br style="clear:both"/>
<xsl:for-each select="LegalNotices/Liquidators/Liquidator">

    <br style="clear:both"/>

    <div class="dataLabel">Liquidator</div>
    <div class="dataValue"  style="padding-bottom:3px">
     <xsl:value-of select="Name"/>
     <br/><xsl:value-of select="LiquidatorLocation/LocationLine1"/>,&#xA0;<xsl:value-of select="LiquidatorLocation/LocationLine2"/>,&#xA0;<xsl:value-of select="LiquidatorLocation/LocationLine3"/>,&#xA0;<xsl:value-of select="LiquidatorLocation/Postcode"/>
 </div>
 <br style="clear:both"/>
</xsl:for-each>

<br style="clear:both"/>


<h3>Volontary Arrangements</h3>
<h4>Completion of Volontary Arrangements</h4>
<br style="clear:both"/>

<div class="dataLabel">Document Lodged At</div>
<div class="dataValue">
    <xsl:call-template name="PublicationTowns"><xsl:with-param name="curValue" select="LegalNotices/VolArrangement/PublicationTown"/></xsl:call-template> On <xsl:value-of select="LegalNotices/VolArrangement/LodgedDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="LegalNotices/VolArrangement/LodgedDate/MM"/></span>&#xA0;<xsl:value-of select="LegalNotices/VolArrangement/LodgedDate/CCYY"/>

</div>
<br style="clear:both"/>
<div class="dataLabel">Arrangement Approved On</div>
<div class="dataValue">
 <xsl:value-of select="LegalNotices/VolArrangement/ApprovalDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="LegalNotices/VolArrangement/ApprovalDate/MM"/></span>&#xA0;<xsl:value-of select="LegalNotices/VolArrangement/ApprovalDate/CCYY"/>
</div>
<br style="clear:both"/>
<div class="dataLabel">Completion Lodged Date</div>
<div class="dataValue">
 <xsl:value-of select="LegalNotices/VolArrangement/CessationLodgeDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="LegalNotices/VolArrangement/CessationLodgeDate/MM"/></span>&#xA0;<xsl:value-of select="LegalNotices/VolArrangement/CessationLodgeDate/CCYY"/>
</div>
<br style="clear:both"/>
<div class="dataLabel">Completion Date</div>
<div class="dataValue">
 <xsl:value-of select="LegalNotices/VolArrangement/CessationDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="LegalNotices/VolArrangement/CessationDate/MM"/></span>&#xA0;<xsl:value-of select="LegalNotices/VolArrangement/CessationDate/CCYY"/>
</div>
<br style="clear:both"/>
<div class="dataLabel">Supervisor</div>
<xsl:for-each select="LegalNotices/VolArrangement/Supervisor">

    <br style="clear:both"/>

    <div class="dataLabel">Liquidator</div>
    <div class="dataValue"  style="padding-bottom:3px">
     <xsl:value-of select="Name"/>
     <br/><xsl:value-of select="SupervisorLocation/LocationLine1"/>,&#xA0;<xsl:value-of select="SupervisorLocation/LocationLine2"/>,&#xA0;<xsl:value-of select="SupervisorLocation/LocationLine3"/>,&#xA0;<xsl:value-of select="SupervisorLocation/Postcode"/>
 </div>
 <br style="clear:both"/>
</xsl:for-each>
<br style="clear:both"/>




        </div>
    </xsl:template>
</xsl:stylesheet>
