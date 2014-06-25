<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

    <xsl:template name="sepcFlag" >
        <xsl:choose>
            <xsl:when test="SpecialInstrInd='A'">Arrangement</xsl:when>
            <xsl:when test="SpecialInstrInd='C'">Debt Assigned</xsl:when>
            <xsl:when test="SpecialInstrInd='D'">Deceased</xsl:when>
            <xsl:when test="SpecialInstrInd='G'">Gone Away</xsl:when>
            <xsl:when test="SpecialInstrInd='I'">Credit Insurance Claim</xsl:when>
            <xsl:when test="SpecialInstrInd='M'">Debt Management Program</xsl:when>
            <xsl:when test="SpecialInstrInd='P'">Partial Settlement</xsl:when>
            <xsl:when test="SpecialInstrInd='Q'">Account Query</xsl:when>
            <xsl:when test="SpecialInstrInd='R'">Recourse</xsl:when>
            <xsl:when test="SpecialInstrInd='V'">Voluntary Termination</xsl:when>
            <xsl:when test="/RawBureauData/IsPATHSViewReport = 1">ConsumerOutput/FullConsumerData/ConsumerData/CAIS/CAISDetails/SpecialInstrInd</xsl:when>
        </xsl:choose>
    </xsl:template>

    <xsl:template name="AccStatus" >
        <xsl:choose>
            <xsl:when test="AccountStatus='F'">
                <div class="CAISAccountStatus" style="background:#ef2525">Default</div>
            </xsl:when>
            <xsl:when test="AccountStatus='A'">
                <div class="CAISAccountStatus" style="background:#58c658">Active</div>
            </xsl:when>
            <xsl:when test="AccountStatus='S'">
                <div class="CAISAccountStatus" style="background:#ffea00">Settled</div>
            </xsl:when>
            <xsl:when test="AccountStatus='D'">
             <div class="CAISAccountStatus" style="background:#e97300">Delinquent</div>
         </xsl:when>
     </xsl:choose>
 </xsl:template>

 <xsl:template name="xsl_CAIS">
    <xsl:param name="acctStatus"/>

    <xsl:for-each select="ConsumerOutput/FullConsumerData/ConsumerData/CAIS">


        <xsl:for-each select="CAISDetails">
           <xsl:if test="AccountStatus=$acctStatus or /RawBureauData/IsPATHSViewReport = 1">


            <div id="CAISDetailsDIV" style="margin:10px 0px 0px 10px;border-top:1px dotted #bbb">

                <br style="clear:both"/>
                <div class="dataValue">
                    <div style="float:left">
                        <strong>&#x2022;&#xA0;</strong>
                        <xsl:value-of select="Name/Title"/>&#xA0;
                        <xsl:value-of select="Name/Forename"/>&#xA0;
                        <xsl:value-of select="Name/MiddleName"/>&#xA0;
                        <xsl:value-of select="Name/Surname"/>&#xA0;

                        <xsl:value-of select="Location/HouseNumber"/>&#xA0;
                        <xsl:value-of select="Location/Street"/>&#xA0;
                        <xsl:value-of select="Location/Street2"/>&#xA0;
                        <xsl:value-of select="Location/PostTown"/>&#xA0;
                        <xsl:value-of select="Location/Postcode"/>&#xA0;
                        <xsl:value-of select="Location/Country"/>
                    </div>
                    <xsl:call-template name="AccStatus"/>
                </div>
                <br style="clear:both"/>
                <div class="dataLabel">current status</div>
                <div class="dataValue ">
                    <xsl:value-of select="substring (AccountStatusCodes, 1, 1)"/>&#xA0;

                    <xsl:value-of select="substring (AccountStatusCodes, 2, string-length(AccountStatusCodes)-1)"/>

                </div>

                <div class="dataLabel">worst status</div>
                <div class="dataValue">
                    <xsl:value-of select="WorstStatus"/>
                </div>


                <div class="dataLabel">date of birth</div>
                <div class="dataValue">
                    <xsl:value-of select="DateOfBirth/DD"/>&#160;
                    <span class="toMonthName"><xsl:value-of select="DateOfBirth/MM"/></span>&#160;
                    <xsl:value-of select="DateOfBirth/CCYY"/>&#160;
                </div>


                <div class="dataLabel">company type</div>
                <div class="dataValue">
                    <xsl:call-template name="companyTypeValues"> <xsl:with-param name="curValue" select="CompanyType" /> </xsl:call-template>

                </div>

                <div class="dataLabel">account type</div>
                <div class="dataValue">
                   <xsl:call-template name="accountTypeValues"> <xsl:with-param name="curValue" select="AccountType" /> </xsl:call-template>

               </div>


               <div class="dataLabel" style="white-space:nowrap">status 1-2 (<xsl:value-of select="NumOfMonthsHistory"/>mths)</div>
               <div class="dataValue">
                <xsl:value-of select="Status1To2"/>
            </div>

            <div class="dataLabel" style="white-space:nowrap">status 3+ (<xsl:value-of select="NumOfMonthsHistory"/>mths)</div>
            <div class="dataValue">
                <xsl:value-of select="StatusTo3"/>
            </div>

            <div class="dataLabel"><xsl:choose>
                    <xsl:when test="RepaymentPeriods/RepaymentPeriod=0">
                        Monthly payment
                    </xsl:when>
                    <xsl:otherwise>
                        Payment terms
                    </xsl:otherwise>
                </xsl:choose></div>
            <div class="dataValue">
                
                <xsl:for-each select="MnthlyRepayment">
                    <xsl:choose>
                        <xsl:when test="../RepaymentPeriods/RepaymentPeriod[position()]=0">
                            <xsl:value-of select="MnthlyRepayment"/>
                        </xsl:when>
                        <xsl:otherwise>
                            <xsl:value-of select="MnthlyRepayment"/> x <xsl:value-of select="../RepaymentPeriods/RepaymentPeriod[position()]"/>&#160;months
                        </xsl:otherwise>
                    </xsl:choose>
                    
                    
                    <br/> 
                </xsl:for-each>
            </div>




            <div class="dataLabel">
                <xsl:choose>
                    <xsl:when test="CreditLimit/Caption='O'">
                        Overdraft Limit
                    </xsl:when>
                    <xsl:otherwise>
                        credit limit
                    </xsl:otherwise>
                </xsl:choose>
            </div>
            <div class="dataValue">&#160;
             <xsl:value-of select="CreditLimit/Amount"/>
         </div>




         <div class="dataLabel">start date</div>
         <div class="dataValue">
            <xsl:value-of select="CAISAccStartDate/DD"/>&#160;
            <span class="toMonthName"><xsl:value-of select="CAISAccStartDate/MM"/></span>&#160;
            <xsl:value-of select="CAISAccStartDate/CCYY"/>&#160;
        </div>

        <div class="dataLabel">default date</div>
        <div class="dataValue" id="notFound">???</div>

        <div class="dataLabel">current balance</div>
        <div class="dataValue num ">
            <xsl:choose>
                <xsl:when test="Balance/Narrative='T'">
                    Satisfied
                </xsl:when>
                <xsl:when test="Balance/Narrative='U'">
                    Unknown
                </xsl:when>
                <xsl:when test="Balance/Narrative='R'">
                    Recoursed
                </xsl:when>
                <xsl:when test="Balance/Narrative='S'">
                    Settled
                </xsl:when>
                <xsl:otherwise>
                    <xsl:value-of select="Balance/Amount"/>
                </xsl:otherwise>
            </xsl:choose>

        </div>



        <div class="dataLabel">default balance</div>
        <div class="dataValue num ">
            <xsl:value-of select="CurrentDefBalance/Amount"/>
        </div>

        <div class="dataLabel">CAIS last updated</div>
        <div class="dataValue ">
            <xsl:call-template name="oneRowDate">
                <xsl:with-param name="curValue" select="LastUpdatedDate"/>
            </xsl:call-template>
        </div>

        <div class="dataLabel">
            <xsl:choose>
                <xsl:when test="AccountStatus='F'">
                    Default
                </xsl:when>
                <xsl:otherwise>
                    Settlement
                </xsl:otherwise>
            </xsl:choose>
            &#xA0;Date</div>
            <div class="dataValue ">
                <xsl:call-template name="oneRowDate">
                    <xsl:with-param name="curValue" select="SettlementDate"/>
                </xsl:call-template>
            </div>


            <xsl:if test="JointAccount='M'">
                <strong>Joint Account</strong>
            </xsl:if>

            <xsl:if test="JointAccount='J'">
                <strong>Joint Account</strong>
            </xsl:if>

            <div style="padding-left:300px"><strong><xsl:call-template name="sepcFlag"/></strong></div>
        </div>
    </xsl:if>
</xsl:for-each>
</xsl:for-each>

</xsl:template>
</xsl:stylesheet>
