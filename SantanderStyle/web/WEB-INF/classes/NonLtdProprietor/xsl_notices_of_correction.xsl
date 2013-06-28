<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="xsl_notices_of_correction">
        <div class="section" id="notices_of_correction">
            <h2>notices of correction</h2>
            
            <div class="dataLabel">number</div><div class="dataValue numeric">
                <xsl:value-of select="NonLtdBusinessData/NoticeOfCorrection/NumCorrections"/>
            </div><br style="clear:both"/>
            
            <div class="matrixLabel" id="notices_of_correction_details">notices of correction details</div>
            <div class="matrix" id="notices_of_correction_details_matrix">
                
                <table cellspacing="0" cellpadding="0">
                    <tr>
                        <th><span>reference</span></th>
                        <th><span>text</span></th>
                    </tr>
                    <xsl:for-each select="NonLtdBusinessData/NoticeOfCorrection/NOCDetail">
                        <tr>
                            <td>
                                <span ><xsl:value-of select="Reference"/></span>
                            </td>
                            <td>
                                <span><xsl:value-of select="Text"/></span>
                            </td>
                        </tr>
                        
                        
                    </xsl:for-each>
                </table>
            </div>
        </div>
    </xsl:template>
</xsl:stylesheet>
