<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="xsl_management_information">
        <div class="section" id="management_information">


            <h2>management information</h2>

<!--
            <div class="dataLabel" style="clear:both;width:400px">Number of convictions held by current board</div>
            <div class="dataValue">
                <xsl:value-of select="LimitedCompanyDelphiDirector/NumConvictions"/>
            </div>

            <div class="dataLabel" style="clear:both;width:400px">Number of failures of directorships held by current board</div>
            <div class="dataValue">
                <xsl:value-of select="LimitedCompanyDelphiDirector/NumFailures"/>
            </div>

            <div class="dataLabel" style="clear:both;width:400px">Number of Creditor Wind Downs of Directorships held by current board</div>
            <div class="dataValue">
                <xsl:value-of select="LimitedCompanyDelphiDirector/DirectorhsipsCreditorWindDown"/>
            </div>
            
                <br style="clear:both"/>-->


            <h3>current directors</h3>
            <xsl:for-each select="ManagementInfo/Directors/CurrentDirector">
                <div class="dataLabel">name</div>
                <div class="dataValue">
                    <xsl:value-of select="DirectorDetails/Name/Prefix"/>
                &#xA0;<xsl:value-of select="DirectorDetails/Name/Forename"/>
                &#xA0;<xsl:value-of select="DirectorDetails/Name/MiddleNames"/>
                &#xA0;<xsl:value-of select="DirectorDetails/Name/SurName"/>
                </div>
                <div class="dataLabel" style="clear:both">address</div>
                <div class="dataValue" style="width:auto;overflow:auto;font-size:10px">

                    <xsl:call-template name="commaSeparatedValue"><xsl:with-param name="curValue" select="DirectorDetails/Location/*"/><xsl:with-param name="ignoredNode" select="'RMC'"/></xsl:call-template>

                </div>
                <div class="dataLabel" style="clear:both">date of birth</div>
                <div class="dataValue">

                    <xsl:value-of select="DirectorDetails/DateOfBirth/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="DirectorDetails/DateOfBirth/MM"/></span>&#xA0;<xsl:value-of select="DirectorDetails/DateOfBirth/CCYY"/>
               
                   
                </div>
                <div class="dataLabel" style="clear:both">position</div>
                <div class="dataValue">
                    <xsl:value-of select="DirectorDetails/Position"/>
                </div>
                <div class="dataLabel" style="clear:both">nationality</div>
                <div class="dataValue">
                    <xsl:value-of select="DirectorDetails/Nationality"/>
                </div>
                <div class="dataLabel" style="clear:both">occupation</div>
                <div class="dataValue">
                    <xsl:value-of select="DirectorDetails/Occupation"/>
                </div>
                <div class="dataLabel" style="clear:both"><xsl:if test="AppointmentIndicator='E'">date appointed</xsl:if><xsl:if test="AppointmentIndicator='P'">appointed prior to</xsl:if></div>
                <div class="dataValue">
                    <xsl:value-of select="AppointmentDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="AppointmentDate/MM"/></span>&#xA0;<xsl:value-of select="AppointmentDate/CCYY"/>
                </div>
                <br style="clear:both"/>
             
                <div style="width:100%;border-bottom:1px solid #EEE;margin:5px 0px 10px 0px"></div>
                
            </xsl:for-each>

                <!--<div class="dataLabel" style="clear:both;min-width:300px">Number of disqualified current directors</div>
                <div class="dataValue">
                    <xsl:value-of select="ScoringData/NumDisqCurrDirs"/>
                </div>

                <div class="dataLabel" style="clear:both;min-width:300px">% of directors resident in UK (1 dp)</div>
                <div class="dataValue">
                    <xsl:value-of select="ScoringData/PercentageDirsResidentUK"/>
                </div>

                 <div class="dataLabel" style="clear:both;min-width:300px">Directors CIFAS flag</div>
                <div class="dataValue">
                  <xsl:variable name="curCifasFlag" select="ScoringData/DirectorsCIFASFlag"/>
                  <xsl:if test="$curCifasFlag = Y">Information detected</xsl:if>
                  <xsl:if test="$curCifasFlag = N">No information detected</xsl:if>
                  <xsl:if test="not(string($curCifasFlag))">No entitlement to CIFAS</xsl:if>


                </div>
            
                <br style="clear:both"/>-->

            <h3>previous directors</h3>
            <xsl:for-each select="ManagementInfo/Directors/PreviousDirector">
                <div class="dataLabel">name</div>
                <div class="dataValue">

                    <xsl:value-of select="DirectorDetails/Name/Prefix"/>
                &#xA0;<xsl:value-of select="DirectorDetails/Name/Forename"/>
                &#xA0;<xsl:value-of select="DirectorDetails/Name/MiddleNames"/>
                &#xA0;<xsl:value-of select="DirectorDetails/Name/SurName"/>
                
                </div>
                <div class="dataLabel" style="clear:both">address</div>
                <div class="dataValue" style="width:auto;overflow:auto;font-size:10px">

                    <xsl:call-template name="commaSeparatedValue"><xsl:with-param name="curValue" select="DirectorDetails/Location/*"/><xsl:with-param name="ignoredNode" select="'RMC'"/></xsl:call-template>

                   
                </div>
                <div class="dataLabel" style="clear:both">date of birth</div>
                <div class="dataValue">

                    <xsl:value-of select="DirectorDetails/DateOfBirth/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="DirectorDetails/DateOfBirth/MM"/></span>&#xA0;<xsl:value-of select="DirectorDetails/DateOfBirth/CCYY"/>

                </div>
                 <div class="dataLabel" style="clear:both">Nationality</div>
                <div class="dataValue">
                    <xsl:value-of select="DirectorDetails/Nationality"/>
                </div>
                <div class="dataLabel" style="clear:both">position</div>
                <div class="dataValue">
                    <xsl:value-of select="DirectorDetails/Position"/>
                </div>
                <div class="dataLabel" style="clear:both">occupation</div>
                <div class="dataValue">
                    <xsl:value-of select="DirectorDetails/Occupation"/>
                </div>
                
                <div class="dataLabel" style="clear:both"><xsl:if test="AppointmentIndicator='E'">date appointed</xsl:if><xsl:if test="AppointmentIndicator='P'">appointed prior to</xsl:if></div>
                <div class="dataValue">
                   <xsl:value-of select="AppointmentDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="AppointmentDate/MM"/></span>&#xA0;<xsl:value-of select="AppointmentDate/CCYY"/>
                
                </div>
                <div class="dataLabel" style="clear:both"><xsl:if test="ResignationIndicator='E'">date resigned</xsl:if><xsl:if test="ResignationIndicator='P'">Resigned Prior To</xsl:if></div>
                <div class="dataValue">
                     <xsl:value-of select="ResignationDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="ResignationDate/MM"/></span>&#xA0;<xsl:value-of select="ResignationDate/CCYY"/>
             
                </div>
                
                <br style="clear:both"/>
                <div style="width:100%;border-bottom:1px solid #EEE;margin:5px 0px 10px 0px"></div>
                
            </xsl:for-each>
            <br style="clear:both"/>
            <h3>company secretary</h3>
            <xsl:for-each select="ManagementInfo/Secretaries/CurrentSecretary">
                <div class="dataLabel">company name</div>
                <div class="dataValue">
                    <xsl:value-of select="SecretaryDetails/CommercialDetail/Name"/>
                </div>
                <div class="dataLabel">name</div>
                <div class="dataValue">
                    <xsl:value-of select="SecretaryDetails/Name/Prefix"/>
                &#xA0;<xsl:value-of select="SecretaryDetails/Name/Forename"/>
                &#xA0;<xsl:value-of select="SecretaryDetails/Name/MiddleNames"/>
                &#xA0;<xsl:value-of select="SecretaryDetails/Name/SurName"/>
                </div>
                <div class="dataLabel" style="clear:both">address</div>
                <div class="dataValue" style="width:auto;overflow:auto;font-size:10px">

                     <xsl:call-template name="commaSeparatedValue"><xsl:with-param name="curValue" select="SecretaryDetails/Location/*"/><xsl:with-param name="ignoredNode" select="'RMC'"/></xsl:call-template>

               

                </div>
                <div class="dataLabel" style="clear:both">date appointed</div>
                <div class="dataValue">
                    <xsl:value-of select="AppointmentDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="AppointmentDate/MM"/></span>&#xA0;<xsl:value-of select="AppointmentDate/CCYY"/>
                
                </div>
                <br style="clear:both"/>
                <br style="clear:both"/>
            </xsl:for-each>
            <h3>previous company secretaries</h3>
            <xsl:for-each select="ManagementInfo/Secretaries/PreviousSecretary">
                <div class="dataLabel">company name</div>
                <div class="dataValue">
                    <xsl:value-of select="SecretaryDetails/CommercialDetail/Name"/>
                </div>
                <div class="dataLabel">name</div>
                <div class="dataValue">
                    <xsl:value-of select="SecretaryDetails/Name/Prefix"/>
                &#xA0;<xsl:value-of select="SecretaryDetails/Name/Forename"/>
                &#xA0;<xsl:value-of select="SecretaryDetails/Name/MiddleNames"/>
                &#xA0;<xsl:value-of select="SecretaryDetails/Name/SurName"/>
                </div>
                <div class="dataLabel" style="clear:both">address</div>
                <div class="dataValue" style="width:auto;overflow:auto;font-size:10px">

                    <xsl:call-template name="commaSeparatedValue"><xsl:with-param name="curValue" select="SecretaryDetails/Location/*"/><xsl:with-param name="ignoredNode" select="'RMC'"/></xsl:call-template>
                </div>
                <div class="dataLabel" style="clear:both">date appointed</div>
                <div class="dataValue">
                    <xsl:value-of select="AppointmentDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="AppointmentDate/MM"/></span>&#xA0;<xsl:value-of select="AppointmentDate/CCYY"/>
                
                </div>
                <div class="dataLabel" style="clear:both">date resigned</div>
                <div class="dataValue">
                     <xsl:value-of select="ResignationDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="ResignationDate/MM"/></span>&#xA0;<xsl:value-of select="ResignationDate/CCYY"/>
                </div>
                <br style="clear:both"/>
                <div style="width:100%;border-bottom:1px solid #EEE;margin:5px 0px 10px 0px"></div>
                
            </xsl:for-each>

        </div>
    </xsl:template>

</xsl:stylesheet>
