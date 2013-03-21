<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="xsl_voters_roll">
        <div class="section" id="voters_roll">
            <h2>voters roll</h2>
            
            <div class="dataLabel">current</div><div class="dataValue doubt">
                [ConsumerOutput/FullConsumerData/ConsumerData/VotersRollLocation/VRollStreetDetails/Location/...]?<br style="clear:both"/>
                <xsl:value-of select="ConsumerOutput/FullConsumerData/ConsumerData/VotersRollLocation/VRollStreetDetails/Location/HouseNumber"/><br style="clear:both"/>
                
                <xsl:value-of select="ConsumerOutput/FullConsumerData/ConsumerData/VotersRollLocation/VRollStreetDetails/Location/Street"/><br style="clear:both"/>
                
                <xsl:value-of select="ConsumerOutput/FullConsumerData/ConsumerData/VotersRollLocation/VRollStreetDetails/Location/Street2"/><br style="clear:both"/>
                
                
                <xsl:value-of select="ConsumerOutput/FullConsumerData/ConsumerData/VotersRollLocation/VRollStreetDetails/Location/Postcode"/><br style="clear:both"/>
                <xsl:value-of select="ConsumerOutput/FullConsumerData/ConsumerData/VotersRollLocation/VRollStreetDetails/Location/PostTown"/><br style="clear:both"/>
                
                <xsl:value-of select="ConsumerOutput/FullConsumerData/ConsumerData/VotersRollLocation/VRollStreetDetails/Location/Country"/><br style="clear:both"/>
                
            </div>
            
            <br style="clear:both"/>
            <br style="clear:both"/>
            <xsl:for-each select="ConsumerOutput/FullConsumerData/ConsumerData/VotersRollPerson">
                <div class="dataLabel">name</div>
                <div class="dataValue" >
                    <xsl:value-of select="VRollPersonDetails/Name/Surname   "/>
                    &#xA0;
                    <xsl:value-of select="VRollPersonDetails/Name/Forename"/>
                </div>
                
                <br style="clear:both"/>
                <div class="dataLabel">period</div>
                <div class="dataValue doubt">
                    <xsl:value-of select="VRollPersonDetails/DatesRegLeft"/> [ConsumerOutput/FullConsumerData/ConsumerData/VotersRollPerson/VRollPersonDetails/DatesRegLeft]?
                </div><br style="clear:both"/>
                <br style="clear:both"/>
            </xsl:for-each>
           
        </div>
    </xsl:template>
</xsl:stylesheet>
