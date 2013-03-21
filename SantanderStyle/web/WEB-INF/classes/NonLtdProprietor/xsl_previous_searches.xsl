<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="xsl_previous_searches">
        <div class="section" id="previous_searches">
            <h2>previous searches</h2>
            <div class="doubt">[NonLtdBusinessData/Identification/PrevSearches]??</div>
            <xsl:for-each select="NonLtdBusinessData/Identification/PrevSearches">
                <div class="dataLabel">application type</div>
                <div class="dataValue">
                    <xsl:value-of select="PrevSearchDetail/EnquiryType"/>
                </div>
                
                    <br style="clear:both"/>
                
                <div class="dataLabel">application date</div>
                <div class="dataValue">
                    <xsl:value-of select="PrevSearchDetail/SearchDate"/>
                </div>
                
                    <br style="clear:both"/>
                
                <div class="dataLabel">company type</div>
                <div class="dataValue">
                    <xsl:value-of select="PrevSearchDetail/SICInformation/Description"/>
                </div>
            </xsl:for-each>

        </div>
    </xsl:template>
</xsl:stylesheet>
