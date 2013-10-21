<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="xsl_voters_roll">
        <div class="section" id="voters_roll">
            <h2>voters roll</h2>
            
            <div class="dataLabel">current</div><div class="dataValue" style="font-weight:bold">
            
                <xsl:value-of select="ConsumerOutput/FullConsumerData/ConsumerData/VotersRollLocation/VRollStreetDetails/Location/HouseNumber"/>
                
               <xsl:if test="ConsumerOutput/FullConsumerData/ConsumerData/VotersRollLocation/VRollStreetDetails/Location/Street != '' ">,&#xA0;<xsl:value-of select="ConsumerOutput/FullConsumerData/ConsumerData/VotersRollLocation/VRollStreetDetails/Location/Street"/></xsl:if> 
                
                 <xsl:if test="ConsumerOutput/FullConsumerData/ConsumerData/VotersRollLocation/VRollStreetDetails/Location/Street2 != '' ">,&#xA0;<xsl:value-of select="ConsumerOutput/FullConsumerData/ConsumerData/VotersRollLocation/VRollStreetDetails/Location/Street2"/></xsl:if> 
                
                
                 <xsl:if test="ConsumerOutput/FullConsumerData/ConsumerData/VotersRollLocation/VRollStreetDetails/Location/Postcode != '' ">,&#xA0;<xsl:value-of select="ConsumerOutput/FullConsumerData/ConsumerData/VotersRollLocation/VRollStreetDetails/Location/Postcode"/></xsl:if> 
                
                 <xsl:if test="ConsumerOutput/FullConsumerData/ConsumerData/VotersRollLocation/VRollStreetDetails/Location/PostTown != '' ">,&#xA0;<xsl:value-of select="ConsumerOutput/FullConsumerData/ConsumerData/VotersRollLocation/VRollStreetDetails/Location/PostTown"/></xsl:if> 
                
                 <xsl:if test="ConsumerOutput/FullConsumerData/ConsumerData/VotersRollLocation/VRollStreetDetails/Location/County != '' ">,&#xA0;<xsl:value-of select="ConsumerOutput/FullConsumerData/ConsumerData/VotersRollLocation/VRollStreetDetails/Location/County"/></xsl:if> 
                
                 <xsl:if test="ConsumerOutput/FullConsumerData/ConsumerData/VotersRollLocation/VRollStreetDetails/Location/Country != '' ">,&#xA0;<xsl:value-of select="ConsumerOutput/FullConsumerData/ConsumerData/VotersRollLocation/VRollStreetDetails/Location/Country"/></xsl:if> 
                
            </div>
            
            <br style="clear:both"/>
            <br style="clear:both"/>
            <xsl:for-each select="ConsumerOutput/FullConsumerData/ConsumerData/VotersRollPerson/VRollPersonDetails">
                <div class="dataLabel">name</div>
                <div class="dataValue" >
                    <xsl:value-of select="Name/Surname"/>
                    &#xA0;
                    <xsl:value-of select="Name/Forename"/>
                </div>
                
                <br style="clear:both"/>
                <div class="dataLabel">period</div>
                <div class="dataValue doubt">
                    <xsl:value-of select="DatesRegLeft"/> [ConsumerOutput/FullConsumerData/ConsumerData/VotersRollPerson/VRollPersonDetails/DatesRegLeft]?
                </div><br style="clear:both"/>
                <br style="clear:both"/>
            </xsl:for-each>
           
        </div>
    </xsl:template>
</xsl:stylesheet>
