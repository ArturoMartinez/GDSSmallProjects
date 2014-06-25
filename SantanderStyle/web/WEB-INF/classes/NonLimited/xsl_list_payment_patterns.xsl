<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

     <xsl:template name="PaymentPatternValues">
        <xsl:choose>
            <xsl:when test="PaymentPerformance/PaymentFull/PaymentPattern = 'C'">a consistent</xsl:when>
            <xsl:when test="PaymentPerformance/PaymentFull/PaymentPattern = 'W'">a worsening</xsl:when>
            <xsl:when test="PaymentPerformance/PaymentFull/PaymentPattern = 'N'">a noticeable worsening</xsl:when>
            <xsl:when test="PaymentPerformance/PaymentFull/PaymentPattern = 'S'">a significant worsening</xsl:when>
            <xsl:when test="PaymentPerformance/PaymentFull/PaymentPattern = 'I'">an improvement</xsl:when>
            <xsl:when test="PaymentPerformance/PaymentFull/PaymentPattern = 'O'">a noticeable improvement</xsl:when>
            <xsl:when test="PaymentPerformance/PaymentFull/PaymentPattern = 'T'">a significant improvement</xsl:when>
            <xsl:when test="/RawBureauData/IsPATHSViewReport = 1"><xsl:value-of select="PaymentPerformance/PaymentFull/PaymentPattern" /></xsl:when>
        </xsl:choose>
    </xsl:template>

    
</xsl:stylesheet>