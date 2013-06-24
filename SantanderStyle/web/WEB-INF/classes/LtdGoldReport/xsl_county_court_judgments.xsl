<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="xsl_county_court_judgments"> 
        <div class="section" id="county_court_judgments">
            <h2>county court judgments</h2>
           
            <xsl:for-each select="CCJs/CCJDetail">
                
                <div class="dataLabel">registered against</div>
                <div class="dataValue">
                    <xsl:value-of select="JudgmentAgainst"/>
                </div>
                <br style="clear:both"/>
                
                <div class="dataLabel">amount</div>
                <div class="dataValue">
                    <xsl:value-of select="JudgmentAmount"/>
                </div>
                <br style="clear:both"/>
                
                <div class="dataLabel">judgement date</div>
                <div class="dataValue">
                    <span class="toMonthName"><xsl:value-of select="JudgmentDate/MM"/></span>&#xA0;<xsl:value-of select="JudgmentDate/CCYY"/>

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
                <div style="border-bottom:1px solid #EEE;width:100%;margin:5px 0px 10px 0px"></div>
                
            </xsl:for-each>
           
        </div>
    </xsl:template>
</xsl:stylesheet>
