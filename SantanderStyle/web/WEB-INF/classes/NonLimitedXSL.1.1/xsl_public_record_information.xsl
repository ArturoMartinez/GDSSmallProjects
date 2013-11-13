<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="xsl_public_record_information">
        <div class="section" id="public_record_information">
            <h2>public record information</h2>


            <h3>country court judgments</h3>

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

            <xsl:choose>
                <xsl:when test="count(Bankruptcies/BankruptcyDetail)>0">
                    <xsl:for-each select="Bankruptcies">
                        <div class="dataLabel">Publication Date</div>
                        <div class="dataValue">
                            <xsl:value-of select="Bankruptcies/BankruptcyDetail/GazetteDate/DD"
                            />&#xA0; <span class="toMonthName">
                                <xsl:value-of select="Bankruptcies/BankruptcyDetail/GazetteDate/MM"
                                /></span>&#xA0; <xsl:value-of
                                select="Bankruptcies/BankruptcyDetail/GazetteDate/CCYY"/>
                        </div>
                        <br style="clear:both"/>

                        <div class="dataLabel">Name</div>
                        <div class="dataValue">
                            <xsl:value-of select="Bankruptcies/BankruptcyDetail/Name"/>
                        </div>
                        <br style="clear:both"/>

                        <div class="dataLabel">Adresse</div>
                        <div class="dataValue">
                            <xsl:value-of
                                select="Bankruptcies/BankruptcyDetail/BankruptcyLocation/LocationLine1"/>
                            <xsl:value-of
                                select="Bankruptcies/BankruptcyDetail/BankruptcyLocation/LocationLine2"/>
                            <xsl:value-of
                                select="Bankruptcies/BankruptcyDetail/BankruptcyLocation/LocationLine3"/>
                            <xsl:value-of
                                select="Bankruptcies/BankruptcyDetail/BankruptcyLocation/LocationLine4"/>
                            <xsl:value-of
                                select="Bankruptcies/BankruptcyDetail/BankruptcyLocation/Postcode"/>
                        </div>
                        <br style="clear:both"/>

                        <div class="dataLabel">Details</div>
                        <div class="dataValue">
                            <xsl:value-of select="Bankruptcies/BankruptcyDetail/BankruptcyText"/>
                        </div>
                        <br style="clear:both"/>
                        <br style="clear:both"/>
                    </xsl:for-each>
                </xsl:when>
                <xsl:otherwise> &#xA0;&#xA0;&#xA0;No Bankruptcies Registered </xsl:otherwise>
            </xsl:choose>

            <h3>county court judgments</h3>

            <xsl:for-each select="CCJs/CCJDetail">

                <div class="dataLabel">registered against</div>
                <div class="dataValue">
                    <xsl:value-of select="JudgmentDetailsArea/JudgmentAgainst/Name"/>
                </div>
                <br style="clear:both"/>

                <div class="dataLabel">amount</div>
                <div class="dataValue num devise">
                    <xsl:value-of select="JudgementAmount"/>
                </div>
                <br style="clear:both"/>

                <div class="dataLabel">judgement date</div>
                <div class="dataValue">
                    <span class="toMonthName"><xsl:value-of select="JudgementDate/MM"/></span>&#xA0;
                        <xsl:value-of select="JudgementDate/CCYY"/>
                </div>
                <br style="clear:both"/>

                <div class="dataLabel">case number</div>
                <div class="dataValue">
                    <xsl:value-of select="CaseNumber"/>
                </div>
                <br style="clear:both"/>
                <div class="dataLabel">court</div>
                <div class="dataValue">
                    <xsl:value-of select="CourtName"/>
                </div>
                <br style="clear:both"/>
                <div style="border-bottom:1px solid #EEE;width:100%;margin:5px 0px 10px 0px"/>

            </xsl:for-each>
        </div>
    </xsl:template>
</xsl:stylesheet>
