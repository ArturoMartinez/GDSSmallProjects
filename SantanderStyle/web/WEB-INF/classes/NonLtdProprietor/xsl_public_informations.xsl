<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

 <xsl:template name="InformationTypeCodes">
        <xsl:param name="curValue" />
   <xsl:choose>
<xsl:when test="$curValue ='01'">  Bill of Sale 01 </xsl:when>
<xsl:when test="$curValue ='02'">  Judgement </xsl:when>
<xsl:when test="$curValue ='03'">  Bankrupt  </xsl:when>
<xsl:when test="$curValue ='04'">  Transferred to Default 04 </xsl:when>
<xsl:when test="$curValue ='05'">  Transferred to Default 05 </xsl:when>
<xsl:when test="$curValue ='06'">  Red Ink </xsl:when>
<xsl:when test="$curValue ='07'">  Green Ink </xsl:when>
<xsl:when test="$curValue ='08'">  Traced Account  </xsl:when>
<xsl:when test="$curValue ='09'">  Repossession  </xsl:when>
<xsl:when test="$curValue ='10'">  Previously NA’d </xsl:when>
<xsl:when test="$curValue ='11'">  Bad Debt  </xsl:when>
<xsl:when test="$curValue ='12'">  Slow Payer  </xsl:when>
<xsl:when test="$curValue ='13'">  Loan from Money Lenders </xsl:when>
<xsl:when test="$curValue ='14'">  Administration Order  </xsl:when>
<xsl:when test="$curValue ='15'">  Bad Account </xsl:when>
<xsl:when test="$curValue ='16'">  Set Aside Judgement </xsl:when>
<xsl:when test="$curValue ='17'">  Satisfied Judgement </xsl:when>
<xsl:when test="$curValue ='18'">  CSA Judgement </xsl:when>
<xsl:when test="$curValue ='19'">  CSA Set Aside </xsl:when>
<xsl:when test="$curValue ='20'">  CSA Satisfied </xsl:when>
<xsl:when test="$curValue ='21'">  Unknown </xsl:when>
<xsl:when test="$curValue ='22'">  Unknown </xsl:when>
<xsl:when test="$curValue ='23'">  Unknown </xsl:when>
<xsl:when test="$curValue ='24'">  Receiving Order </xsl:when>
<xsl:when test="$curValue ='25'">  Notice of Bankruptcy (Adjudication) </xsl:when>
<xsl:when test="$curValue ='26'">  Order of Discharge  </xsl:when>
<xsl:when test="$curValue ='27'">  Adjudication Annulled </xsl:when>
<xsl:when test="$curValue ='28'">  Receiving Order Rescinded </xsl:when>
<xsl:when test="$curValue ='29'">  Administration Order  </xsl:when>
<xsl:when test="$curValue ='30'">  Administration Order Revoked  </xsl:when>
<xsl:when test="$curValue ='31'">  Administration Order Varied </xsl:when>
<xsl:when test="$curValue ='32'">  Petition  </xsl:when>
<xsl:when test="$curValue ='33'">  Sequestration </xsl:when>
<xsl:when test="$curValue ='34'">  Petition Dismissed  </xsl:when>
<xsl:when test="$curValue ='35'">  Trustees And Commissioners  </xsl:when>
<xsl:when test="$curValue ='36'">  Set Aside Admin Order </xsl:when>
<xsl:when test="$curValue ='37'">  Deed of Arrangement </xsl:when>
<xsl:when test="$curValue ='38'">  Bankruptcy Order  </xsl:when>
<xsl:when test="$curValue ='39'">  Certificate of Unenforceability </xsl:when>
<xsl:when test="$curValue ='40'">  Satisfied Administration Order  </xsl:when>
<xsl:when test="$curValue ='41'">  Bankruptcy Order Annulled </xsl:when>
<xsl:when test="$curValue ='42'">  Voluntary Arrangement </xsl:when>
<xsl:when test="$curValue ='43'">  Voluntary Arrangement Revoked </xsl:when>
<xsl:when test="$curValue ='44'">  Voluntary Arrangement Suspended </xsl:when>
<xsl:when test="$curValue ='45'">  Voluntary Arrangement Failed  </xsl:when>
<xsl:when test="$curValue ='46'">  Voluntary Arrangement Completed </xsl:when>
<xsl:when test="$curValue ='47'">  Conditional Order of Discharge  </xsl:when>
<xsl:when test="$curValue ='48'">  Order of Discharge Rescinded  </xsl:when>
<xsl:when test="$curValue ='49'">  Order of Discharge Rescinded, Varied  </xsl:when>
<xsl:when test="$curValue ='50'">  Irish Adjunction  </xsl:when>
<xsl:when test="$curValue ='51'">  Order of Discharge Revoked  </xsl:when>
<xsl:when test="$curValue ='52'">  Adjudication Annulled </xsl:when>
<xsl:when test="$curValue ='53'">  Order of Discharge  </xsl:when>
<xsl:when test="$curValue ='54'">  Order of Discharge Suspended  </xsl:when>
<xsl:when test="$curValue ='55'">  Unknown </xsl:when>
<xsl:when test="$curValue ='56'">  Bill of Sale  </xsl:when>
<xsl:when test="$curValue ='57'">  Satisfaction of Bill Of Sale  </xsl:when>
<xsl:when test="$curValue ='58'">  Discovery Order </xsl:when>
<xsl:when test="$curValue ='59'">  Satisfied Discovery Order </xsl:when>
<xsl:when test="$curValue ='60'">  Bankruptcy Restriction Order  </xsl:when>
<xsl:when test="$curValue ='61'">  Bankruptcy Restriction Undertaking  </xsl:when>
<xsl:when test="$curValue ='62'">  Income Payment Order  </xsl:when>
<xsl:when test="$curValue ='63'">  Income Payment Agreement  </xsl:when>
<xsl:when test="$curValue ='64'">  Fast Track Voluntary Arrangement  </xsl:when>
<xsl:when test="$curValue ='65'">  Debt Arrangement  </xsl:when>
<xsl:when test="$curValue ='66'">  Debt Arrangement Discharge  </xsl:when>
<xsl:when test="$curValue ='67'">  Inhibition  </xsl:when>
<xsl:when test="$curValue ='68'">  Inhibition Dismissed  </xsl:when>
<xsl:when test="$curValue ='69'">   -  </xsl:when>
<xsl:when test="$curValue ='70'">  Scottish Trust Deed </xsl:when>
<xsl:when test="$curValue ='71'">  Confiscation Order  </xsl:when>
<xsl:when test="$curValue ='72'">  Debt Relief Order   </xsl:when>
<xsl:when test="$curValue ='73'">  Tax Lien  </xsl:when>
<xsl:when test="$curValue ='74'">  High Court Judgment </xsl:when>
<xsl:when test="$curValue ='75'">  High Court Judgment Satisfied </xsl:when>
<xsl:when test="$curValue ='76'">  High Court Judgment Set Aside </xsl:when>
<xsl:when test="$curValue ='77'">  Debt Relief Restriction Order </xsl:when>
<xsl:when test="$curValue ='78'">  Debt Relief Restriction Undertaking </xsl:when>
<xsl:when test="/RawBureauData/IsPATHSViewReport = 1"><xsl:value-of select="$curValue" /></xsl:when>
  </xsl:choose>
</xsl:template>






    <xsl:template name="xsl_public_informations">
        <div class="section" id="public_informations">
            <h2>public informations</h2>
            <xsl:for-each select="ConsumerOutput/FullConsumerData/ConsumerData/PublicInformation/PublicInfoDetails">
                <div  style="margin-left:15px;width:100%">
                      
                     <xsl:call-template name="commaSeparatedValue"><xsl:with-param name="separator" select="' '"/><xsl:with-param name="curValue" select="Name/*"/></xsl:call-template>
                     -
                    <xsl:call-template name="commaSeparatedValue"><xsl:with-param name="curValue" select="Location/*"/></xsl:call-template>

                     
                    
                   <br style="clear:both"/>
                    
                    <div class="dataLabel">date</div>
                    <div class="dataValue" style="font-weight:normal">
                        <xsl:call-template name="oneRowDate"><xsl:with-param name="curValue" select="InformationDate"/></xsl:call-template>

                        

                    </div>

                    <div class="dataLabel">court name</div><div class="dataValue" style="font-weight:normal"><xsl:value-of select="substring-after(CourtPlaintiff,' ')"/></div>
                    
                    <div class="dataLabel">amount</div>
                    <div class="dataValue num" style="font-weight:normal">
                        <xsl:value-of select="AmountPounds"/>
                    </div>
                    
                    <div class="dataLabel">case number</div><div class="dataValue" style="font-weight:normal"><xsl:value-of select="substring-before(CourtPlaintiff,' ')"/></div>
                   
                    
                    <div class="dataLabel">type</div><div class="dataValue" style="font-weight:normal">
                        <xsl:call-template name="InformationTypeCodes"><xsl:with-param name="curValue" select="InformationType"/></xsl:call-template>
                    </div>

                    <div class="dataLabel">Satisfaction Date</div>
                    <div class="dataValue" style="font-weight:normal">
                        <xsl:call-template name="oneRowDate"><xsl:with-param name="curValue" select="SatisfactionDate"/></xsl:call-template>
                    </div>


                </div>
                 <br style="clear:both"/>
            </xsl:for-each>
           <div class="dataLabel">latest</div><div class="dataValue stringDateToReadable" style="font-weight:normal">
           <xsl:value-of select="ConsumerOutput/FullConsumerData/ConsumerDataSummary/SummaryDetails/PublicInfoSummary/DateOfLatest"/>
         </div>
                    <br style="clear:both"/>
        </div>
    </xsl:template>
</xsl:stylesheet>
