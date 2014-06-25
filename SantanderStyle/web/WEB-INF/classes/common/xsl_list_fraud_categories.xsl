<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

      <xsl:template name="fraudCategories">
        <xsl:param name="pValue"/>
        <xsl:choose>

            <xsl:when test="$pValue=0">Protective Registration</xsl:when>
            <xsl:when test="$pValue=1">False Identify Fraud</xsl:when>
            <xsl:when test="$pValue=2">Victim of Impersonation</xsl:when>
            <xsl:when test="$pValue=3">Application Fraud (Facility Granted)</xsl:when>
            <xsl:when test="$pValue=4">Application Fraud (Facility Refused)</xsl:when>
            <xsl:when test="$pValue=5">Conversion</xsl:when>
            <xsl:when test="$pValue=6">First Party Fraud</xsl:when>
            <xsl:when test="$pValue=7">Aiding and Abetting</xsl:when>
            <xsl:when test="$pValue=8">Insurance Claims Fraud</xsl:when>
            <xsl:when test="/RawBureauData/IsPATHSViewReport = 1"><xsl:value-of select="$pValue" /></xsl:when>
            
        </xsl:choose>



    </xsl:template>

    
</xsl:stylesheet>