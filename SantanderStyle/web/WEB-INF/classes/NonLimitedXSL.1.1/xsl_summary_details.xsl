<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="xsl_summary_details">
        <div class="section" id="summary_details">
            <h2>summary details</h2>
            <div class="dataLabel">business name</div>
            <div class="dataValue">
                <xsl:value-of select="BusinessName"/>
            </div>
            <br style="clear:both"/>
            <div class="dataLabel">business ref number</div>
            <div class="dataValue">
                <xsl:value-of select="NonLimitedKey"/></div>
            <br style="clear:both"/>
            <div class="dataLabel">address</div>
            <div class="dataValue">
                <xsl:apply-templates select="Identification/BusinessLocation/LocationLine1"/><br
                    style="clear:both"/>
                <xsl:if test="Identification/BusinessLocation/LocationLine2 != '' "
                        ><xsl:apply-templates select="Identification/BusinessLocation/LocationLine2"
                        /><br style="clear:both"/></xsl:if>
                <xsl:if test="Identification/BusinessLocation/LocationLine2 != '' "
                        ><xsl:apply-templates select="Identification/BusinessLocation/LocationLine3"
                        /><br style="clear:both"/></xsl:if>
                <xsl:if test="Identification/BusinessLocation/LocationLine2 != '' "
                        ><xsl:apply-templates select="Identification/BusinessLocation/LocationLine4"
                        /><br style="clear:both"/></xsl:if>
                <xsl:if test="Identification/BusinessLocation/LocationLine2 != '' "
                        ><xsl:apply-templates select="Identification/BusinessLocation/LocationLine5"
                        /><br style="clear:both"/></xsl:if>
                <xsl:apply-templates select="Identification/BusinessLocation/Postcode"/><br
                    style="clear:both"/>
            </div>
            <br style="clear:both"/>
            <div class="dataLabel">Telephone</div>
            <div class="dataValue">
                <xsl:value-of select="Identification/TelephoneNumber"/>
            </div>
            <br style="clear:both"/>
            <div class="dataLabel">SIC codes (1992)</div>
            <div class="dataValue">
                <xsl:for-each select="Identification/SICInformation1992">
                    <xsl:value-of select="Code"/> : <xsl:value-of select="Description"/>
                </xsl:for-each>
            </div>
            <br style="clear:both"/>
            <div class="dataLabel">business activity</div>
            <div class="dataValue">
                <xsl:value-of select="Identification/PrincipalActivities"/>
            </div>
            <br style="clear:both"/>
            <div class="dataLabel">earliest date Known To Experian </div>
            <div class="dataValue">
                
                <xsl:value-of select="Identification/EarliestKnownDate/CCYY"/> / 
                <xsl:value-of select="Identification/EarliestKnownDate/MM"/> / 
                <xsl:value-of select="Identification/EarliestKnownDate/DD"/>
            </div>
            <br style="clear:both"/>
            <div class="dataLabel">notice of correction count</div>
            <div class="dataValue">
                <xsl:value-of select="NoticeOfCorrection/NumCorrections"/>
            </div>
            <br/>
        </div>
    </xsl:template>
</xsl:stylesheet>
