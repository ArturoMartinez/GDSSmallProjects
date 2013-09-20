<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

     <xsl:template name="IndustryPaymentPatternValues">
        <xsl:choose>
            <xsl:when test="PaymentPerformance/PaymentFull/IndPaymentPattern = 'C'">The payments of this company is consistent with the industry average</xsl:when>
            <xsl:when test="PaymentPerformance/PaymentFull/IndPaymentPattern = 'S'">This company pays slower than the industry average.</xsl:when>
            <xsl:when test="PaymentPerformance/PaymentFull/IndPaymentPattern = 'F'">This company pays faster than the industry average.</xsl:when>
            <xsl:otherwise>
                    unknown value(<xsl:value-of select="PaymentPerformance/PaymentFull/IndPaymentPattern"/>)
            </xsl:otherwise>
        </xsl:choose>
    </xsl:template>

    
</xsl:stylesheet>