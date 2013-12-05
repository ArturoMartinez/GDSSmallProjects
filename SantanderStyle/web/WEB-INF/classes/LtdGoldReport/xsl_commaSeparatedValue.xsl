<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

     <xsl:template name="commaSeparatedValue">
        <xsl:param name="curValue"/>
        <xsl:choose>
            <xsl:when test="$curValue!=''">,&#xA0;<xsl:value-of select="$curValue"/></xsl:when>
            <xsl:otherwise></xsl:otherwise>
        </xsl:choose>
    </xsl:template>

    
</xsl:stylesheet>

