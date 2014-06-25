<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="xsl_notices_of_correction">
        <div class="section" id="notices_of_correction">
            <h2>notices of correction</h2>
            <div class="dataLabel">Number of Notices of Correction</div>
                        <div class="dataValue" style="width:auto;overflow:auto">
                            <xsl:value-of select="NoticeOfCorrection/NumCorrections"/>
                        </div>
            <ul>
                <xsl:for-each select="NoticeOfCorrection/NOCDetail">
                    <li>
                        <label>Reference</label>
                        <div class="dataValue">
                           <xsl:value-of select="Reference"/>
                       </div>
                   </li>
                   <li>
                    <label>Text</label>
                    <div class="dataValue">
                        <xsl:value-of select="Text"/>
                   </div>
               </li>
               <br/><br/>
           </xsl:for-each>
       </ul>

   </div>
</xsl:template>
</xsl:stylesheet>