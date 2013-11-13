<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

     <xsl:template name="creditEventType">
        <xsl:param name="curValue"/>
        <xsl:choose>
            <xsl:when test="$curValue = 'C'">Receiver appointments</xsl:when>
            <xsl:when test="$curValue = 'D'">Cessations of Receiver</xsl:when>
            <xsl:when test="$curValue = 'E'">Winding up petitions</xsl:when>
            <xsl:when test="$curValue = 'F'">Dismissals of winding up petitions</xsl:when>
            <xsl:when test="$curValue = 'G'">Winding up orders</xsl:when>
            <xsl:when test="$curValue = 'H'">Voluntary appointments of liquidators</xsl:when>
            <xsl:when test="$curValue = 'I'">Meetings of creditors</xsl:when>
            <xsl:when test="$curValue = 'J'">Resolutions to wind up</xsl:when>
            <xsl:when test="$curValue = 'K'">Intentions to dissolve</xsl:when>
            <xsl:when test="$curValue = 'L'">Dissolution notices</xsl:when>
            <xsl:when test="$curValue = 'M'">Reinstatement notices</xsl:when>
            <xsl:when test="$curValue = 'Q'">Administrators appointed</xsl:when>
            <xsl:when test="$curValue = 'R'">Administrators dismissals</xsl:when>
            <xsl:when test="$curValue = 'S'">Approvals of Voluntary arrangements</xsl:when>
            <xsl:when test="$curValue = 'T'">Completions of Voluntary arrangements</xsl:when>
            <xsl:when test="$curValue = 'U'">Compulsory appointments of liquidators</xsl:when>
            <xsl:when test="$curValue = 'V'">Revocations of Voluntary arrangements</xsl:when>
            <xsl:when test="$curValue = 'W'">Suspensions of Voluntary arrangements</xsl:when>
        </xsl:choose>
    </xsl:template>

    
</xsl:stylesheet>

