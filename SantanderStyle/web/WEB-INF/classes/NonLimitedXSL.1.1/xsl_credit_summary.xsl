<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="xsl_credit_summary">
        <div class="section" id="credit_summary">
            <h2>credit summary</h2>
            <div class="dataLabel">credit rating</div>
            <div class="dataValue num">
                <xsl:value-of select="CommercialDelphi/CreditRating"/>
            </div>
            <br style="clear:both"/>
            <div class="dataLabel">risk band</div>
            <div class="dataValue">
                <span id="notFound"> ??? </span>
            </div>
            <br style="clear:both"/>
            <div class="dataLabel">opinion</div>
            <div class="dataValue">
                <xsl:value-of select="CommercialDelphi/CreditText"/>
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
                    <div class="dataLabel">failure odds</div>
                    <div class="dataValue">
                        <span>
                            <xsl:value-of
                                select="CommercialDelphiHistory/StabilityOdds"
                            />
                        </span>
                    </div>
                    <br style="clear:both"/>
                </div>
                <xsl:variable name="ratingStarsImgSectionHeight">116</xsl:variable>
                <xsl:variable name="score">
                    <xsl:value-of
                        select="CommercialDelphiHistory/CommDelphiScore"/>
                </xsl:variable>
                <div class="subSectionInsert" style="width:400px;float:left">
                    <h3>commercial delphi rating</h3>
                    <div
                        style="margin:auto;padding-top:10px;width:300px;font:italic normal 21px MS Serif"
                        ><xsl:value-of
                            select="CommercialDelphiHistory/CommDelphiScore"
                        /> out of 100 </div>
                    <div
                        style="margin:auto;width:300px;height:116px;background:URL(ratingStars.png) 0px -{(floor($score div 10)) * $ratingStarsImgSectionHeight}px no-repeat"
                    />
                </div>
            </div>
        </div>
    </xsl:template>
</xsl:stylesheet>
