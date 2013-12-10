<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="xsl_credit_summary">
        <div class="section" id="credit_summary">
            <h2>credit summary</h2>
            <div class="dataLabel">credit rating</div>
            <div class="dataValue num devise">
                <xsl:value-of select="CommercialDelphi/CreditRating"/>
            </div>
            <div class="dataLabel">credit limit</div>
            <div class="dataValue num devise">
               <xsl:value-of select="CommercialDelphi/CreditLimit"/>
            </div>
            <br style="clear:both"/>
            <div class="dataLabel">risk band</div>
            <div class="dataValue">
               <xsl:value-of select="CommercialDelphi/CommDelphiBand"/> - <xsl:value-of select="CommercialDelphi/CommDelphiBandText"/>
                
            </div>
            <br style="clear:both"/>
            <div class="dataLabel">opinion</div>
            <div class="dataValue" style="overflow:auto">
                <xsl:value-of select="CommercialDelphi/CreditText"/>
                <xsl:call-template name="lineSeparatedValue"> <xsl:with-param name="curValue" select="CommercialDelphi/ConcludingText"></xsl:with-param></xsl:call-template>
                <xsl:call-template name="lineSeparatedValue"> <xsl:with-param name="curValue" select="CommercialDelphi/NOCText"></xsl:with-param></xsl:call-template>
                
                
            </div>
            <br style="clear:both"/>
            <h3>financial stability assessment</h3>
            <div style="width:850px;margin:auto;overflow:hidden">
                <div style="width:400px;float:left" class="font14">
                    <div class="dataLabel">commercial delphi score</div>
                    <div class="dataValue">
                        <span>
                            <xsl:value-of
                                select="CommercialDelphiHistory/CommDelphiScore"
                            /> out of 100 </span>
                    </div>
                    <br style="clear:both"/>
                    <div class="dataLabel">commercial delphi band</div>
                    <div class="dataValue">
                        <span>
                            <xsl:value-of
                                select="CommercialDelphiHistory/CommDelphiBand"
                            />
                        </span>
                    </div>
                    <br style="clear:both"/>
                    <div class="dataLabel"></div>
                    <br style="clear:both"/>
                     <div class="dataValue alwaysVisible">
                            <xsl:value-of select="CommercialDelphi/CreditText"/>
                        
                    </div>
                    <div class="dataValue alwaysVisible">
                            <xsl:value-of select="CommercialDelphi/ConcludingText"/>
                        
                    </div>

                    <br style="clear:both"/>
                    <div class="dataLabel">failure odds</div>
                    <div class="dataValue">
                        <span>
                            <xsl:value-of
                                select="CommercialDelphi/StabilityOdds"
                            />
                        </span>
                    </div>
                    <br style="clear:both"/>
                </div>
                <xsl:variable name="ratingStarsImgSectionHeight">58</xsl:variable>
                <xsl:variable name="score">
                    <xsl:value-of
                        select="CommercialDelphiHistory/CommDelphiScore"/>
                </xsl:variable>
                <div class="subSectionInsert" style="width:300px;float:left">
                    <h3>commercial delphi rating</h3>
                    <div style="margin:auto;padding-top:10px;width:300px;font:italic normal 18px MS Serif"
                        ><span class="num"><xsl:value-of
                            select="CommercialDelphiHistory/CommDelphiScore"
                        /></span> out of 100 </div>
                    <div class="ratingStarDiv"
                        style="margin:auto;width:150px;height:{$ratingStarsImgSectionHeight}px;background:URL(./rsc/images/ratingStars-mid.png) 0px -{(floor($score div 10)) * $ratingStarsImgSectionHeight}px no-repeat"
                    />
                    <xsl:value-of select="CommercialDelphi/CommDelphiBandText"/>
                </div>
            </div>
        </div>
    </xsl:template>
</xsl:stylesheet>
