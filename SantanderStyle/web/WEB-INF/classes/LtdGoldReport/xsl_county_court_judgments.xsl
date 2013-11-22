<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="xsl_county_court_judgments"> 
        <div class="section" id="county_court_judgments">
            <h2>county court judgments</h2>
           
            <xsl:for-each select="CCJs/CCJDetail">
                
                <div class="dataLabel">registered against</div>
                <div class="dataValue">
                    <xsl:value-of select="JudgmentAgainst"/>&#xA0;&#xA0;
                    <xsl:value-of select="TradingLocation/LocationLine1"/>,&#xA0;<xsl:value-of select="TradingLocation/LocationLine2"/>,&#xA0;<xsl:value-of select="TradingLocation/LocationLine3"/>,&#xA0;<xsl:value-of select="TradingLocation/LocationLine4"/>,&#xA0;<xsl:value-of select="TradingLocation/LocationLine5"/>,&#xA0;<xsl:value-of select="TradingLocation/Postcode"/>
                </div>
                <div class="dataLabel" style="clear:both">amount</div>
                <div class="dataValue num devise">
                    <xsl:value-of select="JudgmentAmount"/>
                </div>
                <div class="dataLabel" style="clear:both">judgement date</div>
                <div class="dataValue">
                    <span class="toMonthName"><xsl:value-of select="JudgmentDate/MM"/></span>&#xA0;<xsl:value-of select="JudgmentDate/CCYY"/>

                </div>
                <div class="dataLabel" style="clear:both">case number</div>
                <div class="dataValue">
                    <xsl:value-of select="CaseNumber"/>
                </div>
                <div class="dataLabel" style="clear:both">court</div>
                <div class="dataValue">
                    <xsl:value-of select="CourtName"/>
                </div>
                <br style="clear:both"/>
                <div style="border-bottom:1px solid #EEE;width:100%;margin:5px 0px 10px 0px"></div>
                
            </xsl:for-each>
           
        </div>
    </xsl:template>
</xsl:stylesheet>
