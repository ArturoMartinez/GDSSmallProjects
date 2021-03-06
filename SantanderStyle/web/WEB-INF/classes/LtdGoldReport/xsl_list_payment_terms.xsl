<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

     <xsl:template name="PaymentTermValues">
        <xsl:choose>
            <xsl:when test="PaymentPerformance/PaymentFull/PaymentToTerms = 'B'">beyond its terms</xsl:when>
            <xsl:when test="PaymentPerformance/PaymentFull/PaymentToTerms = 'W'">within its terms</xsl:when>
            <xsl:when test="/RawBureauData/IsPATHSViewReport = 1"><xsl:value-of select="PaymentPerformance/PaymentFull/PaymentToTerms" /></xsl:when>
        </xsl:choose>
    </xsl:template>

    
</xsl:stylesheet>