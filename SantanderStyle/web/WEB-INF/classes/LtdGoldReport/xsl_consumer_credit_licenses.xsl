<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
     <xsl:template name="CCLCategoriesList">
        <xsl:choose>
            <xsl:when test="LicenceCategories='A'">Consumer credit business</xsl:when>
            <xsl:when test="LicenceCategories='B'">Consumer hire business</xsl:when>
            <xsl:when test="LicenceCategories='C'">Credit brokerage</xsl:when>
            <xsl:when test="LicenceCategories='D'">Debt adjusting and debt counselling</xsl:when>
            <xsl:when test="LicenceCategories='E'">Debt collecting</xsl:when>
            <xsl:when test="LicenceCategories='F'">Credit reference agency</xsl:when>
            <xsl:when test="LicenceCategories='Z'">Right to canvass</xsl:when>
            <xsl:otherwise>
                    <xsl:value-of select="LicenceCategories"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:template>

    <xsl:template name="xsl_consumer_credit_licences">
        <div class="section" id="consumer_credit_licences">
            <h2>consumer credit licences</h2>
            <xsl:for-each select="Identification/CCLs/CCLDetail">
                
            
            <div class="dataLabel">License Number</div>
                <div class="dataValue">
                    <xsl:value-of select="LicenceNumber"/>
                </div>
            <div class="dataLabel" style="clear:both">dated</div>
                <div class="dataValue">
                    <xsl:value-of select="LicenceDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="LicenceDate/MM"/></span>&#xA0;<xsl:value-of select="LicenceDate/CCYY"/>
                </div>
            <div class="dataLabel" style="clear:both">Licensee</div>
                <div class="dataValue">
                    <xsl:value-of select="LicenseeDetail"/>
                </div>
            <div class="dataLabel" style="clear:both">licensee address</div>
                <div class="dataValue">
                    <xsl:value-of select="LicenseeLocation/LocationLine1"/>&#xA0;
                    
                    <xsl:value-of select="LicenseeLocation/LocationLine2"/>&#xA0;
                    
                    <xsl:value-of select="LicenseeLocation/LocationLine3"/>&#xA0;
                    
                    <xsl:value-of select="LicenseeLocation/Postcode"/>
                </div>
            <div class="dataLabel" style="clear:both">categories</div>
                <div class="dataValue">
                    <xsl:call-template name="CCLCategoriesList"></xsl:call-template>
                </div>
            <br style="clear:both"/>
                <xsl:variable name="tNameNum"><xsl:value-of select="count(TradingNames/TradingName)"/></xsl:variable>
            <div class="dataLabel" style="height:{$tNameNum * 11}px">trading names</div>
                <div class="dataValue">
                    <xsl:for-each select="TradingNames/TradingName">
                        <div style="float:left;width:300px;overflow:auto">
                            <xsl:value-of select="."/>
                        </div><br style="clear:both"/>
                    </xsl:for-each>
                </div>
            <br style="clear:both"/>
            <br style="clear:both"/>
            </xsl:for-each>
        </div>
    </xsl:template>
    
</xsl:stylesheet>
