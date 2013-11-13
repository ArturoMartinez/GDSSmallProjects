<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

     <xsl:template name="accountTypes">
        <xsl:choose>
            <xsl:when test="LatestAccountsType='I'">IFRS</xsl:when>
            <xsl:when test="LatestAccountsType='G'">GAAP</xsl:when>
            
        </xsl:choose>
    </xsl:template>


    
</xsl:stylesheet>