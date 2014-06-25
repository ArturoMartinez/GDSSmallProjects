<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="xsl_address_links">
        <div class="section" id="address_links" style="white-space:nowrap">
            <h2>address links</h2>
            <div class="adressLinkHeader" style="width:5%" >
             Link #
         </div>

         <div class="adressLinkHeader" style="width:30%" >
            Name
        </div>

        <div class="adressLinkHeader" style="width:50%" >
            Address
        </div>

        <div class="adressLinkHeader" style="width:5%" >
            Link to
        </div>


        <div class="adressLinkHeader" style="width:7%" >
            Date
        </div>

        <br style="clear:both"/>


        <div style="width:5%" class="dataValue adressLinkRow">
           C
       </div>

       <div style="width:30%" class="dataValue adressLinkRow">
        <xsl:call-template name="commaSeparatedValue">
            <xsl:with-param name="curValue" select="ConsumerOutput/Applicant/Name/*"/> 
            <xsl:with-param name="separator" select="'&#xA0;'"/>          
        </xsl:call-template>
        </div>
        <div style="width:50%" class="dataValue adressLinkRow">
            <!--<xsl:value-of select="ConsumerOutput/Residency/LocationCode" />,&#xA0;-->
            <xsl:call-template name="commaSeparatedValue">
                <xsl:with-param name="curValue" select="ConsumerOutput/LocationDetails/FormattedLocation"/> 
            </xsl:call-template>
        </div>
        <div style="width:5%" class="dataValue adressLinkRow">
                <xsl:value-of select="RelatedSegmentNum" />
            </div>


            <div style="width:7%" class="dataValue adressLinkRow">
                <xsl:call-template name="oneRowDate">
                    <xsl:with-param name="curValue" select="LocationLinkDate"/>
                </xsl:call-template>
            </div>

            <br style="clear:both"/>

    <xsl:for-each select="ConsumerOutput/FullConsumerData/ConsumerData/LocationLink">
        <xsl:for-each select="LocationLinkDetails">

            <div style="width:5%" class="dataValue adressLinkRow">

                <xsl:value-of select="LocationLinkNumber"/>

            </div>

            <div style="width:30%" class="dataValue adressLinkRow">
                <xsl:for-each select="Name">
                    <xsl:call-template name="commaSeparatedValue">
                    <xsl:with-param name="curValue" select="*"/> 
                    <xsl:with-param name="separator" select="'&#xA0;'"/>          
                    </xsl:call-template><br/>
                </xsl:for-each>
                
            </div>

            <div style="width:50%" class="dataValue adressLinkRow">
                <xsl:for-each select="Location">
                <xsl:call-template name="commaSeparatedValue">
                    <xsl:with-param name="curValue" select="*"/> 

                </xsl:call-template><br/>
                </xsl:for-each>
            </div>

            <div style="width:5%" class="dataValue adressLinkRow">
                <xsl:for-each select="RelatedSegmentNum">
                <xsl:choose>
                    <xsl:when test=".='00'">
                        C
                    </xsl:when>
                    <xsl:otherwise>
                         <xsl:value-of select="." />
                    </xsl:otherwise>
                </xsl:choose><br/>
                </xsl:for-each>
            </div>


            <div style="width:7%" class="dataValue adressLinkRow">
                <xsl:for-each select="LocationLinkDate">
                <xsl:call-template name="oneRowDate">
                    <xsl:with-param name="curValue" select="."/>
                </xsl:call-template><br/>
                </xsl:for-each>
            </div>

            <br style="clear:both"/>

        </xsl:for-each>
    </xsl:for-each>

</div>
</xsl:template>
</xsl:stylesheet>
