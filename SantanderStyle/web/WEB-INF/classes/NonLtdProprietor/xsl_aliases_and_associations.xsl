<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="associationSourceName">
        <xsl:choose>
            <xsl:when test="InformationSource='P'">Proposal Form</xsl:when>
            <xsl:when test="InformationSource='E'">Existing account</xsl:when>
            <xsl:when test="InformationSource='T'">telephone</xsl:when>
            <xsl:when test="InformationSource='O'">other</xsl:when>
            <xsl:when test="InformationSource='C'">CAIS data</xsl:when>
            <xsl:when test="InformationSource='A'">joint application data</xsl:when>
            <xsl:when test="InformationSource='J'">joint judgement data</xsl:when>
            <xsl:when test="InformationSource='D'">directorsalias / association</xsl:when>
            <xsl:when test="InformationSource=' '">no source information</xsl:when>
            <xsl:when test="/RawBureauData/IsPATHSViewReport = 1"><xsl:value-of select="InformationSource" /></xsl:when>
        </xsl:choose>
    </xsl:template>

    <xsl:template name="aliasAssoTemplate">
        <xsl:param name="linkSentence"/>
        <xsl:param name="sourceString"/>
        <div style="margin:20px"> 
            <xsl:for-each select="ConsumerOutput/FullConsumerData/ConsumerData/Association/AssociationDetails">
                <xsl:if test="Source=$sourceString or /RawBureauData/IsPATHSViewReport=1">
                    <div class="dataValue"><xsl:call-template name="commaSeparatedValue"><xsl:with-param name="curValue" select="Name/*"/><xsl:with-param name="separator" select="' '"/></xsl:call-template></div><br style="clear:both"/>
                    <div class="dataLabel"><xsl:value-of select="$linkSentence"/></div>&#xA0;
                    <div class="dataValue"><xsl:call-template name="commaSeparatedValue"><xsl:with-param name="curValue" select="AssociateName/*"/><xsl:with-param name="separator" select="' '"/></xsl:call-template></div>
                    <div class="dataLabel">at</div>
                    <div class="dataValue">
                        <xsl:call-template name="commaSeparatedValue"><xsl:with-param name="curValue" select="Location/*"/></xsl:call-template>
                        
                    </div>
                    <div class="dataLabel">on</div>
                    <div class="dataValue">
                        <xsl:value-of select="InformationDate/DD"/>&#160;            
                        <span class="toMonthName"><xsl:value-of select="InformationDate/MM"/></span>&#160; 
                        <xsl:value-of select="InformationDate/CCYY"/>
                    </div>
                    <div class="dataLabel">source</div>
                    <div class="dataValue">
                        <xsl:call-template name="associationSourceName"/>
                    </div><br style="clear:both"/><br style="clear:both"/>
                </xsl:if>
            </xsl:for-each>
        </div>
    </xsl:template>

    <xsl:template name="xsl_aliases_and_associations">
        <div class="section" id="aliases_and_associations">
            <h2>aliases and associations</h2>

            <h3>association</h3>
            <xsl:call-template name="aliasAssoTemplate">
                <xsl:with-param name="linkSentence">is associated with</xsl:with-param>
                <xsl:with-param name="sourceString">A</xsl:with-param>
            </xsl:call-template>

            
            <h3>alias</h3>
            <xsl:call-template name="aliasAssoTemplate">
                <xsl:with-param name="linkSentence">is an alias of</xsl:with-param>
                <xsl:with-param name="sourceString">S</xsl:with-param>
            </xsl:call-template>

            
            <h3>joint application</h3>
            
            <xsl:call-template name="aliasAssoTemplate">
                <xsl:with-param name="linkSentence">is a joint application of</xsl:with-param>
                <xsl:with-param name="sourceString">J</xsl:with-param>
            </xsl:call-template>



        </div>
    </xsl:template>
</xsl:stylesheet>
