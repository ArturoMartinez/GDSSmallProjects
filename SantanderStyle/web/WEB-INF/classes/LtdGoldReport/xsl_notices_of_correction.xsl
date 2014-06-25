<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="xsl_notices_of_correction">
        <div class="section" id="notices_of_correction">
            <h2>notices of correction</h2>
            
              
            
         
            <div class="dataLabel">
                Total Number : 
            </div>
            <div class="dataValue">
                <xsl:value-of select="NoticeOfCorrection/NumCorrections"/>
            </div>
            
            <br style="clear:both"/>
            
            <h3>Notices :</h3>
            <xsl:for-each select="NoticeOfCorrection/NOCDetail">
                <div class="dataLabel">
                    reference
                </div>
                <div class="dataValue">
                    <xsl:value-of select="Reference"/>
                </div>
                <br style="clear:both"/>
                <div class="dataLabel" style="border:none">
                    Text
                </div>
                <div class="dataValue">
                    <xsl:value-of select="Text"/>
                </div>
            </xsl:for-each>
            
            
            
    </div>
    </xsl:template>
</xsl:stylesheet>