<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="vRollsDetails">
        <xsl:param name="vIndicator"/>
        <xsl:param name="vIndicatorExclude" select="''"/>
        <xsl:param name="occurenceLimit" select="1"/>
        <xsl:param name="occurenceVal" select="1"/>
        <xsl:param name="locationLabel" select="Location"/>
        <xsl:for-each select="ConsumerOutput/FullConsumerData/ConsumerData/VotersRollLocation">
            <xsl:if test="(LocationIndicator=$vIndicator and LocationIndicator!=$vIndicatorExclude) or /RawBureauData/IsPATHSViewReport = 1">
                 <div class="dataLabel"><xsl:value-of select="$locationLabel" disable-output-escaping="no"/></div>
                 <div class="dataValue" style="font-weight:bold">
                     <xsl:variable name="currentPosition" select="position()"/>

                     <xsl:call-template name="commaSeparatedValue"><xsl:with-param name="curValue" select="VRollStreetDetails/Location/*"/></xsl:call-template>

                 </div>
                </xsl:if>
        </xsl:for-each>
        <xsl:for-each select="ConsumerOutput/FullConsumerData/ConsumerData/VotersRollPerson">
        <xsl:if test="(LocationIndicator=$vIndicator and LocationIndicator!=$vIndicatorExclude)or /RawBureauData/IsPATHSViewReport = 1">
             <div class="dataLabel" style="display:none"></div>
             <xsl:variable name="CurrentName" select="''"/>
                <xsl:for-each select="VRollPersonDetails">

             <div class="dataValue" style="margin-left:20px">
                    <div style="float:left;width:300px">
                        <div style="width:150px;float:left">&#xA0;
                        <xsl:variable name="currentPosition" select="position()-1"/>

                        <xsl:if test="position() = 1 or (Name/Surname != ../VRollPersonDetails[$currentPosition]/Name/Surname)">
                            
                            <b><xsl:value-of select="Name/Surname"/></b>
                        </xsl:if>
                        </div>
                        <div style="width:150px;float:left">
                            <xsl:value-of select="Name/Forename"/>

                        </div>
                    </div>
                    <div style="float:left;margin-left:10px">
                        <xsl:variable name="dateStringLength" select="string-length(DatesRegLeft)"/>
                        <xsl:if test="$dateStringLength &gt; 5 and ($dateStringLength mod 6) = 0">

                            <span class="toMonthName"><xsl:value-of select="substring(DatesRegLeft,1,2)"/></span>&#xA0;<xsl:value-of select="substring(DatesRegLeft,3,4)"/>
                            to

                            <xsl:choose>
                                <xsl:when test="$dateStringLength &gt; 6">
                                    <xsl:variable name="monthStartPos" select="$dateStringLength - 5"/>
                                    <xsl:variable name="yearStartPos" select="$dateStringLength - 3"/>
                                    <span class="toMonthName"><xsl:value-of select="substring(DatesRegLeft,$monthStartPos,2)"/></span>&#xA0;<xsl:value-of select="substring(DatesRegLeft,$yearStartPos,4)"/>
                                </xsl:when>

                                <xsl:when test="/RawBureauData/IsPATHSViewReport = 1"><xsl:value-of select="DatesRegLeft" /></xsl:when>
                                <xsl:otherwise>
                                    current register
                                </xsl:otherwise>
                            </xsl:choose>
                        </xsl:if>
                    </div><br style="clear:both"/>
                 </div>
                </xsl:for-each>
           
            <div class="dataLabel">period</div>
            <div class="dataValue doubt">
                <xsl:value-of select="VRollPersonDetails/DatesRegLeft"/> [ConsumerOutput/FullConsumerData/ConsumerData/VotersRollPerson/VRollPersonDetails/DatesRegLeft]?
            </div><br style="clear:both"/>
        </xsl:if>
    </xsl:for-each>
     <br style="clear:both"/>
    <xsl:if test="$occurenceLimit &gt; $occurenceVal">
         <xsl:call-template name="vRollsDetails">
            <xsl:with-param name="vIndicator" select="($occurenceVal + 1)"/>
            <xsl:with-param name="vIndicatorExclude" select="'C'"/>
            <xsl:with-param name="occurenceLimit" select="$occurenceLimit"/>
            <xsl:with-param name="occurenceVal" select="$occurenceVal+1"/>
        </xsl:call-template>
    </xsl:if>
</xsl:template>

<xsl:template name="xsl_voters_roll">
    <div class="section" id="voters_roll">
        <h2>voters roll</h2>
        <br style="clear:both"/>

        <xsl:call-template name="vRollsDetails">
            <xsl:with-param name="vIndicator" select="'C'"/>
            <xsl:with-param name="occurenceLimit" select="1"/>
            <xsl:with-param name="locationLabel" select="'current'"/>
        </xsl:call-template>

       
     
         <xsl:call-template name="vRollsDetails">
            <xsl:with-param name="vIndicator" select="1"/>
            <xsl:with-param name="vIndicatorExclude" select="'C'"/>
            <xsl:with-param name="occurenceLimit" select="count(ConsumerOutput/FullConsumerData/ConsumerData/VotersRollPerson)"/>
        </xsl:call-template>

    
       


    </div>
</xsl:template>
</xsl:stylesheet>
