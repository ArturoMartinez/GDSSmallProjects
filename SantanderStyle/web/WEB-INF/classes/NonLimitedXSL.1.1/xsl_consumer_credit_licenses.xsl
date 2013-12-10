<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="xsl_consumer_credit_licences">
        <div class="section" id="consumer_credit_licences">
            <h2>consumer credit licences</h2>
            
            <xsl:for-each select="Identification/CCLs/CCLDetail">
                
               <h4>(<xsl:value-of select="position()"/> of <xsl:value-of select="../../ConsumerCreditLicenceSummary/NumberCLLs" />)</h4>
            
                <div class="dataLabel">Licence Number</div>
                <div class="dataValue">
                    <xsl:value-of select="LicenceNumber"/>
                </div>

            <div class="dataLabel">dated</div>
                <div class="dataValue">
                    <xsl:value-of select="LicenceDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="LicenceDate/MM"/></span>&#xA0;<xsl:value-of select="LicenceDate/CCYY"/>
                    
                </div>
                
            <div class="dataLabel">Licensee</div>
                <div class="dataValue">
                    <xsl:value-of select="LicenseeDetail"/>
                </div>
                
            <div class="dataLabel">licensee address</div>
                <div class="dataValue">
                    
                     <xsl:call-template name="commaSeparatedValue"><xsl:with-param name="curValue" select="LicenseeLocation/*"/></xsl:call-template>
                    
                    
                </div>
                
            <div class="dataLabel">categories</div>
                <div class="dataValue">
                    <xsl:value-of select="LicenceCategories"/>
                </div>
                
                <xsl:variable name="tNameNum"><xsl:value-of select="count(TradingNames/TradingName)"/></xsl:variable>
            <div class="dataLabel" style="height:{$tNameNum * 11}px">trading names</div>
                <div class="dataValue">
                    <xsl:for-each select="TradingNames/TradingName">
                        <div style="float:left;width:300px;overflow:auto">
                            <xsl:value-of select="."/>
                        </div><br/>
                    </xsl:for-each>
                </div>
            <br/>
            </xsl:for-each>
        </div>
    </xsl:template>
    
</xsl:stylesheet>
