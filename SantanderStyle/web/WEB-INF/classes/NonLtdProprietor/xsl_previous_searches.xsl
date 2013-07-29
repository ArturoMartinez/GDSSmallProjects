<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="xsl_previous_searches">
        <div class="section" id="previous_searches">
            <h2>previous searches</h2>
            <xsl:for-each select="ConsumerOutput/FullConsumerData/ConsumerData/PreviousApplication">
                <div class="dataLabel">application type</div>
                <div class="dataValue">
                    <xsl:value-of select="PrevApplnDetails/ApplicationType"/>
                </div>
                
                    <br style="clear:both"/>
                
                <div class="dataLabel">application date</div>
                <div class="dataValue">
                    <xsl:value-of select="PrevApplnDetails/ApplicationDate/DD"/>&#160;
                    <span class="toMonthName"><xsl:value-of select="PrevApplnDetails/ApplicationDate/MM"/></span>&#160;
                    <xsl:value-of select="PrevApplnDetails/ApplicationDate/CCYY"/>&#160;
                </div>
                
                    <br style="clear:both"/>
                
                <div class="dataLabel">company type</div>
                <div class="dataValue">
                     <xsl:call-template name="companyTypeValues"> <xsl:with-param name="curValue" select="PrevApplnDetails/CompanyType" /> </xsl:call-template>
                  
                </div>
                <br style="clear:both"/>
                
                <br style="clear:both"/>
            </xsl:for-each>
            

        </div>
    </xsl:template>
</xsl:stylesheet>
