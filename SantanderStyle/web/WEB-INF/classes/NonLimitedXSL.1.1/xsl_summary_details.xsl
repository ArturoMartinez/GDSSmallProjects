<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="xsl_summary_details">
        <div class="section" id="summary_details">
            <h2>summary details</h2>
            <div class="dataLabel">business name</div>
            <div class="dataValue" id="company_name">
                <xsl:value-of select="BusinessName"/>
            </div>
            <div class="dataLabel">business ref number</div>
            <div class="dataValue">
                <xsl:value-of select="NonLimitedKey"/></div>
            <div class="dataLabel">address</div>
            <div class="dataValue">

                    <xsl:call-template name="commaSeparatedValue"><xsl:with-param name="curValue" select="Identification/BusinessLocation/*"/></xsl:call-template>
               
<br style="clear:both"/>
            </div>
            <div class="dataLabel">Telephone</div>
            <div class="dataValue">
                <xsl:value-of select="Identification/TelephoneNumber"/>
            </div>
            <div class="dataLabel">SIC codes (1992)</div>
            <div class="dataValue">
                <xsl:for-each select="Identification/SICInformation1992">
                    <xsl:value-of select="Code"/> : <xsl:value-of select="Description"/>
                </xsl:for-each>
            </div>
            <div class="dataLabel">business activity</div>
            <div class="dataValue">
                <xsl:value-of select="Identification/PrincipalActivities"/>
            </div>
            <div class="dataLabel">earliest date Known To Experian </div>
            <div class="dataValue">
                <xsl:value-of select="Identification/EarliestKnownDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="Identification/EarliestKnownDate/MM"/></span>&#xA0;<xsl:value-of select="Identification/EarliestKnownDate/CCYY"/>
            </div>
            <div class="dataLabel">notice of correction count</div>
            <div class="dataValue">
                <xsl:value-of select="NoticeOfCorrection/NumCorrections"/>
            </div>

            
            <div class="dataLabel">Average Number Of Employees</div>
            <div class="dataValue">
                <xsl:value-of select="Identification/AvgNumEmployees"/>
            </div>


            <br/>
        </div>
    </xsl:template>
</xsl:stylesheet>
