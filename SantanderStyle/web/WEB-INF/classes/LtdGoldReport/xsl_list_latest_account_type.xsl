<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

     <xsl:template name="LatestAccountTypeList">
        <xsl:choose>
            <xsl:when test="Identification/FilingDetails/LatestAccountType = '0'">Type not available</xsl:when>
            <xsl:when test="Identification/FilingDetails/LatestAccountType = '1'">Full accounts</xsl:when>
            <xsl:when test="Identification/FilingDetails/LatestAccountType = '2'">Small company</xsl:when>
            <xsl:when test="Identification/FilingDetails/LatestAccountType = '3'">Medium company</xsl:when>
            <xsl:when test="Identification/FilingDetails/LatestAccountType = '4'">Group</xsl:when>
            <xsl:when test="Identification/FilingDetails/LatestAccountType = '5'">Dormant</xsl:when>
            <xsl:when test="Identification/FilingDetails/LatestAccountType = '6'">Interim</xsl:when>
            <xsl:when test="Identification/FilingDetails/LatestAccountType = '7'">Initial</xsl:when>
            <xsl:when test="Identification/FilingDetails/LatestAccountType = '8'">Total Exemption Full</xsl:when>
            <xsl:when test="Identification/FilingDetails/LatestAccountType = '9'">Total Exemption small</xsl:when>
            <xsl:when test="Identification/FilingDetails/LatestAccountType = 'A'">Partial Exemption</xsl:when>
            <xsl:otherwise>
                    unknown value (<xsl:value-of select="Identification/FilingDetails/LatestAccountType"/>)
            </xsl:otherwise>
        </xsl:choose>
    </xsl:template>

    
</xsl:stylesheet>

