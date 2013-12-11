<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

     <xsl:template name="PaymentTermValues">
        <xsl:choose>
            <xsl:when test="/NonLtdBusinessData/PaymentPerformance/PaymentFull/PaymentToTerms = 'B'">beyond its terms</xsl:when>
            <xsl:when test="/NonLtdBusinessData/PaymentPerformance/PaymentFull/PaymentToTerms = 'W'">within its terms</xsl:when>
            <xsl:otherwise>
                  
                    <xsl:value-of select="/NonLtdBusinessData/PaymentPerformance/PaymentFull/PaymentToTerms"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:template>

    
</xsl:stylesheet>