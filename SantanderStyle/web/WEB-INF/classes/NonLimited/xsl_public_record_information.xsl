<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="xsl_public_record_information">
        <div class="section" id="public_record_information">
            <h2>public record information</h2>


            <h3>country court judgments - summary</h3>

            <div class="dataLabel"> Total Number : </div>
            <div class="dataValue">
                <xsl:value-of select="CCJs/MNumberCCJs0To72"/>
            </div>
            <div class="dataLabel"> Total value : </div>
            <div class="dataValue num devise">
                <xsl:value-of select="CCJs/MValueCCJs0To72"/>
            </div>

            <br style="clear:both"/>

            <div class="matrix td60 thcenter" id="balance_sheet_f_details_matrix">

                <table cellspacing="0" cellpadding="0">
                    <tr>
                        <th style="background:#fff"/>
                        <th>Last 12m</th>
                        <th>13-24m</th>
                        <th>25-36m</th>
                        <th>37-48m</th>
                        <th>49-60m</th>
                        <th>61-72m</th>

                    </tr>
                    <tr>
                        <th>
                            <span>number</span>
                        </th>
                        <td>
                            <xsl:value-of select="CCJs/MNumberCCJsLast12"/>
                        </td>
                        <td>
                            <xsl:value-of select="CCJs/MNumberCCJs13To24"/>
                        </td>
                        <td>
                            <xsl:value-of select="CCJs/MNumberCCJs25To36"/>
                        </td>
                        <td>
                            <xsl:value-of select="CCJs/MNumberCCJs37To48"/>
                        </td>
                        <td>
                            <xsl:value-of select="CCJs/MNumberCCJs49To60"/>
                        </td>
                        <td>
                            <xsl:value-of select="CCJs/MNumberCCJs61To72"/>
                        </td>
                    </tr>
                    <tr>
                        <th>
                            <span>value</span>
                        </th>
                        <td class="num devise">
                            <xsl:value-of select="CCJs/MValueCCJsLast12"/>
                        </td>
                        <td class="num devise">
                            <xsl:value-of select="CCJs/MValueCCJs13To24"/>
                        </td>
                        <td class="num devise">
                            <xsl:value-of select="CCJs/MValueCCJs25To36"/>
                        </td>
                        <td class="num devise">
                            <xsl:value-of select="CCJs/MValueCCJs37To48"/>
                        </td>
                        <td class="num devise">
                            <xsl:value-of select="CCJs/MValueCCJs49To60"/>
                        </td>
                        <td class="num devise">
                            <xsl:value-of select="CCJs/MValueCCJs61To72"/>
                        </td>

                    </tr>

                </table>
            </div>

            <h3>bankruptcies</h3>

             <div class="dataLabel" style="clear:both;width:300px">Bankruptcies Data in ownership period</div>
                <div class="dataValue">
                    <xsl:value-of select="Bankruptcies/MDataOutOwnshpRange"/>
                </div>
            <div class="dataLabel" style="clear:both;width:300px">Bankruptcies in the ownership period</div>
                <div class="dataValue">
                    <xsl:value-of select="Bankruptcies/MBankruptcyCount"/>
                </div>
            <div class="dataLabel" style="clear:both;width:300px">Most recent Bankruptcies (months)</div>
                <div class="dataValue">
                    <xsl:value-of select="Bankruptcies/MAgeMostRecentBankruptcy"/>
                </div>
            <div class="dataLabel" style="clear:both;width:300px">Bankruptcies NOC Flag</div>
                <div class="dataValue">
                    <xsl:if test="Bankruptcies/MNOCFlag = 'Y'">
                        1 or more NOC
                    </xsl:if><xsl:if test="Bankruptcies/MNOCFlag = 'N'">
                        no NOC
                    </xsl:if>
                </div>
<br style="clear:both"/><br style="clear:both"/>
             <div class="dataLabel" style="clear:both;width:300px">Associated Bankruptcies Data in ownership period</div>
                <div class="dataValue">
                    <xsl:value-of select="Bankruptcies/ADataOutOwnshpRange"/>
                </div>

            <div class="dataLabel" style="clear:both;width:300px">Associated Bankruptcies in the ownership period</div>
                <div class="dataValue">
                    <xsl:value-of select="Bankruptcies/ABankruptcyCount"/>
                </div>

            <div class="dataLabel" style="clear:both;width:300px">Most recent associated Bankruptcies (months)</div>
                <div class="dataValue">
                    <xsl:value-of select="Bankruptcies/AAgeMostRecentBankruptcy"/>
                </div>

            <div class="dataLabel" style="clear:both;width:300px">Associated Bankruptcies NOC Flag</div>
                <div class="dataValue">
                    <xsl:if test="Bankruptcies/ANOCFlag = 'Y'">
                        1 or more NOC
                    </xsl:if><xsl:if test="Bankruptcies/ANOCFlag = 'N'">
                        no NOC
                    </xsl:if>
                </div>
            
            <br style="clear:both"/>
            <br style="clear:both"/>
            <xsl:choose>
                <xsl:when test="count(Bankruptcies/BankruptcyDetail)>0">
                    <xsl:for-each select="Bankruptcies/BankruptcyDetail">
                        <h4>(<xsl:value-of select="position()"/> of <xsl:value-of select="../MBankruptcyCount"/>)</h4>
                        <div class="dataLabel">Publication Date</div>
                        <div class="dataValue">
                            <xsl:value-of select="GazetteDate/DD"
                            />&#xA0; <span class="toMonthName">
                                <xsl:value-of select="GazetteDate/MM"
                                /></span>&#xA0; <xsl:value-of
                                select="GazetteDate/CCYY"/>
                        </div>
                        <div class="dataLabel">Name</div>
                        <div class="dataValue">
                            <xsl:value-of select="Name"/>
                        </div>
                        <div class="dataLabel">Address</div>
                        <div class="dataValue">

                            <xsl:call-template name="commaSeparatedValue"><xsl:with-param name="curValue" select="BankruptcyLocation/*"/></xsl:call-template>


                        </div>
                        <div class="dataLabel">Details</div>
                        <div class="dataValue" style="width:auto;overflow:auto">
                            <xsl:value-of select="BankruptcyText"/>
                        </div>
                        <br style="clear:both"/>
                    </xsl:for-each>
                </xsl:when>
                <xsl:otherwise> &#xA0;&#xA0;&#xA0;No Bankruptcies Registered </xsl:otherwise>
            </xsl:choose>

            <h3>county court judgments - detail</h3>

            <xsl:for-each select="CCJs/CCJDetail">
                <xsl:choose>
                    <xsl:when test="SatisfactionFlag='N'">
                        <div class="dataLabel">satisfaction status</div>
                        <div class="dataValue">Not Satisfied</div>
                    </xsl:when>
                    <xsl:when test="SatisfactionFlag='Y'">
                         <div class="dataLabel">satisfaction status</div>
                        <div class="dataValue">Satisfied</div>

                        <div class="dataLabel">satisfaction date</div>
                        <div class="dataValue">
                            <span class="toMonthName"><xsl:value-of select="SatisfactionDate/MM"/></span>&#xA0;
                        <xsl:value-of select="SatisfactionDate/CCYY"/>
                        </div>
                    </xsl:when>
                </xsl:choose>

                <div class="dataLabel">registered against</div>
                <div class="dataValue">
                    <xsl:value-of select="JudgmentDetailsArea/JudgmentAgainst/Name"/>
                    <xsl:call-template name="commaSeparatedValue"><xsl:with-param name="curValue" select="JudgmentDetailsArea/*"/></xsl:call-template>

                </div>

                <div class="dataLabel">amount</div>
                <div class="dataValue num devise">
                    <xsl:value-of select="JudgmentAmount"/>
                </div>
                <div class="dataLabel">judgment date</div>
                <div class="dataValue">
                    <span class="toMonthName"><xsl:value-of select="JudgmentDate/MM"/></span>&#xA0;
                        <xsl:value-of select="JudgmentDate/CCYY"/>
                </div>
                <div class="dataLabel">case number</div>
                <div class="dataValue">
                    <xsl:value-of select="CaseNumber"/>
                </div>

                <div class="dataLabel">court</div>
                <div class="dataValue">
                    <xsl:value-of select="CourtName"/>
                </div>


                <br style="clear:both"/>



            </xsl:for-each>
        </div>
    </xsl:template>
</xsl:stylesheet>
