<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="xsl_disqualifications">
        <div class="section" id="disqualifications">
            <h2>disqualifications</h2>
            
            <ul>
                <li>
                    <label>Director Disqualification Start Date</label>
                    <div class="dataValue">
                     <xsl:call-template name="oneRowDate">
                    <xsl:with-param name="curValue" select="DisqualStartDate">
                    </xsl:with-param>
                </xsl:call-template>
                 </div>
             </li>
             <li>
                    <label>Director Disqualification End Date</label>
                    <div class="dataValue">
                     <xsl:call-template name="oneRowDate">
                    <xsl:with-param name="curValue" select="DisqualEndDate">
                    </xsl:with-param>
                </xsl:call-template>
                 </div>
             </li>
    </ul>

</div>
</xsl:template>
</xsl:stylesheet>