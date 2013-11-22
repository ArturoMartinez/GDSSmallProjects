<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

    
    <xsl:template name="xsl_public_record_information">
        <div class="section" id="public_record_information">
            <h2>public record information</h2>
            
            <div class="dataLabel">mortgage/charges</div>
            <div class="dataValue">
                <xsl:value-of select="Mortgages/NumMortgages"/> (of which <xsl:value-of select="Mortgages/NumSatMortgages"/> are fully satisfied)
            </div>
            <br style="clear:both"/><br style="clear:both"/>
            <xsl:variable name="noticeCount">
                <xsl:if test="LegalNotices > 0"><xsl:value-of select="LegalNotices/SummaryCount"/></xsl:if>

                
            </xsl:variable>
            <div class="dataLabel" style="height:{$noticeCount*11}px">legal notices</div>
            <div class="dataValue" style="overflow:hidden;width:300px">
                <xsl:if test="LegalNotices/SummaryCount = 0">None Recorded</xsl:if>
            <xsl:for-each select="LegalNotices/SummaryLine">
                <div style="float:left;width:100px">

                <xsl:value-of select="EventDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="EventDate/MM"/></span>&#xA0;<xsl:value-of select="EventDate/CCYY"/>
                    
                </div>
                  <div style="float:left;width:200px">
                   <xsl:call-template name="creditEventType">
                    <xsl:with-param name="curValue" select="EventType"/>
                    </xsl:call-template>
                </div>
                <br style="clear:both"/>
            </xsl:for-each>
                
            </div>
            <br style="clear:both"/><br/>   
            <div class="dataLabel" style="height:30spx">county court judgments</div>
            <div class="dataValue">
                <div class="dataValue" style="overflow:hidden;width:300px">
                    <div style="float:left;width:100px">Total Number : </div><div style="float:left;">
                        <xsl:value-of select="CCJs/NumberCCJs0To72"/>
                    </div>
                    
                    <br style="clear:both"/>
                    <div style="float:left;width:100px">Total Value : </div><div style="float:left">
                        <span class="num devise"><xsl:value-of select="CCJs/ValueCCJs0To72"/></span>
                    </div>
                    <br style="clear:both"/>
                    <div style="float:left;width:100px">Age of most recent : </div><div style="float:left">
                        <xsl:value-of select="CCJs/AgeMostRecentCCJ"/> Month<xsl:if test="CCJs/AgeMostRecentCCJ>1">s</xsl:if>
                    </div>
                    <br style="clear:both"/>
                    <!--<div style="float:left;width:100px">Last 12 months Number : </div><div style="float:left">
                        <xsl:value-of select="CCJs/NumberCCJsLast12Months"/>
                    </div>
                    <br style="clear:both"/>
                    <div style="float:left;width:100px">Last 12 months Value : </div><div style="float:left">
                         <span class="num devise"><xsl:value-of select="CCJs/ValueCCJsLast12Months"/></span>
                    </div>-->
                </div>
            </div>
            <br style="clear:both"/>
        
            <div class="matrix td60 thcenter" id="balance_sheet_f_details_matrix">
            
            <table cellspacing="0" cellpadding="0">
                <tr>
                    <th style="background:#fff"></th>
                    <th>Last 12m</th>
                    <th>13-24m</th>
                    <th>25-36m</th>
                    <th>37-48m</th>
                    <th>49-60m</th>
                    <th>61-72m</th>
                    
                </tr>
                <tr>
                    <th><span>number</span></th>
                    <td>
                        <xsl:value-of select="CCJs/NumberCCJsLast12Months"/>
                    </td>
                    <td>
                        <xsl:value-of select="CCJs/NumberCCJs13To24"/>
                    </td>
                    <td>
                        <xsl:value-of select="CCJs/NumberCCJs25To36"/>
                    </td>
                    <td>
                        <xsl:value-of select="CCJs/NumberCCJs37To48"/>
                    </td>
                    <td>
                        <xsl:value-of select="CCJs/NumberCCJs49To60"/>
                    </td>
                    <td>
                        <xsl:value-of select="CCJs/NumberCCJs61To72"/>
                    </td>
                </tr>
                <tr>
                    <th><span>value</span></th>
                    <td>
                        <xsl:value-of select="CCJs/ValueCCJsLast12Months"/>
                    </td>
                    <td>
                        <xsl:value-of select="CCJs/ValueCCJs13To24"/>
                    </td>
                    <td>
                        <xsl:value-of select="CCJs/ValueCCJs25To36"/>
                    </td>
                    <td>
                        <xsl:value-of select="CCJs/ValueCCJs37To48"/>
                    </td>
                    <td>
                        <xsl:value-of select="CCJs/ValueCCJs49To60"/>
                    </td>
                    <td>
                        <xsl:value-of select="CCJs/ValueCCJs61To72"/>
                    </td>
                    
                </tr>
               
            </table>
        </div>
    </div>
    </xsl:template>
</xsl:stylesheet>