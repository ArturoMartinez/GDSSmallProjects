<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

    <xsl:template name="worstValues">
        <xsl:param name="curValue" />
        <xsl:choose>
            <xsl:when test="$curValue = '0'">Satisfactory</xsl:when>
            <xsl:when test="$curValue = '1'">1 Month Delinquent</xsl:when>
            <xsl:when test="$curValue = '2'">2 Month Delinquent</xsl:when>
            <xsl:when test="$curValue = '3'">3 Month Delinquent</xsl:when>
            <xsl:when test="$curValue = '4'">4 Month Delinquent</xsl:when>
            <xsl:when test="$curValue = '5'">5 Month Delinquent</xsl:when>
            <xsl:when test="$curValue = '6'">6 Month Delinquent</xsl:when>
            <xsl:when test="$curValue = '8'">Default</xsl:when>
            <xsl:when test="$curValue = '9'">Bad Debt</xsl:when>
            <xsl:when test="$curValue = 'S'">Slow Payer</xsl:when>
            <xsl:when test="$curValue = 'U'">Unclassified</xsl:when>
            <xsl:when test="$curValue = 'D'">Dormant</xsl:when>
            <xsl:when test="$curValue = '?'">Unknown Status</xsl:when>
            <xsl:when test="/RawBureauData/IsPATHSViewReport = 1"><xsl:value-of select="$curValue" /></xsl:when>
        </xsl:choose>
    </xsl:template>


    <xsl:template name="locationCodeType">
     <xsl:param name="locationCode"/>
     <xsl:choose>
         <xsl:when test="$locationCode = '01'">Current Location</xsl:when>
         <xsl:when test="$locationCode = '02'">1st Previous Location</xsl:when>
         <xsl:when test="$locationCode = ' 03'">2nd  Previous Location</xsl:when>
         <xsl:when test="$locationCode = '04'">3rd Previous Location </xsl:when>
         <xsl:when test="$locationCode = '05'">4th Previous Location </xsl:when>
         <xsl:when test="$locationCode = '06'">5th Previous Location </xsl:when>
         <xsl:when test="$locationCode = '07'">6th Previous Location </xsl:when>
         <xsl:when test="$locationCode = '08'">7th Previous Location </xsl:when>
         <xsl:when test="$locationCode = ' 09'">8th Previous Location</xsl:when>
         <xsl:when test="$locationCode = 'C_'">Correspondence Location</xsl:when>
         <xsl:when test="$locationCode = 'E_'">Employment Location</xsl:when>
         <xsl:when test="$locationCode = 'D_'">Delivery Location</xsl:when>
         <xsl:when test="$locationCode = 'O_'">Other Location / Not Known</xsl:when>
         <xsl:when test="/RawBureauData/IsPATHSViewReport = 1"><xsl:value-of select="$locationCode" /></xsl:when>
     </xsl:choose>
 </xsl:template>

 <xsl:template name="DBSourceType">
    <xsl:param name="pSource"/>
    <xsl:choose>
        <xsl:when test="$pSource = 'N'">Normal database</xsl:when>
        <xsl:when test="$pSource = 'B'">Backup database</xsl:when>
        <xsl:when test="$pSource = 'T'">Test database</xsl:when>
        <xsl:when test="$pSource = 'G'">Generic Test database</xsl:when>
        <xsl:when test="$pSource = ''">Not Found</xsl:when>
        <xsl:when test="/RawBureauData/IsPATHSViewReport = 1"><xsl:value-of select="$pSource" /></xsl:when>
    </xsl:choose>
</xsl:template>

<xsl:template name="xsl_summary">
    <div class="section" id="summary">
        <h2>summary</h2>

        <h3 style="font-weight:bold">search details</h3>
        <xsl:for-each select="ConsumerOutput/Applicant">


            <div class="dataLabel" style="height:30px">person <xsl:value-of select="position()" disable-output-escaping="no"/></div>
            <div class="dataValue">
                <div style="float:left;width:400px">
                    <xsl:call-template name="commaSeparatedValue"><xsl:with-param name="curValue" select="Name/*"/><xsl:with-param name="separator" select="' '"/></xsl:call-template>
                    <br/>
                    <xsl:call-template name="locationCodeType"><xsl:with-param name="locationCode" select="../../ConsumerOutput/Residency[position()]/LocationCode"/></xsl:call-template>,
                    <xsl:value-of select="../../ConsumerOutput/LocationDetails[position()]/FormattedLocation" />
                </div>

                <div style="float:left;width:400px">
                    <div style="float:left">
                        <strong>Match</strong><br/>
                        <xsl:choose>
                            <xsl:when test="../../ConsumerOutput/Residency[position()]/VRConfirmation/Confirmed = 'Y'">
                                Person
                            </xsl:when>
                            <xsl:when test="/RawBureauData/IsPATHSViewReport = 1">ConsumerOutput/Residency[position()]/VRConfirmation/Confirmed</xsl:when>
                        </xsl:choose>
                    </div>
                    <div style="float:left;margin-left:10px">
                        <strong>Source</strong><br/>
                        <xsl:choose>
                            <xsl:when test="../../ConsumerOutput/Residency[position()]/VRConfirmation/Confirmed = 'Y'">
                                Voters Roll

                            </xsl:when>
                            <xsl:when test="/RawBureauData/IsPATHSViewReport = 1">ConsumerOutput/Residency[position()]/VRConfirmation/Confirmed</xsl:when>
                        </xsl:choose>
                           - <xsl:call-template name="DBSourceType"><xsl:with-param name="pSource"  select="../../ConsumerOutput/FullConsumerData/ConsumerData/VotersRollPerson[position()]/VRollPersonDetails/InformationSource"/></xsl:call-template>
                      
                    </div>
                </div>
            </div>

        </xsl:for-each>

        <br style="clear:both"/>
        <div class="dataLabel" >match</div>
        <div class="dataValue" id="notFound"></div>
        <br style="clear:both"/>


        <div class="dataLabel">source</div>
        <div class="dataValue" id="notFound"></div>
        <br style="clear:both"/>

         <div style="float:left; width:50%">
        <h3  style="margin-top:0px;font-weight:bold">public information</h3>

       
            <div class="dataLabel">number</div>
            <div class="dataValue">
                <xsl:value-of select="ConsumerOutput/FullConsumerData/ConsumerDataSummary/SummaryDetails/PublicInfoSummary/Number"/>
             </div>

             <div class="dataLabel numeric">total amount</div>
            <div class="dataValue num ">
                <xsl:value-of select="ConsumerOutput/FullConsumerData/ConsumerDataSummary/SummaryDetails/PublicInfoSummary/TotalAmount"/>
            </div>

             <div class="dataLabel">latest</div>
             <div class="dataValue stringDateToReadable">
                <xsl:value-of select="ConsumerOutput/FullConsumerData/ConsumerDataSummary/SummaryDetails/PublicInfoSummary/DateOfLatest"/>
                    
             </div>
<!--
             <div class="dataLabel">Satisfaction Date</div>
             <div class="dataValue">
              <xsl:call-template name="oneRowDate">
                      <xsl:with-param name="curValue" select="ConsumerOutput/FullConsumerData/ConsumerData/PublicInformation/PublicInfoDetails/SatisfactionDate"/>
                             </xsl:call-template>
             </div>
-->
        </div>
          <div style="float:left; width:49%;border-left:1px dotted #999">

                    <h3 style="margin-top:0px;font-weight:bold">Previous searches</h3>

                    <div class="dataLabel">0-3 months</div>
                    <div class="dataValue">
                        <xsl:value-of select="ConsumerOutput/FullConsumerData/ConsumerDataSummary/SummaryDetails/CAISSummary/CAISPrevSearches/NumberUpTo3Months"/>
                    </div>

                    <div class="dataLabel">4-6 months</div>
                    <div class="dataValue">
                        <xsl:value-of select="ConsumerOutput/FullConsumerData/ConsumerDataSummary/SummaryDetails/CAISSummary/CAISPrevSearches/Num3To6Months"/>
                    </div>

                    <div class="dataLabel">7-12 months</div>
                    <div class="dataValue">
                        <xsl:value-of select="ConsumerOutput/FullConsumerData/ConsumerDataSummary/SummaryDetails/CAISSummary/CAISPrevSearches/Num6To12Months"/>
                    </div>
        </div>
 <br style="clear:both"/>
 <div style="float:left; width:50%">
                    <h3 style="font-weight:bold">messages</h3>
                    <div class="dataLabel"> </div>
                    <div class="dataValue" style="text-align:center; font-weight:bold; color:#C00">
                        <!--<xsl:choose>
                            <xsl:when test="not(ConsumerOutput/Applicant/Alias)">
                                No potential Alias Data
                            </xsl:when>
                            <xsl:when test="ConsumerOutput/Applicant/Alias = '' ">
                                No potential Alias Data
                            </xsl:when>
                            <xsl:when test="/RawBureauData/IsPATHSViewReport = 1"> if ConsumerOutput/Applicant/Alias = '' then 'No potential Alias Data'</xsl:when>
                        </xsl:choose>-->
                            <xsl:choose>
                            <xsl:when test="ConsumerOutput/ConsumerSummary/PremiumValueData/Director/NDDIRSP='Y'">
                                <br/>Director
                            </xsl:when>
                            <xsl:when test="/RawBureauData/IsPATHSViewReport = 1"> if ConsumerOutput/ConsumerSummary/PremiumValueData/Director/NDDIRSP='Y' then 'Director'</xsl:when>
                        </xsl:choose>
                        <xsl:choose>
                            <xsl:when test="ConsumerOutput/FullConsumerData/ConsumerData/Association/AssociationDetails!=''">
                                <br/>Associates Present
                            </xsl:when>
                            <xsl:when test="/RawBureauData/IsPATHSViewReport = 1"> if ConsumerOutput/FullConsumerData/ConsumerData/Association/AssociationDetails != '' then 'Associates Present'</xsl:when>
                        </xsl:choose>

                        <xsl:choose>
                            <xsl:when test="count(ConsumerOutput/FullConsumerData/ConsumerData/CIFAS/CIFASDetails)>0">
                                <br/>CIFAS Data Present
                            </xsl:when>
                            <xsl:when test="/RawBureauData/IsPATHSViewReport = 1"> if count(ConsumerOutput/FullConsumerData/ConsumerData/CIFAS/CIFASDetails)>0 then 'CIFAS Data Present'</xsl:when>
                        </xsl:choose>

                        <xsl:choose>
                            <xsl:when test="count(ConsumerOutput/FullConsumerData/ConsumerData/LocationLink/LocationLinkDetails)>0">
                                <br/> Previous Address / Occupant
                            </xsl:when>
                            <xsl:when test="/RawBureauData/IsPATHSViewReport = 1"> if count(ConsumerOutput/FullConsumerData/ConsumerData/LocationLink/LocationLinkDetails)>0 then 'Previous Address / Occupant'</xsl:when>
                        </xsl:choose>

                        <xsl:choose>
                            <xsl:when test="ConsumerOutput/FullConsumerData/ConsumerData/CAIS/CAISDetails/SpecialInstrInd = 'M' ">
                                <br/> Debt Management Program
                            </xsl:when>
                            <xsl:when test="/RawBureauData/IsPATHSViewReport = 1"> if ConsumerOutput/FullConsumerData/ConsumerData/CAIS/CAISDetails/SpecialInstrInd = 'M' then 'Debt Management Program'</xsl:when>
                        </xsl:choose>


                    </div>
                   </div>
<div style="float:left; width:49%;border-left:1px dotted #999">
                    <h3 style="font-weight:bold">CAIS</h3>
                    <div class="dataLabel">number</div>
                    <div class="dataValue">
                        <xsl:value-of
                            select="ConsumerOutput/FullConsumerData/ConsumerDataSummary/SummaryDetails/CAISSummary/Number"
                            />
                        </div>
                        <div class="dataLabel">total balance</div>
                        <div class="dataValue num">
                            <xsl:value-of
                                select="ConsumerOutput/FullConsumerData/ConsumerDataSummary/SummaryDetails/CAISSummary/TotalBalance"
                                />
                            </div>
                            <div class="dataLabel">worst current</div>
                            <div class="dataValue">
                                <xsl:call-template name="worstValues"> <xsl:with-param name="curValue" select="ConsumerOutput/FullConsumerData/ConsumerDataSummary/SummaryDetails/CAISSummary/WorstCurrent" /> </xsl:call-template>
                            </div>
                            <div class="dataLabel">worst historical</div>
                            <div class="dataValue">
                               <xsl:call-template name="worstValues"> <xsl:with-param name="curValue" select="ConsumerOutput/FullConsumerData/ConsumerDataSummary/SummaryDetails/CAISSummary/WorstHistorical" /> </xsl:call-template>

                           </div>

                           <!--<div class="dataLabel">worst status</div>
                           <div class="dataValue">
                               <xsl:call-template name="worstValues"> <xsl:with-param name="curValue" select="ConsumerOutput/FullConsumerData/ConsumerData/CAIS/CAISDetails/WorstStatus" /> </xsl:call-template>

                           </div>-->

                           </div>

                           <br style="clear:both"/>

                           <br/>
                       </div>
                   </xsl:template>
               </xsl:stylesheet>
