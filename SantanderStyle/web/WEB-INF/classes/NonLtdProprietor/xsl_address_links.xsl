<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="xsl_address_links">
        <div class="section" id="address_links">
            <h2>address links</h2>
            <xsl:for-each
                select="ConsumerOutput/FullConsumerData/ConsumerData/LocationLink">
                <div class="dataLabel" style="width:100%"> &#x2022;&#xA0;<xsl:value-of
                        select="LocationLinkDetails/Name/Title"/>&#xA0; <xsl:value-of
                        select="LocationLinkDetails/Name/Surname"/>&#xA0; <xsl:value-of
                        select="LocationLinkDetails/Name/Forename"/> - <xsl:value-of
                        select="LocationLinkDetails/Location/HouseNumber"/>&#xA0; <xsl:value-of
                        select="LocationLinkDetails/Location/Street"/> &#xA0; <xsl:value-of
                        select="LocationLinkDetails/Location/Street2"/> &#xA0; <xsl:value-of
                        select="LocationLinkDetails/Location/Postcode"/> &#xA0; <xsl:value-of
                        select="LocationLinkDetails/Location/PostTown"/> &#xA0; <xsl:value-of
                        select="LocationLinkDetails/Location/Country"/>
                    <br style="clear:both"/>
                    <div class="dataLabel">link to</div><div class="dataValue doubt"
                        style="font-weight:normal">
                        <xsl:value-of select="LocationLinkDetails/RelatedSegmentNum"/>&#xA0;
                        [LocationLinkDetails/RelatedSegmentNum]??
                    </div>
                    <br style="clear:both"/>
                    <div class="dataLabel">date</div><div class="dataValue"
                        style="font-weight:normal"/>
                    <xsl:value-of select="LocationLinkDetails/LocationLinkDate"/>
                    <br style="clear:both"/>
                </div>

            </xsl:for-each>

        </div>
    </xsl:template>
</xsl:stylesheet>
